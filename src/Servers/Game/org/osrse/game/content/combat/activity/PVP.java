package org.osrse.game.content.combat.activity;

import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/11/16.
 */
public class PVP extends CombatWorld {

    @Override
    public boolean isSafe(Player player) {
        return false;
    }

    @Override
    public int getWildLevelRange(Player player) {
        return 0;
    }

    @Override
    public void sendCombatPane(Player player) {

    }
}