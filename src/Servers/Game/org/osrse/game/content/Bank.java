/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content;

import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.item.ItemDefinition;
import org.osrse.game.logic.player.Player;

import java.util.ArrayList;

/**
 * @author Lazaro, Jonathan
 */
public class Bank {

    public static void clear(Player player) {
        for (int i = 0; i < player.getBank().size(); i++)
            player.getBank().set(i, new int[]{-1, 0});
        refresh(player);
    }

    public static boolean contains(Player player, int itemId) {
        return contains(player, itemId, 1);
    }

    public static boolean contains(Player player, int itemId, int amount) {
        for (int i = 0; i < player.getBank().size(); i++) {
            if (player.getBank().get(i)[0] == itemId && player.getBank().get(i)[1] >= amount)
                return true;
        }
        return false;
    }

    public static void depositEquipment(Player player) {
        final int slots = (getFreeSlots(player) < 14 ? getFreeSlots(player) : 14);
        boolean update = false;
        for (int i = 0; i < slots; i++) {
            final Item equip = player.getEquipment().get(i);
            if (equip == null)
                continue;
            final int[] item = new int[]{equip.getType(), equip.getAmount()};
            player.getEquipment().remove(i);
            final int index = getItemIndex(player, item[0]);
            if (index > -1)
                player.getBank().set(index, new int[]{item[0], player.getBank().get(index)[1] + item[1]});
            else {
                player.getBank().set(getFreeSlot(player), new int[]{item[0], item[1]});
                update = true;
            }
        }
        if (update) {
            reorder(player);
        }
        player.getEquipment().refresh();
        refresh(player);
    }

    public static void depositInventory(Player player) {
        final int slots = (getFreeSlots(player) < 28 ? getFreeSlots(player) : 28);
        boolean update = false;
        for (int i = 0; i < slots; i++) {
            final Item invo = player.getInventory().get(i);
            if (invo == null)
                continue;


            final int trueId = invo.getType();
            final int itemId = invo.getRealId();
            int amt = invo.getAmount();

            if(Bank.contains(player, itemId)) {
                int initAmt = Bank.getAmount(player, itemId);
                if(Integer.MAX_VALUE - initAmt <= invo.getAmount()) {
                    amt = Integer.MAX_VALUE - initAmt;
                    player.getProtocol().sendMessage("Not enough space in your bank.");
                    if(amt == 0) continue;
                }
            }
            final int[] item = new int[]{invo.getType(), amt};
            player.getInventory().remove(trueId, amt);
            final int index = getItemIndex(player, itemId);
            if (index > -1) {
                player.getBank().set(index, new int[]{itemId, player.getBank().get(index)[1] + item[1]});
            } else {
                player.getBank().set(getFreeSlot(player), new int[]{itemId, item[1]});
                update = true;
            }
        }
        if (update) {
            reorder(player);
        }
        player.getInventory().refresh();
        refresh(player);
    }

    public static int getAmount(Player player, int itemId) {
        for (int i = 0; i < player.getBank().size(); i++) {
            if (player.getBank().get(i)[0] == itemId)
                return player.getBank().get(i)[1];
        }
        return 0;
    }

    public static int getFreeSlot(Player player) {
        return getItemIndex(player, -1);
    }

    public static int getFreeSlots(Player player) {
        int slots = 0;
        for (int i = 0; i < player.getBank().size(); i++)
            if (player.getBank().get(i)[0] == -1)
                slots++;
        return slots;
    }

    public static int getItemIndex(Player player, int itemId) {
        int index = -1;
        for (int i = 0; i < player.getBank().size(); i++)
            if (player.getBank().get(i)[0] == itemId) {
                index = i;
                break;
            }
        return index;
    }


    public static void openBank(Player player) {
        player.getProtocol().sendInterface(0, 548, 12, 13);
        //player.getProtocol().sendInterfaceInventory(15);
        //refresh(player);
    }


