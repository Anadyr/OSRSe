package org.osrse.game.content.combat;

import org.osrse.game.logic.Entity;
import org.osrse.game.logic.masks.Animation;
import org.osrse.game.logic.utility.WeaponInterface;

/**
 * Created by Jonathan on 1/11/16.
 */
public class CombatSettings {

    /**
     * The Entity's combat level.
     */
    private int combatLevel = 3;
    private int disconnect = -1;
	private boolean frozen;
	private Entity target = null, attacker = null;
	private int combatTick, retaliateTick;
	/**
	 * The entity's stats.
	 */
	private int[] stats;
	/**
	 * The entity's cursed modifier.
	 */
	private double[] cursedModifiers;
	/**
	 * The attack speed.
	 */
	private int attackSpeed = 4;
	/**
	 * The entity's attack delay2.
	 */
	private Animation attackAnimation;
	/**
	 * The entity's defence delay2.
	 */
	private Animation defenceAnimation;
	/**
	 * The attack style used.
	 */
	private int attackStyle;
	/**
	 * The attack type used.
	 */
	private int attackType;

    /**
     * Constructs a newcache {@code BasicSettings} {@code Object}.
     */
    public CombatSettings() {
	    this.stats = new int[18];
	    this.cursedModifiers = new double[7];
    }

	/**
     * @return the combatLevel
     */
    public int level() {
        return combatLevel;
    }

    /**
     * @param combatLevel the combatLevel to set
     */
    public void setLevel(int combatLevel) {
        this.combatLevel = combatLevel;
    }

    public void setTarget(Entity e) {
        this.target = e;
    }


	//<editor-fold desc="Combat Animations">

    public void setAttacker(Entity e) {
        this.attacker = e;
    }

    public Entity attacker() {
        return attacker;
    }

    public int getCombatTick() {
        return combatTick;
    }

    public void applyCombatTick() {
        this.combatTick = 5;
    }

    public int getRetaliateTick() {
        return retaliateTick;
    }

    public void applyRetaliateTick() {
        retaliateTick = 5;
    }

    public boolean rejectedOpponent() {
        if(target != null && attacker != null) {
            return target != attacker;
        }
        return false;
    }

    public void opponentReset() {
        target = attacker = null;
        combatTick = -1;
        retaliateTick = -1;
    }

    /**
     * @return the attackAnimation
     */
    public Animation getAttackAnimation() {
	    return attackAnimation;
    }

    /**
     * @param attackAnimation the attackAnimation to set
     */
    public void setAttackAnimation(Animation attackAnimation) {
        this.attackAnimation = attackAnimation;
    }

    /**
     * @return the defenceAnimation
     */
    public Animation getDefenceAnimation() {
	    return defenceAnimation;
    }

    /**
     * @param defenceAnimation the defenceAnimation to set
     */
    public void setDefenceAnimation(Animation defenceAnimation) {
        this.defenceAnimation = defenceAnimation;
    }

    /**
     * @return the attackSpeed
     */
    public int getAttackSpeed() {
        if (attackStyle == WeaponInterface.STYLE_RAPID) {
            return attackSpeed - 1;
        }
        return attackSpeed;
    }

    /**
     * @param attackSpeed the attackSpeed to set
     */
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    /**
     * @return the attackStyle
     */
    public int getAttackStyle() {
        return attackStyle;
    }

    /**
     * @param attackStyle the attackStyle to set
     */
    public void setAttackStyle(int attackStyle) {
        this.attackStyle = attackStyle;
    }

    /**
     * @return the attackType
     */
    public int getAttackType() {
        return attackType;
    }

    /**
     * @param attackType the attackType to set
     */
    public void setAttackType(int attackType) {
        this.attackType = attackType;
    }

    /**
     * @param cursedModifiers the cursedModifiers to set
     */
    public void setCursedModifiers(double[] cursedModifiers) {
        this.cursedModifiers = cursedModifiers;
    }

    public int setDisconnect(int timeout) {
        //if(attacker == null) {
        //    return -1;
        //}
        if(this.disconnect == -1) {
            this.disconnect = timeout;
        }
        return this.disconnect;
    }

    public void tick() {
        if(disconnect > 0) {
            disconnect = disconnect - 1;
        }
        if(target != null) {
            combatTick -= 1;
        }
        if(attacker == null && retaliateTick != 0) {
            retaliateTick -= 1;
        }

    }

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

    //</editor-fold>
}
