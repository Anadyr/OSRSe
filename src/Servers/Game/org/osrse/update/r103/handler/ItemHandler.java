package org.osrse.update.r103.handler;

import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.item.ItemDefinition;
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
	private static final int EXAMINE = 158, EQUIP = 115;

	@Override
	public void handle(Player player, Packet packet) {
		player.sendMessage(""+packet.getOpcode());
		if (packet.getOpcode() == EXAMINE) {
			player.sendMessage(ItemDefinition.get(packet.getLEShortA()).toString());
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
		}
	}
}
