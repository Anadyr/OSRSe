package org.osrse.update.r103;

import org.osrse.WorldModule;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.Skills;
import org.osrse.game.logic.protocol.AbstractProtocol;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.update.Update103;
import org.osrse.utility.NameUtilities;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Jonathan on 10/29/15.
 */
public class Proto103 extends AbstractProtocol {

    public Proto103(Player player) {
        super(player);
    }

    @Override
    public void applyLoginEssentials() {
        sendMapRegion();
        sendWindow(165);
        player.write(new PacketBuilder(212).putByte(0).putByte(0).toPacket());
        //player.write(newcache PacketBuilder(143).putInt(-2135842399).toPacket()); //wtf lol
        player.write(new PacketBuilder(156).toPacket());
        player.write(new PacketBuilder(137).toPacket()); //wtf lol
        player.write(new PacketBuilder(222).toPacket()); //wtf lol
        player.write(new PacketBuilder(153).putByte(0).toPacket()); //wtf lol
        player.write(new PacketBuilder(183).toPacket()); //wtf lol


        //PacketBuilder pb = new PacketBuilder(171 , Packet.Type.VAR_SHORT);
        //pb.putShort(548).putShort(0).putInt(14286941).putShort(1).putShort(218).putInt(2);
               // putInt(10813453).putShort(218).putByte(0);

        //player.write(pb.toPacket());
        sendTabs();
        sendMessage("Welcome to RuneScape");
        for (int i = 0; i < Skills.SKILL_COUNT; i++) {
                sendSkill(i);
        }

        //sendRunScript(233, new Integer[]{7185, 622, 0, 1909, 33, 0, 0, 29681, 3276805}, "ImiiiiiiA");
        //sendRunScript(233, new Integer[]{613, 672, 0, 131, 15, 15, 0, 16, 3276805}, "ImiiiiiiA");
        //sendRunScript(1080, new String[]{""}, "s");

        int i = 0;

        sendConfigs();
        //sendFriendList();
        /*
        pb.putShort(165).putShort(i).
                        putInt(10813463).putShort(160).putByte(1).
                        putInt(10813448).putShort(320).putByte(1).
                        putInt(10813456).putShort(432).putByte(1).
                        putInt(10813459).putShort(216).putByte(1).
                        putInt(10813447).putShort(593).putByte(1).
                        putInt(10813441).putShort(162).putByte(1).
                        putInt(10813467).putShort(378).putByte(0).
                        putInt(10813466).putShort(50).putByte(0).
                        putInt(10813449).putShort(274).putByte(1).
                        putInt(10813453).putShort(218).putByte(1).
                        putInt(10813462).putShort(163).putByte(1).
                        putInt(10813451).putShort(387).putByte(1).
                        putInt(10813450).putShort(149).putByte(1).
                        putInt(10813455).putShort(429).putByte(1).
                        putInt(10813458).putShort(261).putByte(1).
                        putInt(10813454).putShort(589).putByte(1).
                        putInt(10813457).putShort(182).putByte(1).
                        putInt(10813452).putShort(271).putByte(1).
                        putInt(10813460).putShort(239).putByte(1).
                        putInt(14155777).putShort(0).putShort(43).putInt(2).
                        putInt(15663105).putShort(0).putShort(507).putInt(2).
                        putInt(17104972).putShort(1).putShort(4).putInt(2).
                        putInt(17104973).putShort(1).putShort(4).putInt(2);*/


        /*
        opcode=80
            Packet 80 ImiiiiiiA, [233, 3276804, 29681, 0, 0, 33, 1909, 0, 622, 7185]
            opcode=80
            Packet 80 ImiiiiiiA, [233, 3276805, 16, 0, 15, 15, 131, 0, 672, 613]
            opcode=80
            Packet 80 s, [1080, ]
         */


    }

    @Override
    public void sendMapRegion() {
        player.write(((Update103) WorldModule.getLogic().getProtocol()).getMapUpdate(false, player).toPacket());
    }

