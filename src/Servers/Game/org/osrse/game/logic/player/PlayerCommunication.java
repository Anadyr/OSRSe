package org.osrse.game.logic.player;

import org.osrse.WorldModule;
import org.osrse.model.commercial.Alias;
import org.osrse.model.commercial.Communications;
import org.osrse.model.commercial.Communicable;
import org.osrse.network.PacketBuilder;
import org.osrse.slave.ReferencedPerson;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.Serviceable;
import org.osrse.utility.TextUtilities;

import java.util.Map;
import java.util.Random;

/**
 * Created by Jonathan on 1/2/16.
 */
public class PlayerCommunication implements Serviceable {
    private static final Random r =  new Random();
    private Communications communications;
    private final Player player;

    public String currentCCName;

    public PlayerCommunication(Player player, String chatName, int joinReq, int kickReq) {
        this.player = player;
        communications = WorldModule.getLogic().getClanData().get(player.getStaticIndex());
        if(communications == null) {
            communications = new Communications(player.getStaticIndex(), player.getUsername(), chatName, joinReq, kickReq);
            WorldModule.getLogic().getClanData().put(player.getStaticIndex(), communications);
        }
    }

    /**
     * used for player connecting, and disconnecting always sends true for update
     * @param uid
     */
    public void sendFriend(int uid, String username) {
        if(communications.hasFriends() && communications.hasFriend(uid)) {
            Communicable n = WorldModule.getLogic().getCommunicableNode(uid);
            if(n == null || n.getStatus() == 2 || (n.getStatus() == 1 && !n.hasFriend(player.getStaticIndex())) || n.hasIgnore(player.getStaticIndex())) {
                player.getProtocol().sendFriend(true, username, 0, 0);
            } else {
                player.getProtocol().sendFriend(true, username, 0, n.getWorldId());
            }
        }
    }

    public final void addFriend(String username) {
        if(basic().getIgnores().containsValue(username)) {
            player.sendMessage("You cannot add a friend, when they are on your ignore list!");
            return;
        }
        Communicable n = WorldModule.getLogic().getCommunicable(username); //checks all players online in all worlds
        if(n != null) {
            communications.putFriend(username, n.getStaticIndex(), Communications.ClanRank.FRIEND.ordinal());
            sendFriend(n.getStaticIndex(), username);
        }
        if(WorldModule.isCommercial()) {
            WorldModule.getLogic().getLoginSession().requestDefinedFS(false, 0, player.getStaticIndex(), -1, username);
        }
    }

    public final void removeFriend(String username) {
        Communicable n = WorldModule.getLogic().getCommunicable(username); //checks all players online in all worlds

        int friendId =  communications.removeFriend(username);
        if(WorldModule.isCommercial()) {
            WorldModule.getLogic().getLoginSession().requestDefinedFS(true, 0, player.getStaticIndex(), friendId, username);
        } 
        if(n != null) { 
            if(n.getWorldId() == WorldModule.getLogic().getId()) {
                ((Player)n).getCommunication().sendFriend(player.getStaticIndex(), player.getUsername());
            }
        }   
    }

    protected final void appendFriend(int uid, String username, int rank) {
        communications.putFriend(username,uid, rank);
    }


    public final int[] nextMessageId(int world) {
        return new int[] { r.nextInt()+(world >> 16), r.nextInt()};
    }

    public void sendMessageFrom(String name, int world, int rights, int length, byte[] msg) {
        player.getProtocol().sendRecievedPm(NameUtilities.displayFormat(name), nextMessageId(world), rights, length, msg);
    }

    private void sendSentMessage(String username, int length, byte[] msg) {
        player.getProtocol().sendSentPm(NameUtilities.displayFormat(username), length, msg);
    }

    /**
     * @param username               player name
     * @param huffmanBuffer message to send the client/login server.
     */
    public void sendMessage(String username, int huffmanLength, byte[] huffmanBuffer) {
        Communicable c = WorldModule.getLogic().getCommunicable(NameUtilities.capitalizeFormat(username));
        if(c != null && (c.getStatus() == 0 || c.getStatus() == 1 && c.hasFriend(player.getStaticIndex()))) {
            if(c.getWorldId() == WorldModule.getLogic().getId()) {
                ((Player)c).getCommunication().sendMessageFrom(player.getUsername(), WorldModule.getLogic().getId(), player.getPrivilege().getClientReference(), huffmanLength, huffmanBuffer);
            } else {
                WorldModule.getLogic().getLoginSession().sendPrivateMessage(player, ((ReferencedPerson) c), huffmanLength, huffmanBuffer);
            }
            sendSentMessage(c.getUsername(), huffmanLength, huffmanBuffer);
        } else {
            player.getProtocol().sendMessage("Unable to send message - player offline");
        }
    }

    public void sendClanMessage(String text) {
        byte[] chatBuffer = new byte[256];
        chatBuffer[0] = (byte) text.length();
        int offset = 1 + TextUtilities.huffmanCompress(text, chatBuffer, 1);

        boolean updateLs = false;
        for(Communicable c : WorldModule.getLogic().getClanData().get(clanIdentifier).getClanChat().getInChat().values()) {
            if(c != null && (c.getStatus() == 0 || c.getStatus() == 1 && c.hasFriend(player.getStaticIndex()))) {
                if(c.getWorldId() == WorldModule.getLogic().getId()) {
                    System.out.println(text);
                    ((Player)c).getProtocol().sendClanChatMsg(player.getUsername(), basic().currentChat, player.getPrivilege().getClientReference(), offset, chatBuffer);
                } else if(!updateLs) {
                    updateLs = true;
                }
            }
        }
        if(updateLs) {
           WorldModule.getLogic().getLoginSession().sendClanMessage(clanIdentifier, basic().currentChat, player.getUsername(), player.getPrivilege().getClientReference(), offset, chatBuffer);
        }
    }

