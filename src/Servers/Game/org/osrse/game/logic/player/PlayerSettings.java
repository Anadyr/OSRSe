package org.osrse.game.logic.player;
 
import org.osrse.game.logic.Entity;

 

/**
 * @author 'Mystic Flow <Steven@rune-server.org>
 */
public class PlayerSettings {

    /**
     * REGULAR: 0
     * FIGHTCAVE: 1
     */
    public enum SkullIcon { REGULAR, FIGHT_CAVE,
        BH_RED, BH_BlUE,  BH_GREEN, BH_SILVER, BH_NO_TARGET, BH_BROWN,
        DM_RED, DM_BLUE, DM_GREEN, DM_SILVER, DM_BROWN;

        public static SkullIcon forValue(int id) {
            for(SkullIcon s : SkullIcon.values()) {
                if(s.ordinal() == id)
                    return s;
            }
            return null;
        }
    }


    private SkullIcon playerSkull;
    private int chances;
    protected boolean loggedOut = false;

    private int privateTextColor;

    private boolean autoRetaliate = true;
    private int specialAmount = 1000;
    private boolean usingSpecial = false;

    private int combatType;
    private int combatStyle;
    public int killStreak;

    public int titleId = 0;
    private int[] barrowsKillCount = new int[10];
    private boolean[] killedBrothers = new boolean[6];
    private boolean[] leveledUp = new boolean[Skills.SKILL_COUNT];
    private int[] fairyRingCombination = new int[3];

    /**
     * The stronghold chests that have been looted.
     */
    private boolean[] strongholdChestLooted = new boolean[4];

    private int amountToProduce;

    private int maxToProduce;

    private int itemToProduce;

    private int dialoguesSkill;

    private int itemUsed;

    private boolean godEntranceRope = false;

    private int[] possibleProductions;
    private int lastXAmount;
    private int lastSelection;

    private int hitCounter;

    private Entity speakingTo;

	public int kills;
	public int deaths;
	public int pkPoints;
	public int pestPoints;
	public int[] tokens = new int[5];
    private boolean skulled;
    private boolean invisible;

    public void setUsingSpecial(boolean usingSpecial) {
        this.usingSpecial = usingSpecial;
    }

    public boolean isUsingSpecial() {
        return usingSpecial;
    }

    public boolean isAutoRetaliate() {
        return autoRetaliate;
    }

    public void setAutoRetaliate(boolean autoRetaliate) {
        this.autoRetaliate = autoRetaliate;
    }

    public int getSpecialAmount() {
        return specialAmount;
    }

    public void setSpecialAmount(int specialAmount) {
        this.specialAmount = specialAmount;
    }


	/**
	 * @param specialEnergy the specialEnergy to set
	 */
	public void updateSpecialEnergy(Player m, int specialEnergy) {
		this.specialAmount -= specialEnergy;
		if (this.specialAmount < 0) {
			this.specialAmount = 0;
		} else if (this.specialAmount > 1000) {
			this.specialAmount = 1000;
		}
		m.getProtocol().sendConfig(300, specialAmount);
	}

    public void setPrivateTextColor(int privateTextColor) {
        this.privateTextColor = privateTextColor;
    }

    public int getPrivateTextColor() {
        return privateTextColor;
    }

    public int[] getBarrowsKillCount() {
        return barrowsKillCount;
    }

    public boolean[] getKilledBrothers() {
        return killedBrothers;
    }

    public void setAmountToProduce(int i) {
        this.amountToProduce = i;
    }

    public void decreaseAmountToProduce() {
        if (amountToProduce > 1) {
            amountToProduce--;
        }
    }

    public void increaseAmountToProduce() {
        if (amountToProduce < maxToProduce) {
            amountToProduce++;
        }
    }

    public void setMaxToProduce(int i) {
        maxToProduce = i;
    }

    public int getAmountToProduce() {
        return amountToProduce;
    }

    public void setItemToProduce(int itemUsed) {
        this.itemToProduce = itemUsed;

    }

    public int getItemToProduce() {
        return itemToProduce;

    }

    public void setDialougeSkill(int skillId) {
        this.dialoguesSkill = skillId;

    }

    public int getDialoguesSkill() {
        return dialoguesSkill;

    }

    public void setItemUsed(int id) {
        this.itemUsed = id;
    }

    public int getItemUsed() {
        return itemUsed;
    }

    public boolean[] getLeveledUp() {
        return leveledUp;
    }

    public void setPossibleProductions(int[] items) {
        this.possibleProductions = items;
    }

    public int[] getPossibleProductions() {
        return possibleProductions;
    }

    public void incChances() {
        chances++;
    }

    public void decChances() {
        chances--;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int i) {
        this.chances = i;
    }

    public int getLastXAmount() {
        return lastXAmount;
    }

    public void setLastXAmount(int lastXAmount) {
        this.lastXAmount = lastXAmount;
    }

    public void setGodEntranceRope(boolean godEntranceRope) {
        this.godEntranceRope = godEntranceRope;
    }

    public boolean hasGodEntranceRope() {
        return godEntranceRope;
    }

    public void setLastSelection(int lastSelection) {
        this.lastSelection = lastSelection;
    }

    public int getLastSelection() {
        return lastSelection;
    }

    public int getHitCounter() {
        return hitCounter;
    }

    public void resetHitCounter() {
        hitCounter = 0;
    }

    public void incrementHitCounter() {
        hitCounter++;
    }

    public void setSpeakingTo(Entity speakingTo) {
        this.speakingTo = speakingTo;
    }

    public Entity getSpeakingTo() {
        return speakingTo;
    }

    public boolean[] getStrongholdChest() {
        return strongholdChestLooted;
    }
    
    public int[] getFairyRingCombination() {
		return fairyRingCombination;
	}

	public int[] getTokens() {
		return tokens;
	}

    public boolean isSkulled() {
        return skulled;
    }

    public int getSkull() {
        return playerSkull == null ? -1 : playerSkull.ordinal();
    }

    public void setSkull(int id) {
        this.playerSkull = SkullIcon.forValue(id);
    }

    public void setSkull(SkullIcon icon) {
        this.playerSkull = icon;
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }
}