    @Override
    public void sendWindow(int window) {
        player.getSession().write(new PacketBuilder(208).putLEShort(window).toPacket());
    }

    void sendInterfaceSets(int fromroot, int fromchild, int toroot, int tochild) {
        System.out.println((toroot << 16 | tochild) + "/" + (fromroot << 16 | fromchild));
        //  player.getSession().write(newcache PacketBuilder(29).putInt((fromroot << 16 | fromchild)).putInt1((toroot << 16 | tochild)).toPacket());
    }

    @Override
    public void sendTab(int interfaceId, int childId) {
        sendInterface(0, player.getScreenDisplay().getWindowId(), interfaceId, childId);
    }

    @Override
    public void sendTabs() {
        sendChatBox();
        System.out.println(player.getScreenDisplay().getWindowId());
        switch (player.getScreenDisplay()) {
            case Fixed:
                sendTab(593, 62); //cmb
                sendTab(320, 63); //skills
                sendTab(274, 64); //quest
                sendTab(149, 65); //inv
                sendTab(387, 66); //equip
                sendTab(271, 67); //prayer
                //sendTab(player.getMagic().type().getInterfaceId(), 93);
                // PacketBuilder spb = new PacketBuilder(158).putShort(interfaceId).putLEInt(windowId << 16 | childId).putByteS(closeable);
                sendTab(player.getMagic().type().getOldSchoolId(), 68);
                sendTab(589, 69); //cc
                sendTab(429, 70); //fl
                sendTab(432, 71); //il
                sendTab(182, 72); //logout
                sendTab(261, 73); //settings
                sendTab(216, 74); //emotes
                sendTab(239, 75); //music
                break;
            case Resizeable_FixedPanel:
                sendTab(593, 60); //cmb
                sendTab(320, 61); //skills
                sendTab(274, 62); //quest
                sendTab(149, 63); //inv
                sendTab(387, 64); //equip
                sendTab(271, 65); //prayer
                //sendTab(player.getMagic().type().getInterfaceId(), 93);
                // PacketBuilder spb = new PacketBuilder(158).putShort(interfaceId).putLEInt(windowId << 16 | childId).putByteS(closeable);
                sendTab(player.getMagic().type().getOldSchoolId(), 66);
                sendTab(589, 67); //cc
                sendTab(429, 68); //fl
                sendTab(432, 69); //il
                sendTab(182, 70); //logout
                sendTab(261, 71); //settings
                sendTab(216, 72); //emotes
                sendTab(239, 73); //music
                break;
            case Resizeable_Panel:
                //60 quest
                sendTab(593, 58);
                sendTab(320, 59);
                sendTab(274, 60);
                sendTab(149, 61);
                sendTab(387, 62);
                sendTab(271, 63);
                sendTab(player.getMagic().type().getOldSchoolId(), 64);
                sendTab(589, 65);
                sendTab(429, 66);
                sendTab(432, 67);
                sendTab(182, 68);
                sendTab(261, 69);
                sendTab(216, 70);
                sendTab(239, 71);
                /**/
                break;
        }
/*
        int modifier = player.getScreenDisplay() == Player.Display.Fixed ? 0 : 2;
        sendTab(593, player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 7:(62-modifier));
        sendTab(320,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 8:(63-modifier));
        sendTab(274,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 9:(64-modifier));
        sendTab(149,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 10:(65-modifier));
        sendTab(387,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 11:(66-modifier));
        sendTab(271,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 12:(67-modifier));
        //sendTab(player.getMagic().type().getInterfaceId(), 93);
        // PacketBuilder spb = new PacketBuilder(158).putShort(interfaceId).putLEInt(windowId << 16 | childId).putByteS(closeable);
        sendTab(player.getMagic().type().getOldSchoolId(),  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 13:(68-modifier));
        sendTab(589,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 14:(69-modifier));
        sendTab(429,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 15:(70-modifier));
        sendTab(432,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 16:(71-modifier));
        sendTab(182,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 17:(72-modifier));
        sendTab(261,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 18:(73-modifier));
        sendTab(216,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 19:(74-modifier));
        sendTab(239,  player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 20:(75-modifier));

        //sendTab(224, 18); //neitiz travel map lol*/


    }

