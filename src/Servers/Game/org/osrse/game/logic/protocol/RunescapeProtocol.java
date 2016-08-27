/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.protocol;

import org.osrse.model.commercial.Communications;
import org.osrse.network.PacketBuilder;
import org.osrse.game.logic.item.ItemCollection;

import java.util.List;

/**
 * @author Jonathan
 */
public interface RunescapeProtocol {

    public enum InterfaceUpdate {Magic, Combat, Prayer};

    public void applyLoginEssentials();

    public void sendMapRegion();

    public void sendWindow(int window);

    public void sendTab(int tabId, int childId);

    public void sendTabs();

    public void sendChatBox();

    public void sendSkill(int skill);

    public void sendMessage(String message);

    public void sendRunEnergy();

    public void sendPlayerOption(String option, int slot, boolean top);

    public void sendString(int interfaceId, int child, String string);

    public void sendConfig(int configId, int value);

    public void sendInterfaceConfig(int interfaceId, int childId, boolean hidden);

    public void sendIgnoreList();

    public void sendFriendList();

    public void sendPrivatePreferences(int preference);

    public void sendSystemUpdate(int time);

    public void sendUpdateItems(int interfaceId, int childId, int type, ItemCollection items);

    public void sendUpdateItems(int interfaceId, int childId, int type, List<int[]> items);

    public void sendRunScript(int id, Object[] params, String types);

    public void sendClanChat(Communications communications);

    public void sendAccessMask(int interfaceId, int childId, int set, int offset, int length);

    public void sendInterface(int closeable, int windowId, int interfaceId, int childId);

    public void sendInterfaceInventory(int inventoryInterfaceId);

    public void sendLogout();

    public void sendRecievedPm(String sender, int[] uid, int rights, int length, byte[] message);

    public void sendSentPm(String sender, int length, byte[] message);

    public void sendFriend(boolean warn, String username, int clanRank, int world);

    public void putFriend(PacketBuilder buffer, boolean warn, String username, int clanRank, int world);

    public void sendSong(int songId);

    public void sendUpdateInterface(InterfaceUpdate type);

    public void sendClanChatMsg(String playerName, String clanName, int rights, int length, byte[] huffmanMsg);

    void editCCMember(String username, int world, int rank, boolean remove);
}
