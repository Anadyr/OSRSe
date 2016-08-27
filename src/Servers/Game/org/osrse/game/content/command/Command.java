package org.osrse.game.content.command;

import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/8/16.
 */
public interface Command {
    public void handle(Player player, String[] args);

}
