package org.osrse.slave;

import org.osrse.model.commercial.Communications;
import org.osrse.model.Node;
import org.osrse.model.commercial.Communicable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jonathan on 12/30/15.
 */
public class ReferencedPerson extends Node implements Communicable {

    private int privacy;
    private String username;
    private Set<Integer> friendList = new HashSet<Integer>();
    private Set<Integer> ignoreList = new HashSet<Integer>();

    public ReferencedPerson(int world, int staticIndex, int privacy) {
        setIndex(world);
        setStaticIndex(staticIndex);
        this.privacy = privacy;
    }

    @Override
    public int getStatus() {
        return privacy;
    }

    @Override
    public void setStatus(int status) {
        this.privacy = status;
    }

    public final void setUsername(String username) {
        this.username = username;
    }

    public final String getUsername() {
        return username;
    }

    @Override
    public int getWorldId() {
        return getIndex();
    }

    public void addFriend(int friend) {
        friendList.add(friend);
    }

    public void removeFriend(int friend) {
        friendList.remove(friend);
    }

    @Override
    public boolean hasFriend(int staticIndex) {
        return friendList.contains(staticIndex);
    }

    @Override
    public boolean hasIgnore(int staticIndex) {
        return ignoreList.contains(staticIndex);
    }

    public void addIgnore(int friend) {
        friendList.add(friend);
    }

    public void removeIgnore(int friend) {
        friendList.remove(friend);
    }
}
