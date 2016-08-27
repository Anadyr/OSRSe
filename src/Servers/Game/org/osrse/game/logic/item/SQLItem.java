/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.item;

import org.osrse.game.logic.utility.LogicConstants;

/**
 *
 * @author Jonathan
 */
public class SQLItem {

    public SQLItem(int id, String name) {
        this.id = id;
        this.name = name;
        this.full_body = isFullBody();
        this.full_helm = isFullHat();
        this.full_mask = isFullMask();
        this.legs = isLegs();
        this.gloves = isGloves();
    }

    public final String name;
    public final int id;

    public int  highAlch = 0, lowAlch = 0;
    public double weight = 0.0;
    public String examine;
    public int equipType = -1, superId = 0;

    public boolean destroy = false, twoHanded = false, stackable = false, tradeable = true, noted = false;

    public int AtkstabBonus, AtkslashBonus,
            AtkcrushBonus, 
            atkMagicBonus, atkRangedBonus,

    defstabBonus, defslashBonus,
            defcrushBonus,
            defMagicBonus, defRangedBonus,
    strBonus, prayerBonus;

    public final boolean full_mask, full_body, full_helm, legs, gloves;

    public static SQLItem fromString(String string) {
                String[] stuff = string.split("', '");
                     int id = Integer.parseInt(stuff[0].split("'")[1]);
                SQLItem def = new SQLItem(id, stuff[1]);
                if(def.equipType == -1)
                def.equipType = Integer.parseInt(stuff[2]);
                def.twoHanded = Boolean.parseBoolean(stuff[3]);
                def.tradeable = Boolean.parseBoolean(stuff[4]);
                def.stackable = Boolean.parseBoolean(stuff[5]);
                def.noted = Boolean.parseBoolean(stuff[6]);
                def.highAlch = Integer.parseInt(stuff[7]);
                def.lowAlch = Integer.parseInt(stuff[8]);
                def.examine = stuff[9];
                if(def.examine.equalsIgnoreCase("n")) {
                    def.examine = "Swap this note at any bank for the equivalent item.";
                } else if(def.examine.equalsIgnoreCase("null")) {
                    def.examine = "It's a(n) "+def.name;
                }
                def.destroy = Boolean.parseBoolean(stuff[10]);
                def.weight = Double.parseDouble(stuff[11]);
                def.AtkstabBonus = Integer.parseInt(stuff[12]);
                def.AtkslashBonus = Integer.parseInt(stuff[13]);
                def.AtkcrushBonus = Integer.parseInt(stuff[14]);
                def.atkMagicBonus = Integer.parseInt(stuff[15]);
                def.atkRangedBonus = Integer.parseInt(stuff[16]);
                def.defstabBonus = Integer.parseInt(stuff[17]);
                def.defslashBonus = Integer.parseInt(stuff[18]); 
                def.defcrushBonus = Integer.parseInt(stuff[19]);
                def.defMagicBonus = Integer.parseInt(stuff[20]);
                def.defRangedBonus = Integer.parseInt(stuff[21]);
                def.strBonus = Integer.parseInt(stuff[22]);
                def.prayerBonus = Integer.parseInt(stuff[23]);
                def.superId = Integer.parseInt(stuff[24].split("'")[0]);
                return def;
    }


    private static String[] FULL_BODY = {"Investigator's coat", "armour",
            "hauberk", "top", "shirt", "platebody", "Ahrims robetop",
            "Karils leathertop", "brassard", "Robe top", "robetop",
            "platebody (t)", "platebody (g)", "chestplate", "torso",
            "Morrigan's", "leather body", "robe top", "Pernix body", "Torva platebody", "Corrupt statius's platebody", "Corrupt vesta's chainbody"};
    private static String[] FULL_HAT = {"sallet", "med helm", "Green partyhat", "coif",
            "Dharok's helm", "hood", "Initiate helm", "Coif",
            "Helm of neitiznot (charged)", "Helm of neitiznot", "Armadyl helmet"};
    private static String[] FULL_MASK = {"Christmas ghost hood",
            "Dragon full helm (or)", "sallet", "full helm", "mask", "h'ween mask",
            "Veracs helm", "Guthans helm", "Torags helm", "Karils coif",
            "full helm (t)", "full helm (g)", "Pernix cowl", "Slayer helmet"};

        private static String[] LEGS = {"legs", "platelegs", "skirt", "leggings" };
        
   public final boolean isGloves() { 
        String weapon = name;
            if (weapon.endsWith("Gloves")) {
                this.equipType = LogicConstants.Equipment.GLOVES_SLOT;
                return true;
                }
        return false;
    }

    public final boolean isLegs() {
        String weapon = name;
        for (int i = 0; i < LEGS.length; i++) {
            if (weapon.endsWith(LEGS[i])) {
                this.equipType = LogicConstants.Equipment.BOTTOMS_SLOT;
                return true;
            }
        }
        return false;
    }
    public final boolean isFullBody() {
        String weapon = name;
        for (String string : FULL_BODY) {
            if (weapon.contains(string)) {
                this.equipType = LogicConstants.Equipment.CHEST_SLOT;
                return true;
            }
        }
        return id == 6107 || id == 13624 || id == 13887;
    }

    public final boolean isFullHat() {
        String weapon = name;
        for (int i = 0; i < FULL_HAT.length; i++) {
            if (weapon.endsWith(FULL_HAT[i])) {
                this.equipType = LogicConstants.Equipment.HELM_SLOT;
                return true;
            }
        }
        return id == 14824;
    }


    public final boolean isFullMask() {
        String weapon = name;
        for (int i = 0; i < FULL_MASK.length; i++) {
            if (weapon.endsWith(FULL_MASK[i])) {
                this.equipType = LogicConstants.Equipment.HELM_SLOT;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return !examine.equalsIgnoreCase("n") ? examine : "Swap this note at any bank for the equivalent item.";
    }
}
