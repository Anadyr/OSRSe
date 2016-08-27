package org.osrse.game.logic.masks;

/**
 * Created by Jonathan on 1/6/16.
 */
public class NamingEdit {
    private transient String[] strings;

    public NamingEdit(String[] strings) {
        this.strings = strings;
    }

    public NamingEdit(String beforeName, String afterName, String afterCombatLevel) {
        this.strings = new String[] { beforeName, afterName, afterCombatLevel};
    }

    public String[] getRightClickOptions() {
        return strings;
    }


}
