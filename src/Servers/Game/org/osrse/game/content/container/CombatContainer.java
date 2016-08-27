package org.osrse.game.content.container;

import org.osrse.game.logic.Entity;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/11/16.
 */
public class CombatContainer {

    public void handle(Player owner, Player foe) {


    }

    private final void check(Player owner) {
        if(owner.basicSettings().isHomeTeleport()) {
            owner.basicSettings().reset(true);
        }

    }
}
