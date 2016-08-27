package org.osrse.game.content.combat.activity;

import org.osrse.game.logic.item.ItemCollection;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/11/16.
 */
public abstract class CombatWorld {


    /**
     * Tells if the player is in a safe/guarded area
     * @param player
     * @return
     */
    public abstract boolean isSafe(Player player);

    /**
     * On pvp and regular worlds pvp is limited to wild levels/distance from safe areas
     * @param player
     * @return
     */
    public abstract int getWildLevelRange(Player player);

    /**
     * On pvp/deadman worlds this is used for the icon on the screen
     * @param player
     */
    public abstract void sendCombatPane(Player player);


    /**
     * For worlds with guaranteed safe spots
     * @return
     */
    public boolean isGuaranteedSafe() {
        return true;
    }

    public void handleDeath(Player player) {
        ItemCollection p = player.getEquipment();
        p.addAll(player.getInventory());
        int keep = (player.getSetting().isSkulled() ? 0 : 3);
        //+ prayer.getItemProtect();

        if(player.getSetting().isSkulled()) {

        }
    }



}
