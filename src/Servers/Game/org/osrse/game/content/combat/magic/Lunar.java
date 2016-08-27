package org.osrse.game.content.combat.magic;

import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.Magic;

/**
 * Created by Jonathan on 1/7/16.
 */
public class Lunar extends MagicBook {

    public Lunar() {
        super(Magic.Type.Lunar);
    }

    @Override
    public boolean cast(int type, Entity who) {
        return false;
    }
}
