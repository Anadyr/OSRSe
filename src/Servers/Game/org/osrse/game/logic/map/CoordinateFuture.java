/**
 *
 */
package org.osrse.game.logic.map;


import org.osrse.task.tick.Tick;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.Situated;
import org.osrse.game.logic.object.GameObject;
import org.osrse.game.logic.player.Player;

/**
 * @author Lazaro
 */
public class CoordinateFuture {
    private Entity entity;
    private Tile dest = null;
    private Situated destObj;
    private Runnable future;

    private boolean ready = false;
    private boolean fail = false;

    public CoordinateFuture(Entity entity, Runnable future) {
        this(entity, null, future);
    }

    public CoordinateFuture(Entity entity, Situated destObj, Runnable future) {
        this.entity = entity;
        this.destObj = destObj;
        this.future = future;
    }

    public Runnable getFuture() {
        return future;
    }

    public boolean update() {
        if (dest == null) {
            dest = entity.getPathProcessor().getDestination();
            if (dest == null) {
                return false;
            }
        }
        if (withinDistance() && !fail) {
            if (entity.getDirections().getDirection() == null) {
                faceDestination();
                entity.registerTick(new Tick(null, 1, Tick.TickPolicy.STRICT) {
                    @Override
                    public boolean execute() {
                        future.run();
                        return false;
                    }
                });
                return true;
            }
            return false;
        } else if (entity.basicSettings().isTeleporting()) {
            return true; // The entity has teleported, stop the event.
        } else if (entity instanceof Player && entity.getDirections().getDirection() == null) {
            faceDestination();
            notifyFail();
            return true;
        }
        return false; // Continue trying.
    }

    public boolean withinDistance() {
        if (dest == null) {
            return false;
        }
        return entity.getLocation().equals(dest);
    }

    public void notifyFail() {
        if (entity instanceof Player) {
            ((Player) entity).sendMessage("You can't reach that.");
        }
    }

    public void faceDestination() {
        if (destObj != null) {
            if (destObj instanceof GameObject) {
                GameObject destObj2 = (GameObject) destObj;
                if (entity.getLocation().equals(destObj2.getLocation())) {
                    /**
                     * Calculate a location to face other than our own coordinate.
                     */
                    int offX = 0;
                    int offY = 0;
                    switch (destObj2.getDirection()) {
                        case 0:
                            offX = -1;
                            break;
                        case 1:
                            offY = 1;
                            break;
                        case 2:
                            offX = 1;
                            break;
                        case 3:
                            offY = -1;
                            break;
                    }
                    entity.faceDirection(destObj2.getLocation().translate(offX, offY, 0));
                } else if (destObj2.getType() >= 9 && destObj2.getType() <= 11 && (destObj2.getDefinition().sizeX > 1 || destObj2.getDefinition().sizeY > 1)) {
                    /**
                     * Calculate the exact center of the object to face.
                     */
                    int faceX = destObj2.getX() + (( destObj2.getDefinition().sizeX) / 2);
                    int faceY = destObj2.getY() + (( destObj2.getDefinition().sizeY) / 2);
                    entity.faceDirection(Tile.locate(faceX, faceY, entity.getZ()));
                    //entity.faceDirection(((int) (Math.atan2(((double) entity.getX()) - faceX, ((double) entity.getY()) - faceY) * 2607.5945876176133)) & 0x3fff);
                 } else {

                    /**
                     * Face the objects absolute coordinates.
                     */
                    entity.faceDirection(destObj2.getLocation());
                }
            } else if (destObj instanceof Entity) {
                entity.setFaceEntity((Entity) destObj);
            }
        }
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean forceFail) {
        this.fail = forceFail;
    }
}
