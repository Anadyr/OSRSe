package org.osrse.game.content.combat.magic;

import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.Magic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 1/7/16.
 */
public class Ancient extends MagicBook {

    public static final Map<Integer, Spell> spells = new HashMap<Integer, Spell>();

    public Ancient() {
        super(Magic.Type.Ancient);
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
        spells.put(91, new Spell(Magic.Teleports.Edgeville));
        spells.put(82, new Spell(new Magic.Runes[] {Magic.Runes.Fire, Magic.Runes.Air, Magic.Runes.Law},  new int[] {1, 1, 2}, 54, Magic.Teleports.Paddewwa));
        spells.put(83, new Spell(new Magic.Runes[] {Magic.Runes.Soul, Magic.Runes.Law},  new int[] {1, 2}, 60, Magic.Teleports.Senntisten));
        spells.put(84, new Spell(new Magic.Runes[] {Magic.Runes.Blood, Magic.Runes.Law},  new int[] {1, 2}, 66, Magic.Teleports.Kharyrll));
        spells.put(85, new Spell(new Magic.Runes[] {Magic.Runes.Water, Magic.Runes.Law},  new int[] {4, 2}, 72, Magic.Teleports.Lassar));
        spells.put(86, new Spell(new Magic.Runes[] {Magic.Runes.Fire, Magic.Runes.Air, Magic.Runes.Law},  new int[] {3, 2, 2}, 78, Magic.Teleports.Dareeyak));
        spells.put(87, new Spell(new Magic.Runes[] {Magic.Runes.Soul, Magic.Runes.Law},  new int[] {2, 2}, 84, Magic.Teleports.Carrallanger));
        spells.put(88, new Spell(new Magic.Runes[] {Magic.Runes.Blood, Magic.Runes.Law},  new int[] {2, 2}, 90, Magic.Teleports.Annakarl));
        spells.put(89, new Spell(new Magic.Runes[] {Magic.Runes.Water, Magic.Runes.Law},  new int[] {8, 2}, 96, Magic.Teleports.Ghorrock));
        //90 = bounty 1 death 1 chaos 1 law
    }
}
