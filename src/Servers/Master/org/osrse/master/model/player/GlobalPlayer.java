package org.osrse.master.model.player;

import org.osrse.MasterModule;
import org.osrse.model.Node;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;

/**
 * Created by Jonathan on 12/26/13.
 */
public class GlobalPlayer extends Node implements Communicable {

    private String username;
    private int worldId, privacy;
    private long broadcastedTimeStamp = 0L;
    private Communications communications;

    public GlobalPlayer(String username, int globalIndex, int worldId) {
        super.setStaticIndex(globalIndex);
        this.username = username;
        this.worldId = worldId;
        this.broadcastedTimeStamp = System.currentTimeMillis();
        communications = MasterModule.getLogic().getCommunications(getStaticIndex());
    }

    public String getUsername() {
        return username;
    }

	public void setUsername(String username) {
		this.username = username;
	}

    public final int getWorldId() {
        return worldId;
    }

    @Override
    public boolean hasFriend(int staticIndex) {
        return false;
    }

    @Override
    public boolean hasIgnore(int staticIndex) {
        return communications != null && communications.hasIgnore(staticIndex);
    }

    @Override
    public final int getStatus() {
        return privacy;
    }

    @Override
    public final void setStatus(int privacy) {
        this.privacy = privacy;
    }

    /**
     * Used for future worldHopping. Maybe :/
     *
     * @param worldId
     */
    @Deprecated
    public final void changeWorld(int worldId) {
        this.worldId = worldId;
    }

    public boolean isValidTimeStamp() {
        return System.currentTimeMillis() - broadcastedTimeStamp <= 30000;
    }

    public Communications getCommunications() {
        return communications;
    }

    public String toString() {
        return "[Id=" + getStaticIndex() + ", name=" + username + ", w=" + worldId + ":" + getIndex() + (privacy == 3 ? "" : ", p=" + privacy) + "]";
    }

    public void manageCommunications(Packet packet) {
        int id = packet.getShort();
        //System.out.println(id);
        setIndex(id);
        if (communications == null) {
            packet.recalculateBitPosition();
            int kickReq = packet.getBits(3);
            int joinReq = packet.getBits(3);
            int status = packet.getBits(2);
            boolean hasClan = packet.get() == 1;
            String clan = "";
            if(hasClan) {
                clan = packet.getString();
            }
	        communications = new Communications(getStaticIndex(), getUsername(), clan, joinReq, kickReq, 0);
	        setStatus(status);
            MasterModule.getLogic().setInChat(getStaticIndex(), communications);
        }
    }
}
