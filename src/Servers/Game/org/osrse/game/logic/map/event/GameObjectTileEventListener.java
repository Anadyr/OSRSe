package org.osrse.game.logic.map.event;


import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.object.GameObject;

public interface GameObjectTileEventListener extends TileEventListener {
    void onGameObjectEvent(GameObject object, Tile tile);
}
