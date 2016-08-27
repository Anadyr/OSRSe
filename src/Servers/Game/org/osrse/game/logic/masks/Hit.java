package org.osrse.game.logic.masks;

import org.osrse.model.Node;



/**
 * @author Lazaro
 */
public class Hit {
    public static final int NO_DAMAGE = 1, NORMAL_DAMAGE = 2, NORMAL_HIGH_DAMAGE = 3, POISON_DAMAGE = 4, POISON_HIGH_DAMAGE = 5, DISEASE_DAMAGE = 6, DISEASE_HIGH_DAMAGE = 7;
    private int damage;
    private Node from;
    private int type;

    public Hit(Node from, int damage) {
        this.from = from;
        this.damage = damage;
        if (damage <= 0)
            this.type = NO_DAMAGE;
        else
            this.type = NORMAL_DAMAGE;
    }

    public Hit(Node from, int damage, int type) {
        this.from = from;
        this.damage = damage;
        this.type = type;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @return the <code>Node</code> the damage was from.
     */
    public Node getFrom() {
        return from;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void updateType() {
        if (damage <= 0)
            this.type = NO_DAMAGE;
        else if (damage >= 100)
            this.type = NORMAL_HIGH_DAMAGE;
        else
            this.type = NORMAL_DAMAGE;
    }
}