    @Override
    public void sendChatBox() {
        sendTab(162, player.getScreenDisplay() == Player.Display.Resizeable_Panel ? 1 : player.getScreenDisplay() == Player.Display.Fixed ? 20 : 21);//chatbox
    }

    @Override
    public void sendSkill(int skill) {
        PacketBuilder bldr = new PacketBuilder(237);
        bldr.putInt((int) player.getSkills().getExperience(skill));
        if (skill == Skills.PRAYER) {
            bldr.putS((byte) (Math.ceil(player.getSkills().getPrayerPoints())));
        } else {
            bldr.putS((byte) player.getSkills().getLevel(skill));
        }
        bldr.putC((byte) skill);
        player.getSession().write(bldr.toPacket());
    }

    @Override
    public void sendMessage(String message) {
        player.getSession().write(new PacketBuilder(145, Packet.Type.VAR_BYTE).putSmart(0).putByte(0).putString(message).toPacket());
    }

    @Override
    public void sendRunEnergy() {

    }

    @Override
    public void sendPlayerOption(String option, int slot, boolean top) {
        player.getSession().write(new PacketBuilder(82, Packet.Type.VAR_BYTE).putString(option).putByteA(0).putByteC(slot).toPacket());
    }

    @Override
    public void sendString(int interfaceId, int child, String string) {
        player.getSession().write(new PacketBuilder(110, Packet.Type.VAR_SHORT).putInt(interfaceId << 16 | child).putString(string).toPacket());
    }

    private void sendConfigs() {
        sendConfig(18, 1);
        sendConfig(43, 1);
        sendConfig(101, 0);
        sendConfig(166, 2);
        sendConfig(167, 0);
        sendConfig(168, 4);
        sendConfig(169, 4);
        sendConfig(170, 0);
        sendConfig(171, 0);
        sendConfig(173, 1);
        sendConfig(287, 0);

        sendUpdateInterface(InterfaceUpdate.Magic);
        sendConfig(406, 20);
        sendConfig(447, -1);
        sendConfig(520, 1);
        sendConfig(849, -1);
        sendConfig(850, -1);
        sendConfig(851, -1);
        sendConfig(852, -1);
        sendConfig(853, -1);
        sendConfig(854, -1);
        sendConfig(855, -1);
        sendConfig(856, -1);
        sendConfig(872, 4);
        sendConfig(1065, -1);
        sendConfig(1074, 0);
        sendConfig(1075, -1);
        sendConfig(1071, 0);
        sendConfig(1151, -1);
        sendConfig(1226, 12);
        sendConfig(1306, 0);
    }

    @Override
    public void sendConfig(int configId, int value) {
        PacketBuilder bldr = new PacketBuilder(value > 127 ? 192 : 201);
        if(value > 127) {
            bldr.putInt(value);
            bldr.putLEShort(configId);
        } else {
            bldr.putByteA(value);
            bldr.putShortA(configId);
        }
        player.getSession().write(bldr.toPacket());

    }

    @Override
    public void sendInterfaceConfig(int interfaceId, int childId, boolean hidden) {

    }

    @Override
    public void sendIgnoreList() {
        if(!player.getCommunication().basic().getIgnores().isEmpty()) {
            PacketBuilder pb = new PacketBuilder(107, Packet.Type.VAR_SHORT);
            for (String name : player.getCommunication().basic().getIgnores().values()) {
                pb.putByte(0).putString(name).putString("").putByte(0);
            }
            player.getSession().write(pb.toPacket());
        }
    }



    @Override
    public void sendFriendList() {
        player.getCommunication().informFriends(false);
        PacketBuilder pb = new PacketBuilder(165, Packet.Type.VAR_SHORT);
        if(player.getCommunication().hasFriends())
               pb.put(player.getCommunication().getFriendsList()).toPacket();
        player.getSession().write(pb.toPacket());
    }

