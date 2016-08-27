/**
 *
 */
package org.osrse.game.logic;

import org.osrse.game.content.combat.Magic;
import org.osrse.game.content.combat.magic.MagicBook;
import org.osrse.game.logic.utility.BasicSettings;
import org.osrse.game.logic.utility.CombatSettings;
import org.osrse.task.Engine;
import org.osrse.task.tick.Tick;
import org.osrse.game.logic.map.Coverage;
import org.osrse.game.logic.map.Directions;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.masks.Masks;


import java.util.*;

/**
 * @author Lazaro, Jonathan
 */
public abstract class Entity extends Situated implements Runnable {
    public static enum UpdateStage {
        CLIENT_UPDATE, MASK_UPDATE, POST_UPDATE, PRE_UPDATE
    }
    protected final Masks masks = new Masks(this);
    private final Map<String, Object> attributes = new HashMap<String, Object>();
    public transient Magic magic = new Magic(this, Magic.Type.Standard);

    //3667, 2982
    //2800, 5166 pyramid scarab place
    public static final Tile DEFAULT_LOCATION = Tile.locate(3667, 2982, 0).randomize(5);


    private Map<String, Tick> ticks = null;
    private PathProcessor pathProcessor = null;
    public Directions directions = null;


    private int tickIdentifierCounter = 0;
    private static long identifierCounter = 0;
    private long identifier;

    public Entity() {
        identifier = identifierCounter++;
        directions = new Directions();
        ticks = new HashMap<String, Tick>();
    }

    public Tile getDefault() {
        return DEFAULT_LOCATION.random(3);
    }


    public void goHome() {
        basicSettings().setTeleportDestination(getDefault());
    }

    /**
     * The settings.
     */
    private final BasicSettings settings = new BasicSettings();
    private final CombatSettings combat = new CombatSettings();


    public abstract int getHealth();

    public abstract int getBaseHealth();

    public Magic getMagic() {
        return magic;
    }

    public CombatSettings getCombat() {
        return combat;
    }
    /**
     * @return the settings
     */
    public BasicSettings basicSettings() {
        return settings;
    }

    public void setAttribute(String string, Object object) {
        attributes.put(string, object);
    }

    @SuppressWarnings("unchecked")
    public <T> T getAttribute(String string) {
        return (T) attributes.get(string);
    }

    @SuppressWarnings("unchecked")
    public <T> T getAttribute(String string, T fail) {
        T object = (T) attributes.get(string);
        if (object != null) {
            return object;
        }
        return fail;
    }

    public boolean hasAttribute(String string) {
        return attributes.get(string) != null;
    }

    public <T> Object removeAttribute(String string) {
        return attributes.remove(string);
    }

    public Masks getMasks() {
        return masks;
    }

    protected UpdateStage updateStage = null;

    public UpdateStage getUpdateStage() {
        return updateStage;
    }

    public void setUpdateStage(UpdateStage updateStage) {
        this.updateStage = updateStage;
    }


    public final void process() {
        processTicks();

        _process();

        //processHP();

        masks.process();

        if(pathProcessor != null) {
            pathProcessor.processPathRequest();

            pathProcessor.process();
        }
        basicSettings().process(this);
        getCombat().tick();
    }

    public final void reset() {
        masks.reset();
        directions.reset();
        basicSettings().reset(false);

        settings.setCachedMaskBlock(null);

        _reset();
    }

    protected abstract void _process();

    protected abstract void _reset();


    //<editor-fold desc="Ticks">
    protected Deque<Runnable> specificProcesses = new ArrayDeque<Runnable>();

    /**
     * Using this method you can add specific entity behaviour
     * that will be executed in the first upcoming engine update cycle.
     * @param r The runnable to execute in the first upcoming update cycle.
     */
    public void addSpecificProcess(Runnable r) {
        specificProcesses.add(r);
    }

    /**
     * Using this method you can add specific entity behaviour
     * that will be executed in the first upcoming engine update cycle.
     * @param r The runnable to execute in the first upcoming update cycle.
     * @param delay The amount of ticks to wait to add this Runnable.
     */
    public void addSpecificProcess(final Runnable r, int delay) {
        registerTick(new Tick(null, delay) {
            @Override
            public boolean execute() {
                specificProcesses.add(r);
                return false;
            }
        });
    }

