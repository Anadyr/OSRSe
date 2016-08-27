package org.osrse.game.content.combat.magic;

import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.Magic;
import org.osrse.game.content.combat.Magic.Runes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 1/7/16.
 */
public class Standard extends MagicBook {
    /**
     * Spell ID, Spell
     */
    public static final Map<Integer, Spell> spells = new HashMap<Integer, Spell>();

    public Standard() {
        super(Magic.Type.Standard);
    }

    @Override
    public boolean cast(int type, Entity who) {
        System.out.println(type+", "+spells.containsKey(type));
        if(spells.containsKey(type)) {
            spells.get(type).cast(who);
            return true;
        }
        return false;
    }



    static {
        //1 home tele
        spells.put(1, new Spell());
        spells.put(2, new Spell(new Runes[] {Runes.Air, Runes.Mind}, 1));
        spells.put(3, new Spell(new Runes[] {Runes.Water, Runes.Earth, Runes.Body}, new int[] {3, 2, 1}, 3));
        //4 cbow bolt ench
        spells.put(5, new Spell(new Runes[] {Runes.Water, Runes.Air, Runes.Mind}, 5));
        //6 sapph enchant
        spells.put(7, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Mind},  new int[] {2, 1, 1}, 9));
        spells.put(8, new Spell(new Runes[] {Runes.Water, Runes.Earth, Runes.Body},  new int[] {3, 2, 1}, 11));
        spells.put(9, new Spell(new Runes[] {Runes.Fire, Runes.Air, Runes.Mind},  new int[] {3, 2, 1}, 13));
        //10 bones to bananas
        spells.put(11, new Spell(new Runes[] {Runes.Air, Runes.Chaos}, new int[] {2, 1}, 17));
        spells.put(12, new Spell(new Runes[] {Runes.Water, Runes.Earth, Runes.Body},  new int[] {2, 3, 1}, 19));
        spells.put(13, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Nature},  new int[] {3, 3, 2}, 20));
        // 14 low alch
        spells.put(15, new Spell(new Runes[] {Runes.Water, Runes.Air, Runes.Chaos},  new int[] {2, 2, 1}, 23));
        spells.put(16, new Spell(new Runes[] {Runes.Fire, Runes.Air, Runes.Law},  new int[] {1, 3, 1}, 25, Magic.Teleports.Varrock));
        //17 em enchant
        spells.put(18, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Chaos},  new int[] {3, 2, 1}, 29));
        spells.put(19, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Law},  new int[] {1,3, 1}, 40, Magic.Teleports.Lumbridge));
        //20 telegrab
        spells.put(21, new Spell(new Runes[] {Runes.Fire, Runes.Air, Runes.Chaos},  new int[] {4, 3, 1}, 35));
        spells.put(22, new Spell(new Runes[] {Runes.Water, Runes.Air, Runes.Law},  new int[] {1,3, 1}, 40, Magic.Teleports.Falador));
        spells.put(23, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Chaos},  new int[] {2, 2, 1}, 39));
        spells.put(24, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Law},  new int[] {1,1, 1}, 40, Magic.Teleports.House));
        spells.put(25, new Spell(new Runes[] {Runes.Air, Runes.Death},  new int[] {3, 1}, 41));
        //26 superheat
        spells.put(27, new Spell(new Runes[] {Runes.Air, Runes.Law},  new int[] {5, 1}, 45, Magic.Teleports.Camelot));
        spells.put(28, new Spell(new Runes[] {Runes.Water, Runes.Air, Runes.Death},  new int[] {3, 3, 1}, 47));
        //29 ruby ench
        spells.put(30, new Spell(new Runes[] {Runes.Fire, Runes.Death}, Magic.Staff.IBAN,  new int[] {5, 1}, 50));
        spells.put(31, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Nature},  new int[] {4, 4, 3}, 50));
        spells.put(32, new Spell(new Runes[] {Runes.Death, Runes.Mind}, Magic.Staff.SLAYER, new int[] {1, 4}, 50));
        spells.put(33, new Spell(new Runes[] {Runes.Water, Runes.Law},  new int[] {2, 2}, 51, Magic.Teleports.Ardougne));
        spells.put(34, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Death}, new int[] {3, 3, 1}, 53));
        spells.put(35, new Spell(new Runes[] {Runes.Fire, Runes.Nature},  new int[] {5, 1}, 55));
        ////
        spells.put(38, new Spell(new Runes[] {Runes.Earth, Runes.Law},  new int[] {2, 2}, 58, Magic.Teleports.Watchtower));
        spells.put(39, new Spell(new Runes[] {Runes.Fire, Runes.Air, Runes.Death},  new int[] {5, 4, 1}, 59));
        ///
        spells.put(42, new Spell(new Runes[] {Runes.Fire, Runes.Blood, Runes.Air}, Magic.Staff.SARADOMIN, new int[] {2, 2, 4}, 60));
        spells.put(43, new Spell(new Runes[] {Runes.Fire, Runes.Blood, Runes.Air}, Magic.Staff.GUTHIX, new int[] {1, 2, 4}, 60));
        spells.put(44, new Spell(new Runes[] {Runes.Fire, Runes.Blood, Runes.Air}, Magic.Staff.ZAMORAK, new int[] {4, 2, 1}, 60));
        spells.put(45, new Spell(new Runes[] {Runes.Fire, Runes.Law},  new int[] {2, 2}, 61, Magic.Teleports.Trollheim));
        spells.put(46, new Spell(new Runes[] {Runes.Air, Runes.Blood}, new int[] {5, 1}, 62));

        spells.put(48, new Spell(new Runes[] {Runes.Fire, Runes.Water, Runes.Law, Runes.Banana},  new int[] {2, 2, 2, 1}, 64, Magic.Teleports.ApeAtol));
        spells.put(49, new Spell(new Runes[] {Runes.Water, Runes.Air, Runes.Blood}, new int[] {7, 5, 1}, 65));
        spells.put(51, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Soul}, new int[] {5, 5, 1}, 66));
        spells.put(53, new Spell(new Runes[] {Runes.Earth, Runes.Air, Runes.Blood}, new int[] {7, 5, 1}, 70));
        spells.put(54, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Soul}, new int[] {8, 8, 1}, 73));
        spells.put(55, new Spell(new Runes[] {Runes.Soul, Runes.Law, Runes.Earth}, 74));
        spells.put(56, new Spell(new Runes[] {Runes.Fire, Runes.Air, Runes.Blood}, new int[] {7, 5, 1}, 75));
        spells.put(57, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Nature}, new int[] {5, 5, 4}, 79));
        spells.put(58, new Spell(new Runes[] {Runes.Earth, Runes.Water, Runes.Soul}, new int[] {12, 12, 1}, 80));
        spells.put(59, new Spell(new Runes[] {Runes.Fire, Runes.Blood, Runes.Air}, new int[] {3, 3, 3}, 80));
        spells.put(60, new Spell(new Runes[] {Runes.Soul, Runes.Water, Runes.Law}, 82));
        spells.put(61, new Spell(new Runes[] {Runes.Law, Runes.Chaos, Runes.Death}, 85));
        spells.put(63, new Spell(new Runes[] {Runes.Law, Runes.Death, Runes.Chaos}, 85));
        spells.put(64, new Spell(new Runes[] {Runes.Soul, Runes.Law}, new int[] {2, 1}, 90));


    }
}
