package org.osrse.game.logic.protocol;

import org.osrse.WorldModule;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.game.logic.masks.Hit;
import org.osrse.game.logic.masks.Masks.MaskType;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.game.network.LoginProtocol;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedWorld;
import org.osrse.utility.Configuration;
import org.osrse.utility.OutputDisplay;
import org.osrse.utility.TextUtilities;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Jonathan on 4/30/14.
 */
public abstract class Protocol {
    public final LinkedHashMap<MaskType, Integer> playerUpdateMap = new LinkedHashMap<MaskType, Integer>();
    public final LinkedHashMap<MaskType, Integer> mobUpdateMap = new LinkedHashMap<MaskType, Integer>();
    protected final int playerPacketId, npcPacketId;

    private Class<? extends AbstractProtocol> interactionProtocol;
    private final LoginProtocol loginProtocol;

    protected static int[] playerHashLoc = new int[2048];
    private int version;

    public Protocol(LoginProtocol loginProtocol,
                    Class<? extends AbstractProtocol> interactionProtocol, int playerPacket, int npcPacket) {
        this.playerPacketId = playerPacket;
        this.npcPacketId = npcPacket;
        this.loginProtocol = loginProtocol;
        this.interactionProtocol = interactionProtocol;
    }

    public static void setPlayerHashLoc(int index, int value) {
        playerHashLoc[index] = value;
    }

    /**
     * The update method for players
     * checks for nulls for people doing login
     * and no support for updating at that time.
     *
     * @param player
     */
    public void process(Player player) {
        if (playerPacketId != -1) {
            updatePlayer(player, createUpdate(true));
        }
        if (npcPacketId != -1) {
            updateMobs(player, createUpdate(false));
        }
        //grounditem update
    }

    /**
     * @param player
     * @return
     */
    protected PacketBuilder createUpdate(boolean player) {
        return new PacketBuilder(player ? playerPacketId : npcPacketId, Packet.Type.VAR_SHORT);
    }

    /**
     * protected under the sense of GPI/GMI, which can be overwritten ;)
     *
     * @param player
     * @param packet The master packet is written in bits instead of bytes and holds
     *               information about the local list, players to add and remove, movement
     *               and which updates are required.
     */
    protected void updatePlayer(Player player, PacketBuilder packet) {

        /*
         * The update block packet holds update blocks and is send after the
         * master packet.
         */
        PacketBuilder updateBlock = new PacketBuilder();

        /*
         * Updates this player.
         */
        manageMovement(true, player, packet);
        masks(player, updateBlock, false);

        /*
         * Write the current size of the player list.
         */
        packet.putBits(8, player.getLocalPlayers().size());

        /*
         * Iterate through the local player list.
         */
        for (Iterator<Player> it$ = player.getLocalPlayers().iterator(); it$.hasNext(); ) {
            /*
             * Get the next player.
             */
            Player otherPlayer = it$.next();

            /*
             * If the player should still be in our list.
             */
            if (WorldModule.getLogic().getPlayers().contains(otherPlayer)
                    && !otherPlayer.basicSettings().isTeleporting()
                    && otherPlayer.getLocation().withinRange(
                    player.getLocation())) {
                /*
                 * Update the movement.
                 */
                manageMovement(false, otherPlayer, packet);

                /*
                 * Check if an update is required, and if so, send the update.
                 */
                if (otherPlayer.getMasks().requiresUpdate()) {
                    masks(otherPlayer, updateBlock, false);
                }
            } else {
                /*
                 * Otherwise, remove the player from the list.
                 */
                it$.remove();

                /*
                 * Tell the client to remove the player from the list.
                 */
                packet.putBits(1, 1);
                packet.putBits(2, 3);
            }
        }

        /*
         * Loop through every player.
         */
        for (Player otherPlayer : WorldModule.getLogic().getLocalPlayers(player.getLocation())) {
                /*
                 * Check if there is room left in the local list.
                 */
            if (player.getLocalPlayers().size() >= 255) {
                    /*
                     * There is no more room left in the local list. We cannot
                     * add more players, so we just ignore the extra ones. They
                     * will be added as other players get removed.
                     */
                break;
            }

                /*
                 * If they should not be added ignore them.
                 */
            if (otherPlayer == null || otherPlayer == player
                    || player.getLocalPlayers().contains(otherPlayer) || otherPlayer.isReleased()) {
                continue;
            }

                /*
                 * Add the player to the local list if it is within distance.
                 */
            player.getLocalPlayers().add(otherPlayer);

                /*
                 * Add the player in the packet.
                 */
            addPlayer(packet, player, otherPlayer);

                /*
                 * Update the player, forcing the appearance flag.
                 */
            masks(otherPlayer, updateBlock, true);
        }

        /*
         * Check if the update block is not empty.
         */
        if (updateBlock.getPosition() != 0) {
            /*
             * Write a magic id indicating an update block follows.
             */
            packet.putBits(11, 2047);
            packet.recalculateBitPosition();

            /*
             * Add the update block at the end of this packet.
             */
            packet.put(updateBlock.toPacket().getBytes());
        } else {
            /*
             * Terminate the packet normally.
             */
            packet.recalculateBitPosition();
        }
        /*
         * Write the packet.
         */
        player.write(packet.toPacket());
    }

