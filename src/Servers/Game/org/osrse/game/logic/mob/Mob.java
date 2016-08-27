/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osrse.game.logic.mob;

import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.game.content.container.WalkingContainer;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.map.Tile;
import org.osrse.utility.Serviceable;

/**
 *
 * @author Jonathan
 */
public class Mob extends Entity implements Serviceable {

    private SpawnPoint spawn;
    private boolean dynamicMob;
    private Entity target;
    private int size = 1;
    
    public Mob(int id, SpawnPoint spawn) {
        setStaticIndex(id);
        this.spawn = spawn;
        this.setPathProcessor(new MobPathProcessor(this));
        this.setLocation(spawn.getSpawn(false));
    }

    public Mob(int id, int size, SpawnPoint spawn) {
        setStaticIndex(id);
        this.size = size;
        this.spawn = spawn;
        this.setPathProcessor(new MobPathProcessor(this));
        this.setLocation(spawn.getSpawn(false));
    }

    public boolean hasTarger() {
        return target != null;
    }

    public Entity getTarget() {
        return target;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getBaseHealth() {
        return 0;
    }

    @Override
    public void run() {
        switch (updateStage) {
            case PRE_UPDATE:
                try {
                    process();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                return;
            case MASK_UPDATE:
                try {
                    basicSettings().setCachedMaskBlock(WorldModule.getLogic().getProtocol().doMaskBlock(this));
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                WorldModule.getLogic().getMaskUpdateLatch().countDown();
                return;
            case POST_UPDATE:
                try {
                    reset();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                WorldModule.getLogic().getResetUpdateLatch().countDown();
                return;
        }
    }

    @Override
    protected void _process() {
        if(!getPathProcessor().moving() && Module.random(10) == 9) {
           WalkingContainer.handleWalk(this, spawn.getSpawn(true));
        }
        // TODO Auto-generated method stub
    }

    @Override
    protected void _reset() {
        // TODO Auto-generated method stub
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public void addType(Tile tile) {
        tile.add(this);
    }

    @Override
    public void removeType(Tile tile) {
        tile.remove(this);
    }

    @Override
    public void _resetEvents() {

    }

    @Override
    public int getSize() {
        return size;
    }

    private boolean destroyed;

    public void destroy() {
        destroyed = true;
    }

    @Override
    public void release() {
        release(dynamicMob);
    }

    @Override
    public void release(boolean removeFromGame) {
        if(removeFromGame) {

        }
    }

    public boolean hasUpdate() {
        return (!isValid() || basicSettings().isTeleporting() || getDirections().getDirection() != null || getDirections().getSecondDirection() != null || getMasks().requiresUpdate());
    }
}