    /**
     * Using this method you can add specific entity behaviour
     * that will be executed in the first upcoming engine update cycle.
     * @param r The runnable to execute in the first upcoming update cycle.
     * @param delay The amount of ticks to wait to add this Runnable.
     * @param identifier The identifier of the tick used to add this Runnable.
     */
    public void addSpecificProcess(final Runnable r, int delay, String identifier) {
        registerTick(new Tick(identifier, delay) {
            @Override
            public boolean execute() {
                specificProcesses.add(r);
                return false;
            }
        });
    }

    /**
     * Registers a tick event onto the entity's tick processor.
     *
     * @param tick The tick to be registered.
     */
    public void registerTick(Tick tick) {
        if (tick.getIdentifier() == null) {
            tick.setIdentifier(new StringBuilder().append(tickIdentifierCounter++).toString());
        }
        if (tick.getPolicy() == Tick.TickPolicy.STRICT) {
            cancelStrictTicks();
        }
        tick.onStart();
        synchronized (ticks) {
            Tick oldTick = ticks.put(tick.getIdentifier(), tick);
            if (oldTick != null) {
                oldTick.stop();
            }
        }
       Engine.submit(tick);
    }

    public void cancelStrictTicks() {
        synchronized (ticks) {
            for (Tick tick : new ArrayList<Tick>(ticks.values())) {
                if (tick.getPolicy() == Tick.TickPolicy.STRICT) {
                    cancelTick(tick);
                }
            }
        }
    }


    /**
     * Cancels a tick event that ways registered.
     * <p/>
     * Note: The tick may have already been running.
     *
     * @param identifier The getIdentifier of the tick to be canceled.
     */
    public void cancelTick(String identifier) {
        synchronized (ticks) {
            Tick tick = ticks.remove(identifier);
            if (tick != null) {
                tick.stop();
            }
        }
    }

    /**
     * Cancels a tick event that ways registered.
     * <p/>
     * Note: The tick may have already been running.
     *
     * @param tick The tick to be canceled.
     */
    public void cancelTick(Tick tick) {
        cancelTick(tick.getIdentifier());
    }

    private final void processTicks() {
        synchronized (ticks) {
            for (Iterator<Map.Entry<String, Tick>> it = new HashSet<Map.Entry<String, Tick>>(ticks.entrySet()).iterator(); it.hasNext(); ) {
                Tick tick = it.next().getValue();
                if (!tick.running()) {
                    ticks.remove(tick.getIdentifier());
                }
            }
        }
    }
    //</editor-fold>


    public final Directions getDirections() {
        return directions;
    }

    public abstract void addType(Tile tile);
    public abstract void removeType(Tile tile);
    public abstract int getSize();

    protected Coverage coverage;

    @Override
    public void remove(Tile tile) {
        removeType(tile); //removes from old tile
    }

    @Override
    public void add(Tile tile) {
        coverage = new Coverage(getLocation(), getSize());
        addType(tile); //adds to newcache
    }

    public Coverage getCoverage() {
        return coverage;
    }

    public void updateCoverage(Directions.NormalDirection direction) {
        coverage.update(direction, getSize());
    }

    public void updateCoverage(Tile loc) {
        coverage.update(loc, getSize());
    }

    public final PathProcessor getPathProcessor() {
        return pathProcessor;
    }

    public final void setPathProcessor(PathProcessor pathProcessor) {
        this.pathProcessor = pathProcessor;
    }


    public void resetEvents() {
        resetEvents(true);
    }

    public void resetEvents(boolean nullCoordinateFuture) {
        cancelTick("event");
        cancelStrictTicks();

        if(pathProcessor != null)
            pathProcessor.reset(nullCoordinateFuture);

        //resetAnimation();
        //face(null);
        //resetGraphics();

        _resetEvents();
    }

    public abstract void _resetEvents();


    public void setMagicBook(MagicBook magic) {
        this.magic.changeBook(magic);
    }

    public void setFaceEntity(Entity e) {
        masks.face(e);
    }

    public final void faceDirection(Tile loc) {
        masks.setFaceDirection(loc);
    }



}