    /**
     * updateMobs
     *
     * @param player
     * @param packet The main packet holds information about adding, moving and removing
     *               NPCs.
     */
    protected void updateMobs(Player player, PacketBuilder packet) {
        /*
         * The update block holds the update masks and data, and is written
		 * after the main block.
		 */
        PacketBuilder updateBlock = new PacketBuilder();


		/*
         * Write the current size of the npc list.
		 */
        packet.putBits(8, 0);
        player.write(packet.toPacket());
    }

    /**
     * cycle through the linked map in order for each
     * here order for the switch does not matter.
     */
    protected final void cycleMasks(Player owner, Mob mob, boolean force, PacketBuilder blockTo) {
        final boolean plr = owner != null;
        for (Map.Entry<MaskType, Integer> currentMask : (owner == null ? mobUpdateMap : playerUpdateMap).entrySet()) {
            MaskType curr = currentMask.getKey();
            boolean needsUpdate = (plr ? owner : mob).getMasks().requiresCycle(curr, force);
            if (needsUpdate) {
                if(curr == MaskType.ANIMATION) {
                    if(plr)
                        doAnimation(owner, blockTo); else
                        doAnimation(mob, blockTo);
                } else if(curr == MaskType.FACE_ENTITY) {
                    if(plr)
                        doFaceEntity(owner, blockTo); else
                        doFaceEntity(mob, blockTo);
                } else if(curr == MaskType.FACE_DIRECTION) {
                    if(plr)
                        doFaceDirection(owner, blockTo);   else
                        doFaceDirection(mob, blockTo);
                } else if(curr == MaskType.FORCED_CHAT) {
                    if(plr)
                        blockTo.putString(owner.getMasks().getForcedChat().getForceText());    else
                        blockTo.putString(mob.getMasks().getForcedChat().getForceText());
                } else if(curr == MaskType.NAME_EDIT) {
                    for(int i = 0; i < 3; i++) {
                        if(plr)  {
                            blockTo.putString(owner.getMasks().getNameEdit().getRightClickOptions()[i]);
                        } else
                            blockTo.putString(mob.getMasks().getNameEdit().getRightClickOptions()[i]);
                    }
                } else if (curr == MaskType.GRAPHICS) {
                    if(plr)
                        doGraphics(owner, blockTo);    else
                        doGraphics(mob, blockTo);
                } else if(curr == MaskType.SECONDARY_GRAPHICS) {
                    if(plr)
                        doSecondaryGraphics(owner, blockTo);   else
                        doSecondaryGraphics(mob, blockTo);
                } else if (curr == MaskType.HIT) {
                    if(plr)
                        doFirstHit(owner, blockTo, owner.getMasks().getHit(1));    else
                        doFirstHit(mob, blockTo, mob.getMasks().getHit(1));
                } else if (curr == MaskType.SECOND_HIT) {
                    if(plr)
                        doSecondHit(owner, blockTo, owner.getMasks().getHit(2));  else
                        doSecondHit(mob, blockTo, mob.getMasks().getHit(2));
                } else if(plr) {
                    if(curr == MaskType.APPEARANCE) {
                        doAppearance(owner.basicSettings().getCachedAppearanceBlock(), blockTo);
                    } else if(curr == MaskType.CHAT) {
                        doChat(owner, blockTo);
                    } else if(curr == MaskType.RESET_MOVEMENT_MODE) {
                        doForceMovement(owner, blockTo);
                    } else if(curr == MaskType.MOVEMENT_MODE) {
                        doMovementMode(owner, blockTo);
                    }
                }
            }
        }
        if(plr) {
            owner.basicSettings().setCachedMaskBlock(blockTo.toPacket());
        } else {
            mob.basicSettings().setCachedMaskBlock(blockTo.toPacket());
        }
    }

