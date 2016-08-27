package org.osrse.game.content.combat.magic;

import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.Magic;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/11/16.
 */
public abstract class MagicBook {

    protected Magic.Type magicType;

    protected MagicBook(Magic.Type typeType) {
        this.magicType = typeType;
    }

    public final Magic.Type type() {
        return magicType;
    }

    public abstract boolean cast(int type, Entity who);



}
