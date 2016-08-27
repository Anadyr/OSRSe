package org.osrse.master.model.player;

import org.osrse.master.model.player.dep.OldAssembler;
import org.osrse.model.Node;
import org.osrse.model.commercial.Communications.Request;

/**
 * Created by Jonathan on 1/14/16.
 */
public class GameRequest extends Node implements Comparable<GameRequest> {
    public OldAssembler.Request type;


    private Request request;
    public int clanRank = 0, clan_join = 0, clan_kick = 7;
    public long timestamp = 0L;
    public String name, clanname = "";
    public boolean ignore, join_clan, remove, sendCC;
    public GlobalPlayer player;

    @Deprecated
    private GameRequest() {
        setValid(true);
    }

    public GameRequest(int owner, int friend) {
        setStaticIndex(owner);
        setIndex(friend);
    }

    public GameRequest(GlobalPlayer index) {
        this.player = index;
        this.request = Request.SERVE;
    }

    public void setName(String name) {
        this.name = name;
    }
    public final void setRemove(boolean remove) {
        this.remove = remove;
    }
    public final void setIgnore(boolean ignoreList) {
        this.ignore = ignoreList;
    }
    public final boolean isIgnore() {
        return ignore;
    }
    public void setType(Request request) {
        this.request = request;
    }
    public Request getRequest() {
        return request;
    }

    public void modifyClan(int clanId) {
        this.clanRank = clanId;
        this.join_clan = true;
    }
    public final int getClanRank() {
        return clanRank;
    }

    public GameRequest handle() {
        setValid(true);
        this.timestamp = System.currentTimeMillis();// + 60000;
        return this;
    }

    /**
     * Delete from list
     * @param owner
     * @param friend
     * @param ignore
     */
    @Deprecated
    public GameRequest(int owner, int friend, boolean ignore) {
        this();
        setStaticIndex(owner);
        setIndex(friend);
        this.ignore = ignore;
        type = ignore ? OldAssembler.Request.DEL_IGNORE : OldAssembler.Request.DEL_FRIEND;
        timestamp();
    }

    /**
     * find and remove to.
     * @param owner
     * @param friend
     * @param username
     * @param ignore
     */
    @Deprecated
    public GameRequest(int owner, int friend, String username, boolean ignore) {
        this();
        setStaticIndex(owner);
        setIndex(friend);
        this.name = username;
        this.ignore = ignore;
        type = OldAssembler.Request.FIND;
        timestamp();
    }

    /**
     * Modify friend clan
     * @param owner
     * @param friend
     * @param clanId
     */
    @Deprecated
    public GameRequest(int owner, int friend, int clanId) {
        this(owner, friend, true);
        this.clanRank = clanId;
        type = OldAssembler.Request.CLAN_EDIT;
    }

    @Deprecated
    public void timestamp() {
        this.timestamp = System.currentTimeMillis() + (int)(Math.random() * 9.9999999999999D);// + 60000;
    }

    @Override
    public int compareTo(GameRequest o) {
        return request.compareTo(o.request) + (timestamp < o.timestamp ? 1 : timestamp == o.timestamp ? 0 : -1);
    }

    public void setClanRequest(boolean clanRequest) {
        this.join_clan = clanRequest;
    }

}