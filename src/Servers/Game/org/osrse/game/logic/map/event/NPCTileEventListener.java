package org.osrse.game.logic.map.event;

import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.mob.Mob;


public interface NPCTileEventListener extends TileEventListener {
    void onNPCEvent(Mob npc, Tile tile);
}
