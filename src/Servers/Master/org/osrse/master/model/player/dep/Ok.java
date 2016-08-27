package org.osrse.master.model.player.dep;

/**
 * Created by Jonathan on 1/16/16.
 */
public class Ok {
        public static void main(String[] args) {
            CubbyHole c = new CubbyHole();
            Producer p1 = new Producer(c, 1);
            Consumer c1 = new Consumer(c, 1);

            p1.start();
            c1.start();
        }



    static class CubbyHole {
        private int contents;
        private volatile boolean available = false;

        public int get() {
            synchronized (this) {
                while (!available) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }

            available = false;
            synchronized (this) {
                notifyAll();
            }
            return contents;
        }

        public void put(int value) {
            synchronized (this) {
                while (available) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            available = true;

            contents = value;

            synchronized (this) {
                notifyAll();
            }
        }
    }

    static class Consumer extends Thread {
        private CubbyHole cubbyhole;
        private int number;
        private Integer takeSum = 0;

        public Consumer(CubbyHole c, int number) {
            cubbyhole = c;
            this.number = number;
        }

        public Integer getTakeSum() {
            return takeSum;
        }

        public void run() {
            int value = 0;
            for (int i = 0; i < 100; i++) {
                value = cubbyhole.get();
                takeSum+=value;

            }

            //System.out.println("Take Sum for Consumer: " + number + " is "
           //         + takeSum);
        }
    }

    static class Producer extends Thread {
        private CubbyHole cubbyhole;
        private int number;
        private Integer putSum = 0;

        public Integer getPutSum() {
            return putSum;
        }

        public Producer(CubbyHole c, int number) {
            cubbyhole = c;
            this.number = number;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                int rnd = (int) (Math.random() * 10);
                cubbyhole.put(rnd);
                putSum+=rnd;
                try {
                    sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                }
            }
            //System.out.println("Put Sum for Producer: " + number + " is " + putSum);

        }
    }
}
