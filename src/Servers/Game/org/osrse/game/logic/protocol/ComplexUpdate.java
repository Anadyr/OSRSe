package org.osrse.game.logic.protocol;

import org.osrse.WorldModule;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.network.LoginProtocol;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.Player.Viewport;

import java.util.Iterator;

/**
 * Created by Jonathan on 5/1/14.
 * @author Lazaro
 */
public abstract class ComplexUpdate extends Protocol {

    private final int regionPacketId;
    /**
     * The GPI/GMI Global Player Information, Global Mob Information.
     *
     * @param loginProtocol
     * @param interactionProtocol
     * @param regionPacketId
     * @param playerPacketId
     * @param npcPacketId
     */
    public ComplexUpdate(LoginProtocol loginProtocol,
                         Class<? extends AbstractProtocol> interactionProtocol, int regionPacketId, int playerPacketId, int npcPacketId) {
        super(loginProtocol, interactionProtocol, playerPacketId, npcPacketId);
        this.regionPacketId = regionPacketId;
    }

    //<editor-fold desc="Mapregion handling">
    /**
     * getMapUpdate
     * Newer versions of OSRS require complexPackets
     * @param cycle used in an update, or regular packet
     * @param player
     * @return builder
     */
    public final PacketBuilder getMapUpdate(boolean cycle, Player player) {
        if(cycle && !hasUpdateRegionSub()) {
            return null;
        } else {
            PacketBuilder pb = new PacketBuilder(regionPacketId, Packet.Type.VAR_SHORT);
            if (!player.isInCycle()) {
                pb.putBits(30, player.getLocation().getX() << 14 | player.getLocation().getY() & 16383 | player.getLocation().getZ() << 28);
                for (int i = 1; i < 2048; i++) {
                    if (i != player.getIndex()) {
                        pb.putBits(18, playerHashLoc[i]);
                    }
                }
            }
            handleRegionChange(player, pb);
            return pb;
        }
    }

    /**
     * Override when updatePlayer and Region send are synchronous
     * OSRS only (afaik)
     * @return
     */
    protected boolean hasUpdateRegionSub() {
        return false;
    }
    //</editor-fold>

