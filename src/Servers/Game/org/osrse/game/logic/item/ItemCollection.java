/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.item;

import org.osrse.model.utility.NodeCollection;
import org.osrse.game.logic.player.Player;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Jonathan
 */
public class ItemCollection extends NodeCollection<Item> {
    public static enum Stack {
        FORCE_STACK, STANDARD
    }
    private List<ItemCollectionListener> listeners;
    private Player player;
    private Stack stack;

    public ItemCollection(Player player, int size) {
        this(player, size, Stack.STANDARD);
    }

    public ItemCollection(Player player, int size, Stack stack) {
        super(0, size);
        this.player = player;
        this.stack = stack;
        listeners = new LinkedList<ItemCollectionListener>();
        super.setIndexOptimization(false);
    }

    @Override
    public boolean add(Item item) {
        return add(item, nextIndex());
    }

    @Override
    public boolean add(Item item, int index) {
        if (stack == Stack.STANDARD && !item.isStackable()) {
            if (item.getAmount() > 1) {
                if ((capacity() - size()) >= item.getAmount()) {
                    int amount = item.getAmount();
                    while (amount > 0) {
                        if (super.add(new Item(item.getType(), 1), nextIndex())) { // the
                            // index
                            // specified
                            // is
                            // voided.
                            // refresh(item.getIndex());
                            amount--;
                        }
                    }
                    return true;
                }
            } else {
                if (super.add(item, index)) { 
                    return true;
                }
            }
        } else {
            Item otherItem = getForType(item.getType());
            if (otherItem == null) {
                if (super.add(item, index)) {
                    return true;
                }
            } else {
                long amt = otherItem.getAmount() + item.getAmount();
                if (amt > Integer.MAX_VALUE) {
                    amt = Integer.MAX_VALUE;
                }
                otherItem.setAmount((int) amt);
                return true;
            }
        }
        event(ItemCollectionListener.EventType.FULL);
        return false;
    }

    /**
     * Adds an <code>ItemListListener</code> object onto a list of other
     * listeners to be called when the list is modified.
     * <p/>
     * Note: That the listeners do not have a specific order in which they are
     * called.
     *
     * @param listener The listener to add.
     */
    public void addListener(ItemCollectionListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    @Override
    public void clear() {
        for (Item otherItem : this) {
            remove(otherItem.getIndex());
        }
    }

    public boolean contains(int type, int minAmount) {
        int amount = 0;
        for (Item item : this) {
            if (item.getType() == type) {
                amount += item.getAmount();
                if (stack == Stack.FORCE_STACK) {
                    break;
                }
            }
        }
        return amount >= minAmount;
    }

    public void event(ItemCollectionListener.EventType type) {
        synchronized (listeners) {
            for (ItemCollectionListener listener : listeners) {
                listener.event(player, this, type);
            }
        }
    }

    public int getAmount(int type) {
        int amount = 0;
        for (Item item : this) {
            if (item.getType() == type) {
                if (item.getDefinition().stackable)
                    return item.getAmount();
                amount++;
            }
        }
        return amount;
    }

    public Item getForType(int type) {
        for (Item otherItem : this) {
            if (otherItem.getType() == type) {
                return otherItem;
            }
        }
        return null;
    }

    public boolean hasRoomFor(int itemId, int amount) {
        final Item item = new Item(itemId, amount);
        final boolean stackable = item.isStackable(); 
        if (stackable && contains(itemId))
            return true;
        else
            return remaining() >= (stackable ? 1 : amount);
    }

    /**
     * Calls all the item listeners to refresh everything.
     */
    public void refresh() {
        synchronized (listeners) {
            for (ItemCollectionListener listener : listeners) {
                listener.refresh(player, this);
                listener.event(player, this, ItemCollectionListener.EventType.REFRESH);
            }
        }
    }

    /**
     * Calls all the item listeners to refresh a certain index.
     *
     * @param index The index to refresh.
     */
    private void refresh(int index) {
        synchronized (listeners) {
            for (ItemCollectionListener listener : listeners) {
                listener.refresh(player, this, index);
                listener.event(player, this, ItemCollectionListener.EventType.REFRESH);
            }
        }
    }

    public int remaining() {
        return capacity() - size();
    }

    @Override
    public Item remove(int index) {
        Item item = super.remove(index);
        // refresh(index);
        return item;
    }

    public int remove(int type, int amount) {
        int removed = 0;
        for (Item otherItem : this) {
            if (otherItem == null)
                continue;
            if (otherItem.getType() == type) {
                if (otherItem.isStackable()) {
                    if (amount > otherItem.getAmount())
                        amount = otherItem.getAmount();
                    otherItem.setAmount(otherItem.getAmount() - amount);
                    if (otherItem.getAmount() <= 0)
                        remove(otherItem.getIndex());
                    removed = amount;
                    break;
                } else {
                    remove(otherItem.getIndex());
                    removed++;
                    if (removed >= amount)
                        break;
                }
            }
        }
        return removed;
    } 

    @Override
    public boolean remove(Item item) {
        // TODO - FIX!
        /*
           * Item otherItem = getForType(item.getType()); if (otherItem != null) {
           * if (otherItem.getAmount() > item.getAmount()) {
           * otherItem.setAmount(otherItem.getAmount() - item.getAmount());
           * //refresh(otherItem.getIndex()); return true; } else {
           * super.remove(otherItem.getIndex()); //refresh(otherItem.getIndex());
           * return true; } }
           */
        return false;
    }
}
