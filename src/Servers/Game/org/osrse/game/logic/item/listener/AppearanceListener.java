package org.osrse.game.logic.item.listener;

import org.osrse.WorldModule;
import org.osrse.game.content.Renderer;
import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.item.ItemCollectionListener;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.utility.LogicConstants;

/**
 * @author Lazaro
 */
public class AppearanceListener implements ItemCollectionListener {
    public static final AppearanceListener INSTANCE = new AppearanceListener();

    public void event(Player player, ItemCollection itemList, EventType type) {
        if (type == EventType.REFRESH) {
            Renderer.startRender(player, player.getEquipment().get(LogicConstants.Equipment.WEAPON_SLOT));
            player.basicSettings().setCachedAppearanceBlock(WorldModule.getLogic().getProtocol().doAppearanceBlock(player));
            player.getMasks().setAppearanceUpdate(true);
        }
    }

    public void refresh(Player player, ItemCollection itemList) {
        // To change body of implemented methods use File | Settings | File
        // Templates.
    }

    public void refresh(Player player, ItemCollection itemList, int index) {
        // To change body of implemented methods use File | Settings | File
        // Templates.
    }
}
