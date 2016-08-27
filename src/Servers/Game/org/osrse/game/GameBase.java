/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osrse.game;

import org.osrse.WorldModule;
import org.osrse.game.content.combat.Combat;
import org.osrse.game.logic.protocol.AbstractProtocol;
import org.osrse.game.logic.protocol.Protocol;
import org.osrse.game.network.LoginProtocol;
import org.osrse.model.ModuleStore;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.model.utility.Response;
import org.osrse.model.utility.NodeCollection;
import org.osrse.network.PacketHandler;
import org.osrse.network.Session;
import org.osrse.slave.ReferencedPerson;
import org.osrse.task.Engine;
import org.osrse.utility.NameUtilities;
import org.osrse.game.file.player.LoadableContext;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.Situated;
import org.osrse.game.logic.item.ItemDefinition;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.game.logic.map.PathFinder;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.PathRequest;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.game.logic.utility.LogicConstants;
import org.osrse.game.logic.utility.XteaLibrary;
import org.osrse.game.utility.WorldShutdownHook;
import org.osrse.slave.LoginSession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Jonathan
 */
public class GameBase extends ModuleStore {

    private final int worldId, revision;
    protected boolean multiRevisional = false, updating = false;

    public GameBase(int worldId, int revision) {
        this.worldId = worldId;
        this.revision = revision;
        worldPlayers = new NodeCollection<Player>(1, 2048);
        worldMobs = new NodeCollection<Mob>(1, 32768);
        players = new HashMap<String, Player>();
        clanData = new HashMap<Integer, Communications>(1);
    }

    public final boolean isMultiRevisional() {
        return multiRevisional;
    }

    public final int getId() {
        return worldId;
    }

    public final int getRevision() {
        return revision;
    }

    private final NodeCollection<Player> worldPlayers;
    private final NodeCollection<Mob> worldMobs;
    private final Map<String, Player> players;
    private final Map<Integer, Communications> clanData;

    private XteaLibrary library;

    private CountDownLatch clientUpdateLatch = null;
    private CountDownLatch resetUpdateLatch = null;
    private CountDownLatch maskUpdateLatch = null;
    //private Map<Integer, Protocol> revisionMap;
    private Protocol protocol;
    private Combat combat;

    /**
     * Base definitions here, dialogues what have you..
     * @throws Exception
     */
    protected void finishLogic() throws Exception {//activity
            this.worldActivity = CombatActivity.forName(moduleConfig.getString("Activity"));
            loginSession = new LoginSession(moduleConfig, worldActivity);
            library = new XteaLibrary();
            ItemDefinition.init(revision);
            //gamedialogues.start
            Runtime.getRuntime().addShutdownHook(new WorldShutdownHook());
            protocol = Protocol.applyPatch(revision);
            //revisionMap = Protocol.handleProtocolLoad(revision, multiRevisional, new File(Module.getFile("available_revisions.inf")));
            combat = new Combat(this.worldActivity);
    }

    public Protocol getProtocol() {
        return protocol;
    }
    public final Combat getCombat() {
        return combat;
    }

    private LoginSession loginSession;

    public final LoginSession getLoginSession() {
        return loginSession;
    }

    //<editor-fold desc="Logic Maps">
    /*
    public Protocol getUpdateContext(int revision) {
        return revisionMap.get(revision);
    }

    public Set<Integer> getAvailableRevisions() {
        return revisionMap.keySet();
    }*/

    public Map<String, Player> getPlayerMap() {
        return players;
    }

    public Map<Integer, Communications> getClanData() {
        synchronized (clanData) {
            return clanData;
        }
    }

    public NodeCollection<Mob> getMobs() {
        return worldMobs;
    }

    private final Map<String, Long> playerLeavings = new HashMap<String, Long>();

    public XteaLibrary getLibrary() {
        return library;
    }

