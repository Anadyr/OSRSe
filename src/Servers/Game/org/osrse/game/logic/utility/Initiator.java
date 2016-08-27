package org.osrse.game.logic.utility;

/**
 * @author Lazaro
 */
public interface Initiator<T extends Poolable> {
    public void init(T object) throws Exception;
}
