/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.master.model;

import org.osrse.MasterModule;
import org.osrse.master.LoginBase;
import org.osrse.master.model.player.GameRequest;
import org.osrse.model.commercial.Alias;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.model.utility.Response;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.Serviceable;
import org.osrse.master.model.player.GlobalPlayer;
import org.osrse.network.CommercialPackets;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Jonathan
 */
public class World extends WorldComponent implements Serviceable {
    private Session session;
    private String address, activity;

    /**
     * Synch/Offline worlds
     *
     * @param index         globalPlayerIndex/worldId
     * @param flag          private data/worldFlag
     * @param requestedSize
     */
    private World(int index, int flag, int requestedSize) {
        super(index, flag, requestedSize);
    }

    /**
     * A real connected world
     *
     * @param index
     * @param flag
     * @param address
     */
    public World(Session session, int index, int flag, String address, String activity) {
        super(index, flag, 2000);
        this.session = session;
        this.address = address;
        this.activity = activity;
    }

    public static World createOfflineWorld(int id, int flag) {
        return new World(id, flag, 1);
    }

    //<editor-fold desc="Basic Getter/Setters">
    public String getAddress() {
        return address;
    }

    public Session getSession() {
        return session;
    }

    public String getActivity() {
        return activity;
    }

    public boolean isOnline() {
        return session != null && session.isConnected();
    }

    public int online() {
        return isOnline() ? dynamicSync > 0 ? dynamicSync + docked.size() : docked.size() : -1;
    }

    /**
     * Dynamic sync refers to World server disconnecting
     * or losing contact with the login server and sending over
     * its entire playerbase while not allowing login unless
     * database is in sync and option is set
     */
    public void setSyncing(int inSync) {
        this.dynamicSync = inSync;
    }

    public boolean isDynamicSync() {
        return dynamicSync > 0;
    }

    private int dynamicSync;

    /**
     * Global sync represents when a world logs in to
     * the login server, and needs their playerbase data.
     */
    boolean globalSync = false;

    public boolean isGloballySynced() {
        return globalSync;
    }

    public void setGloballySynced(boolean synced) {
        this.globalSync = synced;

    }

    //</editor-fold>

