package org.osrse.game.logic.player;

import org.osrse.game.logic.map.Directions;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.Tile;

import java.awt.*;

/**
 * @author Lazaro
 */
public class PlayerPathProcessor extends PathProcessor {
    private Player player;

    public PlayerPathProcessor(Player player) {
        super(player);
        this.player = player;
    }

    @Override
    protected Directions.NormalDirection next() {
        /**
         * Check if we are walking.
         */
        if (!player.basicSettings().isTeleporting() && moving()) {
            /**
             * Get the first waypoint from the buffer.
             */
            Tile nextPoint = buffer.peek();
            /**
             * Check if this tile is a place holder (used for delays).
             */
            if (nextPoint != null && nextPoint.equals(Tile.PLACE_HOLDER)) {
                /**
                 * Remove the place holder.
                 */
                buffer.next();
                return null;
            }

            /**
             * Check if we are already on this tile.
             */
            if (player.getLocation().equals(nextPoint)) {
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
                return null;
            }

            /**
             * Calculate the directions of the next waypoint.
             */
            Directions.NormalDirection direction = Directions.directionFor(player.getLocation(), nextPoint);
            /**
             * We want to move.
             */
            if (direction != null) {
                if (player.basicSettings().isClipping() && !player.getLocation().canMove(direction, player.getSize(), false)) {
                    reset();
                    return null;
                }

                /**
                 * Calculate the next tile.
                 */
                Tile next = player.getLocation().translate(Directions.DIRECTION_DELTA_X[direction.intValue()], Directions.DIRECTION_DELTA_Y[direction.intValue()], 0);
                /**
                 * Check if the map region is going to change.
                 */
                if (player.basicSettings().getMapRegionUpdatePosition().differentMap(next)) {
                    /**
                     * Flag the map changing.
                     */
                    player.basicSettings().setMapRegionUpdate(true);
                }
                if (next.getRegionX() != player.getLocation().getRegionX() || next.getRegionY() != player.getLocation().getRegionY()) {
                    player.setMapRegionDirection(Directions.directionFor(new Point(player.getLocation().getRegionX(), player.getLocation().getRegionY()), new Point(next.getRegionX(), next.getRegionY())));
                }
                /**
                 * Set the tile and return the directions.
                 */
                player.setLocation(next);
                player.updateCoverage(next);

                updateHistory(next);

                return direction;
            }
        }
        return null;
    }

    @Override
    public void process() {
        Tile oldLocation = player.getLocation(); // Save the old location.
        if (!player.basicSettings().isTeleporting() && moving()) { // Check if we are moving.
            Directions.Direction direction = next(); // Calculate the first direction, for walking.
            Directions.Direction secondDirection = null;
            if (moveSpeed == MOVE_SPEED_RUN || (moveSpeed != MOVE_SPEED_WALK && player.isRunning())) { // Check if we are running.
                if (player.getRunningEnergy() > 0) { // Check if the player has enough energy to run.
                    player.getDirections().setDirection(direction); // Set the previous direction for logic reasons
                    updateCoordinateFuture(); // Update the coordinate future

                    secondDirection = next(); // Calculate the second direction, for running.
                    if (secondDirection != null) {
                        player.setRunningEnergy(player.getRunningEnergy() - 1); // Decrease energy.
                        player.getProtocol().sendRunEnergy();
                    }
                } else {
                    moveSpeed = MOVE_SPEED_ANY; // Stop running this buffer.
                    player.setRunning(false); // Stop the player from running.
                    player.getProtocol().sendConfig(173, 0);
                }
            }
            if (secondDirection != null) {
                direction = Directions.runningDirectionFor(new Point(oldLocation.getX(), oldLocation.getY()), new Point(player.getLocation().getX(), player.getLocation().getY()));
                if (direction == null) {
                    direction = Directions.directionFor(new Point(oldLocation.getX(), oldLocation.getY()), new Point(player.getLocation().getX(), player.getLocation().getY()));
                }
            }
	        if (player.getMasks().getFaceDirection() != null) {
		        player.getMasks().resetFace(player.basicSettings().isFollowing());
	        }
            int newMovementMode = secondDirection != null ? 2 : 1;
            if (newMovementMode != player.getMovementMode()) {
                player.setMovementMode(newMovementMode);
                player.getMasks().setMovementMode(true);
            }
            player.getDirections().setDirection(direction); // Set the final direction.
            player.getDirections().setSecondDirection(secondDirection);
        }
        if(player.getLocation() == null) {
            System.out.println("Player was found null location: "+player.getUsername());
            return;
        }
        if (player.getLocation().getZ() != oldLocation.getZ()) {
            player.setHeightUpdate(true);
        }
        if (player.basicSettings().getTeleportDestination() != null) {
	        reset(); // Reset the waypoint buffer.
	        if (player.basicSettings().getTeleportTick() == 0) {
		        teleport();
	        }
        } else {
            updateCoordinateFuture();
        }
        player.basicSettings().setOldLocation(oldLocation);
    }


	@Override
	public void teleport() {
		player.getMasks().setResetMovementMode(127);
		Tile oldLocation = player.getLocation(); // Save the old location.
		player.setLocation(player.basicSettings().getTeleportDestination()); // Set the newcache location.
		player.updateCoverage(player.basicSettings().getTeleportDestination()); // Set the newcache tile coverage
		player.basicSettings().setTeleportDestination(null); // Reset the teleport variables.
		player.basicSettings().setTeleporting(true); // Flag the teleport.
		player.basicSettings().setForcedTeleporting(false);
		player.basicSettings().setMapRegionUpdate(oldLocation.differentMap(player.getLocation())); // Flag if the map has changed.
	}
}
