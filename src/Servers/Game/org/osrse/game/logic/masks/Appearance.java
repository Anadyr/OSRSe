package org.osrse.game.logic.masks;


import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;

public class Appearance {

    private int mobId = -1;
    private int gender;
    private int[] look = new int[7];
    private int[] colour = new int[10];

    private Player player;

    public Appearance(Player player) {
        this.player = player;
        this.setMobLook(-1);
        this.resetAppearence();
    }

    public void resetAppearence() {
        look[0] = 18; // Torso
        look[1] = 26; // Arms
        look[2] = 36; // Legs
        look[3] = 1; // Hair
        look[4] = 33; // Hands
        look[5] = 42; // Shoes
        look[6] = 14; // Facial hair
        for (int i = 0; i < 5; i++) {
            colour[i] = 0;
        } 
        gender = 0;
    }

    public void female() {
        look[0] = 57; // Torso
        look[1] = 64; // Arms
        look[2] = 77; // Legs
        look[3] = 48; // Hair
        look[4] = 68; // Hands
        look[5] = 80; // Shoes
        look[6] = 1000; // Beard
        for (int i = 0; i < 5; i++) {
            colour[i] = i * 5 + 3;
        }
        colour[2] = 16;
        colour[1] = 16;
        colour[0] = 3;
        gender = 1;

    }

    public void setMobLook(int npcType) {
        this.mobId = npcType;
    }

    public int getMobId() {
        return mobId;
    }

    public boolean isMob() {
        return mobId != -1;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public boolean isMale() {
    	return gender == 0;
    }

    public int[] getLook() {
        return look;
    }
    
    public int getLook(int id) {
        return look[id];
    }

    public int[] getColour() {
        return colour;
    }

    public void setLook(int i, int j) {
            look[i] = j;
    }

    public void setColor(int i, int j) {
            colour[i] = j;
    }

    public int getColor(int i) {
            return colour[i];
    }

    private int standAnim, runAnim, walkAnim;

    public int getStandAnim() {
        return standAnim;
    }

    public void setStandAnim(int id) {
        this.standAnim = id;
    }

    public int getRunAnim() {
        return runAnim;
    }

    public void setRunAnim(int id) {
        this.runAnim = id;
    }
    
    public int getWalkAnim() {
        return walkAnim;
    }

    public void setWalkAnim(int id) {
        this.walkAnim = id;
    }

    public void refresh() {
        player.getMasks().setAppearanceUpdate(true);
        player.basicSettings().
                setCachedAppearanceBlock(WorldModule.getLogic().getProtocol().doAppearanceBlock(player));
    }
}
