/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.item;

import org.osrse.game.logic.player.Player;


/**
 * @author Lazaro
 */
public interface ItemCollectionListener {
    public static enum EventType {
        FULL, REFRESH
    }

    public void event(Player player, ItemCollection itemList, EventType type);

    public void refresh(Player player, ItemCollection itemList);

    public void refresh(Player player, ItemCollection itemList, int index);
}

