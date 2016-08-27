/**
 *
 */
package org.osrse.game.logic.map;

import org.osrse.Module;

import java.awt.*;

/**
 * @author Lazaro
 */
public class Directions {
    public static interface Direction {
        public int intValue();

        public int npcIntValue();
        
        public int type();

        public boolean isRun();
    }

    /*
                if(var3 == 0) {
               xx -= 2;
               yy -= 2;
            } else if(var3 == 1) {
               --xx;
               yy -= 2;
            } else if(var3 == 2) {
               yy -= 2;
            } else if(3 == var3) {
               ++xx;
               yy -= 2;
            } else if(var3 == 4) {
               xx += 2;
               yy -= 2;
            } else if(5 == var3) {
               xx -= 2;
               --yy;
            } else if(6 == var3) {
               xx += 2;
               --yy;
            } else if(7 == var3) {
               xx -= 2;
            } else if(var3 == 8) {
               xx += 2;
            } else if(var3 == 9) {
               xx -= 2;
               ++yy;
            } else if(10 == var3) {
               xx += 2;
               ++yy;
            } else if(11 == var3) {
               xx -= 2;
               yy += 2;
            } else if(var3 == 12) {
               --xx;
               yy += 2;
            } else if(var3 == 13) {
               yy += 2;
            } else if(var3 == 14) {
               ++xx;
               yy += 2;
            } else if(15 == var3) {
               xx += 2;
               yy += 2;
            }
     */
    public static enum RunningDirection implements Direction {
        SS_WW(0), SS_W(1), SS(2), SS_E(3), SS_EE(4), S_WW(5), S_EE(6), WW(7), EE(8), N_WW(9), N_EE(10), NN_WW(11), NN_W(12), NN(13), NN_E(14), NN_EE(15);
        private int dir;

        private RunningDirection(int dir) {
            this.dir = dir;
        }

        public int intValue() {
            return dir;
        }

        public int npcIntValue() {
            throw new UnsupportedOperationException("The GNP protocol does not support 2 step running directions!");
        }
        
        public int type() {
        	return 2;
        }

        public boolean isRun() {
            return true;
        }

        @Override
        public String toString() {
            return "[run] [dir=" + dir + ", type=" + super.toString() + "]";
        }
    }


    public static enum NormalDirection implements Direction {
        //EAST(4, 2), NORTH(6, 0), NORTH_EAST(7, 1), NORTH_WEST(5, 7), SOUTH(1, 4), SOUTH_EAST(2, 3), SOUTH_WEST(0, 5), WEST(3, 6);
        EAST(4, 4), NORTH(6, 1), NORTH_EAST(7, 2), NORTH_WEST(5, 0), SOUTH(1, 6), SOUTH_EAST(2, 7), SOUTH_WEST(0, 5), WEST(3, 3);
        public static NormalDirection forIntValue(int value) {
            switch (value) {
                case 0:
                    return SOUTH_WEST;
                case 1:
                    return SOUTH;
                case 2:
                    return SOUTH_EAST;
                case 3:
                    return WEST;
                case 4:
                    return EAST;
                case 5:
                    return NORTH_WEST;
                case 6:
                    return NORTH;
                case 7:
                    return NORTH_EAST;
            }
            return null;
        }

        private int dir;
        private int npcDir;

        private NormalDirection(int dir, int npcDir) {
            this.dir = dir;
            this.npcDir = npcDir;
        }

        public int intValue() {
            return dir;
        }

        public int npcIntValue() {
            return npcDir;
        }

        public int type() {
        	return 1;
        }

        public boolean isRun() {
            return false;
        }

        @Override
        public String toString() {
            return "[walk] [dir=" + dir + ", type=" + super.toString() + "]";
        }

        public boolean similar(NormalDirection dir) {
            switch (this) {
                case NORTH:
                    return dir == NORTH || dir == NORTH_EAST || dir == NORTH_WEST;
                case SOUTH:
                    return dir == SOUTH || dir == SOUTH_EAST || dir == SOUTH_WEST;
                case EAST:
                    return dir == EAST || dir == NORTH_EAST || dir == SOUTH_EAST;
                case WEST:
                    return dir == WEST || dir == NORTH_WEST || dir == SOUTH_WEST;
                case NORTH_EAST:
                    return dir == NORTH_EAST || dir == NORTH || dir == EAST;
                case SOUTH_EAST:
                    return dir == SOUTH_EAST || dir == SOUTH || dir == EAST;
                case NORTH_WEST:
                    return dir == NORTH_WEST || dir == NORTH || dir == WEST;
                case SOUTH_WEST:
                    return dir == SOUTH_WEST || dir == SOUTH || dir == WEST;
            }
            return false;
        }

