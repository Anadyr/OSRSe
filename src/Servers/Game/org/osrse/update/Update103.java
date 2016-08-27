package org.osrse.update;

import org.osrse.WorldModule;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.item.SQLItem;
import org.osrse.game.logic.masks.Appearance;
import org.osrse.game.logic.masks.Hit;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.utility.LogicConstants;
import org.osrse.game.logic.protocol.ComplexUpdate;
import org.osrse.update.r103.Proto103;
import org.osrse.update.r103.Login103;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.utility.NameUtilities;

import org.osrse.game.logic.masks.Masks.MaskType;

/**
 * Created by Jonathan on 12/27/15.
 */
public class Update103 extends ComplexUpdate {

    /**
     * Update 103
     * MAP 239
     * GPI 169 {
     *      APP 64,
     *      CHAT 8,
     *      MOVEMENT 4096,
     *
     *      BOVERFLOW 16
     *  }
     * GNI 49 {
     *
     * }
     */
    public Update103() {
        super(new Login103(), Proto103.class, 239, 169, 31);
        playerUpdateMap.put(MaskType.APPEARANCE, 64);
        playerUpdateMap.put(MaskType.ANIMATION, 2);
        playerUpdateMap.put(MaskType.FACE_ENTITY, 128);
        playerUpdateMap.put(MaskType.FORCED_CHAT, 4);
        playerUpdateMap.put(MaskType.HIT, 1);
        playerUpdateMap.put(MaskType.FACE_DIRECTION, 32);
        playerUpdateMap.put(MaskType.CHAT, 8);
        playerUpdateMap.put(MaskType.GRAPHICS, 256);
        playerUpdateMap.put(MaskType.FORCE_MOVEMENT, 2048);
        playerUpdateMap.put(MaskType.SECOND_HIT, 1024);
        playerUpdateMap.put(MaskType.MOVEMENT_MODE, 512);
        playerUpdateMap.put(MaskType.RESET_MOVEMENT_MODE, 4096);
        playerUpdateMap.put(MaskType.NAME_EDIT, 8192);
        playerUpdateMap.put(MaskType.BYTE_OVERFLOW, 16);
    }

    protected final boolean hasUpdateRegionSub() {
        return true;
    }

    @Override
    protected void addPlayer(Player player, PacketBuilder block, int x, int y) {  }

    @Override
    protected void addMob(Mob mob, PacketBuilder pb, int x, int y) {
        pb.putBits(15, mob.getIndex());
        pb.putBits(5, y);
        pb.putBits(5, x);
        pb.putBits(14, mob.getStaticIndex());
        pb.putBits(3, mob.getDirections().getFacedDirection());
        pb.putBits(1, 1);
        pb.putBits(1, mob.getMasks().requiresUpdate() ? 1 : 0);
    }

