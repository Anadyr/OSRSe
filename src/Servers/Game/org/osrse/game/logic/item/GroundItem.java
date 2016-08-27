package org.osrse.game.logic.item;


import org.osrse.game.logic.Situated;
import org.osrse.game.logic.map.Tile;

/**
 * Created by Jonathan on 1/5/14.
 */
public class GroundItem extends Situated {
    private int amount;
    private boolean exists = true;
    private boolean modified = false;
    private String owner;
    private boolean public_;
    private boolean spawned;
    private long timeModified;
    private final int id;

    public GroundItem(int id, int amount, Tile location, String owner, boolean spawned) {
        this.id = id;
        this.amount = amount;
        this.owner = owner;
        this.spawned = spawned;
        this.public_ = owner == null;
        setLocation(location);
        resetTimeModified();
    }

    public int getId() {
        return id;
    }

    public boolean exists() {
        return exists;
    }

    public String getOwner() {
        return owner;
    }

    public long getTimeModified() {
        return timeModified;
    }


    public boolean isModified() {
        return modified;
    }

    public boolean isPublic() {
        return public_;
    }

    public boolean isSpawned() {
        return spawned;
    }

    public void resetTimeModified() {
        timeModified = System.currentTimeMillis();
    }


    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPublic(boolean public_) {
        this.public_ = public_;
    }

    public SQLItem getDefinition() {
        return ItemDefinition.itemDefinitions.get(2);
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
