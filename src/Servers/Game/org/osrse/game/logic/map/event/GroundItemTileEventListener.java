package org.osrse.game.logic.map.event;


import org.osrse.game.logic.item.GroundItem;
import org.osrse.game.logic.map.Tile;

public interface GroundItemTileEventListener extends TileEventListener {
    void onGroundItemEvent(GroundItem item, Tile tile);
}
