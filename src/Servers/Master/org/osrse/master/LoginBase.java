/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.master;

import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;
import org.osrse.master.model.player.*;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.model.utility.Response;
import org.osrse.master.model.World;
import org.osrse.master.model.economy.GrandExchange;
import org.osrse.model.ModuleStore;
import org.osrse.model.utility.NodeCollection;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.network.CommercialPackets;

import java.util.*;

/**
 * @author Jonathan
 */
public final class LoginBase extends ModuleStore {
    public static final Map<Integer, Communications> globalCommunications = new HashMap<Integer, Communications>();
    public static final Map<String, Integer> toIndex = new HashMap<String, Integer>();

    public static final Map<Integer, GlobalPlayer> currentlyLogging = new HashMap<Integer, GlobalPlayer>();
    public static final NodeCollection<World> worlds = new NodeCollection<World>(1, 128);
    private RelationWorker relationWorker;
    private GrandExchange grandExchange;

    public final NodeCollection<World> worlds() {
        return worlds;
    }

    public final RelationWorker worker() {
        return relationWorker;
    }

    @Override
    protected final void finishLogic() throws Exception {
        relationWorker = new RelationWorker();
        grandExchange = new GrandExchange();
        worlds.add(World.createOfflineWorld(1, 12));
        worlds.add(World.createOfflineWorld(2, 12));
        worlds.add(World.createOfflineWorld(3, 12));
    }

    @Override
    public final int getReferencePort() {
        return 40000;
    }

