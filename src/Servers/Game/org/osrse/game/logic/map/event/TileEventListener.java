package org.osrse.game.logic.map.event;


import org.osrse.game.logic.map.Tile;

public interface TileEventListener {
	
	public void onRegister(Tile tile);
	
}
