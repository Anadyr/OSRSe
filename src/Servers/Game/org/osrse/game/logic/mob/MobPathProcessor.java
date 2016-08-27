package org.osrse.game.logic.mob;

import org.osrse.game.logic.map.Directions;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.Tile;

 
public class MobPathProcessor extends PathProcessor {
    private Mob mob;

    public MobPathProcessor(Mob mob) {
        super(mob);
        this.mob = mob;
    }

    @Override
    protected Directions.NormalDirection next() {
        /**
         * Check if we are walking.
         */
        if (moving()) {
            /**
             * Get the first waypoint from the buffer.
             */
            Tile nextPoint = buffer.peek();
            /**
             * Check if we are already on this tile.
             */
            if (mob.getLocation().equals(nextPoint)) {
                /**
                 * Remove the current waypoint and get the next one.
                 */
                buffer.next();
                nextPoint = buffer.peek();
            }
            /**
             * Check if there is a next step.
             */
            if (nextPoint == null) {
                /**
                 * Stop walking.
                 */
                reset();
                return null;
            }
            /**
             * Calculate the directions of the next waypoint.
             */
            Directions.NormalDirection direction = Directions.directionFor(mob.getLocation(), nextPoint);
            /**
             * We want to move.
             */
            if (direction != null) {

                if (!mob.getLocation().canMove(direction, mob.getSize(), false)) {
                    reset();
                    return null;
                }

                /**
                 * Calculate the next tile.
                 */
                Tile next = mob.getLocation().translate(Directions.DIRECTION_DELTA_X[direction.intValue()], Directions.DIRECTION_DELTA_Y[direction.intValue()], 0);

                /**
                 * Check that the Mob will stay within range.
                 */
                //int range = mob.getSpawn().range;
                //if (!next.withinRange(mob.getSpawn().location, range) && range != -1) {
                //    //mob.getCombat().stop(true);
                //    return null;
                //}

                /**
                 * Set the tile and return the directions.
                 */
                mob.setLocation(next);
                mob.updateCoverage(next);

                updateHistory(next);

                return direction;
            }
        }
        return null;
    }

    @Override
    public void process() {
        Tile oldLocation = mob.getLocation(); // Save the old location.
        if (mob.basicSettings().getTeleportDestination() != null) { // Check if we are teleporting.
            mob.setLocation(mob.basicSettings().getTeleportDestination()); // Set the new location.
            mob.updateCoverage(mob.basicSettings().getTeleportDestination()); // Set the new tile coverage
            mob.basicSettings().setTeleportDestination(null); // Reset the teleport variables.
            mob.basicSettings().setTeleporting(true); // Flag the teleport.
            reset();
        } else if (moving() && !mob.hasAttribute("frozen")) { // Check if we are moving.
            Directions.Direction direction = next(); // Calculate the first direction, for walking.
            Directions.Direction secondDirection = null;
            if (moveSpeed == MOVE_SPEED_RUN) { // Check if we are running.
                mob.getDirections().setDirection(direction); // Set the previous direction for logic reasons
                updateCoordinateFuture(); // Update the coordinate future

                secondDirection = next(); // Calculate the second direction, for running.
            }

            mob.getDirections().setDirection(direction); // Set the final direction.
            mob.getDirections().setSecondDirection(secondDirection);
        }
        mob.basicSettings().setOldLocation(oldLocation);
        updateCoordinateFuture();
    }
}
