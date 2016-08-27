package org.osrse.game.logic;

import org.osrse.model.Node;
import org.osrse.game.logic.map.Tile;

/**
 * @author Anadyr
 */
public abstract class Situated extends Node {

    private Tile location = null;

    public final Tile getLocation() {
        return location;
    }

    public final int getX() {
        return location.getX();
    }

    public final int getY() {
        return location.getY();
    }

    public final int getZ() {
        return location.getZ();
    }

    public abstract void add(Tile tile);

    public abstract void remove(Tile tile);

    public final void setLocation(Tile location) {
        if (this.location != null)
            this.remove(location);
        if (location != null) {
            this.location = location;
            add(location);
        }
    }

    public String toString() {
        return "x="+getX()+", y="+getY();
    }

}
