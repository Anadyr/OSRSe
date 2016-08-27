package org.osrse.game.logic.player;


import org.osrse.game.logic.utility.LogicConstants;

/**
 * Holds the player's current skill levels.
 * @author Emperor
 * @author `Discardedx2
 */
public class Skills implements SkillSkeleton {

	/**
	 * The combat experience multiplier.
	 */
	public static final double COMBAT_EXPERIENCE_MULTIPLIER = 150.0;
	
	/**
	 * The skilling experience multiplier.
	 */
	public static final double SKILLING_EXPERIENCE_MULTIPLIER = 65.0;

	/**
	 * The skill names.
	 */
	public static final String[] SKILL_NAME = { "Attack", "Defence",
			"Strength", "Constitution", "Ranged", "Prayer", "Magic", "Cooking",
			"Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting",
			"Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer",
			"Farming", "Runecrafting", "Hunter", "Construction"};

	/**
	 * Constants for the skill numbers.
	 */
	public static final int ATTACK = 0;
	public static final int DEFENCE = 1;
	public static final int STRENGTH = 2;
	public static final int HITPOINTS = 3;
	public static final int RANGE = 4;
	public static final int PRAYER = 5;
	public static final int MAGIC = 6;
	public static final int COOKING = 7;
	public static final int WOODCUTTING = 8;
	public static final int FLETCHING = 9;
	public static final int FISHING = 10;
	public static final int FIREMAKING = 11;
	public static final int CRAFTING = 12;
	public static final int SMITHING = 13;
	public static final int MINING = 14;
	public static final int HERBLORE = 15;
	public static final int AGILITY = 16;
	public static final int THIEVING = 17;
	public static final int SLAYER = 18;
	public static final int FARMING = 19;
	public static final int RUNECRAFTING = 20;
	public static final int HUNTER = 21;
	public static final int CONSTRUCTION = 22; 

	/**
	 * The amount of skills.
	 */
	public static final int SKILL_COUNT = 23;

	/**
	 * The player.
	 */
	private final Player player;

	/**
	 * An array containing all the player's experience.
	 */
	private final double[] experience;

	/**
	 * An array containing all the maximum levels.
	 */
	private final int[] staticLevels;

	/**
	 * An array containing all the current levels.
	 */
	private final int[] dynamicLevels;

	/**
	 * The amount of prayer points left.
	 */
	private int prayerPoints = 1;

	/**
	 * The player's life-points.
	 */
	private int lifepoints = 100;

	/**
	 * The maximum lifepoints.
	 */
	private int maximumLifepoints = lifepoints;

	/**
	 * The amount of increased maximum lifepoints.
	 */
	private int lifepointsIncrease = 0;

	/**
	 * The total experience gained.
	 */
	private int experienceGained = 0;

    /**
	 * Constructs a newcache {@code Skills} {@code Object}.
	 * @param player The player.
	 */
	public Skills(Player player) {
		this.player = player;
		this.experience = new double[25];
		this.staticLevels = new int[25];
		this.dynamicLevels = new int[25];
		for (int i = 0; i < 25; i++) {
			this.staticLevels[i] = 1;
			this.dynamicLevels[i] = 1;
		}
		this.experience[HITPOINTS] = 1154;
		this.dynamicLevels[HITPOINTS] = 10;
		this.staticLevels[HITPOINTS] = 10;
		this.player.getCombat().setLevel(3);
	}

    public void calculateCombat(boolean onLoad) {
        int combatBase = (int) Math.ceil((dynamicLevels[DEFENCE] + dynamicLevels[HITPOINTS]) * .25 + (dynamicLevels[PRAYER] % 2 == 0 ? dynamicLevels[PRAYER] : dynamicLevels[PRAYER] - 1 + 0) * .125);
        int meleeBase = ((dynamicLevels[ATTACK] * 130) + (dynamicLevels[STRENGTH] * 130)) / 400;
        int rangedBase = (dynamicLevels[RANGE] % 2 == 0 ? dynamicLevels[RANGE] * 195 : (dynamicLevels[RANGE] * 195) - 65) / 400;
        int magicBase = (dynamicLevels[MAGIC] % 2 == 0 ? dynamicLevels[MAGIC] * 195 : (dynamicLevels[MAGIC] * 195) - 65) / 400;
        int oldCombat = player.getCombat().level();
        player.getCombat().setLevel(Math.max(Math.max(meleeBase, rangedBase), magicBase) + combatBase);
        //if (!onLoad && oldCombat >= 3 && oldCombat != player.level())
            //player.getAppearance().refresh();
    }