    protected abstract void doMovementMode(Player player, PacketBuilder blockTo);


    //<editor-fold desc="Player Masks">
    private Packet doPlayerMaskBlock(Player player, boolean force) {
        /*
         * We have to construct and cache our own block.
         */
        PacketBuilder block = new PacketBuilder();
        /*
         * Calculate the bitmask.
         */
        int mask = 0;

        for (Map.Entry<MaskType, Integer> thisMaskData : playerUpdateMap.entrySet()) {
            MaskType curr = thisMaskData.getKey();
            if (player.getMasks().requiresCycle(curr, force)) {
                mask |= thisMaskData.getValue();
            }
        }
        /*
         * Check if the bitmask would overflow a byte.
         */
        if (mask >= 0x100) {
            /*
             * Write it as a short and indicate we have done so.
             */
            mask |= playerUpdateMap.get(MaskType.BYTE_OVERFLOW);
            if (mask >= 0x10000) {
                mask |= playerUpdateMap.get(MaskType.SHORT_OVERFLOW);
                block.put((byte) (mask & 0xFF));
                block.put((byte) (mask >> 8 & 0xFFFF));
                block.put((byte) (mask >> 16));
            } else {
                block.put((byte) (mask & 0xFF));
                block.put((byte) (mask >> 8));
            }
        } else {
            /*
             * Write it as a byte.
             */
            block.put((byte) mask);
        }
        cycleMasks(player, null, force, block);
        player.basicSettings().setCachedMaskBlock(block.toPacket());
        return block.toPacket();
    }

    protected void masks(Player player, PacketBuilder pb, boolean newPlayer) {
        if (!newPlayer) {
            pb.put(player.basicSettings().getCachedMaskBlock().getBytes());
        } else {
            pb.put(doPlayerMaskBlock(player, newPlayer).getBytes());
        }
    }

    public Packet doMaskBlock(Player player) {
        return doPlayerMaskBlock(player, false);
    }

    public void doChat(Player player, PacketBuilder block) {
        String unpacked = player.getMasks().getChat().getText();
        byte[] chatBuffer = new byte[256];
        chatBuffer[0] = (byte) unpacked.length();
        int offset = 1 + TextUtilities.huffmanCompress(unpacked, chatBuffer, 1);
        doChat(player, block, offset, chatBuffer);
    }
    //</editor-fold>

    //<editor-fold desc="Specific update functions">

    /**
     * Adds a newcache player.
     *
     * @param packet      The packet.
     * @param otherPlayer The player.
     */
    public void addPlayer(PacketBuilder packet, Player player, Player otherPlayer) {
        int xPos = otherPlayer.getLocation().getX()
                - player.getLocation().getX();
        int yPos = otherPlayer.getLocation().getY()
                - player.getLocation().getY();
        /*
         * Abstraction is used here for clientsided rearrangement
         * To keep errors from loading multiple revisions at one time.
         */
        addPlayer(otherPlayer, packet, xPos, yPos);
    }

