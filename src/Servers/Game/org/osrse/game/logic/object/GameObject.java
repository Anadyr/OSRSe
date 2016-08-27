package org.osrse.game.logic.object;

import org.osrse.game.logic.Situated;
import org.osrse.game.logic.map.Tile;


public class GameObject extends Situated {
    private int id;
    private int type;
    private int direction;
    private int sizeX;
    private int sizeY;
    private boolean spawned;
    private boolean exists = true;

    public GameObject(int id, Tile loc, int type, int direction, int sizeX, int sizeY) {
        this(id, loc, type, direction, sizeX, sizeY, false);
    }

    public GameObject(int id, Tile loc, int type, int direction, int sizeX, int sizeY, boolean spawned) {
        this.id = id;
        this.type = type;
        this.direction = direction;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.spawned = spawned;
        setLocation(loc);
    }

    public ObjectDefinition getDefinition() {
        return ObjectDefinition.forId(id);
    }

    public int getId() {
        return id;
    }

    public int getDirection() {
        return direction;
    }

    public int getType() {
        return type;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public boolean isSpawned() {
        return spawned;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    @Override
    public void add(Tile tile) {
        tile.add(this);
    }

    @Override
    public void remove(Tile tile) {
        tile.remove(this);
    }
}
