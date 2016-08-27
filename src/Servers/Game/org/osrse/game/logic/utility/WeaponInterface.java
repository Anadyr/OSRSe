package org.osrse.game.logic.utility;

import org.osrse.game.logic.player.Player;
import java.util.HashMap;
import java.util.Map;

 

/**
 * @author Maxime Meire
 */
public class WeaponInterface {

    public static final Map<Integer, Style> styles = new HashMap<Integer, Style>();


    public static final int TYPE_STAB = 0;
    public static final int TYPE_SLASH = 1;
    public static final int TYPE_CRUSH = 2;
    public static final int TYPE_RANGED = 3;
    public static final int TYPE_MAGIC = 4;

    public static final int STYLE_ACCURATE = 0;
    public static final int STYLE_AGGRESSIVE = 1;
    public static final int STYLE_CONTROLLED = 2;
    public static final int STYLE_DEFENSIVE = 3;
    public static final int STYLE_RAPID = 4;
    public static final int STYLE_LONG_RANGE = 5;

    private WeaponInterface() {
    }

    public static int getStyle(int groupId, int button) {
        Style style = styles.get(groupId);
        if (button >= style.config.length) {
            button = 0;
        }
        return style.config[button][0];
    }

    public static int getType(int groupId, int button) {
        Style style = styles.get(groupId);
        if (button >= style.config.length) {
            button = 0;
        }
        return style.config[button][1];
    }

    public static int getBonusForType(Player player, int type, boolean defence) {
        switch (type) {
            /*
            case TYPE_STAB:
                return player.getBonuses().getBonus(Bonuses.STAB_ATTACK + (defence ? 5 : 0));
            case TYPE_SLASH:
                return player.getBonuses().getBonus(Bonuses.SLASH_ATTACK + (defence ? 5 : 0));
            case TYPE_CRUSH:
                return player.getBonuses().getBonus(Bonuses.CRUSH_ATTACK + (defence ? 5 : 0));
            case TYPE_RANGED:
                return player.getBonuses().getBonus(Bonuses.RANGED_ATTACK + (defence ? 5 : 0));
            case TYPE_MAGIC:
                return player.getBonuses().getBonus(Bonuses.MAGIC_ATTACK + (defence ? 5 : 0));*/
            default:
                return 1;
        }
    }

    public static class Style {

        public int[][] config;

        private Style(int[][] config) {
            this.config = config;
        }
    }

    static {
        styles.put(0, new Style(new int[][]{{STYLE_ACCURATE, TYPE_CRUSH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_CRUSH}}));
        styles.put(1, new Style(new int[][]{{STYLE_ACCURATE, TYPE_CRUSH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_CRUSH}}));
        styles.put(2, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(3, new Style(new int[][]{{STYLE_ACCURATE, TYPE_CRUSH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_CRUSH}}));
        styles.put(4, new Style(new int[][]{{STYLE_ACCURATE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_STAB}}));
        styles.put(5, new Style(new int[][]{{STYLE_ACCURATE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_DEFENSIVE, TYPE_STAB}}));
        styles.put(6, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_CONTROLLED, TYPE_STAB}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(7, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(8, new Style(new int[][]{{STYLE_ACCURATE, TYPE_CRUSH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_CONTROLLED, TYPE_STAB}, {STYLE_DEFENSIVE, TYPE_CRUSH}}));
        styles.put(9, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_CONTROLLED, TYPE_STAB}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(10, new Style(new int[][]{{STYLE_ACCURATE, TYPE_CRUSH}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_CRUSH}}));
        styles.put(11, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_CONTROLLED, TYPE_SLASH}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(12, new Style(new int[][]{{}})); // flowers and rubber chicken etc
        styles.put(13, new Style(new int[][]{{}})); // mud pie
        styles.put(14, new Style(new int[][]{{STYLE_CONTROLLED, TYPE_STAB}, {STYLE_CONTROLLED, TYPE_SLASH}, {STYLE_CONTROLLED, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_STAB}}));
        styles.put(15, new Style(new int[][]{{STYLE_CONTROLLED, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_DEFENSIVE, TYPE_STAB}}));
        styles.put(16, new Style(new int[][]{{STYLE_ACCURATE, TYPE_RANGED}, {STYLE_RAPID, TYPE_RANGED}, {STYLE_LONG_RANGE, TYPE_RANGED}}));
        styles.put(17, new Style(new int[][]{{STYLE_ACCURATE, TYPE_RANGED}, {STYLE_RAPID, TYPE_RANGED}, {STYLE_LONG_RANGE, TYPE_RANGED}}));
        styles.put(18, new Style(new int[][]{{STYLE_ACCURATE, TYPE_RANGED}, {STYLE_RAPID, TYPE_RANGED}, {STYLE_LONG_RANGE, TYPE_RANGED}}));
        styles.put(19, new Style(new int[][]{{}})); // chins
        styles.put(20, new Style(new int[][]{{}})); // fixed device
        styles.put(21, new Style(new int[][]{{STYLE_ACCURATE, TYPE_RANGED}, {STYLE_RAPID, TYPE_RANGED}, {STYLE_LONG_RANGE, TYPE_RANGED}})); // salamanders
        styles.put(22, new Style(new int[][]{{STYLE_ACCURATE, TYPE_SLASH}, {STYLE_AGGRESSIVE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_CRUSH}, {STYLE_DEFENSIVE, TYPE_SLASH}}));
        styles.put(23, new Style(new int[][]{{}})); // invandis flail
        styles.put(24, new Style(new int[][]{{}})); // no existing item found
        styles.put(25, new Style(new int[][]{{}})); // tridents
        styles.put(26, new Style(new int[][]{{STYLE_ACCURATE, TYPE_STAB}, {STYLE_AGGRESSIVE, TYPE_SLASH}, {STYLE_DEFENSIVE, TYPE_CRUSH}})); // STAFF OF LIGHT
    }
}