    protected abstract void addPlayer(Player player, PacketBuilder block, int x, int y);

    protected abstract void addMob(Mob mob, PacketBuilder block, int x, int y);

    /**
     *
     * @param player
     * @param packet
     */
    protected abstract void handleRegionChange(Player player, PacketBuilder packet);

    /**
     * Pre GPI/GMI Updating for movement.
     *
     * @param localUpdate
     * @param player
     * @param packet
     */
    protected void manageMovement(boolean localUpdate, Player player, PacketBuilder packet) {
        int movementUpdateId = (localUpdate && (player.basicSettings().isTeleporting() || player.basicSettings().isMapRegionUpdate())) ? 3
                : (player.getDirections().getSecondDirection() != null ? 2
                : (player.getDirections().getDirection() != null ? 1
                : (player.getMasks().requiresUpdate() ? 0
                : -1)));
        /*
         * put basic movement header in
         */
        packet.putBits(1, movementUpdateId == -1 ? 0 : 1);

        if (movementUpdateId != -1) {
          /*
           * tell the client that our player teleported/changeregion, has movement, or is standing still.
           */
            packet.putBits(2, movementUpdateId);
            if (movementUpdateId == 3) {
                /**
                 * Apply custom/scrambled bits for Teleport/region change
                 */
                handleRegionChange(player, packet);
            } else if (movementUpdateId > 0) {
            /*
             * Write the primary sprite (i.e. walk direction).
             */
                packet.putBits(3, player.getDirections().getDirection().intValue());
                if (movementUpdateId == 2) {
                    /*
                     * Write the secondary sprite (i.e. run direction).
                     */
                    packet.putBits(3, player.getDirections().getSecondDirection().intValue());
                }
            /*
             * Write a flag indicating if a block update happened.
             */
                packet.putBits(1, player.getMasks().requiresUpdate() ? 1 : 0);
            }
        }
    }

    //</editor-fold>

    //<editor-fold desc="Revisional Abstraction">
    public static Protocol applyPatch(int revision) throws Exception {
        Protocol update = (Protocol) Class.forName(new StringBuilder("org.osrse.update.Update").append(revision).toString()).newInstance();
        update.setVersion(revision);
        return update;
    }

    public LoginProtocol getLoginProtocol() {
        return loginProtocol;
    }

