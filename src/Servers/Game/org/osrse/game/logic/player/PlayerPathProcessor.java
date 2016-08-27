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
            if (!player.basicSettings().isForcedTeleporting()) {
                reset(); // Reset the waypoint buffer.
            }
            teleport();
        } else {
            updateCoordinateFuture();
        }
        player.basicSettings().setOldLocation(oldLocation);
    }


    @Deprecated
    private void teleport() {

        /*
        if(player.teleportTick == -1) {
            player.teleportTick = player.getMagic().hasTwoStepTeleport() ? 4 : 3;
        }
        if(player.getMagic().getSecondary() == Magic.Type.Home && player.teleportTick != 0) {
            if(player.teleportTick == 12) {
                player.getMasks().setAnimation(4850);
            } else if(player.teleportTick == 10) {
                player.getMasks().setAnimation(4853);
                player.getMasks().setGraphics(Graphic.create(802));
            } else if(player.teleportTick == 5) {
                player.getMasks().setAnimation(4855);
                player.getMasks().setGraphics(Graphic.create(803));
            } else if(player.teleportTick == 2) {
                player.getMasks().setAnimation(4857);
                player.getMasks().setGraphics(Graphic.create(804));
            }
        } else {
            if(player.teleportTick == 0) {
                player.magic.finishTeleport();
                player.getMasks().setFixedMovementMode(127);
                Tile oldLocation = player.getLocation(); // Save the old location.
                player.setLocation(player.getTeleportDestination()); // Set the newcache location.
                player.updateCoverage(player.getTeleportDestination()); // Set the newcache tile coverage
                player.setTeleportDestination(null); // Reset the teleport variables.
                player.setTeleporting(true); // Flag the teleport.
                player.setMapRegionUpdate(oldLocation.differentMap(player.getLocation())); // Flag if the map has changed.
            } else if(player.teleportTick == 3) {
                player.getMagic().startTeleport();
            } else if(player.teleportTick == 4) {
                player.getMagic().windAnimation();
            }*/
        }
/*

        if(player.teleportTick == -1) {
            player.teleportTick = 4;
            player.getMagic().windAnimation();
        }
        if(player.teleportTick == 0) {
            System.out.println(player.getTeleportDestination()+"/"+player.getLocation().differentMap(player.getTeleportDestination()));
            // teleporting.
            player.setLocation(player.getTeleportDestination());
            // location.
            // variables.
            player.setTeleporting(true);
            player.setMapRegionUpdate(player.getLocation().differentMap(player.getTeleportDestination()));
            player.setTeleportDestination(null);
        }*/
        /*

        if(player.teleportTick == -1) {
            player.teleportTick = 4;
            player.getMagic().windAnimation();
        } else if(player.teleportTick == 3) {
            player.getMagic().startTeleport();
        } else if(player.teleportTick == 2) {
            // teleporting.
            //player.getMasks().setFixedMovementMode(127);
        } else if(player.teleportTick == 1) {
            //player.getMasks().setFixedMovementMode(127);
            player.setLocation(player.getTeleportDestination());
            player.setTeleporting(true); // Flag the teleport.
           // player.getMasks().setFixedMovementMode(127);
        } else if(player.teleportTick == 0) {
            player.magic.finishTeleport();
           // player.getMasks().setFixedMovementMode(1);
            player.setMapRegionUpdate(!player.isForcedTeleporting() && player.getOldLocation().differentMap(player.getLocation())); // Flag
            player.setTeleportDestination(null); // Reset the teleport
        }*/
        /*
        if(player.teleportTick == -1) {
            player.teleportTick = 3;
            player.getMagic().windAnimation();
        }
        if(player.teleportTick == 0) {
            player.setTeleportDestination(null); // Reset the teleport variables.
            player.setTeleporting(true); // Flag the teleport.
            player.magic.finishTeleport();
        } else if(player.teleportTick == 1) {
            player.getMasks().setFixedMovementMode(0);
            Tile oldLocation = player.getLocation(); // Save the old location.
            player.setLocation(player.getTeleportDestination()); // Set the newcache location.
            player.updateCoverage(player.getTeleportDestination()); // Set the newcache tile coverage
            player.setTeleporting(true); // Flag the teleport.
            player.setMapRegionUpdate(oldLocation.differentMap(player.getLocation())); // Flag if the map has changed.
        } else if(player.teleportTick == 2) {
            //player.getMasks().setFixedMovementMode(127);
        } else if(player.teleportTick == 3) {
            player.getMagic().startTeleport();
            player.getMasks().setFixedMovementMode(127);
            player.getMasks().setMovementType(1);
            player.getMasks().setMovementMode(true);         }*/
        /*
        if(player.teleportTick >= 3 && player.teleportTick != -1) {
            player.getMasks().setFixedMovementMode(127);
            if(ancients) {
                player.getMasks().setGraphics(Graphic.create(455));
            } else
                player.getMasks().setAnimation(715);
            Tile oldLocation = player.getLocation(); // Save the old location.
            player.setLocation(player.getTeleportDestination()); // Set the newcache location.
            player.updateCoverage(player.getTeleportDestination()); // Set the newcache tile coverage
            player.setTeleportDestination(null); // Reset the teleport variables.
            player.setTeleporting(true); // Flag the teleport.
            player.setMapRegionUpdate(oldLocation.differentMap(player.getLocation())); // Flag if the map has changed.

            player.teleportTick = -1;
        } else if(player.teleportTick == 1) {
            player.getMasks().setFixedMovementMode(127);

        } else if(player.teleportTick == -1) {
            if(ancients) {
                player.getMasks().setGraphics(Graphic.create(392));
                player.getMasks().setAnimation(1979);
            } else {
                player.getMasks().setGraphics(Graphic.create(308, 50, 100));
                player.getMasks().setAnimation(714);
            }
            player.setMovementMode(0);
            //player.getMasks().setMovementType(false);
            player.teleportTick = 0;
        }*/
    //}
}
