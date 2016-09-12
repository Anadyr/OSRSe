/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.protocol;

import org.osrse.game.logic.item.ItemCollection;
import org.osrse.model.commercial.Communications;
import org.osrse.network.PacketBuilder;

import java.util.List;

/**
 * @author Jonathan
 */
public interface RunescapeProtocol {

    void applyLoginEssentials();

    void sendMapRegion();

    void sendWindow(int window);

    void sendTab(int tabId, int childId);

    void sendTabs();

    void sendChatBox();

    void sendSkill(int skill);

    void sendMessage(String message);

    void sendRunEnergy();

    void sendPlayerOption(String option, int slot, boolean top);

    void sendString(int interfaceId, int child, String string);

    void sendConfig(int configId, int value);

    void sendInterfaceConfig(int interfaceId, int childId, boolean hidden);

    void sendIgnoreList();

    void sendFriendList();

    void sendPrivatePreferences(int preference);

    void sendSystemUpdate(int time);

    void sendUpdateItems(int interfaceId, int childId, int type, ItemCollection items);

    void sendUpdateItems(int interfaceId, int childId, int type, List<int[]> items);

    void sendRunScript(int id, Object[] params, String types);

    void sendClanChat(Communications communications);

    void sendAccessMask(int interfaceId, int childId, int set, int offset, int length);

    void sendInterface(int closeable, int windowId, int interfaceId, int childId);

    void sendCloseInterface(int interfaceId, int child);

    void sendCloseInterface(int child);

    void sendInterface(boolean closeable, int interfaceId);

    void sendInterfaceInventory(int inventoryInterfaceId);

    void sendLogout();

    void sendRecievedPm(String sender, int[] uid, int rights, int length, byte[] message);

    void sendSentPm(String sender, int length, byte[] message);

    void sendFriend(boolean warn, String username, int clanRank, int world);

    void putFriend(PacketBuilder buffer, boolean warn, String username, int clanRank, int world);

    void sendSong(int songId);

    void sendUpdateInterface(InterfaceUpdate type);

    void sendClanChatMsg(String playerName, String clanName, int rights, int length, byte[] huffmanMsg);

    void editCCMember(String username, int world, int rank, boolean remove);

    enum InterfaceUpdate {Magic, Combat, Prayer}
}
