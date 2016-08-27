package org.osrse.master.model.economy;

import org.osrse.model.Node;
import org.osrse.model.commercial.Component;
import org.osrse.model.utility.NodeCollection;

/**
 * Created by Jonathan on 12/29/15.
 */
public class GrandExchange extends Component<Node> {

    public GrandExchange() {
        super(new NodeCollection<Node>(100));
    }

    @Override
    public boolean isValid(String name) {
        return false;
    }

    @Override
    public Node searchComponent(int i) {
        return null;
    }

    @Override
    public boolean registerComponent(Node node, int index) {
        return false;
    }

    @Override
    public void removeComponent(Node node) {

    }
}
