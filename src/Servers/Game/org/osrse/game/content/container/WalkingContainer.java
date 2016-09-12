/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content.container;

import org.osrse.WorldModule;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.map.path.AStarPathFinder;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.player.Player;

/**
 *
 * @author Jonathan
 */
public class WalkingContainer {

    public static void handleWalk(Player player, int firstX, int firstY, boolean runSteps) {
        if(player.getAttribute("cutScene") != null) {
                return;
        }
	    player.basicSettings().setFollowing(false);
	    if(player.basicSettings().isHomeTeleport()) {
            player.getMagic().resetTeleFrom();
        }
        player.getPathProcessor().setCoordinateFuture(null);
        WorldModule.getLogic().submitPath(new AStarPathFinder(),
                player, firstX, firstY, null,
                runSteps ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
        player.getPathProcessor().processPathRequest();
    }

    public static void handleWalk(Mob mob, Tile rand) {
        mob.getPathProcessor().setCoordinateFuture(null);
        WorldModule.getLogic().submitPath(new AStarPathFinder(),
                mob, rand.getX(), rand.getY(), null, PathProcessor.MOVE_SPEED_ANY, true, null);
        mob.getPathProcessor().processPathRequest();
    }
}