    @Override
    protected void handleRegionChange(Player player, PacketBuilder pb) {
        int regionX = player.getLocation().getPartX();
        int regionY = player.getLocation().getPartY();
        boolean forceSend = false;
        if ((((regionX / 8) == 48) || ((regionX / 8) == 49)) && ((regionY / 8) == 48)) {
            forceSend = true;
        }
        if (((regionX / 8) == 48) && ((regionY / 8) == 148)) {
            forceSend = true;
        }
        pb.putShortA(regionY);
        pb.putLEShort(regionX);

        int count = 0;
        PacketBuilder pb2 = new PacketBuilder();
        for (int xCalc = (regionX - 6) / 8; xCalc <= (regionX + 6) / 8; xCalc++) {
            for (int yCalc = (regionY - 6) / 8; yCalc <= (regionY + 6) / 8; yCalc++) {
                int region = yCalc + (xCalc << 8);
                int[] xteaData = WorldModule.getLogic().getLibrary().getKey(region);
                if (!forceSend || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147) && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
                    pb2.putInt(xteaData[0]);
                    pb2.putInt(xteaData[1]);
                    pb2.putInt(xteaData[2]);
                    pb2.putInt(xteaData[3]);
                    count++;
                }
            }
        }
        pb.putShort(count);
        pb.put(pb2.toPacket().getBytes());
        player.basicSettings().setMapRegionUpdatePosition(player.getLocation());
        player.basicSettings().setMapRegionUpdate(false);
    }

    //<editor-fold desc="Player Masks">
    @Override
    protected void doGraphics(Player player, PacketBuilder block) {
        block.putShort(player.getMasks().getGraphics().getId())
                .putInt(((player.getMasks().getGraphics().getHeight() << 16) + player.getMasks().getGraphics().getDelay()));
    }

    @Override
    protected void doAnimation(Player player, PacketBuilder block) {
        block.putShort(player.getMasks().getAnimationId())
             .putByte(player.getMasks().getAnimationDelay());
    }

    @Override
    protected void doFaceEntity(Player player, PacketBuilder block) {
        block.putShort(player.getMasks().getFaceEntity());
    }

    @Override
    protected void doFaceDirection(Player player, PacketBuilder block) {
        int dX = player.getLocation().getX() - player.getMasks().getFaceDirection().getX();
        int dY = player.getLocation().getY() - player.getMasks().getFaceDirection().getY();
        block.putShort(((int) (Math.atan2(dX, dY) * 2607.5945876176133)) & 0x3fff);
    }

    @Override
    protected void doForceMovement(Player player, PacketBuilder block) {
        block.putByte(player.getMasks().getFixedMovementMode());
    }

    @Override
    protected void doFirstHit(Player player, PacketBuilder block, Hit primary) {

    }

    @Override
    protected void doSecondHit(Player player, PacketBuilder block, Hit secondary) {

    }

    @Override
    protected void doSecondaryGraphics(Player player, PacketBuilder block) {

    }

    @Override
    protected void doChat(Player player, PacketBuilder block, int offset, byte[] chatBuffer) {
        block.putShort(((player.getMasks().getChat().getEffect() & 0xFF) << 8 | player.getMasks().getChat().getColor() & 0xFF)); // shke effect
        block.putByte(player.getPrivilege().getClientReference());
        block.putByte(0);
        block.putByte(offset);
        block.put(chatBuffer, 0, offset);
    }

    @Override
    protected void doAppearance(Packet appearanceBlock, PacketBuilder blockTo) {
        blockTo.putByte(appearanceBlock.getLength());
        blockTo.put(appearanceBlock.getBytes(), 0, appearanceBlock.getLength());
    }

    @Override
    protected void doMovementMode(Player player, PacketBuilder blockTo) {
        blockTo.putByte(player.getMovementMode());
    }


    @Override
    public Packet doAppearanceBlock(Player player) {
        Appearance app = player.getAppearance();
        PacketBuilder playerProps = new PacketBuilder();
        playerProps.put((byte) app.getGender()); // gender

        playerProps.put((byte) player.getSetting().getSkull()); // skull icon
        playerProps.put((byte) -1);// otherPlayer.getCombatState().getPrayerHeadIcon());

        if (player.getAppearance().isMob()) {
            playerProps.putShort(-1);
            playerProps.putShort(player.getAppearance().getMobId());
        } else {
            for (int currSlot = 0; currSlot < 12; currSlot++) {
                Item item = player.getEquipment().get(currSlot == 8 || currSlot == 11 ? 0 : (currSlot == 6 ? currSlot - 2 : currSlot));

                SQLItem def = item == null ? null : item.getDefinition();

                if (item != null && (currSlot != 8 || currSlot != 6 || currSlot != 11)) {
                    playerProps.putShort(512 + def.id);
                } else {
                    if (currSlot < 4 || currSlot == LogicConstants.Equipment.SHIELD_SLOT) {
                        playerProps.putByte(0);
                    } else {
                        int modifier = currSlot == 4 ? 4 : 5;
                        if (def != null) {
                            if ((def.full_body || def.full_helm || def.full_mask) &&
                                    (currSlot == 11 && def.full_mask || currSlot == 8 || currSlot == 6)) {
                                playerProps.putByte(0);
                                continue;
                            }
                        }
                        playerProps.putShort(0x100 + app.getLook(currSlot - modifier));
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            playerProps.put((byte) player.getAppearance().getColor(i));
        }

        playerProps.putShort((short) player.getAppearance().getStandAnim());//808); // stand
        playerProps.putShort((short) 823); // stand turn
        playerProps.putShort((short) player.getAppearance().getWalkAnim());//819); // walk
        playerProps.putShort((short) 820); // turn 180 7049
        playerProps.putShort((short) 821); // turn 90 cw
        playerProps.putShort((short) 822); // turn 90 ccw
        playerProps.putShort((short) player.getAppearance().getRunAnim());//824); // run

        playerProps.putString(NameUtilities.displayFormat(player.getUsername()));
        playerProps.putByte((byte) player.getCombat().level());
        playerProps.putShort(0);
        playerProps.putByte(player.getPrivilege() == Player.Privilege.ADMINISTRATOR && player.getSetting().isInvisible() ? 1 : 0);
        return playerProps.toPacket();
    }

    //</editor-fold>

    //<editor-fold desc="Mob Masks">

    @Override
    protected void handleMovement(Mob mob, PacketBuilder block) {

    }

    @Override
    protected void doGraphics(Mob mob, PacketBuilder block) {

    }

    @Override
    protected void doAnimation(Mob mob, PacketBuilder block) {

    }

    @Override
    protected void doFaceEntity(Mob mob, PacketBuilder block) {

    }

    @Override
    protected void doFaceDirection(Mob mob, PacketBuilder block) {

    }

    @Override
    protected void doFirstHit(Mob mob, PacketBuilder block, Hit primary) {

    }

    @Override
    protected void doSecondHit(Mob mob, PacketBuilder block, Hit secondary) {

    }

    @Override
    protected void doSecondaryGraphics(Mob mob, PacketBuilder block) {

    }
    //</editor-fold>
}