	/**
	 * Adds experience to a skill.
	 *
	 * @param slot
	 *            The skill slot.
	 * @param experience
	 *            The experience.
	 */
	public void addExperience(int slot, double experience) {
		addExperience(slot, experience, false);
	}
	
	/**
	 * Adds experience to a skill.
	 *
	 * @param slot
	 *            The skill slot.
	 * @param experience
	 *            The experience.
	 * @param ignoreMultiplier
	 * 			  If we shouldn't multiply.
	 */
	public void addExperience(int slot, double experience, boolean ignoreMultiplier) {
		double mult = ignoreMultiplier ? 1 : slot > 6 ? SKILLING_EXPERIENCE_MULTIPLIER : COMBAT_EXPERIENCE_MULTIPLIER;
		if (!ignoreMultiplier && slot == MAGIC && player.getEquipment().get(LogicConstants.Equipment.WEAPON_SLOT).getType() == 18681) {
			if (staticLevels[slot] < 60) { //Fairy wand aids up to level 60 magic.
				mult += 0.1;
			}
		}
		this.experience[slot] += (experience * mult);
		if (this.experience[slot] > 200000000) {
			this.experience[slot] = 200000000;
		}
		experienceGained = experienceGained + (int) (experience * mult);
		//ActionSender.sendConfig(player, 1801, experienceGained * 10);
		int newLevel = getStaticLevelByExperience(slot);
		if (newLevel > staticLevels[slot]) {
			//player.getSetting().getLeveledUp()[slot] = true;
			player.setAttribute("leveledUp", Boolean.TRUE);
			if (dynamicLevels[slot] < newLevel) {
				dynamicLevels[slot] += newLevel - staticLevels[slot];
			}
			if (slot == HITPOINTS) {
				lifepoints += (newLevel - staticLevels[slot]) * 10;
				maximumLifepoints = newLevel * 10;
				//ActionSender.sendConfig(player, 1240, lifepoints << 1);
			}
			staticLevels[slot] = newLevel;
			updateCombatLevel();
		}
        player.getProtocol().sendSkill(slot);
	}

	/**
	 * Refreshes all the skill levels.
	 */
	public void refresh() {
		for (byte i = 0; i < 23; i++) {
            player.getProtocol().sendSkill(i);
		}
		//ActionSender.sendConfig(player, 1240, lifepoints << 1);
		//ActionSender.sendConfig(player, 2382, (int) prayerPoints);
	}

