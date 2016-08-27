package org.osrse.model.commercial;

/**
 * Created by Jonathan on 12/30/13.
 */
public interface Communicable {

    /**
     * getIndex() refers to worldId, playerinworldId
     *
     * @return
     */
    int getIndex();

    /**
     * static index refers to players globalId given on account creation
     *
     * @return
     */
    int getStaticIndex();

    /**
     * @return private messaging id, or world server status
     */
    int getStatus();

    /**
     * set privacy status, or world server status
     * @param status
     */
    void setStatus(int status);


    String getUsername();

    int getWorldId();

    boolean hasFriend(int staticIndex);

    boolean hasIgnore(int staticIndex);
}