    //<editor-fold desc="GPI">
    @Override
    protected final void updatePlayer(Player player, PacketBuilder complex) {
        /**
         * Local Update in cycle
         */
        complex.recalculateBitPosition();
        int skip = -1;
        for (int i = 1; i < 2048; i++) {
            if (player.hasFlag(Viewport.IN, i)) {
                if (!player.hasFlag(Viewport.SKIPPED_LAST, i)) {
                    Player local = WorldModule.getLogic().getPlayers().get(i);
                    if (!updateLocalPlayer(player, local, i, complex, skip)) {
                        player.setFlag(Viewport.SKIPPED_THIS, local.getIndex(), true);
                        skip++;
                    } else {
                        skip = -1;
                    }
                }
            }
        }
        writeSkip(skip, complex);
        /**
         * Local Update players joining our cycle
         */
        complex.recalculateBitPosition();
        skip = -1;
        for (int i = 1; i < 2048; i++) {
            if (player.hasFlag(Viewport.IN, i)) {
                if (player.hasFlag(Viewport.SKIPPED_LAST, i)) {
                    Player local = WorldModule.getLogic().getPlayers().get(i);
                    if (!updateLocalPlayer(player, local, i, complex, skip)) {
                        player.setFlag(Viewport.SKIPPED_THIS, local.getIndex(), true);
                        skip++;
                    } else {
                        skip = -1;
                    }
                }
            }
        }
        writeSkip(skip, complex);
        int newPlayerCount = 0;
        /**
         * Global Update players in our cycle
         */
        complex.recalculateBitPosition();
        skip = -1;
        for (int i = 1; i < 2048; i++) {
            if (player.hasFlag(Viewport.SKIPPED_LAST, i)) {
                Player p2 = WorldModule.getLogic().getPlayers().get(i);
                if (player.hasFlag(Viewport.IN, i) || player.hasFlag(Viewport.LEFT, i)) {
                    continue;
                } else if (p2 == null || !p2.isInCycle()) {
                    player.setFlag(Viewport.SKIPPED_THIS, i, true);
                    skip++;
                    continue;
                }
                if (player.getLocation().withinRange(p2.getLocation()) && newPlayerCount < 64) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 0, complex, false);
                    newPlayerCount++;
                } else if (p2.basicSettings().isTeleporting() || p2.loggedInThisCycle()) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 3, complex, false);
                } else if (p2.getMapRegionDirection() != null) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 2, complex, false);
                } else if (p2.isHeightUpdate()) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 1, complex, false);
                } else {
                    player.setFlag(Viewport.SKIPPED_THIS, i, true);
                    skip++;
                }
            }
        }
        writeSkip(skip, complex);
        /**
         * Global Update players joining our cycle
         */
        complex.recalculateBitPosition();
        skip = -1;
        for (int i = 1; i < 2048; i++) {
            if (!player.hasFlag(Viewport.SKIPPED_LAST, i)) {
                Player p2 = WorldModule.getLogic().getPlayers().get(i);
                if (player.hasFlag(Viewport.IN, i) || player.hasFlag(Viewport.LEFT, i)) {
                    continue;
                } else if (p2 == null || !p2.isInCycle()) {
                    player.setFlag(Viewport.SKIPPED_THIS, i, true);
                    skip++;
                    continue;
                }
                if (player.getLocation().withinRange(p2.getLocation()) && newPlayerCount < 64) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 0, complex, false);
                    newPlayerCount++;
                } else if (p2.basicSettings().isTeleporting() || p2.loggedInThisCycle()) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 3, complex, false);
                } else if (p2.getMapRegionDirection() != null) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 2, complex, false);
                } else if (p2.isHeightUpdate()) {
                    writeSkip(skip, complex);
                    skip = -1;
                    updateGlobalPlayer(player, p2, 1, complex, false);
                } else {
                    player.setFlag(Viewport.SKIPPED_THIS, i, true);
                    skip++;
                }
            }
        }
        writeSkip(skip, complex);
        /**
         * Masks
         */
        complex.recalculateBitPosition();
        for (int i : player.getUpdateRequiredList()) {
            Player local = WorldModule.getLogic().getPlayers().get(i);
            boolean justEnteredViewport = player.hasFlag(Viewport.JOINED, i);
            if (local.getMasks().requiresUpdate() || justEnteredViewport) {
                masks(local, complex, justEnteredViewport);
            }
        }
        PacketBuilder mapMain = player.basicSettings().isMapRegionUpdate() ? getMapUpdate(true, player) : null;
        if(mapMain == null) {
            player.write(complex.toPacket());
        } else
            player.getSession().writeSubPackets(mapMain, complex.toPacket());
    }


    private void updateGlobalPlayer(Player owner, Player player, int stage, PacketBuilder pb, boolean repeated) {
        if (!repeated) {
            pb.putBits(1, 1);
        }
        pb.putBits(2, stage);
        switch (stage) {
            case 0:
                if (player.basicSettings().isTeleporting() || player.loggedInThisCycle()) {
                    pb.putBits(1, 1);
                    updateGlobalPlayer(owner, player, 3, pb, true);
                } else if (player.getMapRegionDirection() != null) {
                    pb.putBits(1, 1);
                    updateGlobalPlayer(owner, player, 2, pb, true);
                } else if (player.isHeightUpdate()) {
                    pb.putBits(1, 1);
                    updateGlobalPlayer(owner, player, 1, pb, true);
                } else {
                    pb.putBits(1, 0);
                }
                int x = player.getLocation().getX() - (player.getLocation().getRegionX() << 6);
                int y = player.getLocation().getY() - (player.getLocation().getRegionY() << 6);
                pb.putBits(6, x);
                pb.putBits(6, y);
                pb.putBits(1, 1);
                owner.applyFlags(player.getIndex(), true, Viewport.IN, Viewport.SKIPPED_THIS, Viewport.JOINED);
                owner.getUpdateRequiredList().addLast(player.getIndex());
                break;
            case 1:
                int hashLoc = playerHashLoc[player.getIndex()];
                int z = (hashLoc >> 16) & 0x3;
                z = player.getLocation().getZ() - z & 0x3;
                pb.putBits(2, z);
                break;
            case 2:
                hashLoc = playerHashLoc[player.getIndex()];
                z = (hashLoc >> 16) & 0x3;
                z = player.getLocation().getZ() - z & 0x3;
                pb.putBits(5, z << 3 | (player.getMapRegionDirection().intValue() & 0x7));
                break;
            case 3:
                hashLoc = playerHashLoc[player.getIndex()];
                z = (hashLoc >> 16) & 0x3;
                x = (hashLoc >> 8) & 0xff;
                y = hashLoc & 0xff;
                x = player.getLocation().getRegionX() - x & 0xff;
                y = player.getLocation().getRegionY() - y & 0xff;
                z = player.getLocation().getZ() - z & 0x3;
                pb.putBits(18, z << 16 | x << 8 | y);
                break;
        }
    }

    /**
     *
     * @param owner
     * @param player
     * @param index
     * @param stage
     * @param remove
     * @param pb
     */
    private void updateLocalPlayer(Player owner, Player player, int index, int stage, boolean remove, PacketBuilder pb) {
        pb.putBits(1, 1);
        pb.putBits(1, remove ? 0 : (player.getMasks().requiresUpdate() ? 1 : 0));
        pb.putBits(2, stage);
        switch (stage) {
            case 0:
                if (remove) {
                    if (player != null) {
                        if (player.basicSettings().isTeleporting()) {
                            pb.putBits(1, 1);
                            updateGlobalPlayer(owner, player, 3, pb, true);
                        } else if (player.getMapRegionDirection() != null) {
                            pb.putBits(1, 1);
                            updateGlobalPlayer(owner, player, 2, pb, true);
                        } else if (player.isHeightUpdate()) {
                            pb.putBits(1, 1);
                            updateGlobalPlayer(owner, player, 1, pb, true);
                        } else {
                            pb.putBits(1, 0);
                        }
                    } else {
                        pb.putBits(1, 0);
                    }
                    owner.setFlag(Viewport.IN, index, false);
                    owner.setFlag(Viewport.LEFT, index, true);
                }
                break;
            case 1:
                pb.putBits(3, player.getDirections().getDirection().intValue());
                break;
            case 2:
                pb.putBits(4, player.getDirections().getDirection().intValue());
                break;
            case 3:
                pb.putBits(1, owner != player ? 0 : 1);
                if (owner != player) {
                    int x = player.getLocation().getX() - player.basicSettings().getOldLocation().getX() & 0x1f;
                    int y = player.getLocation().getY() - player.basicSettings().getOldLocation().getY() & 0x1f;
                    int z = player.getLocation().getZ() - player.basicSettings().getOldLocation().getZ() & 0x3;
                    pb.putBits(12, z << 10 | x << 5 | y);
                } else {
                    int x = player.getLocation().getX() - player.basicSettings().getOldLocation().getX() & 0x3fff;
                    int y = player.getLocation().getY() - player.basicSettings().getOldLocation().getY() & 0x3fff;
                    int z = player.getLocation().getZ() - player.basicSettings().getOldLocation().getZ() & 0x3;
                    pb.putBits(30, z << 28 | x << 14 | y);
                }
                break;
        }
    }

    /**
     * For updating a local player.
     * <p/>
     * Used int NSN0 and NSN1.
     *
     * @param owner  The player we are updating.
     * @param player A local player.
     * @param pb     The message factory to write with.
     * @return If the block was written.
     */
    private boolean updateLocalPlayer(Player owner, Player player, int index, PacketBuilder pb, int skip) {
        if (player == null || (owner != player && (!player.isValid() || player.isReleased()
                           || (owner.basicSettings().isTeleporting() && player.basicSettings().isTeleporting()) || !owner.getLocation().withinRange(player.getLocation())))) {
            writeSkip(skip, pb);
            updateLocalPlayer(owner, player, index, 0, true, pb);
        } else {
            if (player.basicSettings().isTeleporting() && (!player.basicSettings().isForcedTeleporting() || owner == player)) {
                writeSkip(skip, pb);
                updateLocalPlayer(owner, player, index, 3, false, pb);
            } else if (player.getDirections().getDirection() != null) {
                writeSkip(skip, pb);
                if (player.getDirections().getDirection().isRun()) {
                    updateLocalPlayer(owner, player, index, 2, false, pb);
                } else {
                    updateLocalPlayer(owner, player, index, 1, false, pb);
                }
            } else {
                if (player.getMasks().requiresUpdate()) {
                    writeSkip(skip, pb);
                    updateLocalPlayer(owner, player, index, 0, false, pb);
                } else {
                    return false;
                }
            }
            if (player.getMasks().requiresUpdate()) {
                owner.getUpdateRequiredList().addLast(player.getIndex());
            }
        }
        return true;
    }
    //</editor-fold>

    //<editor-fold desc="GMI">
    protected final void updateMobs(Player player, PacketBuilder pb) {
        pb.recalculateBitPosition();
        pb.putBits(8, player.getMobList().size());
        int stage, update;
        for (Iterator<Mob> it = player.getMobList().iterator(); it.hasNext();) {
            Mob npc = it.next();
            stage = !player.getLocation().withinRange(npc.getLocation()) || (npc.hasUpdate()) ? 1 : 0;
            pb.putBits(1, stage);
            if(stage != 0) {
                update = (!npc.isValid() || npc.basicSettings().isTeleporting() || !player.getLocation().withinRange(npc.getLocation()) ? 3 :
                        npc.getDirections().getSecondDirection() != null ? 2 :
                                npc.getDirections().getDirection() != null ? 1 : 0);
                pb.putBits(2, update);
                switch(update) {
                    case 1:
                        pb.putBits(3, npc.getDirections().getDirection().npcIntValue());
                        break;
                    case 2:
                        pb.putBits(3, npc.getDirections().getSecondDirection().npcIntValue());
                        pb.putBits(3, npc.getDirections().getDirection().npcIntValue());
                        break;
                }
                if(update != 3 && update != 0) {
                    pb.putBits(1, npc.getMasks().requiresUpdate() ? 1: 0);
                }
                if(update == 3) {
                    it.remove();
                }
            }
        }
        for (Mob npc : WorldModule.getLogic().getLocalMobs(player.getLocation())) {
            if (player.getMobList().size() >= 255) {
                break;
            }
            if (!npc.isValid() || player.getMobList().contains(npc) || player.basicSettings().isTeleporting() || npc.basicSettings().isTeleporting()) {
                continue;
            }
            addMob(player, npc, pb);
        }
        if(!hasUpdateRegionSub())
            pb.putBits(15, 32767);
        pb.recalculateBitPosition();
        for (Mob npc : player.getMobList()) {
            if (npc.getMasks().requiresUpdate()) {
                pb.put(npc.basicSettings().getCachedMaskBlock().getBytes());
            }
        }
        player.write(pb.toPacket());
    }


    private final void addMob(Player player, Mob npc, PacketBuilder pb) {
        int x = npc.getLocation().getX() - player.getLocation().getX();
        int y = npc.getLocation().getY() - player.getLocation().getY();
        if (x < 0)
            x += 32;
        if (y < 0)
            y += 32;
        addMob(npc, pb, x, y);
        player.getMobList().add(npc);
    }
    //</editor-fold>

    /**
     * Writes an amount of loops to skip.
     *
     * @param skip The amount of loops to skip.
     * @param pb   The message factory to write with.
     */
    private void writeSkip(int skip, PacketBuilder pb) {
        if (skip > -1) {
            int type = 0;
            if (skip != 0) {
                if (skip < 32) {
                    type = 1;
                } else if (skip < 256) {
                    type = 2;
                } else if (skip < 2048) {
                    type = 3;
                } else {
                    throw new IllegalArgumentException("Skip count cannot be over 2047!");
                }
            }
            pb.putBits(1, 0);
            pb.putBits(2, type);
            switch (type) {
                case 1:
                    pb.putBits(5, skip);
                    break;
                case 2:
                    pb.putBits(8, skip);
                    break;
                case 3:
                    pb.putBits(11, skip);
                    break;
            }
        }
    }

}