        public static NormalDirection random() {
             return forIntValue(Module.random.nextInt(7));
        }
    }

    public static final byte[] DIRECTION_DELTA_X = new byte[]{-1, 0, 1, -1, 1, -1, 0, 1};
    public static final byte[] DIRECTION_DELTA_Y = new byte[]{-1, -1, -1, 0, 0, 1, 1, 1};

    //public static final byte[] DIRECTION_DELTA_X = newcache byte[]{-1, 0, 1, -1, 1, -1, 0, 1};
    //public static final byte[] DIRECTION_DELTA_Y = newcache byte[]{-1, -1, -1, 0, 0, 1, 1, 1};

    /**
     * Calculates the directions between two points.
     *
     * @param currentPos The current point.
     * @param nextPos    The next point.
     * @return The directions in which the next point is.
     */
    public static NormalDirection directionFor(Point currentPos, Point nextPos) {
        int dirX = (int) (nextPos.getX() - currentPos.getX());
        int dirY = (int) (nextPos.getY() - currentPos.getY());
        if (dirX < 0) {
            if (dirY < 0)
                return NormalDirection.SOUTH_WEST;
            else if (dirY > 0)
                return NormalDirection.NORTH_WEST;
            else
                return NormalDirection.WEST;
        } else if (dirX > 0) {
            if (dirY < 0)
                return NormalDirection.SOUTH_EAST;
            else if (dirY > 0)
                return NormalDirection.NORTH_EAST;
            else
                return NormalDirection.EAST;
        } else {
            if (dirY < 0)
                return NormalDirection.SOUTH;
            else if (dirY > 0)
                return NormalDirection.NORTH;
            else
                return null;
        }
    }

    /**
     * Calculates the direction between three points.
     *
     * @param currentPos The current point.
     * @param nextPos    The second next point (Note: Must be at a distance of TWO or
     *                   else the method will not work.)
     * @return The direction in which the second next point is.
     */
    public static RunningDirection runningDirectionFor(Point currentPos, Point nextPos) {
        int dirX = (int) (nextPos.getX() - currentPos.getX());
        int dirY = (int) (nextPos.getY() - currentPos.getY());
        switch (dirX) {
            case -2:
                switch (dirY) {
                    case -2:
                        return RunningDirection.SS_WW;
                    case -1:
                        return RunningDirection.S_WW;
                    case 0:
                        return RunningDirection.WW;
                    case 1:
                        return RunningDirection.N_WW;
                    case 2:
                        return RunningDirection.NN_WW;
                }
                return null;
            case -1:
                switch (dirY) {
                    case -2:
                        return RunningDirection.SS_W;
                    case 2:
                        return RunningDirection.NN_W;
                }
                return null;
            case 0:
                switch (dirY) {
                    case -2:
                        return RunningDirection.SS;
                    case 2:
                        return RunningDirection.NN;
                }
                return null;
            case 1:
                switch (dirY) {
                    case -2:
                        return RunningDirection.SS_E;
                    case 2:
                        return RunningDirection.NN_E;
                }
                return null;
            case 2:
                switch (dirY) {
                    case -2:
                        return RunningDirection.SS_EE;
                    case -1:
                        return RunningDirection.S_EE;
                    case 0:
                        return RunningDirection.EE;
                    case 1:
                        return RunningDirection.N_EE;
                    case 2:
                        return RunningDirection.NN_EE;
                }
                return null;
        }
        return null;
    }

    /**
     * Calculates the direction between the two tiles.
     *
     * @param currentPos The current point.
     * @param nextPos    The next point.
     * @return The direction in which the next point is.
     */
    public static NormalDirection directionFor(Tile currentPos, Tile nextPos) {
        return directionFor(new Point(currentPos.getX(), currentPos.getY()), new Point(nextPos.getX(), nextPos.getY()));
    }

    private Direction direction = null;
    private Direction secondDirection = null;

    /**
     * Gets the current direction.
     *
     * @return The current direction.
     */
    public Direction getDirection() {
        return direction;
    }

    public Direction getSecondDirection() {
        return secondDirection;
    }

    private int faceDirection = NormalDirection.SOUTH.intValue();

    public int getFacedDirection() {
        return faceDirection;
    }
    /**
     * Resets the direction status.
     */
    public void reset() {
        direction = null;
        secondDirection = null;
    }

    /**
     * Sets the directions.
     *
     * @param direction The directions
     */
    public void setDirection(Direction direction) {
        if(direction != null) {
            this.faceDirection = direction.intValue();
        }
        this.direction = direction;
    }

    public void setSecondDirection(Direction secondDirection) {
        this.secondDirection = secondDirection;
    }
}
