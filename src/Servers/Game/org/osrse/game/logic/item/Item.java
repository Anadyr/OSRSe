/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.item;


import org.osrse.model.Node;

/**
 *
 * @author Jonathan
 */
public class Item extends Node {
    protected int amount;
    protected final int type;

    public Item(int type) {
        this(type, 1);
    }

    public Item(int type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    /**
     * Note: This method only compares the type of item! Not the amount!
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Item) {
            return ((Item) object).type == type;
        }
        return false;
    } 

    public int getAmount() {
        return amount;
    }

    public int getRealId() {
        SQLItem def = getDefinition();
        return  def != null ? def.noted ? def.superId : type : type;
    }

    public SQLItem getDefinition() {
        return ItemDefinition.itemDefinitions.get(type);
    }

    public int getType() {
        return type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    boolean isStackable() {
        if(type == 995) {
            return true;
        }
        SQLItem d = getDefinition();
        if(d == null) return false;
        return d.stackable;
    }
}