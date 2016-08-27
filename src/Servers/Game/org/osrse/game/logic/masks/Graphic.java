package org.osrse.game.logic.masks;
 

/**
 * @author 'Mystic Flow
 */
public class Graphic {
    private int delay;
    private int height;
    private int id;
    public static final Graphic STUNNED_GRAPHIC = Graphic.create(80, 100 << 16);
    public static final Graphic RESET = Graphic.create(65535, 0, 0);

    public static Graphic create(int id) {
        return new Graphic(id);
    }

    public static Graphic create(int id, int delay) {
        return new Graphic(id, delay);
    }

    public static Graphic create(int id, int delay, int height) {
        return new Graphic(id, delay, height);
    }

    /**
     * Creates a graphics mask with no delay.
     *
     * @param id The graphics id.
     */
    public Graphic(int id) {
        this(id, 0);
    }

    /**
     * Creates a graphics mask with the specified delay.
     *
     * @param id    The graphics id.
     * @param delay The delay.
     */
    public Graphic(int id, int delay) {
        this(id, delay, 0);
    }

    /**
     * Creates a graphics mask with the specified delay and mask.
     *
     * @param id     The graphics id.
     * @param delay  The delay.
     * @param height The height.
     */
    public Graphic(int id, int delay, int height) {
        this.id = id;
        this.delay = delay;
        this.height = height;
    }

    /**
     * @return The delay
     */
    public int getDelay() {
        return delay;
    }

    /**
     * @return The height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return The id
     */
    public int getId() {
        return id;
    }
}
