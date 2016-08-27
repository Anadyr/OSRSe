package org.osrse.model.commercial;

import static org.osrse.model.commercial.Communications.ClanRank;

/**
 * Created by Jonathan on 1/14/16.
 */
public class Alias {
    private final String name;
    private ClanRank rank;
    private String username;

    public Alias(String name, ClanRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public final ClanRank getRank() {
        return rank;
    }

    public final void setRank(ClanRank rank) {
        this.rank = rank;
    }

    public final String toString() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}