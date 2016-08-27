/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.player;

import org.osrse.WorldModule;
import org.osrse.game.content.combat.Magic;
import org.osrse.game.content.combat.magic.MagicBook;
import org.osrse.game.logic.protocol.AbstractProtocol;
import org.osrse.game.logic.protocol.Protocol;
import org.osrse.game.logic.protocol.RunescapeProtocol;
import org.osrse.model.commercial.Communicable;
import org.osrse.network.Packet;
import org.osrse.network.Session;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.Serviceable;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.item.listener.AppearanceListener;
import org.osrse.game.logic.item.listener.EquipmentListener;
import org.osrse.game.logic.item.listener.InventoryListener;
import org.osrse.game.logic.map.Directions;
import org.osrse.game.logic.map.Region;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.map.event.RegionLoader;
import org.osrse.game.logic.masks.Appearance;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.utility.LogicConstants;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class Player extends Entity implements Serviceable, Communicable {

    public static enum Display { Fixed(548), Resizeable_FixedPanel(161), Resizeable_Panel(165);

        private int windowId;

        private Display(int windowId) {
            this.windowId = windowId;
        }
        public final int getWindowId() {
            return windowId;
        }

        public static Display forId(int displayMode) {
            switch(displayMode) {
                case 0:
                    return Fixed;
                case 1:
                    return Resizeable_FixedPanel;
                case 2:
                    return Resizeable_Panel;
                default:
                    return Fixed;
            }
        }
    }

    public static enum Privilege {
        ADMINISTRATOR(2), MODERATOR(1), PLAYER(0), IRONMAN(0, 3), ULTIMATE_IRONMAN(0, 4);

        public static Privilege forValue(int value) {
            switch (value) {
                case 0:
                    return PLAYER;
                case 1:
                    return MODERATOR;
                case 2:
                    return ADMINISTRATOR;
                case 3:
                    return IRONMAN;
                case 4:
                    return ULTIMATE_IRONMAN;

            }
            return PLAYER;
        }

        private int value, reference;

        private Privilege(int value) {
            this.value = value;
            this.reference = value;
        }

        private Privilege(int value, int reference) {
            this.value = value;
            this.reference = reference;
        }

        public int getValue() {
            return value;
        }

        public int getClientReference() {
            return reference;
        }
    }

    private Session session;
    private final int clientRevision;
    private AbstractProtocol protocol;
    private Display screenDisplay = Display.Fixed;

    protected Player(Session session, int clientRevision) {
        super();
        this.session = session;
        this.clientRevision = clientRevision;
        setPathProcessor(new PlayerPathProcessor(this));
    }


    protected String password, username;
    private PlayerCommunication communications;

    public void setCommunications(PlayerCommunication communications) {
        this.communications = communications;
    }


    public void setProtocol(AbstractProtocol protocol) {
        this.protocol = protocol;
    }

    public Session getSession() {
        return session;
    }

    public String getUsername() { return username; }

    public String getPassword() {
        return password;
    }

    private Privilege privilege = Privilege.PLAYER;

    public final void setRights(int privilege) {
        this.privilege = Privilege.forValue(privilege);
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    private boolean released = false;

    public boolean isReleased() {
        return released;
    }

    public void setScreenDisplay(Display d) {
        this.screenDisplay = d;
    }

    public Display getScreenDisplay() {
        return screenDisplay;
    }


    private final Appearance appearance = new Appearance(this);
    private Skills skills = new Skills(this);

    private final List<Player> localPlayerList = new ArrayList<Player>(); 
    private final List<Mob> localMobs = new ArrayList<Mob>();

    private final List<int[]> bank = new ArrayList<int[]>();
    private final ItemCollection inventory = new ItemCollection(this, LogicConstants.INVENTORY_SIZE),
                                 equipment = new ItemCollection(this, LogicConstants.EQUIPMENT_SIZE);
    private PlayerSettings settings = new PlayerSettings();
    public int playerViewportSize = -1;
    public static final int MAX_VIEWPORT_SIZE = 16;

    public PlayerSettings getSetting() {
        return settings;
    }


    public List<Player> getLocalPlayers() {
        return localPlayerList;
    } 

    public List<Mob> getLocalMobs() {
        return localMobs;
    }

    @Override
    public void release() {
        release(true);
    }

    @Override
    public void release(boolean release) {
        if(!cantRemove()) {
            setStatus(2);
            communications.release();
            released = true;
        }
    }

    public final void setMagicBook(MagicBook book) {
        if(book.type() == Magic.Type.Ancient) {
            getSkills().setPrayerPoints(0, true);
            getSkills().refresh();
            sendMessage("An ancient knowledge fills your mind.");
        } else {
            sendMessage("You switched to "+NameUtilities.capitalizeFormat(book.type().toString())+" magic.");
        }
        super.setMagicBook(book);
        protocol.sendUpdateInterface(RunescapeProtocol.InterfaceUpdate.Magic);
    }

    @Override
    public int getHealth() {
        return skills.getLifepoints();
    }

    @Override
    public int getBaseHealth() {
        return skills.getMaximumLifepoints();
    }

    //<editor-fold desc="Updating methods">
    @Override
    protected void _process() {
    }

    @Override
    protected void _reset() {
       mapRegionDirection = null;
        loggedInThisCycle = false;
        heightUpdate = false;
        updateRequiredList.clear();
        for (int i = 1; i < 2048; i++) {
            setFlag(Viewport.SKIPPED_LAST, i, hasFlag(Viewport.SKIPPED_THIS, i));
            applyFlags(i, false, Viewport.JOINED, Viewport.LEFT, Viewport.SKIPPED_THIS);
        }
        if (playerViewportSize < MAX_VIEWPORT_SIZE) {
            playerViewportSize++;
        }
        Protocol.setPlayerHashLoc(super.getIndex(), super.getLocation().getZ() << 16 | super.getLocation().getRegionX() << 8 | super.getLocation().getRegionY() & 0xff);
    }

    @Override
    public void _resetEvents() {

    }

    public void run() {
        switch (updateStage) {
            case PRE_UPDATE:
                try {
                    process();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                break;
            case MASK_UPDATE:
                try {
                    basicSettings().setCachedMaskBlock(WorldModule.getLogic().getProtocol().doMaskBlock(this));
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                WorldModule.getLogic().getMaskUpdateLatch().countDown();
                break;
            case CLIENT_UPDATE:
                try {
                    if (isOnline()) {
                        WorldModule.getLogic().getProtocol().process(this);
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                WorldModule.getLogic().getClientUpdateLatch().countDown();
                break;
            case POST_UPDATE:
                try {
                    boolean mapUpdate = basicSettings().isMapRegionUpdate();
                    reset();
                    if (mapUpdate) {
                        getProtocol().sendMapRegion();
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                WorldModule.getLogic().getResetUpdateLatch().countDown();
                break;
        }
    }
    //</editor-fold>
    public void logout() {
        settings.loggedOut = true;
    }

    public boolean isOnline() {
       return (session.isConnected() || cantRemove());
    }

    public boolean cantRemove() {
        return (getCombat().setDisconnect(getCombat().attacker() != null ? 30 : settings.loggedOut ? -1 : 10) > 1);
    }

    public void write(Packet packet) {
        if (session == null) {
            return;
        }
        //System.out.println("Packet out "+packet.getOpcode()+", length="+packet.getLength()+", array="+ Arrays.toString(packet.getBytes()));
        session.write(packet);
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Skills getSkills() {
        return skills;
    }

    public ItemCollection getInventory() {
        return inventory;
    }

    public ItemCollection getEquipment() {
        return equipment;
    } 

    public String toString() {
        return toString(false);
    }

    public String toString(boolean ls) {
        if(ls)
            return "[name="+getUsername()+", password="+getPassword().replaceAll(".", "*")+"]";
        return "[name="+getUsername()+", index="+getIndex()+", display="+screenDisplay+"]";
    }

    public void sendMessage(String string) {
        getProtocol().sendMessage(string);
    }

    public List<int[]> getBank() {
        return bank;
    }

    public final AbstractProtocol getProtocol() {
        return protocol;
    }


    public PlayerCommunication getCommunication() {
        return communications;
    }

    private int privateSetting = 0;

    @Override
    public int getStatus() {
        return privateSetting;
    }

    @Override
    public void setStatus(int status) {
        privateSetting = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void addType(final Tile tile) {
        tile.add(this);
        RegionLoader.append(Region.forTile(tile));
    }

    @Override
    public void removeType(Tile tile) {
        tile.remove(this);
    }

    @Override
    public int getSize() {
        return 1;
    }

    private List<Mob> localNPCs = new LinkedList<Mob>();

    public List<Mob> getMobList() {
        return localNPCs;
    }

    private boolean running = false;
    private int runningEnergy = 100;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getRunningEnergy() {
        return runningEnergy;
    }

    public void setRunningEnergy(int runningEnergy) {
        this.runningEnergy = runningEnergy;
    }

    private Directions.NormalDirection mapRegionDirection = null;

    public Directions.NormalDirection getMapRegionDirection() {
        return mapRegionDirection;
    }

    public void setMapRegionDirection(Directions.NormalDirection mapRegionDirection) {
        this.mapRegionDirection = mapRegionDirection;
    }




    //<editor-fold desc="Viewport Flags">
    private byte[] indexSettings = new byte[2048];

    public enum Viewport { IN(0x1), JOINED(0x2), LEFT(0x4), SKIPPED_LAST(0x8), SKIPPED_THIS(0x10);
        private final int hash;

        private Viewport(int hash) {
            this.hash = hash;
        }

         public final int getHash() {
             return hash;
         }
    };

    public boolean hasFlag(Viewport flag, int index) {
        return (indexSettings[index] & flag.getHash()) != 0;
    }

    public void applyFlags(int playerIndex, boolean applyVal, Viewport... flags) {
        for(Viewport f : flags) {
            setFlag(f, playerIndex, applyVal);
        }
    }

    public void setFlag(Viewport flag, int index, boolean apply) {
        if (apply) {
            indexSettings[index] |= flag.getHash();
        } else {
            if((indexSettings[index] & flag.getHash()) != 0) {
                indexSettings[index] ^= flag.getHash();
            }
        }
    }

    //</editor-fold>
    private int movementMode = 1;

    public int getMovementMode() {
        return movementMode;
    }

    public void setMovementMode(int movementMode) {
        this.movementMode = movementMode;
    }


    private boolean inCycle;

    /**
     *
     * @return player is ready for updating
     */
    public boolean isInCycle() {
        return inCycle;
    }

    private boolean loggedInThisCycle = true;

    public boolean loggedInThisCycle() {
        return loggedInThisCycle;
    }

    private boolean heightUpdate = false;
    public void setHeightUpdate(boolean heightUpdate) {
        this.heightUpdate = heightUpdate;
    }

    public boolean isHeightUpdate() {
        return heightUpdate;
    }

    private LinkedList<Integer> updateRequiredList = new LinkedList<Integer>();

    public LinkedList<Integer> getUpdateRequiredList() {
        return updateRequiredList;
    }

    //</editor-fold>

    /**
     * Send login, then apply appearance and equipment
     * after the needed startup packets
     */
    public void sendLogin() {
        setFlag(Viewport.IN, getIndex(), true);
        protocol.applyLoginEssentials();
        equipment.addListener(AppearanceListener.INSTANCE);
        equipment.addListener(EquipmentListener.INSTANCE);
        equipment.refresh();
        inventory.addListener(InventoryListener.INSTANCE);
        inventory.refresh();
        inCycle = true;
    }

    public int getClientRevision() {
        return clientRevision;
    }


    //region deprecated functions
    @Deprecated
    public int getWorldId() {
        return WorldModule.getLogic().getId();
    }

    @Override
    public boolean hasFriend(int staticIndex) {
        return communications.hasFriend(staticIndex);
    }

    @Override
    public boolean hasIgnore(int staticIndex) {
        return communications.hasIgnore(staticIndex);
    }
    //endregion


}