    public final void sendFriend(boolean warn, String username, int clanRank, int world) {
        PacketBuilder p = new PacketBuilder(165, Packet.Type.VAR_SHORT);
        putFriend(p, warn, username, clanRank, world);
        player.getSession().write(p.toPacket());
    }

    public final void putFriend(PacketBuilder buffer, boolean warn, String username, int clanRank, int world) {
        buffer.putByte(warn ? 0 : 1).putString(username).putByte(0)
                                    .putShort(world)
                                    .putByte(clanRank).putByte(0);
                                    if(world != 0) {
                                        buffer.putByte(0).putByte(8).putInt(0);
                                    }
                                    buffer.putByte(0);
    }

    @Override
    public void sendSong(int songId) {

    }

    @Override
    public void sendUpdateInterface(InterfaceUpdate type) {
        if(type == InterfaceUpdate.Magic) {
            sendConfig(439, player.getMagic().type().ordinal());
        }
    }

    @Override
    public void sendPrivatePreferences(int preference) {

    }

    @Override
    public void sendSystemUpdate(int time) {

    }

    public final void sendUpdateItems(int interfaceId, int childId, int type, ItemCollection items) {
        PacketBuilder bldr = new PacketBuilder(160, Packet.Type.VAR_SHORT);
        bldr.putInt(interfaceId << 16 | childId);
        bldr.putShort(type);
        bldr.putShort(items.capacity());
        for (Item item : items.toArray(new Item[0])) {
            if (item != null) {
                bldr.putLEShortA(item.getType() + 1);
                int count = item.getAmount();
                if (count > 254) {
                    bldr.put((byte) 255);
                    bldr.putInt1(count);
                } else {
                    bldr.put((byte) count);
                }
            } else {
                bldr.putLEShortA(0);
                bldr.put((byte) 0);
            }
        }
        player.write(bldr.toPacket());
    }

    public final void sendUpdateItems(int interfaceId, int childId, int type, List<int[]> items) {
        PacketBuilder bldr = new PacketBuilder(160, Packet.Type.VAR_SHORT);
        bldr.putInt(interfaceId << 16 | childId);
        bldr.putShort(type);
        bldr.putShort(items.size());
        for (int[] item : items) {
            bldr.putShort(item[0] + 1);
            if (item[1] > 254) {
                bldr.putByte((byte) 255);
                bldr.putInt(item[1]);
            } else {
                bldr.putByte(item[1]);
            }
        }
        player.write(bldr.toPacket());
    }

    /**
     * Sends a clientscript to the client.
     *
     * @param id     The id.
     * @param params Any parameters in the scrips.
     * @param types  The script types
     * @return The action sender instance, for chaining.
     */
    public final void sendRunScript(int id, Object[] params, String types) {
        PacketBuilder bldr = new PacketBuilder(80, Packet.Type.VAR_SHORT);
        bldr.putString(types);
        if (params.length > 0) {
            int j = 0;
            for (int i = types.length() - 1; i >= 0; i--, j++) {
                if (types.charAt(i) == 115) {
                    bldr.putString((String) params[j]);
                } else {
                    bldr.putInt((Integer) params[j]);
                }
            }
        }
        bldr.putInt(id);
        player.write(bldr.toPacket());
    }


    @Override
    public void sendClanChatMsg(String playerName, String clanName, int icon, int length, byte[] huffmanMsg) {
        PacketBuilder pb = new PacketBuilder(214, Packet.Type.VAR_BYTE);
        pb.putString(playerName);
        System.out.println("clan="+clanName+", msg="+length+"/"+NameUtilities.stringToLong(NameUtilities.capitalizeFormat(clanName))+"/"+icon);
        pb.putLong(NameUtilities.stringToLong(NameUtilities.capitalizeFormat(clanName)));
        pb.putShort(new Random().nextInt());
        pb.putTriByte(new Random().nextInt());
        pb.putByte(icon);
        //pb.putSmart(length);
        pb.put(huffmanMsg, 0, length);

        player.write(pb.toPacket());
    }

