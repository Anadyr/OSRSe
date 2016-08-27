package org.osrse.game.logic.mob;

import org.osrse.game.logic.map.Directions;
import org.osrse.game.logic.map.Tile;

public class SpawnPoint {
    private final int x, y, z, maxOffset;

    public SpawnPoint(int x, int y, int z, int maxOffset) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.maxOffset = maxOffset;
    }

    public SpawnPoint(Tile tile) {
        this(tile.getX(), tile.getY(), tile.getZ(), 5);
    }

    /**
     * Will be used for bankers etc
     * @param x
     * @param y
     * @param z
     */
    public SpawnPoint(int x, int y, int z) {
        this(x, y, z, 0);
    }

    public Tile getSpawn(boolean randomize) {
        return Tile.locate(x, y, z).randomize(randomize ? maxOffset : 0);
    }

    public Directions.NormalDirection getFace() {
        return Directions.NormalDirection.random();
    }


}
