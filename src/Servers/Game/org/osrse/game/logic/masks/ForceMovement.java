package org.osrse.game.logic.masks;

/**
 * Created by Jonathan on 1/6/16.
 */
public class ForceMovement {
    public static final ForceMovement DITCH_IN = new ForceMovement(0, -3, 0, 0, 33, 60, 512);
    public static final ForceMovement DITCH_OUT = new ForceMovement(0, 3, 0, 0, 33, 60, 1024);

    public final int x1, y1, x2, y2, delay, animation, faceDir;

    public ForceMovement(int x1, int y1, int x2, int y2, int animation, int delay, int faceDir) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.animation = animation;
        this.delay = delay;
        this.faceDir = faceDir;
    }
}