    public void editCCMember(String username, int world, int rank, boolean remove) {
        PacketBuilder pb = new PacketBuilder(116, Packet.Type.VAR_BYTE);
        pb.putString(username)
                .putShort(world)
                .putByte(remove ? -128 : rank);
        if(!remove)
            pb.putByte(0);
        player.write(pb.toPacket());
    }
      
    @Override
    public void sendClanChat(Communications com) {
        PacketBuilder pb = new PacketBuilder(84, Packet.Type.VAR_SHORT);
        System.out.println(player.getCommunication().isInClanChat());
        if(com != null && player.getCommunication().isInClanChat()) {
            pb.putString(com.username());
            pb.putLong(NameUtilities.stringToLong(NameUtilities.capitalizeFormat(com.getClanChat().getChatName())));
            //if !cc delete assimilate
            pb.putByte(0);

            //make sure this is valid
            pb.putByte(com.getClanChat().getInChat().size());

            //find out if we need to send this packet to add people to chat
            for(Map.Entry<String, Communicable> l : com.getClanChat().getInChat().entrySet()) {
                System.out.println("cc member="+l.getValue().getUsername());
                pb.putString(l.getValue().getUsername());
                pb.putShort(l.getValue().getWorldId());
                pb.putByte(com.getRank(l.getValue().getStaticIndex()).getId());
                pb.putByte(0);
            }
        }
        player.write(pb.toPacket());
    }

    @Override
    public void sendAccessMask(int interfaceId, int childId, int set, int offset, int length) {
        PacketBuilder pb = new PacketBuilder(196);
        pb.putShortA(length);
        pb.putLEInt(interfaceId << 16 | childId);
        pb.putLEShort(offset);
        pb.putInt(set);
        player.write(pb.toPacket());
        //pb.putLEShortA(range2).putLEInt(interfaceId << 16 | childId).putLEShortA(0).putShortA(range1).putInt2(interfaceId2 << 16 | childId2);
    }

    @Override
    public void sendInterface(int closeable, int windowId, int interfaceId, int childId) {
        PacketBuilder spb = new PacketBuilder(158).putShort(interfaceId).putLEInt(windowId << 16 | childId).putByteS(closeable);
        player.getSession().write(spb.toPacket());
    }

    @Override
    public void sendInterface(boolean closeable, int interfaceId) {//11 164
        sendInterface(closeable ? 1 : 0, player.getScreenDisplay().getWindowId(), interfaceId, player.getScreenDisplay() == Player.Display.Fixed ? 18 : 11);
    }

    @Override
    public void sendCloseInterface(int interfaceId, int child) {
        player.write(new PacketBuilder(244).putInt(interfaceId << 16 | child).toPacket());
    }

    @Override
    public void sendCloseInterface(int child) {
        sendCloseInterface(player.getScreenDisplay().getWindowId(), child);
    }


    @Override
    public void sendInterfaceInventory(int inventoryInterfaceId) {

    }

    @Override
    public void sendLogout() {
        player.logout();
        player.getSession().write(new PacketBuilder(151).toPacket());
    }

    public final void sendRecievedPm(String sender, int[] uid, int rights, int length, byte[] message) {
        PacketBuilder pb = new PacketBuilder(1, Packet.Type.VAR_SHORT);
        pb.putString(sender).putShort(uid[0]).putTriByte(uid[1]).putByte(rights).putSmart(length).put(message);
        player.getSession().write(pb.toPacket());

    }

    public void sendSentPm(String reciever, int length, byte[] message) {
        PacketBuilder pb = new PacketBuilder(199, Packet.Type.VAR_SHORT);
        pb.putString(reciever).putSmart(length).put(message);
        player.getSession().write(pb.toPacket());
    }

}
