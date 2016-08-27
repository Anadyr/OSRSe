package org.osrse.game.logic.masks;

public class Animation {

    public static final Animation RESET = Animation.create(65535), DIG_ANIMATION = Animation.create(831);

    private int id;
    private int delay;

    private Animation(int id, int delay) {
        this.id = id;
        this.delay = delay;
    }

    public int getId() {
        return id;
    }

    public int getDelay() {
        return delay;
    }

    public static Animation create(int id) {
        return create(id, 0);
    }

    public static Animation create(int id, int delay) {
        return new Animation(id, delay);
    }

}
