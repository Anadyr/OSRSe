package org.osrse.game.logic.map;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

import org.osrse.Module;
import org.osrse.game.logic.item.GroundItem;
import org.osrse.game.logic.map.event.*;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.object.GameObject;
import org.osrse.game.logic.player.Player;

/**
 * @author Lazaro
 */
public final class Tile {
    public static final Tile PLACE_HOLDER = new Tile(-1, -1, -1);

    public static double distanceFormula(int x, int y, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public static Tile locate(int x, int y, int z) {
        return Region.getAbsoluteTile(x, y, z);
    }

    public static Tile locate(int[] coordinates) {
        return locate(coordinates[0], coordinates[1], coordinates[2]);
    }

    private final int x, y, z;

    private transient List<Player> players;
    private transient List<Mob> npcs;

    private transient List<GroundItem> items;
    private transient GameObject spawnedObject = null;


    private transient List<TileEventListener> eventListeners = new LinkedList<TileEventListener>();

    public Tile(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //public void add(Situated locatable) {
        /*
        if (locatable instanceof Player) {
            add((Player) locatable);

        } else if (locatable instanceof Mob) {
            add((Mob) locatable);

            dispatchMobEvents((Mob) locatable, true);*/
            /*
        } else if (locatable instanceof GroundItem) {
            add((GroundItem) locatable);

            dispatchGroundItemEvents((GroundItem) locatable);
        } else if (locatable instanceof GameObject) {
            GameObject obj = (GameObject) locatable;
            if (obj.isSpawned()) {
                spawnedObject = obj;
            }

            dispatchGameObjectEvents((GameObject) locatable);
        }
        */
       // }
    //}

    private void dispatchPlayerEvents(Player player, boolean loop) {
        for(TileEventListener listener : eventListeners) {
            if(listener instanceof PlayerTileEventListener) {
                ((PlayerTileEventListener) listener).onPlayerEvent(player, this);
            } else if(listener instanceof EntityTileEventListener) {
                ((EntityTileEventListener) listener).onEntityEvent(player, this);
            }
        }
        if(player.getSize() > 1 && loop) {
            Tile[][] tiles = player.getCoverage().tiles();
        	for (int x = 0; x < tiles.length; x++) {
        		for (int y = 0; y < tiles[x].length; y++) {
        			tiles[x][y].dispatchPlayerEvents(player, false);
        		}
        	}
        }
    }

    private void dispatchMobEvents(Mob npc, boolean loop) {
        for(TileEventListener listener : eventListeners) {
            if(listener instanceof NPCTileEventListener) {
                ((NPCTileEventListener) listener).onNPCEvent(npc, this);
            } else if(listener instanceof EntityTileEventListener) {
                ((EntityTileEventListener) listener).onEntityEvent(npc, this);
            }
        }        
        if(npc.getSize() > 1 && loop) {
        	Tile[][] tiles = npc.getCoverage().tiles();
        	for (int x = 0; x < tiles.length; x++) {
        		for (int y = 0; y < tiles[x].length; y++) {
        			tiles[x][y].dispatchMobEvents(npc, false);
        		}
        	}
        }
    }



    private void dispatchGroundItemEvents(GroundItem item) {
        for(TileEventListener listener : eventListeners) {
            if(listener instanceof GroundItemTileEventListener) {
                ((GroundItemTileEventListener) listener).onGroundItemEvent(item, this);
            }
        }
    }

    private void dispatchGameObjectEvents(GameObject object) {
        for(TileEventListener listener : eventListeners) {
            if(listener instanceof GameObjectTileEventListener) {
                ((GameObjectTileEventListener) listener).onGameObjectEvent(object, this);
            }
        }
    }

    public void add(Player player) {
        getPlayers().add(player);

        dispatchPlayerEvents(player, true);
    }

    public boolean containsPlayers() {
        return players != null && players.size() > 0;
    }

    public int getPlayerCount() {
        return players != null ? players.size() : 0;
    }

    public List<Player> getPlayers() {
        if (players == null) {
            players = new LinkedList<Player>();
        }
        return players;
    }

    public void remove(Player player) {
        getPlayers().remove(player);
    }

    public void add(Mob mob) {
        getMobs().add(mob);

        dispatchMobEvents(mob, true);
    }

    public boolean containsMobs() {
        return npcs != null && npcs.size() > 0;
    }

    public int getMobCount() {
        return npcs != null ? npcs.size() : 0;
    }

    public List<Mob> getMobs() {
        if (npcs == null) {
            npcs = new LinkedList<Mob>();
        }
        return npcs;
    }

    public void remove(Mob npc) {
        getMobs().remove(npc);
    }


    public void add(GroundItem item) {
        getItems().add(item);

        dispatchGroundItemEvents(item);
    }

    public boolean containsItems() {
        return items != null && items.size() > 0;
    }

    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public List<GroundItem> getItems() {
        if (items == null) {
            items = new LinkedList<GroundItem>();
        }
        return items;
    }

    public void remove(GroundItem item) {
        getItems().remove(item);
    }

    public GameObject getSpawnedObject() {
        return spawnedObject;
    }

    public void add(GameObject obj) {
        if (obj.isSpawned()) {
            spawnedObject = obj;
        }
        dispatchGameObjectEvents(obj);
    }

    public void remove(GameObject obj) {
        if (obj.isSpawned() && spawnedObject == obj) {
            spawnedObject = null;
        }
    }

    public boolean differentMap(Tile tile) {
        return distanceFormula(getPartX(), getPartY(), tile.getPartX(), tile.getPartY()) >= 5;
    }

    public int distance(Tile tile) {
        return (int) distanceFormula(x, y, tile.x, tile.y);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object instanceof Tile) {
            Tile tile = (Tile) object;
            return this.x == tile.x && this.y == tile.y && this.z == tile.z;
        }
        return false;
    }

    public int getLocalX() {
        return getLocalX(this);
    }

    public int getLocalX(Tile base) {
        return x - ((base.getPartX() - 6) << 3);
    }

    public int getLocalY() {
        return getLocalY(this);
    }

    public int getLocalY(Tile base) {
        return y - ((base.getPartY() - 6) << 3);
    }

    public int getPartX() {
        return x >> 3;
    }

    public int getPartY() {
        return y >> 3;
    }

    public int getRegionX() {
        return x >> 6;
    }

    public int getRegionY() {
        return y >> 6;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public int hashCode() {
        return z << 30 | x << 15 | y;
    }

    public Point toPoint() {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("x=").append(x).append(", y=").append(y).append(", z=").append(z).toString();
    }

    public Tile translate(int diffX, int diffY, int diffZ) {
        return Tile.locate(x + diffX, y + diffY, z + diffZ);
    }

    public boolean withinRange(Tile t) {
        return withinRange(t, 16);
    }

    public boolean withinRange(Tile t, int distance) {
        if (distance < 0 || z != t.z) {
            return false;
        }
        int dX = x - t.x;
        int dY = y - t.y;
        return dX < distance && dX >= -distance && dY < distance && dY >= -distance;
    }
    
    public boolean right(Tile t) {
    	return x > t.x;
    }
    
    public boolean left(Tile t) {
    	return x < t.x;
    }
    
    public boolean above(Tile t) {
    	return y > t.y;
    }
    
    public boolean under(Tile t) {
    	return y < t.y;
    }

    /**
     * NOTE: only for entities with size 1.
     * @param dir
     * @return
     */
    public boolean canMove(Directions.NormalDirection dir) {
        return canMove(dir, 1, false);
    }

    /**
     * NOTE: only for entities with size 1.
     * @param dir
     * @return
     */
    public boolean canMove(Directions.NormalDirection dir, boolean npcCheck) {
        return canMove(dir, 1, npcCheck);
    }

    public boolean canMove(Directions.NormalDirection dir, int size, boolean npcCheck) {
        switch (dir) {
        case WEST:
        	for (int k = y; k < y + size; k++) {
        		if (npcCheck && Tile.locate(x - 1, k, z).containsMobs())
        			return false;
        		if ((Region.getAbsoluteClipping(x - 1, k, z) & 0x42240000) != 0) 
        			return false;
        	}
            break;
        case EAST:
        	for (int k = y; k < y + size; k++) {
        		if (npcCheck && Tile.locate(x + size, k, z).containsMobs())
        			return false;
        		if ((Region.getAbsoluteClipping(x + size, k, z) & 0x60240000) != 0)
        			return false;
        	}
        	break;
        case SOUTH:
        	for (int i = x; i < x + size; i++) {
        		if (npcCheck && Tile.locate(i, y - 1, z).containsMobs())
        			return false;
        		if ((Region.getAbsoluteClipping(i, y - 1, z) & 0x40a40000) != 0)
        			return false;
        	} 
        	break;
        case NORTH:
        	for (int i = x; i < x + size; i++) {
        		if (npcCheck && Tile.locate(i, y + size, z).containsMobs())
        			return false;
        		if ((Region.getAbsoluteClipping(i, y + size, z) & 0x48240000) != 0)
        			return false;
        	}
        	break;
        case SOUTH_WEST:
        	for (int i = x; i < x + size; i++) {
        		int s = Region.getAbsoluteClipping(i, y - 1, z);
        		int w = Region.getAbsoluteClipping(i - 1, y, z);
        		int sw = Region.getAbsoluteClipping(i - 1, y - 1, z);
        		if (npcCheck && Tile.locate(i - 1, y - 1, z).containsMobs())
        			return false;
        		if ((sw & 0x43a40000) != 0 || (s & 0x40a40000) != 0 || (w & 0x42240000) != 0)
        			return false;
        	}
        	for (int k = y; k < y + size; k++) {
        		int s = Region.getAbsoluteClipping(x, k - 1, z);
        		int w = Region.getAbsoluteClipping(x - 1, k, z);
        		int sw = Region.getAbsoluteClipping(x - 1, k - 1, z);
        		if (npcCheck && Tile.locate(x - 1, k - 1, z).containsMobs())
        			return false;
        		if ((sw & 0x43a40000) != 0 || (s & 0x40a40000) != 0 || (w & 0x42240000) != 0)
        			return false;
        	}
        	break;
        case SOUTH_EAST:
        	for (int i = x; i < x + size; i++) {
        		int s = Region.getAbsoluteClipping(i, y - 1, z);
        		int e = Region.getAbsoluteClipping(i + 1, y, z);
        		int se = Region.getAbsoluteClipping(i + 1, y - 1, z);
        		if (npcCheck && Tile.locate(i + 1, y - 1, z).containsMobs())
        			return false;
        		if ((se & 0x60e40000) != 0 || (s & 0x40a40000) != 0 || (e & 0x60240000) != 0)
        			return false;
        	}
        	for (int k = y; k < y + size; k++) {
        		int s = Region.getAbsoluteClipping(x + size - 1, k - 1, z);
        		int e = Region.getAbsoluteClipping(x + size, k, z);
        		int se = Region.getAbsoluteClipping(x + size, k - 1, z);
        		if (npcCheck && Tile.locate(x + 1, k - 1, z).containsMobs())
        			return false;
        		if ((se & 0x60e40000) != 0 || (s & 0x40a40000) != 0 || (e & 0x60240000) != 0)
        			return false;
        	}
        	break;
        case NORTH_WEST:
        	for (int i = x; i < x + size; i++) {
        		int n = Region.getAbsoluteClipping(i, y + size, z);
        		int w = Region.getAbsoluteClipping(i - 1, y + size - 1, z);
        		int nw = Region.getAbsoluteClipping(i - 1, y + size, z);
        		if (npcCheck && Tile.locate(i - 1, y + size, z).containsMobs())
        			return false;
        		if ((nw & 0x4e240000) != 0 || (n & 0x48240000) != 0 || (w & 0x42240000) != 0)
        			return false;
        	}
        	for (int k = y; k < y + size; k++) {
        		int n = Region.getAbsoluteClipping(x, y, z);
        		int w = Region.getAbsoluteClipping(x - 1, y, z);
        		int nw = Region.getAbsoluteClipping(x - 1, y + 1, z);
        		if (npcCheck && Tile.locate(x - 1, k + 1, z).containsMobs())
        			return false;
        		if ((nw & 0x4e240000) != 0 || (n & 0x48240000) != 0 || (w & 0x42240000) != 0)
        			return false;
        	}
        	break;
        case NORTH_EAST:
        	for (int i = x; i < x + size; i++) {
        		int n = Region.getAbsoluteClipping(i, y + size, z);
        		int e = Region.getAbsoluteClipping(i + 1, y + size - 1, z);
        		int ne = Region.getAbsoluteClipping(i + 1, y + size, z);
        		if (npcCheck && Tile.locate(i + 1, y + size, z).containsMobs())
        			return false;
        		if ((ne & 0x78240000) != 0 || (n & 0x48240000) != 0 || (e & 0x60240000) != 0) 
        			return false;
        	}
        	for (int k = y; k < y + size; k++) {
        		int n = Region.getAbsoluteClipping(x + size - 1, k + 1, z);
        		int e = Region.getAbsoluteClipping(x + size, k, z);
        		int ne = Region.getAbsoluteClipping(x + size, k + 1, z);
        		if (npcCheck && Tile.locate(x + size, k + 1, z).containsMobs())
        			return false;
        		if ((ne & 0x78240000) != 0 || (n & 0x48240000) != 0 || (e & 0x60240000) != 0) 
        			return false;
        	}
        	break;
        }
    	return true;       
    }

    public Tile randomize(int maxDelta) {
        return randomize(maxDelta, maxDelta);
    }

    public Tile randomize(int maxDeltaX, int maxDeltaY) {
        int maxTries = 3;

        for (int i = 0; i < maxTries; i++) {
            int deltaX = Module.random.nextInt(maxDeltaX + 1);
            int deltaY = Module.random.nextInt(maxDeltaY + 1);

            Tile t = translate(deltaX, deltaY, 0);
            if (Region.getAbsoluteClipping(t.getX(), t.getY(), t.getZ()) <= 256) {
                return t;
            }
        }

        return this;
    }

    public Tile random(int size) {
            int maxTries = 3;
            for (int i = 0; i < maxTries; i++) {
                int deltaX = Module.random.nextInt(size) * (Module.random.nextBoolean() ? -1 : 1);
                int deltaY = Module.random.nextInt(size) * (Module.random.nextBoolean() ? -1 : 1);
                Tile t = translate(deltaX, deltaY, 0);
                if (Region.getAbsoluteClipping(t.getX(), t.getY(), t.getZ()) <= 256) {
                    return t;
                }
            }
        return null;
    }

    public int wildernessLevel() {
    	if (Areas.HIGH_LVL_WILD_STAIRS.inArea(this)) {
        	return (((y - 9920) / 8) + 1);
    	}
        if (y > 3524 && y < 4000 && x > 2943 && x <= 3394)
            return (((y - 3520) / 8) + 1);
        return 0;
    }

    public void registerEventListener(TileEventListener listener) {
        eventListeners.add(listener);
        listener.onRegister(this);
    }

    public void unregisterEventListener(TileEventListener listener) {
        eventListeners.remove(listener);
    }


}
