package org.osrse.master.model.player.dep;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import org.osrse.master.model.player.GameRequest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Jonathan on 1/15/16.
 */
public class Test {
   // public enum Request {FIND, ADD, DEL, EDIT_CLAN}
  //  private static final List<Request> PREFERRED_ORDER = ImmutableList.of(Request.ADD, Request.DEL, Request.EDIT_CLAN, Request.FIND);
  //  private static final Comparator<Request> PROCESS_COMPARATOR = Ordering.explicit(PREFERRED_ORDER);

  //  final ConcurrentLinkedQueue<GameRequest> queue = new ConcurrentLinkedQueue<GameRequest>();


    public static void main(String[] args) {
        PriorityQueue<GameRequest> pq2 = new PriorityQueue<GameRequest>(10, new CompareRequest());

        pq2.add(new GameRequest(1, 0, false));
        pq2.add(new GameRequest(8, 1, false));
        pq2.add(new GameRequest(1, 0, ":", false));
        pq2.add(new GameRequest(3, 2, false));
        pq2.add(new GameRequest(8, 1,":",  false));
        pq2.add(new GameRequest(3, 2, ":", false));
        pq2.add(new GameRequest(1, 7, false));
        pq2.add(new GameRequest(9, 4, ":", false));
        pq2.add(new GameRequest(7, 5,":",  false));
        pq2.add(new GameRequest(9, 4, false));
        pq2.add(new GameRequest(1, 7, ":", false));
        pq2.add(new GameRequest(7, 5, false));


        System.out.println("pq2: " + pq2);
        int i2 = pq2.size();
        for(int i = 0; i < i2; i++) {
            System.out.println("size: " + pq2.size());
            // return highest priority element and removes it from the queue
            GameRequest r = pq2.poll();
            System.out.println("poll: " + r.type+", stamp="+r.timestamp);
            // print size
            System.out.println("size: " + pq2.size());
        }
    }

    public static class CompareRequest implements Comparator<GameRequest> {

        @Override
        public int compare(GameRequest o1, GameRequest o2) {
            return o2.compareTo(o1);
        }
    }
}

