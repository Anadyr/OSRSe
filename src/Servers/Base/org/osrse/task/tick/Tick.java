package org.osrse.task.tick;


import org.osrse.task.event.RecurringEvent;

/**
 * @author Lazaro
 */
public abstract class Tick extends RecurringEvent {
    public static enum TickPolicy {
        STRICT, PERSISTENT
    }

    protected int counter;
    protected int interval;

    private String identifier;

    private TickPolicy policy;

    public Tick() {
        this(null);
    }

    public Tick(int interval) {
        this(null, interval);
    }

    public Tick(int interval, TickPolicy policy) {
        this(null, interval, policy);
    }

    public Tick(String identifier) {
        this(identifier, 1);
    }

    public Tick(String identifier, int interval) {
        this(identifier, interval, TickPolicy.PERSISTENT);
    }

    public Tick(String identifier, int interval, TickPolicy policy) {
        super(0, 600);
        this.interval = interval;
        this.counter = interval;
        this.identifier = identifier;
        this.policy = policy;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public abstract boolean execute();

    public boolean running() {
        return !finished();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        if (this.identifier != null) {
            throw new RuntimeException("Illegal operation on re-resetting tick identifier!");
        }
        this.identifier = identifier;
    }

    public int interval() {
        return interval;
    }

    public Tick setInterval(int interval) {
        this.counter = (interval - (this.interval - counter));
        this.interval = interval;
        return this;
    }

    public TickPolicy getPolicy() {
        return policy;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int value) {
        counter = value;
    }

    public Tick resetCounter() {
        counter = interval;
        return this;
    }

    @Override
    public void run() {
        if (counter-- <= 0) {
            boolean keepRunning = true;
            try {
                keepRunning = execute();
            } catch (Exception e) {
                System.err.println("Error handling tick [" + this + "]" + e.getMessage());
            }
            if (!keepRunning) {
                stop();
            } else {
                counter = interval;
            }
        }
    }

    @Override
    public void stop() {
        super.stop();

        onStop();
    }

}
