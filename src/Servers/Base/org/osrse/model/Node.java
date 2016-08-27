package org.osrse.model;

import org.osrse.utility.Attributes;


public abstract class Node {
    private int dynamicIndex = -1, staticIndex = -1;
    private boolean valid = false;
    private Attributes attributes = null;

    public int getIndex() {
        return dynamicIndex;
    }

    public void setIndex(int index) {
        this.dynamicIndex = index;
    }

    public void setStaticIndex(int index) {
        this.staticIndex = index;
    }

    public int getStaticIndex() {
        return staticIndex;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public final boolean hasAttributed() {
        return attributes != null;
    }

    public final Attributes getAttributes() {
        if (attributes == null) {
            attributes = new Attributes();
        }
        return attributes;
    }
}