    @Override
    public void sendResponse(Session session) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.LOGIN_RESPONSE, Packet.Type.VAR_BYTE);
        pb.putByte(Response.LOGIN.intValue()).putByte(worlds.size());
        final World responseFor = (World) session.getAttachment();
        int count = 0;
        final ArrayList<World> syncWith = new ArrayList<World>();
        for (World w : worlds.toList()) {
            if (w.getIndex() != responseFor.getIndex()) {
                pb.putByte(w.getIndex())
                        .putByte(w.getStaticIndex())
                        .putByte(!w.isOnline() ? -1 : 0);
                if (w.isOnline()) {
                    pb.putShort(w.getDocked().size());
                    pb.putString(w.getAddress());
                    pb.putString(w.getActivity());
                }
                if(!w.isOnline() || w.getDocked().isEmpty()) {
                    count++;
                } else
                    syncWith.add(w);
            }
        }
        final int cnt = count;
        session.write(pb.toPacket()).addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (cnt == worlds.size()) {
                    responseFor.setGloballySynced(true);
                } else {
                    System.err.println("sync miss match count="+cnt+", should be "+ worlds.size());
                }
            }
        });
    }


    public void registerWorld(World w) {
        World removed = worlds.remove(w.getIndex());
        if (w.isOnline()) {
            sendResponse(w.getSession());
            if (!w.isDynamicSync())
                System.out.println("Registered World " + w);
        } else {
            System.out.println("Removed World " + w);
        }
        worlds.add(w, w.getIndex());
        for (World world : worlds.toList()) {
            world.announceWorld(w);
        }
    }

    public void syncWorld(World world, Packet packet) {
        world.setSyncing(0);
        int amt = packet.getShort();
        for (int i = 0; i < amt; i++) {
            int staticIndex = packet.getShort();
            registerPlayer(packet, world, staticIndex);
        }
        System.out.println("Registered World " + world);
    }

    public void requestLogin(World world, int staticIndex, String username) {
        boolean isAlreadyRequesting = currentlyLogging.containsKey(staticIndex);

        if (isAlreadyRequesting) {
            boolean timeout = !currentlyLogging.get(staticIndex).isValidTimeStamp();
            if (timeout) {
                currentlyLogging.remove(staticIndex);
                isAlreadyRequesting = false;
            }
        }
        if (!isAlreadyRequesting) {
            for (World w : worlds.toList()) {
                if (w != null && w.isOnline() && w.getIndex() != world.getIndex()) {
                    GlobalPlayer p = w.retrieve(staticIndex);
                    if (p != null) {
                        if (p.getUsername() == null || p.getUsername().isEmpty()) {
                            p.setUsername(username); //in case we were synched without user details
                        }
                        isAlreadyRequesting = true;
                    }
                }
            }
        }
        if (!isAlreadyRequesting) {
            GlobalPlayer gp = new GlobalPlayer(username, staticIndex, world.getIndex());
            currentlyLogging.put(staticIndex, gp);
        }

        world.sendLoginResponse(isAlreadyRequesting ? Response.ONLINE : Response.LOGIN, staticIndex);
    }

    public GlobalPlayer registerPlayer(Packet packet, World world, int playerIdentity) {
        GlobalPlayer player = currentlyLogging.remove(playerIdentity);
        boolean synched = player == null;
        if (synched) {
            player = new GlobalPlayer("", playerIdentity, world.getIndex());
            int playerWorldIndex = packet.getShort();
            player.setStatus(2); //this player is offline till world updates him
            player.setIndex(playerWorldIndex);
        } else {
            player.manageCommunications(packet);
            relationWorker.dispatch(new GameRequest(player));
            //friend.requestFriendServer(player);
        }
        if (!synched && world.registerComponent(player, player.getIndex())) {
            System.out.println("Registered player " + player);
        }
        return player;
    }

    public void editPlayer(World world, GlobalPlayer globalPlayer, int details) {
        globalPlayer.setStatus(details);
        if (details == 3) {
            world.removeComponent(globalPlayer);
            System.out.println("Removed player " + globalPlayer);
        }
        for (World w : worlds.toList()) {
            if (w != world && w.isOnline()) {
                w.editPlayer(globalPlayer);
            }
        }
    }

    /**
     * Used for misc shit lol
     * @param staticIndex
     * @return
     */
    public World getWorldContaining(int staticIndex) {
        synchronized (worlds) {
            for (World w : worlds.toList()) {
                GlobalPlayer player = w.retrieve(staticIndex);
                if (player != null) {
                    return w;
                }
            }
        }
        return null;
    }

    public GlobalPlayer getPlayer(int staticIndex) {
        synchronized (worlds) {
            for (World w : worlds.toList()) {
                GlobalPlayer player = w.retrieve(staticIndex);
                if (player != null) {
                    return player;
                }
            }
        }
        return null;
    }

    public Communications getCommunications(int staticIndex) {
        synchronized (globalCommunications) {
            return globalCommunications.get(staticIndex);
        }
    }

    public void setInChat(int index, Communications chat) {
        toIndex.put(chat.username(), index);
        globalCommunications.put(index, chat);
    }

    public Communications forName(String name) {
        return globalCommunications.get(toIndex.get(name));
    }

    public final void run() {
        for (World world : worlds.toList()) {
            if (world != null) {
                world.run();
            }
        }
        synchronized (currentlyLogging) {
            for (Map.Entry<Integer, GlobalPlayer> e : currentlyLogging.entrySet()) {
                if (!e.getValue().isValidTimeStamp()) {
                    currentlyLogging.remove(e.getKey());
                }
            }
        }
        if(relationWorker.requiresUpdate()) {
            relationWorker.run();
        }
    }


    //we have to find out 1st if this world has the entire clan
    //second we have to update the world with everyone or this player/ and every world with this extra player entering if they have the cc
    //and make a mark of what worlds have this cc fully syncd, and what worlds are in need of a 1 man sync
    //and then worlds in need of a full sync for this cc

    //now that we found, apply the join instead of accessing the DB, and notify worlds with live stream to this cc.

    /**
     * Updates CC join/leave info Globally
     *
     * When you join a CC the world may or may not have info on, it requests the Master Server to fetch it and all its details
     * Ranks, CC join/kick priv, and then if it is already in memory we simply send it to the sourceWorld. If if it in use in say a second world
     * we tell that world to update an extra player in the chat, and messages sent in the cc will be broadcasted World->Master->World
     * @param clanToJoin Clan Chat Owner
     * @param playerJoining PlayerJoining
     * @param remove remove from the chat
     */
    public void addPlayerToCC(World sourceWorld, Communications clanToJoin, GlobalPlayer playerJoining, boolean remove) {
        for(World world : worlds) {
            if(world != sourceWorld) {
                if(clanToJoin.getClanChat().hostedIn(world.getStaticIndex())) { //if has use for clan updates
                    world.editCCPlayer(clanToJoin, playerJoining, remove); //edit
                    //check if empty of players, if so tick true for gc
                }
            } else {
                if(!clanToJoin.getClanChat().hostedIn(world.getStaticIndex())) { //if world is synced with this clan
                    world.registerClan(clanToJoin, (world.retrieve(clanToJoin.uid) == null));
                }
                //check if world has clan
                //otherwise send entire chat members over, and let the background push the request to join
            }
        }
    }

    /**
     * Updates clan ranks, and kicks players if needed.
     * @param sourceWorld
     * @param playerEditted
     */
    public void editPlayerInCC(World sourceWorld, GlobalPlayer playerEditted) {

    }
}
