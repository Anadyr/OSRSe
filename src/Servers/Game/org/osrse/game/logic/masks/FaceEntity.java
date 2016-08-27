package org.osrse.game.logic.masks;

import org.osrse.game.logic.Entity;
import org.osrse.game.logic.player.Player;

/**
 * @author Lazaro
 */
public class FaceEntity {
    public static final FaceEntity NO_FACE = new FaceEntity(-1);
    private int id;

    public FaceEntity(Entity e) { 
        this(e instanceof Player ? ((Player) e).getIndex() + 32768 : e.getIndex());
    }

    public FaceEntity(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
}
