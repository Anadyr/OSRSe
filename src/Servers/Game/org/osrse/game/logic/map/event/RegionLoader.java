package org.osrse.game.logic.map.event;

import org.osrse.task.Engine;
import org.osrse.game.logic.map.Region;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jonathan on 1/10/14.
 */
public class RegionLoader {

    private static final Queue<Region> queuedRegions = new LinkedBlockingQueue<Region>();

    private static transient boolean isRunning = false;

    public static final void append(Region region) {
        int x= region.getX();
        int y = region.getY();
            if(!region.isLoaded()) {
                queuedRegions.add(region);
            }
            Region[] regions = region.getSurroundings();
            for(Region r : regions) {
                if(!r.isLoaded()) {
                    queuedRegions.add(r);
                }
            }
            if(!isRunning && !queuedRegions.isEmpty()) {
                isRunning = true;
                Engine.dispatchToMapWorker(new Runnable() {
                    public void run() {
                        for(int i = 0; i < queuedRegions.size(); i++) {
                            Region r = queuedRegions.remove();
                            r.load();
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {

                            }
                        }
                        isRunning = false;
                    }
                });
            }
    }

}