    public byte[] getFriendsList() {
        PacketBuilder pb = new PacketBuilder();
        for (Map.Entry<Integer, Alias> aliasEntry : communications.relationData.entrySet()) {
            Communicable n = WorldModule.getLogic().getCommunicableNode(aliasEntry.getKey());
            if (n == null) {
                player.getProtocol().putFriend(pb, false, aliasEntry.getValue().toString(), 0, 0);
            } else {
                boolean offline = (n.getStatus() == 1 && !n.hasFriend(player.getStaticIndex()) || n.getStatus() == 2);
                player.getProtocol().putFriend(pb, false, n.getUsername(), 0, offline ? 0 : n.getWorldId());
            }
        }
        return pb.toPacket().getBytes();
    }


    /**
     * appends all player interactions with this dockedplayer
     *
     * @param p
     */
    public static void appendInteraction(Communicable p) {
        for(Player pl1 : WorldModule.getLogic().getPlayerMap().values()) {
            pl1.getCommunication().sendFriend(p.getStaticIndex(), p.getUsername());
        }
    }

    /**
     * Updates everyone with this player accordingly
     * @param updateMaster used to send global change
     */
    public void informFriends(boolean updateMaster) {
        if(updateMaster && WorldModule.isCommercial()) {
            WorldModule.getLogic().getLoginSession().sendPlayerUpdate(player, player.getStatus());
        }
        appendInteraction(player);
    }

    public void finishRequest(int type, int ccOwnerUID, String usernameCCName) {
        if(ccOwnerUID == -1 && type < 2) {
            player.getProtocol().sendMessage("Could not find player - "+usernameCCName);
        } else {
            if(type == 0) {
                appendFriend(ccOwnerUID, usernameCCName, Communications.ClanRank.FRIEND.ordinal()); //for saving
                sendFriend(ccOwnerUID, usernameCCName);
            } else if(type == 1) {
                    //appendignore
                    //sendignore
            } else if(type == 2) {
                Communications com = WorldModule.getLogic().getClanData().get(ccOwnerUID); //coming null
                int valud = com == null ? -5 : com.joinResponse(player, true);
                if(com != null && valud == 0) {
                    for(Map.Entry<String, Communicable> comm : com.getClanChat().getInChat().entrySet()) {
                        if(comm.getValue().getWorldId() == WorldModule.getLogic().getId()) {
                            //later check if they are still in cc otherwise update shit
                            Player p1 = WorldModule.getLogic().getPlayerFromStaticIndex(comm.getValue().getStaticIndex());
                            if(comm.getValue().getStaticIndex() == player.getStaticIndex()) {
                                p1.getCommunication().setClanIdentifier(com.uid);
                                p1.getProtocol().sendClanChat(com);
                            } else {
                                p1.getProtocol().editCCMember(player.getUsername(), WorldModule.getLogic().getId(), com.getRank(player.getStaticIndex()).getId(), false);
                            }
                        }
                    }
                    basic().currentChat = com.getClanChat().getChatName(); //easier to access
                    player.getProtocol().sendMessage("Now talking in clan channel " + NameUtilities.capitalizeFormat(com.getClanChat().getChatName()));
                    player.getProtocol().sendMessage("To talk, start each line of chat with the / symbol.");
                } else {
                    player.sendMessage("System busy - please try again later. -"+valud); //hm
                }
            } else {
                String msg =    type == -1 ? "You do not have a high enough rank to join this friends chat channel." :
                                type == -2 ? "The channel you tried to join is currently full." :
                                type == -3 ? "You are not allowed to join this user's friends chat channel." :
                                             "The channel you tried to join does not exist.";
                player.getProtocol().sendMessage(msg);
            }
        }
    }

    public void leaveCC(Communications com) {
        for(Map.Entry<String, Communicable> comm : com.getClanChat().getInChat().entrySet()) {
            if(comm.getValue().getWorldId() == WorldModule.getLogic().getId()) {
                //later check if they are still in cc otherwise update shit
                Player p1 = WorldModule.getLogic().getPlayerFromStaticIndex(comm.getValue().getStaticIndex());
                if(comm.getValue().getStaticIndex() == player.getStaticIndex()) {
                    p1.getCommunication().setClanIdentifier(0);
                    p1.getProtocol().sendClanChat(null);
                    p1.getCommunication().basic().currentChat = "";
                    player.sendMessage("You have left the channel.");
                } else {
                    if(p1 != null && p1.isOnline()) {//if double logout will have problems?
                        p1.getProtocol().editCCMember(player.getUsername(), WorldModule.getLogic().getId(), com.getRank(player.getStaticIndex()).getId(), true);
                    }
                }
            }
        }

    }


    @Override
    public void release() {
        release(false);
    }

    @Override
    public void release(boolean destroyClan) {
        if(destroyClan) {

        } else {
            //basic().hasChat()
            informFriends(false);
        }
    }

    public boolean hasFriend(int staticIndex) {
        return communications.hasFriend(staticIndex);
    }

    public boolean hasFriends() {
        return communications.hasFriends();
    }

    public Communications basic() {
        return communications;
    }

    private int clanIdentifier = 0;

    public boolean isInClanChat() {
        return clanIdentifier != 0;
    }

    public void setClanIdentifier(int identifier) {
        this.clanIdentifier = identifier;
    }

    public int getClanChat() {
        return clanIdentifier;
    }

    public boolean hasIgnore(int staticIndex) {
        return communications.hasIgnore(staticIndex);
    }
}
