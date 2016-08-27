package org.osrse.game.content.combat;

import org.osrse.game.GameBase;
import org.osrse.game.content.combat.activity.CombatWorld;
import org.osrse.game.content.combat.activity.Deadman;
import org.osrse.game.content.combat.activity.PVP;
import org.osrse.game.content.combat.activity.Regular;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/5/14.
 */
public class Combat {
    public enum ActionType {
        MELEE, RANGED, MAGIC, SUMMONING, OTHER;
    }

    private final CombatWorld world;

    public Combat(GameBase.CombatActivity combatActivity) {
        this.world = combatActivity == GameBase.CombatActivity.Deadman ? new Deadman() : combatActivity == GameBase.CombatActivity.Economy ? new Regular() : new PVP();

    }

    String notInWilderness = "You can't attack players when you're not in the Wilderness.";
    String moveDeeper = "You need to move deeper into the wilderness to attack this player.";

    public boolean canAttack(Player owner, Player foe) {
        if(world.isGuaranteedSafe()) {
            int wildy = Math.min(getWildernessLevel(owner.getLocation()), getWildernessLevel(foe.getLocation()));
            if(wildy < 1) {
                owner.sendMessage(notInWilderness);
                return false;
            }
            int levelDiff = Math.abs(owner.getCombat().level() - foe.getCombat().level());
            if (wildy > 0 && wildy < levelDiff) {
                owner.sendMessage(moveDeeper);
                return false;
            }
        }
        return true;
    }

    public static void handleSpell(Player owner, Entity foe, int spell) {

           //boolean can = owner.getMagic().buttonCast(spell, foe);
            owner.sendMessage("Spell  mob="+foe.getIndex()+", spell="+spell);
           // if(!can) {

           // }
    }

    public int getWildernessLevel(Tile tile) {
        final int y = tile.getY();
        final int x = tile.getX();
        if (y > 3524 && y < 4000 && x > 2943 && x <= 3394)
            return (((y - 3520) / 8) + 1);
        return 0;
    }

    public final boolean isMulti(Player owner) {
        return false;
    }

    public final void attackMob(Player player, Mob mob) {
        player.getCombat().setAttacker(mob);
    }
}