    public GlobalPlayer retrieve(int staticIndex) {
        for (GlobalPlayer p : docked.toList()) {
            if (p != null && p.getStaticIndex() == staticIndex) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void release() {
        release(true);
    }

    @Override
    public void release(boolean broadcast) {
        if (broadcast) {
            MasterModule.getLogic().registerWorld(World.createOfflineWorld(getIndex(), getStaticIndex()));
        }
    }

    /**
     * run
     * The World Sync packet
     */
    public void run() {
        if (isOnline() && !isGloballySynced()) {
            syncWorld(0, true);
            setGloballySynced(true);
        }
    }

    public void announceWorld(World w) {
        if (w.getIndex() == getIndex() || !isOnline()) {
            return;
        }
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.ANNOUCE_WORLD, Packet.Type.VAR_BYTE);
        pb.putByte(w.getIndex()).putByte(w.getStaticIndex()).putByte(w.online());
        if (w.isOnline()) {
            pb.putShort(w.online()).putString(w.getAddress()).putString(w.getActivity());
        }
        session.write(pb.toPacket());
    }

    public void syncWorld(int world, boolean globalSync) {
        PacketBuilder main = new PacketBuilder(CommercialPackets.MasterResponse.SYNC_WORLD, Packet.Type.VAR_SHORT);
        main.putByte(globalSync ? LoginBase.worlds.size() : 1);
        for (World worlds : LoginBase.worlds.toList()) {
            if (!globalSync && worlds.getIndex() != world) {
                continue;
            }
            if (worlds.getIndex() != getIndex()) {
                int size = worlds.getDocked().size();
                main.putByte(worlds.getIndex());
                main.putByte(worlds.getStaticIndex());
                if(worlds.isOnline()) {
                    main.putString(worlds.getAddress());
                    main.putString(worlds.getActivity());
                } else {
                    main.putString("");
                    main.putString("Offline");
                }
                main.putShort(size);
                for (GlobalPlayer pl : worlds.getDocked().toList()) {
                    main.putString(pl.getUsername()); //? does this even need to be here? seems redundant af
                    main.recalculateBitPosition();
                    main.putBits(22, pl.getStaticIndex());
                    main.putBits(2, pl.getStatus());
                }
            }
        }
        session.write(main.toPacket());
    }

    public void sendLoginResponse(Response loginResponse, int staticIndex) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.ACCEPT_PLAYER_REGISTRATION);
        pb.putShort(staticIndex).putByte(loginResponse.intValue()).putByte(MasterModule.getLogic().getCommunications(staticIndex) == null ? 1 : 0);
        session.write(pb.toPacket());
    }

    public void announcePlayer(boolean synched, GlobalPlayer other) {
        if (searchComponent(other.getStaticIndex()) == other || !isOnline()) {
            return;
        }
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.ANNOUNCE_PLAYER, Packet.Type.VAR_SHORT)
                .putShort(other.getStaticIndex())
                .putString(other.getUsername());
        pb.recalculateBitPosition()
                .putBits(1, synched ? 1 : 0)
                .putBits(8, other.getWorldId())
                .putBits(3, other.getStatus());
        //8 bits 256 worlds, 3 bits > 4 statuses, sync if world is offline synching
        if (!synched) {
            for (Map.Entry<Integer, Alias> hisList : other.getCommunications().getRelationData().entrySet()) {
                if(retrieve(hisList.getKey()) != null) {
                    pb.putShort(hisList.getKey());
                }
            }
        }
        session.write(pb.toPacket());
    }

    public void editPlayer(GlobalPlayer player) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.EDIT_PRIVACY);
        pb.putShort(player.getStaticIndex())
                .putByte(player.getStatus());
        session.write(pb.toPacket());
    }

    public void sendRequest(GameRequest request) {
        System.out.println("writing request" +request.name+", clan="+request.join_clan+", index="+request.getIndex()+", type="+(request.join_clan ? (request.clanname.isEmpty() ? 3 : 2) : request.ignore ? 1 : 0));
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.COM_RESP, Packet.Type.VAR_BYTE);
        pb.putShort(request.getStaticIndex());
        pb.putByte((request.join_clan ? (request.clanname.isEmpty() ? 3 : 2) : (request.ignore ? 1 : 0)));
        pb.putString(request.name);
        pb.putShort(request.getIndex());
        session.write(pb.toPacket());
    }

    public void editRelationBetween(int owner, int removed, int type) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.ANNOUNCE_LIST_EDIT);
        pb.putShort(owner)
          .putShort(removed)
          .putByte(type);
        session.write(pb.toPacket());
    }

    public void sendPrivateMessage(int staticIndexFrom, int rights, int staticIndexTo, int length, byte[] huffmanCompressed) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.SEND_PM, Packet.Type.VAR_SHORT);
        pb.putShort(staticIndexFrom).putByte(rights).putShort(staticIndexTo).putSmart(length).put(huffmanCompressed);
        session.write(pb.toPacket());
    }

    public void sendFriendServer(GlobalPlayer gp, Communications com) {
        PacketBuilder main = new PacketBuilder(CommercialPackets.MasterResponse.FRIEND_SERVER, Packet.Type.VAR_SHORT);
        Map<Integer, Alias> rd = com.getRelationData();
        int i = rd.size();
        main.putShort(gp.getStaticIndex());
        main.putSmart(i);
        if (i > 0) {
            for (Map.Entry<Integer, Alias> es : rd.entrySet()) {
                main.recalculateBitPosition()
                    .putBits(20, es.getKey())
                    .putBits(3, es.getValue().getRank().ordinal())
                    .putBits(1, hasReferences(gp, es.getKey()) ? 1 : 0)
                    .putString(es.getValue().toString());
                //20 bits = 1,048,576 acounts, doubt it will get this high.
            }
        }
        ///System.out.println("ok2");
        Map<Integer, String> id = com.getIgnores();
        i = id.size();
        main.putSmart(i);
        if(i > 0) {
            for (Map.Entry<Integer, String> es : id.entrySet()) {
                main.recalculateBitPosition()
                    .putBits(23, es.getKey())
                    .putBits(1, hasReferences(gp, es.getKey()) ? 1 : 0)
                    .putString(es.getValue());
                //20 bits = 1,048,576 acounts, doubt it will get this high.
                // 23 here to complete 8x3 (tribyte) using 1 bit for mask
            }
            //System.out.println("ok2");
        }
       // System.out.println("wrote friend server"+gp.getUsername());

        session.write(main.toPacket());
    }

    private boolean hasReferences(GlobalPlayer gp, int uid) {
        Communications com = MasterModule.getLogic().getCommunications(uid);
        boolean has = false;
        if(com != null) {
            World w =  MasterModule.getLogic().getWorldContaining(com.uid);
            has = w != null && w.getIndex() != gp.getWorldId() && com.hasFriend(gp.getStaticIndex());
        }
        return has;
    }

    /*

    public void sendClanResponse(int requestedToJoin, int clanJoiningId, int clanResponse) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.CC_RESP); //useless
        pb.putInt(requestedToJoin).putInt(clanJoiningId).putByte(clanResponse); //pretty much we dont even need to get technical
        session.write(pb.toPacket());
    }*/


    public void editCCPlayer(Communications clanToJoin, GlobalPlayer playerJoining, boolean remove) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.CC_EDIT);
        pb.putByte(remove ? 1 : 0)
                .putInt(clanToJoin.uid)
                .putInt(playerJoining.getStaticIndex())
                .putLong(NameUtilities.stringToLong(playerJoining.getUsername()))
                .putByte(clanToJoin.getRank(playerJoining.getStaticIndex()).getId());
        session.write(pb.toPacket());
    }

    public void registerClan(Communications clanToJoin, boolean define) {
        System.out.println("Registering Clan -"+clanToJoin.username()+", "+clanToJoin.getClanChat().getChatName());
        PacketBuilder pb = new PacketBuilder(CommercialPackets.MasterResponse.CC_DEFINE, Packet.Type.VAR_BYTE);
        pb.putInt(clanToJoin.uid).putByte(clanToJoin.getClanChat().getInChat().size()).putByte(define ? 1 : 0);
        if(define) { //might need a tweek if clan is cached, but the Master server is restarted etc..
            pb.putByte(clanToJoin.getClanChat().getJoinReq().getId())
            .putByte(clanToJoin.getClanChat().getKickReq().getId())
            .putString(clanToJoin.username())
            .putString(clanToJoin.getClanChat().getChatName());
        } else {
            System.err.println("no point in sending entire clan definition to a world its owner is in.");
        }
        for (Map.Entry<String, Communicable> alphaUsers : clanToJoin.getClanChat().getInChat().entrySet()) {
            pb.putInt(alphaUsers.getValue().getStaticIndex())
                    //.putShort(alphaUsers.getValue().getWorldId())
                    .putByte(clanToJoin.getRank(alphaUsers.getValue().getStaticIndex()).getId());
        }
        clanToJoin.getClanChat().editHost(getStaticIndex(), true);

        session.write(pb.toPacket());

    }
}
