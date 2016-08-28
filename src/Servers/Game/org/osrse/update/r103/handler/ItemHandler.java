package org.osrse.update.r103.handler;

import org.osrse.game.content.container.ItemContainer;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/28/2016.
 */
public class ItemHandler extends PacketHandler<Player> {

	//115 wield option 1
	//6 dismantle option 2/guzzle
	//50 drop/destroy option 3
	//158 examine option 4
	//187 eat/look at? item=7638
	//207 item on item
	//72 empty
	private static final int EXAMINE = 158, EQUIP = 115, UNEQUIP = 149;

	@Override
	public void handle(Player player, Packet packet) {
		player.sendMessage(""+packet.getOpcode());
		if (packet.getOpcode() == EXAMINE) {
			ItemContainer.handleExamine(player, (int) packet.getLEShortA());
		} else if(packet.getOpcode() == EQUIP) {
			int inventorySlot = packet.getLEShortA();
			int itemId = packet.getLEShortA();
			int widgetId = packet.getInt1();
			int interfaceId = widgetId >> 16;
			int button = widgetId & 0xffff;

			if (player.getAttribute("cutScene") != null) {
				return;
			}
			Item item = player.getInventory().get(inventorySlot);
			if (item == null) return;
			int slot = item.getDefinition().equipType;
			if (slot != -1) {
				//add 2 handed support here
				Item currEquipped = player.getEquipment().remove(slot);

				player.getInventory().remove(inventorySlot);
				player.getEquipment().add(item, slot);
				if (currEquipped != null) {
					player.getInventory().add(currEquipped);
				}
				player.getEquipment().refresh();
				player.getInventory().refresh();
			} else if (player.getInventory().isFull()) {
				player.getProtocol().sendMessage("full");
			}
		} else if(packet.getOpcode() == UNEQUIP) {

			int widgetid = packet.getInt();
			int oldItemId = packet.getShort();
			int oldEquipSlot = packet.getShort();

			int interfaceId = widgetid >> 16;
			if(interfaceId != 387) return;


			int button = widgetid & 0xffff;
			if (button >= 6 && button < 17) {
				int index = 0;
				 if (button == 16) {
					index = 13;
				} else if (button == 15) {
					index = 12;
				 } else if (button == 14) {
					 index = 10;
				} else if (button == 13) {
					index = 9;
				} else if (button == 12) {
					 index = 7;
				} else if (button == 11) {
					index = 5;
				}
				//System.out.println(widgetid + "/" + oldItemId + "/" + oldEquipSlot + "/" + button + "/" + interfaceId);

				if (player.getAttribute("cutScene") != null) {
					return;
				}
				Item item = player.getEquipment().get(index == 0 ? button - 6 : index);
				if (item == null) return;
				if (player.getInventory().add(item)) {
					Item i = player.getEquipment().remove(index == 0 ? button - 6 : index);
					if (i != null) {
						player.getEquipment().refresh();
						player.getInventory().refresh();
					}
				}
			}
		}
	}
}