	/**
	 * Gets the static level.
	 *
	 * @param slot
	 *            The skill's slot.
	 * @return The level.
	 */
	public int getStaticLevelByExperience(int slot) {
		double exp = experience[slot];
		int points = 0;
		int output;
		for (byte lvl = 1; lvl < (slot == 24 ? 121 : 100); lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return slot == 24 ? 120 : 99;
	}

	/**
	 * Gets the experience for a certain level.
	 * @param level The level.
	 * @return The experience needed.
	 */
	public int getExperienceByLevel(int level) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= level; lvl++) {
			points += Math.floor(lvl + 300.0
					* Math.pow(2.0, lvl / 7.0));
			if (lvl >= level) {
				return output;
			}
			output = (int) Math.floor(points / 4);
		}
		return 0;
	}

	/**
	 * Updates the combat level.
	 */
	private void updateCombatLevel() {
		int attack = staticLevels[ATTACK];
		int strength = staticLevels[STRENGTH];
		int defence = staticLevels[DEFENCE];
		int range = staticLevels[RANGE];
		int magic = staticLevels[MAGIC];
		int prayer = staticLevels[PRAYER];
		int constitution = staticLevels[HITPOINTS];
		int combatLevel = (int) (((defence + constitution
				+ Math.floor(prayer / 2)) * 0.25) + 1);
		double melee = (attack + strength) * 0.325;
		double ranger = Math.floor(range * 1.5) * 0.325;
		double mage = Math.floor(magic * 1.5) * 0.325;
		if (melee >= ranger && melee >= mage) {
			combatLevel += melee;
		} else if (ranger >= melee && ranger >= mage) {
			combatLevel += ranger;
		} else if (mage >= melee && mage >= ranger) {
			combatLevel += mage;
		}
		player.getCombat().setLevel(combatLevel);
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Gets the experience.
	 * @param slot The slot.
	 * @return The experience.
	 */
	public double getExperience(int slot) {
		return experience[slot];
	}

	/**
	 * Gets the static skill level.
	 * @param slot The slot.
	 * @return The static level.
	 */
	@Override
	public int getStaticLevel(int slot) {
		return staticLevels[slot];
	}

	/**
	 * Sets the experience gained.
	 * @param experienceGained The experience gained.
	 */
	public void setExperienceGained(int experienceGained) {
		this.experienceGained = experienceGained;
	}

	/**
	 * Gets the experience gained.
	 * @return The experience gained.
	 */
	public int getExperienceGained() {
		return experienceGained;
	}

	@Override
	public void setLevel(int slot, int level) {
		dynamicLevels[slot] = level;
//        player.getProtocol().sendSkill(slot);
	}

	@Override
	public int getLevel(int slot) {
		return dynamicLevels[slot];
	}

	@Override
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
		//ActionSender.sendConfig(player, 1240, lifepoints << 1);
	}

	@Override
	public int getLifepoints() {
		return lifepoints;
	}

	@Override
	public int getMaximumLifepoints() {
		return maximumLifepoints + lifepointsIncrease;
	}

	@Override
	public void setLifepointsIncrease(int amount) {
		this.lifepointsIncrease = amount;
	}

	@Override
	public int heal(int health) {
		lifepoints += health;
		int left = 0;
		if (lifepoints > getMaximumLifepoints()) {
			left = lifepoints - getMaximumLifepoints();
			lifepoints = getMaximumLifepoints();
		}
		//ActionSender.sendConfig(player, 1240, lifepoints << 1);
		return left;
	}

	@Override
	public int hit(int damage) {
		lifepoints -= damage;
		int left = 0;
		if (lifepoints < 0) {
			left = -lifepoints;
			lifepoints = 0;
		}
		//ActionSender.sendConfig(player, 1240, lifepoints << 1);
		return left;
	}

	@Override
	public int getPrayerPoints() {
		return prayerPoints;
	}

	@Override
	public void updatePrayerPoints(double amount) {
		if (amount > 0 && player.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
			return;
		}
		prayerPoints -= amount;
		if (prayerPoints < 0) {
			prayerPoints = 0;
		}
		//ActionSender.sendConfig(player, 2382, (int) prayerPoints);
	}

	@Override
	public int updateLevel(int skill, int amount, int maximum) {
		if (amount > 0 && dynamicLevels[skill] > maximum) {
			return 0;
		} else if (amount < 0 && player.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
            player.getProtocol().sendSkill(skill);
			return 0;
		}
		int left = (dynamicLevels[skill] + amount) - maximum;
		int level = dynamicLevels[skill] += amount;
		if (level < 0) {
			dynamicLevels[skill] = 0;
		} else if (amount < 0 && level < maximum) {
			dynamicLevels[skill] = maximum;
		} else if (amount > 0 && level > maximum) {
			dynamicLevels[skill] = maximum;
		}
        player.getProtocol().sendSkill(skill);
        return left;
	}

	/**
	 * Sets the static level.
	 * @param slot The skill slot.
	 * @param level The leve to set.
	 */
	public void setStaticLevel(int slot, int level) {
		staticLevels[slot] = level;
		updateCombatLevel();
	}

	/**
	 * Sets the experience.
	 * @param slot The skill slot.
	 * @param experience The experience to set.
	 */
	public void setExperience(int slot, double experience) {
		this.experience[slot] = experience;
	}

	/**
	 * Sets the current amount of prayer points left.
	 * @param points The amount of prayer points.
	 * @param update IF we should send the orb config 480+
	 */
	public void setPrayerPoints(int points, boolean update) {
		this.prayerPoints = points;
		if (update) {
			//ActionSender.sendConfig(player, 2382, prayerPoints);
		}
	}

	/**
	 * Updates the current maximum lifepoints.
	 */
	public void updateMaximumLifepoints() {
		this.maximumLifepoints = staticLevels[HITPOINTS] * 10;
	}

    public int[] getLevelArray() {
        return dynamicLevels;
    }

    public double[] getExperienceArray() {
        return experience;
    }
}