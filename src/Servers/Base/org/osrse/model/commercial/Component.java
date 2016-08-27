/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.model.commercial;

import org.osrse.model.Node;
import org.osrse.model.utility.NodeCollection;
import org.osrse.utility.Serviceable;

/**
 * @author Jonathan
 * TODO extend abstraction to fit needs
 */
public abstract class Component<S extends Node> extends Node {
    protected final NodeCollection<S> docked;

    public Component(NodeCollection<S> dockList) {
        this.docked = dockList;
    }


    /**
     * Used for private messaging standards in the mainstream protocol,
     * used for login in the commercial world protocol USE WITH CAUTION
     *
     * @param name
     * @return
     */
    public abstract boolean isValid(String name);


    /**
     * searchComponent, better alternative to @isValid(String name)
     * easily searches players without filtering through all of them.
     * @param i
     * @return
     */
    public abstract S searchComponent(int i);

    public abstract boolean registerComponent(S node, int index);

    public abstract void removeComponent(S node);

    public final S remove(int index) {
        if(docked.capacity() >= index) {
            S s = docked.remove(index);
            System.err.println("Component removed at index="+index+", Object="+s.toString());
            return s;
        }
        return null;
    }

    public NodeCollection<S> getDocked() {
        return docked;
    }
}
