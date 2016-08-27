package org.osrse.master.model.player.dep;

import java.io.Serializable;

/**
 * Created by Jonathan on 12/29/15.
 */
public class PlayerData implements Serializable {

    /**
     * Used for the future FTP for loginserver <-> Game server
     * instead of SQL only.
     * @param username
     */
    public PlayerData(String username) {
        this.username = username;
    }

    private String username;
    private boolean banned, muted;
    private int x, y, z;
    private int rights, privacy;
    private int[] levels, experience;


    private String[] friends;
    private int[] ranks;
    private int ccJoinReq, ccKickReq;




}
