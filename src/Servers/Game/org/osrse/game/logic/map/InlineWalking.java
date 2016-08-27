package org.osrse.game.logic.map;

import org.osrse.game.logic.Entity;
import org.osrse.game.logic.player.Player;

 

public class InlineWalking {

	
    public static boolean failedWalking(Entity player) {
        if (player.getAttribute("stunned") == Boolean.TRUE) {
        	if(player instanceof Player)
        		((Player)player).sendMessage("You're stunned.");
            return true;
        }
        if (player.getAttribute("cantMove") == Boolean.TRUE || player.getAttribute("busy") == Boolean.TRUE) {
            return true;
        }
        /*
        if (player.hasTick("animator_tick") || player.hasTick("trap_action")) {
        	return true;
        } */
        return false;
    }
}
