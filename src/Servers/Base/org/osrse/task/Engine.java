package org.osrse.task;

import org.jboss.netty.bootstrap.Bootstrap;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.osrse.task.event.Event;
import org.osrse.task.event.RecurringEvent;
import org.osrse.task.utility.ManipulativeThreadFactory;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;


/**
 * @author Lazaro, Jonathan
 */
public final class Engine {
    private static final double THREAD_MULTIPLIER = 2.0;

    private static boolean running;

    private static Executor mapWorker = Executors.newFixedThreadPool(4, new ManipulativeThreadFactory("map-worker", 4));
    private static Executor worldWorker = Executors.newFixedThreadPool((int) (Runtime.getRuntime().availableProcessors() * THREAD_MULTIPLIER), new ManipulativeThreadFactory("world-worker", 10));
    private static ExecutorService fileWorker = Executors.newFixedThreadPool(2, new ManipulativeThreadFactory("cache-worker", Thread.NORM_PRIORITY));

    private static ScheduledExecutorService serviceWorker = Executors.newSingleThreadScheduledExecutor(new ManipulativeThreadFactory("service-worker", 3));
    private static ScheduledExecutorService asyncLogic = Executors.newSingleThreadScheduledExecutor(new ManipulativeThreadFactory("async-logic", Thread.MAX_PRIORITY));
    private static ScheduledExecutorService parallelLogic = Executors.newScheduledThreadPool((int) (Runtime.getRuntime().availableProcessors() * THREAD_MULTIPLIER), new ManipulativeThreadFactory("parallel-logic", 9));

    private static final Queue<Event> eventQueue = new ArrayDeque<Event>();

    public static void start(Runnable runnable, int msrate) {
        if (!running) {
            asyncLogic.scheduleAtFixedRate(runnable, 0, msrate, TimeUnit.MILLISECONDS);
            running = true;
        }
        for (Event t : eventQueue) {
            execute(t);
        }
        eventQueue.clear();
    }

    public static void scheduleClientNetwork(Runnable runnable) {
        serviceWorker.scheduleAtFixedRate(runnable, 1200, 1500, TimeUnit.MILLISECONDS);
    }


    /**
     * This is used in the Engine and in the Event class ONLY!
     * <p/>
     * To schedule an event, use {@link #scheduleRecurringEvent(org.osrse.task.event.RecurringEvent)}
     *
     * @param event The event to be scheduled.
     */
    public static void scheduleRecurringEvent(RecurringEvent event) {
        switch (event.executor()) {
            case ASYNC_LOGIC:
                event.setSchedule(asyncLogic.scheduleAtFixedRate(event, event.initialDelay(), event.delay(),
                        TimeUnit.MILLISECONDS));
                break;
            case PARALLEL_LOGIC:
                event.setSchedule(parallelLogic.scheduleAtFixedRate(event, event.initialDelay(), event.delay(), TimeUnit.MILLISECONDS));
                break;
            default:
                event.setSchedule(serviceWorker.scheduleAtFixedRate(event, event.initialDelay(), event.delay(), TimeUnit.MILLISECONDS));
                break;
        }
    }

    private static void scheduleEvent(Event event) {
        switch (event.executor()) {
            case ASYNC_LOGIC:
                asyncLogic.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
            case PARALLEL_LOGIC:
                parallelLogic.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
            default:
                serviceWorker.schedule(event, event.delay(), TimeUnit.MILLISECONDS);
                break;
        }
    }


    public static Bootstrap createBootstrap(boolean server) {
        return server ? new ServerBootstrap(new NioServerSocketChannelFactory(newNetworkingBossExecutor("nio-boss"), newNetworkingWorkerExecutor())) :
                new ClientBootstrap(new NioClientSocketChannelFactory(newNetworkingBossExecutor("lmc-boss"), worldWorker));
    }

    private static Executor newNetworkingBossExecutor(String name) {
        return Executors.newCachedThreadPool(new ManipulativeThreadFactory(name, Thread.MAX_PRIORITY));
    }

    private static Executor newNetworkingWorkerExecutor() {
        return Executors.newCachedThreadPool(new ManipulativeThreadFactory("nio-worker", 7));
    }


    public static void submit(Event event) {
        if (running) {
            execute(event);
        } else {
            eventQueue.offer(event);
        }
    }

    private static void execute(Event event) {
        if (event instanceof RecurringEvent) {
            scheduleRecurringEvent((RecurringEvent) event);
        } else {
            scheduleEvent(event);
        }
    }


    public static ExecutorService getFileWorker() {
        return fileWorker;
    }


    public static void dispatchToWorldWorker(Runnable r) {
        worldWorker.execute(r);
    }

    public static void dispatchToMapWorker(Runnable r) {
        mapWorker.execute(r);
    }
}
