package org.osrse.game.content.combat.magic;

import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.Magic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 1/7/16.
 */
public class Ancient extends MagicBook {

    public static final Map<Integer, Spell> spells = new HashMap<Integer, Spell>();

    public Ancient() {
        super(Magic.Type.Ancient);
    }

    @Override
    public boolean cast(int type, Entity who) {
        return false;
    }


    static {

    }
}
