package org.osrse.game.content.combat.magic;

import org.osrse.game.content.combat.Magic;
import org.osrse.game.logic.Entity;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/21/16.
 */
public class Spell {
    private Magic.Teleports city = Magic.Teleports.NULL;
    private Magic.Runes[] runes;
    private Magic.Staff staff;
    private int[] amount;
    private int base = 1;
    private int levelReq;


    public Spell(Magic.Runes[] runes, Magic.Staff staff,  int[] amounts, int level) {
        this.runes = runes;
        this.staff = staff;
        this.amount = amounts;
        this.levelReq = level;
    }

    public Spell(Magic.Runes[] runes, int[] amounts, int level) {
        this.runes = runes;
        this.amount = amounts;
        this.levelReq = level;
    }

    public Spell(Magic.Runes[] runes, int[] amounts, int level, Magic.Teleports city) {
        this.city = city;
        this.runes = runes;
        this.amount = amounts;
        this.levelReq = level;
    }

    public Spell(Magic.Runes[] runes, int base, int level) {
        this.runes = runes;
        this.base = base;
        this.levelReq = level;
    }

    public Spell(Magic.Runes[] runes, int level) {
        this.runes = runes;
        this.levelReq = level;
    }

    public Spell(Magic.Teleports teleport) {
        base = 0;
        this.city = teleport;
    }

    public boolean isTeleport() {
        return city != null || base == 0;
    }

    public boolean hasRunes(Player player) {
        if(base > 0) {
            for(int i = 0; i < runes.length; i++) {
                if(!player.getInventory().contains(runes[i].getId(), amount  == null ? base : amount[i])) {
                    //return false;
                }
            }
        }
        return true;
    }

    public boolean hasRequiredItems(Player player) {
        if(base > 0) {
            if(staff != null) {
                return player.getEquipment().contains(staff.getId(), 1);
            }
        }
        //add orbs and such
        return true;
    }

    public void cast(Entity player) {
        if(base > 0) {
            for(int i = 0; i < runes.length; i++) {
               //player.getInventory().remove(runes[i].getId(), amount  == null ? base : amount[i]);
            }
            if(staff != null && staff == Magic.Staff.IBAN) {
                //remove charge
            }
        }
        if(base == 0 || city != Magic.Teleports.NULL) {
            if(base > 0) {
                player.getMagic().teleportCity(city, false, false);
            } else {
                player.getMagic().homeTele();
            }
        }
    }

}