    public Player createPlayer(LoginRequest login, PlayerDefinition def) {
        Player player = def.create(login);// new Player(login, def);
        try {
            player.setProtocol(interactionProtocol.getDeclaredConstructor(Player.class).newInstance(player));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return player;
    }
    //</editor-fold>

    //<editor-fold desc="Abstract Player Masks">
    protected abstract void doChat(Player player, PacketBuilder block, int offset, byte[] chatBuffer);

    protected abstract void doAppearance(Packet appearanceBlock, PacketBuilder blockTo);

    public abstract Packet doAppearanceBlock(Player player);

    protected abstract void doGraphics(Player player, PacketBuilder block);

    protected abstract void doAnimation(Player player, PacketBuilder block);

    protected abstract void doFaceEntity(Player player, PacketBuilder block);

    protected abstract void doFaceDirection(Player player, PacketBuilder block);

    protected abstract void doForceMovement(Player player, PacketBuilder block);

    protected abstract void doFirstHit(Player player, PacketBuilder block, Hit primary);

    protected abstract void doSecondHit(Player player, PacketBuilder block, Hit secondary);

    protected abstract void doSecondaryGraphics(Player player, PacketBuilder block);
    //</editor-fold>

    //<editor-fold desc="Abstract Mob Masks">
    protected abstract void handleMovement(Mob mob, PacketBuilder block);

    protected abstract void doGraphics(Mob mob, PacketBuilder block);

    protected abstract void doAnimation(Mob mob, PacketBuilder block);

    protected abstract void doFaceEntity(Mob mob, PacketBuilder block);

    protected abstract void doFaceDirection(Mob mob, PacketBuilder block);

    protected abstract void doFirstHit(Mob mob, PacketBuilder block, Hit primary);

    protected abstract void doSecondHit(Mob mob, PacketBuilder block, Hit secondary);

    protected abstract void doSecondaryGraphics(Mob mob, PacketBuilder block);
    //</editor-fold>

    //<editor-fold desc="Shit that shouldn't be here">
    @Deprecated
    public static void sendWorldList(Session session, LoginSession loginsession, int revision) {
        if (WorldModule.getLogic().hasSupportFor(revision)) {
            PacketBuilder worldList = new PacketBuilder().putShort(loginsession.getWorldCount(1));
            Protocol interactions = WorldModule.getLogic().getProtocol();
            for (int i = 1; i < loginsession.getWorldCount(2); i++) {
                if (i == WorldModule.getLogic().getId()) {
                    //TODO custom ip, flag, and activity
                    interactions.applyWorldToList(worldList, i, "127.0.0.1", WorldModule.getLogic().getLoginSession().getActivity(), 0, WorldModule.getLogic().getPlayers().size());
                } else {
                    ReferencedWorld w = loginsession.getWorldDock().get(i);
                    interactions.applyWorldToList(worldList, w.getId(), w.getAddress(), w.getActivity(), w.getFlag(), w.getPlayers());
                }
            }
            session.write(worldList.toPacket());
        }
    }

    protected void applyWorldToList(PacketBuilder pb, int worldId, String address, String activity, int flag, int playerCount) {
        pb.putShort(worldId | 0x8000)
                .putString(address)
                .putString(activity)
                .putByte(flag)
                .putShort(playerCount);
    }

    /**
     * @param baseRevision most important revision
     * @param f            file containing extra revisions
     * @return map containing all revisions in their designated classes
     * WARNING LOADING MULTIPLE REVISIONS AT ONCE IS POINTLESS
     * TOO MUCH OVERHEAD IN CACHE HANDLING SO IT IS DISABLED THROUGH @param loadingMulti
     * LOADING MAPS ITEMS/MAPS/DEFS/ANIMATIONS(OSRS ONLY) PER REVISION IS HEADACHE U DONT NEED
     * @throws java.io.IOException
     */
    @Deprecated
    public static Map<Integer, Protocol> handleProtocolLoad(int baseRevision, boolean loadingMulti, File f) throws Exception {
        Map<Integer, Protocol> revisionMap = new HashMap<Integer, Protocol>();
        int[] revs = new int[0];
        if (loadingMulti && f != null && f.exists() && !f.isDirectory()) {
            Configuration c = new Configuration(f);
            revs = c.getIntArray("revisions");
            for (int i : revs) {
                if (revisionMap.get(i) == null) {
                    revisionMap.put(i, Protocol.applyPatch(i));
                }
            }
        }
        //if we dont include our base revision
        if (!revisionMap.containsKey(baseRevision)) {
            revisionMap.put(baseRevision, Protocol.applyPatch(baseRevision));
            int[] realrevs = new int[revs.length + 1];
            for (int i = 0; i < revs.length; i++) {
                realrevs[i] = revs[i];
            }
            realrevs[realrevs.length - 1] = baseRevision;
            revs = realrevs;
        }
        //if file isnt there
        if (revs == null) {
            revs = new int[]{baseRevision};
            revisionMap.put(baseRevision, Protocol.applyPatch(baseRevision));
        }
        revisionMap.put(baseRevision, Protocol.applyPatch(baseRevision));

        OutputDisplay.printMultiple(revs, "Loaded revision");
        return revisionMap;
    }

    public Packet doMaskBlock(Mob mob) {
        return null;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
    //</editor-fold>


}