package org.osrse.game.logic.map.event;


import org.osrse.game.logic.Entity;
import org.osrse.game.logic.map.Tile;

public interface EntityTileEventListener extends TileEventListener {
    void onEntityEvent(Entity entity, Tile tile);
}
