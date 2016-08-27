package org.osrse.game.utility;

import org.osrse.WorldModule;
import org.osrse.utility.OutputDisplay;

/**
 * Created by Jonathan on 12/24/13.
 */
public class WorldShutdownHook extends Thread {

    public void run() {
        System.out.println("Saving all data...");
        OutputDisplay.increment();
        WorldModule.getLogic().getLoginSession().release(false);
    }
}
