/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content;

import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.player.Player;

/**
 * @author Jonathan
 */
public class Renderer {

    /**
     * called only for weapon changes
     *
     * @param player
     * @param item
     */
    public static void startRender(Player player, Item item) {
        int run = 824, walk = 819, stand = 808;
        if (item != null) {
            if (item.getType() == 11802) {
                run = 7043;
                walk = 7052;
                stand = 7053;
            }
        }
        player.getAppearance().setWalkAnim(walk);
        player.getAppearance().setRunAnim(run);
        player.getAppearance().setStandAnim(stand);
    }

}
