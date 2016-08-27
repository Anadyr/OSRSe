package org.osrse.master.model.world;

import org.osrse.model.commercial.Component;
import org.osrse.model.utility.NodeCollection;
import org.osrse.master.model.player.GlobalPlayer;

/**
 * Created by Jonathan on 12/29/15.
 */
public class ClanManagement extends Component<GlobalPlayer> {
    protected static final int MAXIMUM_CLAN_SIZE = 100;
    private final GlobalPlayer owner;

    public ClanManagement(GlobalPlayer owner) {
        super(new NodeCollection<GlobalPlayer>(MAXIMUM_CLAN_SIZE));
        this.owner = owner;
    }

    @Override
    public boolean isValid(String name) {
        return false;
    }

    @Override
    public GlobalPlayer searchComponent(int i) {
        return null;
    }

    @Override
    public boolean registerComponent(GlobalPlayer node, int index) {
        return false;
    }

    @Override
    public void removeComponent(GlobalPlayer node) {

    }
}
