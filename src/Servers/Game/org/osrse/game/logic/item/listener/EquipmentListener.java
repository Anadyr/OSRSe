package org.osrse.game.logic.item.listener;
  
import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.item.ItemCollectionListener;
import org.osrse.game.logic.player.Player;

/**
 * @author Lazaro
 */
public class EquipmentListener implements ItemCollectionListener {
    public static final EquipmentListener INSTANCE = new EquipmentListener();

    public void event(Player player, ItemCollection itemList, EventType type) {
        if (type == EventType.REFRESH) { 
            player.getProtocol().sendUpdateItems(-1, 64208, 94, itemList);
        }
    }

    public void refresh(Player player, ItemCollection itemList) {
    }

    public void refresh(Player player, ItemCollection itemList, int index) {
    }
}
