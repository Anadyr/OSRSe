package org.osrse.master.model.player.dep;

import org.osrse.master.model.player.GameRequest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jonathan on 1/15/16.
 */
public class retarded implements Runnable {
    private BlockingQueue<GameRequest> requests = new LinkedBlockingQueue<GameRequest>();

    public void dispatchRequest(GameRequest request) {
        requests.offer(request);
    }

    @Override
    public void run() {
        try {
            GameRequest request = requests.take();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean update() {
        return !requests.isEmpty();
    }


    /*
                    World w = MasterModule.getLogic().getWorldContaining(com.uid);
                if (w != null) {
                    w.sendRequest(request);
                }
     */
}
