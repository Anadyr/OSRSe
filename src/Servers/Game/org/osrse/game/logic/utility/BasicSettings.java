package org.osrse.game.logic.utility;

import org.osrse.game.content.combat.Magic;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.masks.Graphic;
import org.osrse.network.Packet;


/**
 * Holds the entity's properties such as stat bonuses, curse increases/decreases, ...
 * @author Emperor
 *
 */
public class BasicSettings {

    protected Tile mapRegionUpdatePosition = null;
    protected boolean mapRegionUpdate = false;
    private boolean noting = false;
    private boolean following;
    private Packet cachedMaskBlock = null;
    private Packet cachedAppearanceBlock = null;
    private Tile teleportDestination = null;
    private boolean teleporting = false;
    private int teleportTick = 0;
    /**
     * home teleport
     */
    private boolean homeTeleport;
    /**
     * The teleportation target.
     */
    private Tile teleportTarget = null;
    /**
     * Pathfinding.
     *
     * @param tile
     */
    private boolean clipping = true;
    private Tile oldLocation = null;
    private boolean forcedTeleporting = false, animatedTP = false;

    public void setNotedBank(boolean b) {
        this.noting = b;
    }

    public boolean isNoted() {
        return noting;
    }

    public Packet getCachedAppearanceBlock() {
        return cachedAppearanceBlock;
    }

    public void setCachedAppearanceBlock(Packet block) {
        this.cachedAppearanceBlock = block;
    }

    public Packet getCachedMaskBlock() {
        return cachedMaskBlock;
    }

    public void setCachedMaskBlock(Packet block) {
        this.cachedMaskBlock = block;
    }

    public final Tile getMapRegionUpdatePosition() {
        return mapRegionUpdatePosition;
    }

    public final void setMapRegionUpdatePosition(Tile mapRegionUpdatePosition) {
        this.mapRegionUpdatePosition = mapRegionUpdatePosition;
    }

    public final Tile getTeleportDestination() {
        return teleportDestination;
    }

    public final void setTeleportDestination(Tile teleportDestination) {
        this.teleportDestination = teleportDestination;
    }

    public final boolean isTeleporting() {
        return teleporting;
    }

    public final void setTeleporting(boolean teleporting) {
        this.teleporting = teleporting;
    }

    public int getTeleportTick() {
        return teleportTick;
    }

    public void setTeleportTick(int teleportTick) {
        this.teleportTick = teleportTick;
    }

    public boolean isHomeTeleport() {
        return homeTeleport;
    }

    public void setHomeTeleport(boolean homeTeleport) {
        if(homeTeleport) {
            teleportTick = 17;
        }
        this.homeTeleport = homeTeleport;
    }

    /**
     * Checks if this entity has a target to teleport to.
     *
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    public boolean hasTeleportTarget() {
        return teleportTarget != null;
    }

    /**
     * Gets the teleport target.
     *
     * @return The teleport target.
     */
    public Tile getTeleportTarget() {
        return teleportTarget;
    }

    /**
     * Sets the teleport target.
     *
     * @param teleportTarget The target location.
     */
    public void setTeleportTarget(Tile teleportTarget) {
        this.teleportTarget = teleportTarget;
    }

    /**
     * Resets the teleport target.
     */
    public void resetTeleportTarget() {
        this.teleportTarget = null;
    }

    public void reset(boolean halt) {
        if(teleportTick != -1) {
            teleportTick = teleportTick - 1;
        }
        if(halt) {
            teleportTick = -1;
            setTeleporting(false);
            setTeleportDestination(null);
            setHomeTeleport(false);
        }
        setMapRegionUpdate(false);
        teleporting = false;
    }

    public void process(Entity owner) {
        if(getTeleportDestination() != null && !owner.hasAttribute("teleblock")) {
            if(teleportTick == -1) {
                teleportTick = owner.getMagic().hasTwoStepTeleport() ? 4 : 3;
            }
            if (animatedTP) {
                if (owner.getMagic().getSecondary() == Magic.Type.Home) {
                    if (teleportTick == 12) {
                        owner.getMasks().setAnimation(4850);
                    } else if (teleportTick == 10) {
                        owner.getMasks().setAnimation(4853);
                        owner.getMasks().setGraphics(Graphic.create(802));
                    } else if (teleportTick == 5) {
                        owner.getMasks().setAnimation(4855);
                        owner.getMasks().setGraphics(Graphic.create(803));
                    } else if (teleportTick == 2) {
                        owner.getMasks().setAnimation(4857);
                        owner.getMasks().setGraphics(Graphic.create(804));
                    }
                } else {
                    if (teleportTick == 3) {
                        owner.getMagic().startTeleport();
                    } else if (teleportTick == 4) {
                        owner.getMagic().windAnimation();
                    }
                }
                if(teleportTick == 0) {
                    animatedTP = false;
                    owner.magic.finishTeleport();
                }
            }
        } else if(getTeleportDestination() != null) {
            owner.getMagic().resetTeleFrom();
        }
    }

    public final boolean isClipping() {
        return clipping;
    }

    public final void setClipping(boolean clipping) {
        this.clipping = clipping;
    }

    public Tile getOldLocation() {
        return oldLocation;
    }

    public void setOldLocation(Tile oldLocation) {
        this.oldLocation = oldLocation;
    }

    public boolean isForcedTeleporting() {
        return forcedTeleporting;
    }

    public void setForcedTeleporting(boolean forcedTeleporting) {
        this.forcedTeleporting = forcedTeleporting;
    }

    public final boolean isMapRegionUpdate() {
        return mapRegionUpdate;
    }
    public final void setMapRegionUpdate(boolean mapRegionUpdate) {
        this.mapRegionUpdate = mapRegionUpdate;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isAnimatedTP() {
        return animatedTP;
    }

    public void setAnimatedTP(boolean animatedTP) {
        this.animatedTP = animatedTP;
    }
}