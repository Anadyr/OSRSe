package org.osrse.game.logic.masks;

import org.osrse.game.logic.player.Player;
import org.osrse.task.tick.Tick;

/**
 * Created by Jonathan on 1/6/16.
 */
public class ForcedMovement {

    public final int x1, y1, x2, y2, delay1, delay2, faceDir;

    public ForcedMovement(int x1, int y1, int x2, int y2, int delay1, int delay2, int faceDir) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.delay1 = delay1;
        this.delay2 = delay2;
        this.faceDir = faceDir;
    }

    public ForcedMovement(int[] fromscript) {
        this.x1 = fromscript[0];
        this.x2 = fromscript[1];
        this.y1 = fromscript[2];
        this.y2 = fromscript[3];
        this.delay1 = fromscript[4];
        this.delay2 = fromscript[5];
        this.faceDir = fromscript[6];
    }

    public static void force(final Player player, final Animation a, final ForcedMovement movement, String ident, final boolean removeAtt) {
        player.registerTick(new Tick(ident) {
            @Override
            public boolean execute() {
                player.getMasks().setAnimation(a);
                player.getMasks().setForceMovement(movement);
                player.getPathProcessor().reset(true);
                player.basicSettings().setForcedTeleporting(true);
                player.basicSettings().setTeleportDestination(player.getLocation().translate(movement.x2, movement.y2, 0));
                if (removeAtt) {
                    player.removeAttribute("busy");
                }
                return false;
            }
        });
    }

    public static void force(final Player player, final Animation animation, final int[] f, String identifier, final boolean removeAttribute) {
        player.registerTick(new Tick(identifier) {
            @Override
            public boolean execute() {
                ForcedMovement forcedMovement = new ForcedMovement(f);
                player.getMasks().setAnimation(animation);
                player.getMasks().setForceMovement(forcedMovement);
                player.getPathProcessor().reset(true);
                player.basicSettings().setForcedTeleporting(true);
                player.basicSettings().setTeleportDestination(player.getLocation().translate(forcedMovement.x2, forcedMovement.y2, 0));
                if (removeAttribute) {
                    player.removeAttribute("busy");
                }
                return false;
            }
        });

    }
}
