package org.osrse.game.logic.map;


import org.osrse.game.logic.Situated;

/**
 * @author Lazaro
 */
public class PathRequest {
    public PathFinder pathFinder;
    public int x;
    public int y;
    public int moveSpeed;
    public boolean automated;
    public Situated target;
    public Runnable future;

    public PathRequest(PathFinder pathFinder, int x, int y, Situated target, int moveSpeed, boolean automated, Runnable future) {
        this.pathFinder = pathFinder;
        this.x = x;
        this.y = y;
        this.moveSpeed = moveSpeed;
        this.automated = automated;
        this.target = target;
        this.future = future;
    }
}
