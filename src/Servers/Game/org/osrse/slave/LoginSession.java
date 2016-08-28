package org.osrse.slave;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.osrse.WorldModule;
import org.osrse.game.GameBase;
import org.osrse.game.logic.player.PlayerCommunication;
import org.osrse.network.CommercialPackets;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.utility.Configuration;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.Serviceable;
import org.osrse.game.logic.player.Player;
import org.osrse.utility.TextUtilities;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 12/21/13.
 */
public class LoginSession implements Serviceable {
    /**
     * Maps holding the reversal of GlobalUserId with their game name
     * Used mostly for login, and friends list edits.
     */
    private final BiMap<Integer, String> indexToName = HashBiMap.create();
    private final BiMap<String, Integer> nameToIndex = indexToName.inverse();

    /**
     * Map holding all ReferencedPersons on other worlds, used for pming, communications chat, and login.
     */
    private final Map<Integer, ReferencedPerson> players = new HashMap<Integer, ReferencedPerson>();
    /**
     * Map holding all worlds ordered by their Id
     */
    private final Map<Integer, ReferencedWorld> worldDock = new HashMap<Integer, ReferencedWorld>();

    /**
     * LoginSession(String serverAddress, int flag)
     * address of THIS world for world list packet
     * flag id of THIS world for world list packet
     */
    public LoginSession(Configuration moduleConfig, GameBase.CombatActivity activity) {
        this.address = moduleConfig.getString("Address");
        this.flag = moduleConfig.getInt("Flag"); //todo add to activity
        this.activity = activity.toString();
    }

    public final Map<String, Integer> getNameToIndex() {
        return nameToIndex;
    }
    public final Map<Integer, String> getIndexToName() {
        return indexToName;
    }
    public final Map<Integer, ReferencedWorld> getWorldDock() {
        return worldDock;
    }

    private boolean sync;
    public boolean isInSynch() {
        return sync;
    }

    private Session session;
    public final Session getSession() {
        return session;
    }
    public final void setSession(Session session) {
        this.session = session;
    }

    private final String address, activity;
    private final int flag;

    public String getActivity() {
        return activity;
    }

    public int getFlag() {
        return flag;
    }

    public String getAddress() {
        return address;
    }

    /**
     * release()
     * informs loginserver to shutdown this world,
     * and informs others to do the same
     */
    @Override
    public void release() {
        release(false);
    }

    //region World register functions

