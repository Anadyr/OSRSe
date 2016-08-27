/**
 *
 */
package org.osrse.model.utility;


public enum Response {

    CONTINUE(0), MEMBER_ONLY(12), TANSFERRING(21), ONLINE(5), BANNED(4), CLIENT_UPDATED(6),
    CURRENTLY_UPDATING(14), ERROR(13), INVALID_DETAILS(3), IP_BANNED(26), LOGIN(2), LOGIN_LIMIT_EXCEEDED(9), LOGIN_SERVER_OFFLINE(8), WORLD_FULL(7);

    public static Response valueFor(int responseCode) {
        switch (responseCode) {
            case 0:
                return CONTINUE;
            case 2:
                return LOGIN;
            case 3:
                return INVALID_DETAILS;
            case 4:
                return BANNED;
            case 5:
                return ONLINE;
            case 6:
                return CLIENT_UPDATED;
            case 7:
                return WORLD_FULL;
            case 8:
                return LOGIN_SERVER_OFFLINE;
            case 9:
                return LOGIN_LIMIT_EXCEEDED;
            case 12:
                return MEMBER_ONLY;
            case 13:
                return ERROR;
            case 14:
                return CURRENTLY_UPDATING;
            case 21:
                return TANSFERRING;
            case 26:
                return IP_BANNED;
        }
        return null;
    }

    private int responseCode;

    private Response() {
        this(-1);
    }

    private Response(int responseCode) {
        this.responseCode = responseCode;
    }

    public int intValue() {
        return responseCode;
    }

    @Override
    public String toString() {
        return "response=" + super.toString().replace("_", " ").toLowerCase();
    }
}
