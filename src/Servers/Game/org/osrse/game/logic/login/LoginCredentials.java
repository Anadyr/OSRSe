/**
 *
 */
package org.osrse.game.logic.login;

import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.network.Session;
import org.osrse.utility.NameUtilities;


public class LoginCredentials {
    private final String name;
    private final String password;
    private int displayMode;
    
    public LoginCredentials(String name, String password, int displayMode) {
        this.name = NameUtilities.capitalizeFormat(name);
        this.password = password;
        this.displayMode = displayMode;
    } 

    public String getName() {
        return name;
    }

    public int getDisplayMode() {
    	return displayMode;
    }

    public PlayerDefinition toDefinition() {
        if(definition == null) {
            definition = new PlayerDefinition(name, password);
        }
        return definition;
    }

    private PlayerDefinition definition;
    
    @Override
    public String toString() {
        return "name=" + name + ", password=" + password.replaceAll(".", "*");
    }
}