    public Player getPlayerFromStaticIndex(int staticIndex) {
        String s = loginSession.getIndexToName().get(staticIndex);
        if(s != null && !s.isEmpty()) {
            return players.get(NameUtilities.capitalizeFormat(s));
        }
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Update">
    public void run() {
        try {
            synchronized (worldPlayers) {
                maskUpdateLatch = new CountDownLatch(worldPlayers.size() + worldMobs.size());
                clientUpdateLatch = new CountDownLatch(worldPlayers.size());
                resetUpdateLatch = new CountDownLatch(worldPlayers.size() + worldMobs.size());
                /**
                 * Pre-update: Processes game logic.
                 */
                for (Player player : worldPlayers) {
                    if (player.isOnline()) {
                        player.setUpdateStage(Entity.UpdateStage.PRE_UPDATE);
                        player.run();
                    }
                }
                for (Mob npc : worldMobs) {
                    npc.setUpdateStage(Entity.UpdateStage.PRE_UPDATE);
                    npc.run();
                }
                /**
                 * Mask update: Compiles every entity's mask before-hand so that
                 * no synchronization is needed later.
                 */
                for (Player player : worldPlayers) {
                    if (player.isOnline()) {
                        player.setUpdateStage(Entity.UpdateStage.MASK_UPDATE);
                       Engine.dispatchToWorldWorker(player);
                    } else {
                        maskUpdateLatch.countDown();
                    }
                }
                for (Mob npc : worldMobs) {
                    npc.setUpdateStage(Entity.UpdateStage.MASK_UPDATE);
                   Engine.dispatchToWorldWorker(npc);
                }
                try {
                    maskUpdateLatch.await();
                } catch (InterruptedException e) {
                    return;
                }
                /**
                 * Client update: Prepares and sends the update packets to the
                 * client.
                 */
                for (Player player : worldPlayers) {
                    if (player.isOnline()) {
                        player.setUpdateStage(Entity.UpdateStage.CLIENT_UPDATE);
                       Engine.dispatchToWorldWorker(player);
                    } else {
                        clientUpdateLatch.countDown();
                    }
                }
                try {
                    clientUpdateLatch.await();
                } catch (InterruptedException e) {
                    return;
                }
                /**
                 * Post-update: Resets all update cycle flags.
                 */
                for (Player player : worldPlayers) {
                    if (player.isOnline()) {
                        player.setUpdateStage(Entity.UpdateStage.POST_UPDATE);
                       Engine.dispatchToWorldWorker(player);
                    } else {
                        removePlayer(player);
                        resetUpdateLatch.countDown();
                    }
                }
                for (Mob mob : worldMobs) {
                    if (mob.isDestroyed()) {
                         remove(mob);
                        resetUpdateLatch.countDown();
                    } else {
                        mob.setUpdateStage(Entity.UpdateStage.POST_UPDATE);
                       Engine.dispatchToWorldWorker(mob);
                    }
                }
                try {
                    resetUpdateLatch.await();
                } catch (InterruptedException ignored) {
                }
            }
        } catch (Exception e) {
            System.err.println("Error updating world!");
            e.printStackTrace();
        }
        LoadableContext.process();
    }

    public CountDownLatch getClientUpdateLatch() {
        return clientUpdateLatch;
    }

    public CountDownLatch getResetUpdateLatch() {
        return resetUpdateLatch;
    }

    public CountDownLatch getMaskUpdateLatch() {
        return maskUpdateLatch;
    }

    public NodeCollection<Player> getPlayers() {
        return worldPlayers;
    }
    //</editor-fold>

    //<editor-fold desc="Entity Register">
    public void removePlayer(Player player) {
        if(WorldModule.isCommercial()) {
            loginSession.sendPlayerUpdate(player, 3);
        }
        worldPlayers.remove(player);
        loginSession.getIndexToName().remove(player.getStaticIndex());
        players.remove(player.getUsername());
        player.release();
        System.out.println("Removed player " + player);
        LoadableContext.cachePlayer(player);
    }

    public void remove(Mob mob) {
        mob.release();
        synchronized (worldMobs) {
            worldMobs.remove(mob);
        }
    }

    public boolean register(Mob mob) {
        boolean success;
        synchronized (worldMobs) {
            success = worldMobs.add(mob);
        }
        return success;
    }

    public void resetMobs(boolean remove) {
        for(Mob mob : worldMobs) {
            mob.release(remove);
            if(remove) {
                remove(mob);
            }
        }
    }
    //</editor-fold>


    public boolean isUpdating() {
        return updating;
    }

    public void addToQueue(String player, long timeLeft) {
        this.playerLeavings.put(player, timeLeft);
    }

    public Communicable getCommunicableNode(int index) {
        Communicable p = getPlayerFromStaticIndex(index);
        if(WorldModule.isCommercial() && p == null) {
            p = loginSession.getPlayer(index);
        }
        return p;

    }

    public Communicable getCommunicable(String name) {
        Communicable p = players.get(name);
        if(WorldModule.isCommercial() && p == null) {
            p = loginSession.getPlayer(name);
        }
        return p;
    }

    //<editor-fold desc="Overridden">
    @Override
    public final void sendResponse(Session session) {
        Protocol.sendWorldList(session, loginSession, (int) session.getKey());
    }

    @Override
    public int getReferencePort() {
        return (LogicConstants.WORLD_PORT_START + worldId);
    }

    @Override
    public PacketHandler<Player> createHandler(String name) {
        try {
            return ((PacketHandler<Player>) Class.forName(new StringBuilder(LogicConstants.LOGIC_MESSAGE_DIR).append(revision).append(LogicConstants.LOGIC_MESSAGE_HANDLER_DIR).append(name).toString()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //</editor-fold>


    //<editor-fold desc="Player Login">
    public Response responseFor(LoginRequest login) {
        if (worldPlayers.isFull()) {
            return Response.WORLD_FULL;
        }
        if(login.hasCredentials()) {
            PlayerDefinition def = login.getCredentials().toDefinition();
            String username = NameUtilities.capitalizeFormat(def.getUsername());
            if(players.containsKey(def.getUsername()) && !players.get(def.getUsername()).getSession().isConnected() && login.getLoginOpcode() == 18) {
                return Response.CONTINUE; //reconnecting
            }
            if (players.containsKey(def.getUsername()) || currentlyLogging.contains(username)|| loginSession.getPlayer(username) != null) {
                return Response.ONLINE;
            }
            if(playerLeavings.containsKey(username)) {
                login.setTransferTime(playerLeavings.get(username));
                if(login.getTransferTime() < 60 && login.getTransferTime() > 0) {
                    return Response.TANSFERRING;
                } else {
                    playerLeavings.remove(username);
                }
            }
        }
        return login.getResponse();
    }

    /**
     * essential for kids trying to break the system.
     */
    private Set<String> currentlyLogging = new HashSet<String>();

    public LoginProtocol getLoginHandler() {
        return protocol.getLoginProtocol();
    }

    public boolean hasSupportFor(int revision) {
        return protocol.getVersion() == revision;
    }

    public void situateRequest(LoginRequest login, int clientRevision) {
        //Protocol update = //revisionMap.get(clientRevision);
        Response resp = responseFor(login);
        if(resp == Response.LOGIN) {
            PlayerDefinition def = login.getCredentials().toDefinition();
            def = LoadableContext.load(def);
            ReferencedPerson r = null;
            if(def != null)
                r = loginSession.getPlayer(def.getStaticIndex());
            if(r != null) {
                r.setUsername(def.getUsername());
                resp = Response.ONLINE;
            } else
                resp = def == null ?
                        Response.INVALID_DETAILS : currentlyLogging.contains(def.getUsername()) ?
                        Response.ONLINE : Response.LOGIN;
            if(resp == Response.LOGIN) {
                Player player = protocol.createPlayer(login, def);
                if(!managingCommercialRequest(player, login)) {
                    finishPlayerLogin(resp, player);
                }
                return;
            }
        }
        AbstractProtocol.sendLoginResponse(login, resp);
    }

    /**
     * Manages a Commercial login request vs a local request,
     * Due to Multiple worlds, or just a single server.
     * @param player
     * @param req
     * @return
     */
    private boolean managingCommercialRequest(Player player, LoginRequest req) {
        player.getSession().setAttachment(player);
        player.setScreenDisplay(Player.Display.forId(req.getCredentials().getDisplayMode()));
        player.setAttribute("req", req);
        players.put(req.getCredentials().getName(), player);
        loginSession.getIndexToName().put(player.getStaticIndex(), req.getCredentials().getName());
        currentlyLogging.add(player.getUsername());
        if(WorldModule.isCommercial()) {
            loginSession.requestPlayerLogin(player.getStaticIndex(), req.getCredentials().getName());
            System.out.println("Requesting login: " + player.toString(true));
        }
        return WorldModule.isCommercial();
    }

    /**
     * The finishing method to a finished login module
     * response to a login
     * @param resp
     * @param player
     */
    public void finishPlayerLogin(Response resp, Player player) {
        LoginRequest req = (LoginRequest) player.removeAttribute("req");
        if (resp != Response.LOGIN) {
            getPlayerMap().remove(player.getUsername());
            loginSession.getIndexToName().remove(player.getStaticIndex());
            AbstractProtocol.sendLoginResponse(req, resp);
        } else {
            boolean success;
            synchronized (worldPlayers) {
                success = worldPlayers.add(player);
            }
            if (success && player.getSession().isConnected()) {
                if (WorldModule.isCommercial()) {
                    loginSession.completePlayerLogin(player);
                }
                System.out.println("Registered Player: " + player);
            } else if (WorldModule.isCommercial() && !player.getSession().isConnected()) {
                loginSession.sendPlayerUpdate(player, 3);
                success = false;
            }
            if (success) {
                AbstractProtocol.sendLoginResponse(req, resp);
            }
        }
        currentlyLogging.remove(player.getUsername());
    }
    //</editor-fold>


    private CombatActivity worldActivity = CombatActivity.Deadman;

    public enum CombatActivity { Deadman, Economy, Spawn;
        public static CombatActivity forName(String name) {
            for(CombatActivity cb : CombatActivity.values()) {
                if(cb.toString().equalsIgnoreCase(name)) {
                    return cb;
                }
            }
            return Spawn;
        }
    };

    public final CombatActivity getWorldActivity() {
        return worldActivity;
    }


    //<editor-fold desc="Region Loaded information">
    public final Player[] getLocalPlayers(Tile tile) {
        return getLocalPlayers(tile, 16);
    }

    public final Player[] getLocalPlayers(Tile tile, int depth) {
        Tile[] regionTiles = getRegionTiles(tile, depth);
        int i = 0;
        for (Tile t : regionTiles) {
            i += t.getPlayerCount();
        }
        Player[] players = new Player[i];
        i = 0;
        for (Tile t : regionTiles) {
            if (t.containsPlayers()) {
                for (Player player : t.getPlayers()) {
                    if(player.isValid() && !player.isReleased()) {
                        players[i++] = player;
                    }
                }
            }
        }
        return players;
    }

    public final Mob[] getLocalMobs(Tile tile) {
        return getLocalMobs(tile, 16);
    }

    public final Mob[] getLocalMobs(Tile tile, int depth) {
        Tile[] regionTiles = getRegionTiles(tile, depth);
        int i = 0;
        for (Tile t : regionTiles) {
            i += t.getMobCount();
        }
        Mob[] npcs = new Mob[i];
        i = 0;
        for (Tile t : regionTiles) {
            if (t.containsMobs()) {
                for (Mob npc : t.getMobs()) {
                    npcs[i++] = npc;
                }
            }
        }
        return npcs;
    }

    public final Tile[] getRegionTiles(Tile tile, int depth) {
        int baseX = tile.getX();
        int baseY = tile.getY();
        int z = tile.getZ();
        Tile[] regionTiles = new Tile[(int) Math.pow(((depth * 2) - 1), 2)];
        int i = 0;
        for (int x = -depth + 1; x < depth; x++) {
            for (int y = -depth + 1; y < depth; y++) {
                regionTiles[i++] = Tile.locate(baseX + x, baseY + y, z);
            }
        }
        return regionTiles;
    }

    public void submitPath(PathFinder pathFinder, Entity entity, int x, int y, Runnable r) {
        submitPath(pathFinder, entity, x, y, null, r);
    }

    public void submitPath(PathFinder pathFinder, Entity entity, int x, int y, Situated target, Runnable r) {
        submitPath(pathFinder, entity, x, y, target, PathProcessor.MOVE_SPEED_ANY, false, r);
    }

    public void submitPath(final PathFinder pathFinder, final Entity entity, final int x, final int y, Situated target, final int moveSpeed, boolean automated, Runnable r) {
        entity.getPathProcessor().pathRequest = new PathRequest(pathFinder, x, y, target, moveSpeed, automated, r);
    }
    //</editor-fold>

}
