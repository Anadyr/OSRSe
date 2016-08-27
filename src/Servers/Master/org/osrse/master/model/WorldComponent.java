package org.osrse.master.model;

import org.osrse.model.commercial.Component;
import org.osrse.model.utility.NodeCollection;
import org.osrse.master.model.player.GlobalPlayer;

/**
 * Created by Jonathan on 12/21/15.
 */
public class WorldComponent extends Component<GlobalPlayer> {

    /**
     * Players/worlds
     * @param index globalPlayerIndex/worldId
     * @param flag private data/worldFlag
     */
    public WorldComponent(int index, int flag, int size) {
        super(new NodeCollection<GlobalPlayer>(size));
        super.setIndex(index);
        super.setStaticIndex(flag);
        super.setValid(size != 1);
    }

    public boolean isValid(String name) {
        GlobalPlayer[] globalPlayers = new GlobalPlayer[0];
        docked.toArray(globalPlayers);
        for(GlobalPlayer player : globalPlayers) {
            if(player.getUsername().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Search Component
     * CAREFUL do not use Static Index's here!
     * @param worldIndex players specific inworld Index
     * @return
     */
    public final GlobalPlayer searchComponent(int worldIndex) {
        return docked.get(worldIndex);
    }

    public boolean registerComponent(GlobalPlayer node, int index) {
        return docked.add(node,index);
    }


    public void removeComponent(GlobalPlayer node) {
        docked.remove(node);
    }

    public String toString() {
        return  "[id="+getIndex()+ (isValid() ? ", online="+docked.size() : "") + "]";
    }
}
