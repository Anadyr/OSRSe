package org.osrse.network;

import org.osrse.utility.Identifyable;

/**
 * Created by Jonathan on 12/29/15.
 */
public class CommercialPackets {


    public enum WorldRequests implements Identifyable {
        INITIAL_REQUEST(0), REQUESTING_LOGIN(1), REGISTER_PLAYER(2), EDIT_PRIVACY(3), SEND_PM(4), COM_REQUEST(5), EDIT_CLAN(6);

        private final int id;

        private WorldRequests(int i) {
            this.id = i;
        }

        public final int getId() {
            return id;
        }

        public static WorldRequests forId(int id) {
            for(WorldRequests mr : WorldRequests.values()) {
                if(mr.getId() == id) {
                    return mr;
                }
            }
            return null;
        }
    }

    public enum MasterResponse implements Identifyable {
        LOGIN_RESPONSE(0), ANNOUCE_WORLD(1), SYNC_WORLD(2), ACCEPT_PLAYER_REGISTRATION(3), ANNOUNCE_PLAYER(4), EDIT_PRIVACY(5), ANNOUNCE_LIST_EDIT(6), SEND_PM(7), FRIEND_SERVER(8), COM_RESP(9), CC_DEFINE(10), CC_EDIT(11);

        private final int id;

        private MasterResponse(int i) {
            this.id = i;
        }

        public static MasterResponse forId(int id) {
            for(MasterResponse mr : MasterResponse.values()) {
                if(mr.getId() == id) {
                    return mr;
                }
            }
            return null;
        }

        public final int getId() {
            return id;
        }

    }


}

