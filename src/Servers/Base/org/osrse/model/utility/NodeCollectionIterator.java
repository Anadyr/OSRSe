package org.osrse.model.utility;


import org.osrse.model.Node;

import java.util.Iterator;

public class NodeCollectionIterator<N extends Node> implements Iterator<N> {
    private Integer[] indexes;
    private NodeCollection<N> nodeCollection;
    private int position = 0;

    public NodeCollectionIterator(NodeCollection<N> nodeList) {
        this.nodeCollection = nodeList;
        this.indexes = nodeList.getIndexes().toArray(new Integer[0]);
    }

    public boolean hasNext() {
        return position != indexes.length;
    }

    @SuppressWarnings("unchecked")
    public N next() {
        while (true) {
            if (position < indexes.length) {
                Node n = nodeCollection.get(indexes[position++]);
                if (n == null) {
                    continue;
                }
                return (N) n;
            }
            return null;
        }
    }

    public void remove() {
        nodeCollection.remove(indexes[position - 1]);
    }
}