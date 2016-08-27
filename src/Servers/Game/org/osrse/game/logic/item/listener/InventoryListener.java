package org.osrse.game.logic.item.listener;
  
import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.item.ItemCollectionListener;
import org.osrse.game.logic.player.Player;

/**
 * @author Lazaro
 */
public class InventoryListener implements ItemCollectionListener {
    public static final InventoryListener INSTANCE = new InventoryListener();

    public void event(Player player, ItemCollection itemList, EventType type) {
        switch (type) {
            case REFRESH:
                player.getProtocol().sendUpdateItems(149, 0, 93, itemList);
                //player.calculateWeight();
                break;
            case FULL:
                player.getProtocol().sendMessage("There is not enough space in your inventory.");
                break;
        }
    }

    public void refresh(Player player, ItemCollection itemList) {
    }

    public void refresh(Player player, ItemCollection itemList, int index) {
    }
}