    /**
     * release() called when disconnecting, or connecting
     * to master module
     *
     * @param connect to server
     */
    @Override
    public void release(boolean connect) {
        int[] isaacRand = null;
        PacketBuilder pb;
        if (connect) {
            isaacRand = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D)};
            pb = new PacketBuilder(CommercialPackets.WorldRequests.INITIAL_REQUEST);
            PacketBuilder rsa = new PacketBuilder();
            rsa.putByte(10)
                    .putInt(isaacRand[0])
                    .putInt(isaacRand[1])
                    .putInt(isaacRand[2])
                    .putInt(isaacRand[3])
                    .putByte(WorldModule.getLogic().getId())
                    .putByte(getFlag())
                    .putShort(WorldModule.getLogic().getPlayers().size())
                    .putString(getAddress())
                    .putString(getActivity());
            ByteBuffer rsaBuffer = ByteBuffer.wrap(new BigInteger(rsa.toPacket().getBytes())
                    .modPow(WorldModule.getLogic().getBaseExponent(),
                            WorldModule.getLogic().getBaseModulus()).toByteArray());
            pb.putShort(rsaBuffer.array().length);
            pb.put(rsaBuffer.array());
        } else {
            pb = new PacketBuilder(CommercialPackets.WorldRequests.INITIAL_REQUEST, Packet.Type.VAR_SHORT);
            pb.putByte(0);
        }
        session.write(pb.toPacket());
        session.setISAAC(isaacRand, false);
    }

    /**
     * appendWorld
     * Used on LS login, and for single world registration/edit.
     *
     * @param worldAmt amount of worlds in buffer
     * @param packet   hasValue worldData (worldId, flag, playerAmount, address, activity)
     */
    public void appendWorld(int worldAmt, Packet packet) {
        for (int i = 0; i < worldAmt && packet.remaining() > 2; i++) {
            int worldId = packet.get();
            int flag = packet.get();
            int playerAmt = packet.get();
            String worldAddress = "";
            String worldActivity = "";
            if (playerAmt != -1) {
                playerAmt = packet.getShort();
                worldAddress = packet.getString();
                worldActivity = packet.getString();
            }
            ReferencedWorld d = worldDock.get(worldId);

            if (d != null) {
                d.update(flag, worldAddress, worldActivity, playerAmt);
            } else {
                d = new ReferencedWorld(worldId, flag, worldAddress, worldActivity, playerAmt);
            }
            if(playerAmt != -1)
                System.out.println("Registered World "+d);
            worldDock.put(worldId, d);
        }
    }

    /**
     * SyncGame
     * Reads all players online by their static index, later addresses them as needed
     * Static Indexes are the Id of players on the database, and do not change.
     * Getting the username is only needed when conflicted with a player in relations to
     * As since the index and name are stored on friends data.
     *
     * @param packet
     */
    public void syncGame(Packet packet) {
        int playersExpected;
        int amt = packet.get() -1;
        int currW = 0;
        int p = 0;
        String print = "Synched ";
        for (; currW < amt; currW++) {
            int currId = packet.get();
            int flag = packet.get();
            String addr = packet.getString();
            String act = packet.getString();
            playersExpected = packet.getShort();
            worldDock.put(currId, new ReferencedWorld(currId, flag, addr, act, playersExpected));

            for(p = 0; p < playersExpected; p++) {
                String name = packet.getString();
                packet.recalculateBitPosition();
                int staticIndex = packet.getBits(22);
                int privacy = packet.getBits(2);
                ReferencedPerson r = new ReferencedPerson(currId, staticIndex, privacy);
                r.setUsername(name);
                appendReferencedPerson(false, r);
            }
            print += "[w="+currId+", act="+act;
            if(playersExpected > 0) {
                print += ", online="+playersExpected;
            }
            print +="]";
        }
        System.out.println(print);
        sync = false;
    }

    /**
     * sendSync
     * Updates the Loginserver when it comes back online of all our players.
     * This is not a permenant solution to shutting the login server on and off
     */
    public void sendSync() {
        PacketBuilder main = new PacketBuilder(CommercialPackets.WorldRequests.INITIAL_REQUEST, Packet.Type.VAR_SHORT);
        main.putByte(1); // tells sync is inbound
        main.putShort(WorldModule.getLogic().getPlayers().size());
        for(int i = 1; i < 2048; i++) {
           Player p = WorldModule.getLogic().getPlayers().get(i);
            if(p != null) {
                main.putShort(p.getStaticIndex());
                main.recalculateBitPosition();
                main.putBits(12, p.getIndex());
                main.putBits(4, p.getStatus());
            }
        }
        session.write(main.toPacket());
    }

    /**
     * @return registered worlds + this world
     */
    public int getWorldCount(int offset) {
        return worldDock.size() + offset;
    }
    //endregion


    //region Referenced Person methods
    public void appendReferencedPerson(boolean address, ReferencedPerson p) {
        worldDock.get(p.getIndex()).insertNumber(p);
        players.put(p.getStaticIndex(), p);
        indexToName.remove(p.getStaticIndex());
        nameToIndex.put(NameUtilities.capitalizeFormat(p.getUsername()), p.getStaticIndex());
        if(address)  {
            PlayerCommunication.appendInteraction(p);
        }
    }

    public void appendFake(ReferencedPerson o) {
        players.put(o.getStaticIndex(), o);
    }

    public ReferencedPerson getPlayer(int id) {
        synchronized (players) {
            return players.get(id);
        }
    }

    public ReferencedPerson getPlayer(String username) {
        Integer i = nameToIndex.get(NameUtilities.capitalizeFormat(username));
        if (i != null) {
            return players.get(i);
        }
        return null;
    }

    public void releasePerson(int playerStaticIndex) {
        ReferencedPerson r = players.remove(playerStaticIndex);
        if (r != null) {
            worldDock.get(r.getIndex()).removeNumber(playerStaticIndex);
            PlayerCommunication.appendInteraction(r);
        }
    }
    //endregion


    //region Master Session Streams
    /**
     * Sends a login request for the global id of a player
     * This fixes players trying to multi log into 2 worlds
     */
    public void requestPlayerLogin(int playerIndex, String login) {
        session.write(new PacketBuilder(CommercialPackets.WorldRequests.REQUESTING_LOGIN, Packet.Type.VAR_BYTE).putShort(playerIndex).putString(login).toPacket());
    }

    /**
     * Tells ls to complete login of a player,
     * This is used when the LS is connected, if we are going to sync
     * We use a different approach, and add players to queue to re request friend server access.
     * Otherwise it will forcibly say "Friend server currently busy."
     *
     * @param player short player static index
     *               short player world index
     *               bit 3, kickReq
     *               bit 3, joinReq
     *               bit 2, privacy
     *               smart friends list size {
     *                     short friendIndex
     *                     byte rank
     *               }
    */
    public void completePlayerLogin(Player player) {
        PacketBuilder pb = new PacketBuilder(CommercialPackets.WorldRequests.REGISTER_PLAYER, Packet.Type.VAR_SHORT)
                .putShort(player.getStaticIndex())
                .putShort(player.getIndex());
        //we dont send data over and over unless the master module needs it.
        // It gets updated all the time, no need to spam redundant data
        Boolean b = (Boolean) player.removeAttribute("com");
        if(b) {
            int status = player.getStatus();
            boolean hashChat = player.getCommunication().basic().getClanChat().isValid();
            pb.recalculateBitPosition();
            System.out.println(player.getCommunication().basic().getClanChat().getKickReq().getId()+"/"+ player.getCommunication().basic().getClanChat().getJoinReq().getId()+"/"+ player.getCommunication().basic().getClanChat().getJoinReq().toString()+"/"+player.getCommunication().basic().getClanChat().getJoinReq().toString());
                pb.putBits(3, player.getCommunication().basic().getClanChat().getKickReq().ordinal())
                  .putBits(3, player.getCommunication().basic().getClanChat().getJoinReq().ordinal())
                  .putBits(2, status);
            pb.putByte(hashChat ? 1 : 0);
            if(hashChat) {
                pb.putString(player.getCommunication().basic().getClanChat().getChatName());
            }
        }
         session.write(pb.toPacket());
    }

    /**
     * @param player
     * @param update 0, public chat, 1 friends chat, 2 off chat, 3 logout
     */
    public void sendPlayerUpdate(Player player, int update) {
        session.write(new PacketBuilder(CommercialPackets.WorldRequests.EDIT_PRIVACY, Packet.Type.VAR_BYTE)
                .putShort(player.getIndex())
                .putByte(update)
                .toPacket());
    }

    public void sendPrivateMessage(Player from, ReferencedPerson to, int length, byte[] huffmanBuffer) {
        session.write(new PacketBuilder(CommercialPackets.WorldRequests.SEND_PM, Packet.Type.VAR_SHORT)
                .putShort(from.getStaticIndex())
                .putByte(from.getPrivilege().getClientReference())
                .putShort(to.getStaticIndex())
                .putSmart(length)
                .put(huffmanBuffer).toPacket());
    }

    /**
     *
     * @param remove delete from
     * @param listType 0 friend chat, 1 ignore list, 2 clan.
     * @param owner uid of player request
     * @param pers uid of communicant
     * @param username if all else look for username/clan name
     */
    public void requestDefinedFS(boolean remove, int listType, int owner, int pers, String username) {
        int id = 0;
        if(listType != 0) {
            id |= listType;
        }
        if(remove) {
            id |= 4;
        }
        if(pers != -1) {
            id |= 8;
        }
        PacketBuilder pb = new PacketBuilder(CommercialPackets.WorldRequests.COM_REQUEST, Packet.Type.VAR_BYTE);
        pb.putShort(owner).putByte(id);
        if(pers != -1) {
            pb.putShort(pers);
        } else {
            pb.putString(username);
        }
        session.write(pb.toPacket());
    }


    public void sendClanMessage(int currentOwnerIndex, String currentClan, String playerUsername, int clientReference, int huffmanLength, byte[] huffmanBuffer) {


    }

    //endregion
}
