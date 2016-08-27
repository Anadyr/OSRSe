package org.osrse.game.logic.map;

public class Areas {

    private Areas() {
    }

    public static final RSArea HIGH_LVL_WILD_STAIRS = RSArea.forBounds(3014, 10306, 3058, 10349);
    public static final RSArea WILDERNESS = RSArea.forBounds(2944, 3525, 3394, 3999).include(HIGH_LVL_WILD_STAIRS);

    public static final RSArea MULTI = RSArea.forBounds(2944, 3525, 3394, 3712).exclude(RSArea.forBounds(2944, 3525, 3005, 3643))
            .exclude(RSArea.forBounds(3005, 3525, 3071, 3597)).exclude(RSArea.forBounds(3071, 3525, 3135, 3605));


}