    public static void refresh(Player player) {
        final int free = player.getBank().size() - getFreeSlots(player);
        player.getProtocol().sendUpdateItems(12, -1, 95, player.getBank());

        player.getProtocol().sendString(12, 3, "" + free);
        player.getProtocol().sendString(12, 5, "" + player.getBank().size());

        player.getProtocol().sendAccessMask(12, 6, 2046, 0, 424);
        player.getProtocol().sendAccessMask(15, 0, 2046, 0, 28);
        /*
        [7:28:20 PM] Greco: player.getActionSender().sendAccessMask(0, 799, 1311998, 12 << 16 | 12);
                              player.getActionSender().sendAccessMask(809, 817, 2, 12 << 16 | 12);
                              player.getActionSender().sendAccessMask(818, 827, 1048576, 12 << 16 | 12);
                              player.getActionSender().sendAccessMask(10, 10, 1048578, 12 << 16 | 10);
                              player.getActionSender().sendAccessMask(11, 19, 1179714, 12 << 16 | 10);
                              player.getActionSender().sendAccessMask(0, 27, 1181438, 15 << 16 | 3);
                              player.getActionSender().sendAccessMask(0, 27, 1054, 15 << 16 | 12);
                              player.getActionSender().sendAccessMask(0, 3, 2, 12 << 16 | 32);
                              player.getActionSender().sendAccessMask(1054, 15, 10, 0, 27);
                            [7:29:43 PM] Greco: int set, int interfaceId, int child, int offset, int lengt
         */

    }

    public static void removeItem(Player player, int slot, int amount) {
        int itemId = player.getBank().get(slot)[0];
        final int index = getItemIndex(player, itemId);
        if (index == -1)
            return;
        if (amount > getAmount(player, itemId))
            amount = getAmount(player, itemId);
        boolean asNote = false;
        if (player.basicSettings().isNoted()) {
            if (ItemDefinition.get(itemId).superId != 0)
                asNote = true;
            else {
                player.getProtocol().sendMessage("This item cannot be withdrawn as a note.");
            }
        }
        if (amount > player.getInventory().remaining()) {
            if (player.getInventory().hasRoomFor((asNote ? ItemDefinition.get(itemId).superId : itemId), amount)) {
                amount = player.getInventory().remaining();
            }
        }
        if (amount <= 0)
            return;
        boolean worked = player.getInventory().add(new Item(asNote ? ItemDefinition.get(itemId).superId : itemId, amount));
        if (worked) {
            final int[] item = new int[]{itemId, player.getBank().get(index)[1] - amount};
            //System.out.println(item[1]);
            if (item[1] <= 0) {
                player.getBank().set(index, new int[]{-1, 0});
                reorder(player);
            } else {
                player.getBank().set(index, item);
            }
            refresh(player);
            player.getInventory().refresh();
        }
    }

    /**
     * Items have to be in order by their tab ids. Also, tab 0, which is the
     * master tab, must come last.
     */
    public static void reorder(Player player) {
        final ArrayList<int[]> toAdd = new ArrayList<int[]>();
        while (true) {
            for (int i = 0; i < player.getBank().size(); i++) {
                final int[] item = player.getBank().get(i);
                toAdd.add(item);
            }
            break;
        }
        player.getBank().clear();
        for (int[] add : toAdd)
            player.getBank().add(add);
    }


    public static boolean storeItem(Player player, int slot, int amount) {
        final Item item = player.getInventory().get(slot);
        if (item == null)
            return false;
        if (amount > player.getInventory().getAmount(item.getType()))
            amount = player.getInventory().getAmount(item.getType());
        if (amount <= 0)
            return false;
        int itemId = item.getType();
        if (item.getDefinition().noted) {
            itemId = item.getDefinition().superId;
        }
        final int containId = getItemIndex(player, itemId);
        if (containId > -1)
            player.getBank().set(containId, new int[]{itemId, player.getBank().get(containId)[1] + amount});
        else {
            if (getFreeSlots(player) > 0) {
                player.getBank().set(getFreeSlot(player), new int[]{itemId, amount});
                reorder(player);
            } else {
                player.getProtocol().sendMessage("Not enough space in your bank. - " + getFreeSlots(player));
                return false;
            }
        }
        player.getInventory().remove(item.getType(), amount);
        player.getInventory().refresh();
        refresh(player);
        return true;
    }

    public static void swap(Player player, int fromSlot, int toSlot) {
        final int[] item1 = player.getBank().get(fromSlot);
        final int[] item2 = player.getBank().get(toSlot);
        if (!contains(player, item1[0]) || !contains(player, item2[0]))
            return;
        player.getBank().set(fromSlot, new int[]{item2[0], item2[1]});
        player.getBank().set(toSlot, new int[]{item1[0], item1[1]});
        refresh(player);
    }
}