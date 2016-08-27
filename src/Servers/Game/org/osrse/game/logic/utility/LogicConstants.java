/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.utility;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class LogicConstants {
    public static class Equipment {
        public static final int HELM_SLOT = 0;
        public static final int CAPE_SLOT = 1;
        public static final int AMULET_SLOT = 2;
        public static final int WEAPON_SLOT = 3;
        public static final int CHEST_SLOT = 4;
        public static final int SHIELD_SLOT = 5;
        public static final int BOTTOMS_SLOT = 7;
        public static final int GLOVES_SLOT = 9;
        public static final int BOOTS_SLOT = 10;
        public static final int RING_SLOT = 12;
        public static final int ARROWS_SLOT = 13;
    }
    /**
     * Bonuses as displayed on the equipment screen.
     */
    public static final String[] BONUSES = {
        "Stab", "Slash", "Crush", "Magic", "Range", 
        "Stab", "Slash", "Crush", "Magic", "Range", 
        "Strength", "Prayer"
    };	
    public static final String LOGIC_MESSAGE_DIR = "org.osrse.update.r";
    public static final String LOGIC_MESSAGE_HANDLER_DIR = ".handler."; 


    /**
     * The sting to send on the equipment interface run script.
     */
    public final static String EQUIPMENT_TYPE_STRING = "IviiiIsssssssss";
    /**
     * The parameters for the equipment screen.
     */
    public static final Object[] EQUIPMENT_PARAMETERS = new Object[] { "", "", "", "", "", "", "", "", "Wear", -1, 0, 7, 4, 98, 22020096 };

    public static final int BANK_SIZE = 424;
    public static final int MAX_GROUND_ITEMS = 8192;
    public static final int NPC_CAP = 1024;
    public static final int EQUIPMENT_SIZE = 14;
    public static final int INVENTORY_SIZE = 28;
    public static final int WORLD_PORT_START = 40000;

    public static final int[] DEFAULT_BANK = new int[BANK_SIZE];

    static {
        for(int i = 0; i < BANK_SIZE; i++) {
            DEFAULT_BANK[i] = -1;
        }
    }
}
