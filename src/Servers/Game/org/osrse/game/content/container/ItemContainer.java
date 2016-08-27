/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content.container;

import org.osrse.game.logic.item.ItemDefinition;
import org.osrse.game.logic.player.Player;

/**
 *
 * @author Jonathan
 */
public class ItemContainer {

    public static void handleExamine(Player player, int item){
         player.sendMessage(ItemDefinition.get(item).toString());
    }
}
