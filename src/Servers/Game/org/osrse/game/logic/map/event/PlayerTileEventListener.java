package org.osrse.game.logic.map.event;

import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.player.Player;

public interface PlayerTileEventListener extends TileEventListener {
    void onPlayerEvent(Player player, Tile tile);
}
