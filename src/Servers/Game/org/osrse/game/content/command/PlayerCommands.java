package org.osrse.game.content.command;

import org.osrse.game.content.Commands;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/8/16.
 */
public class PlayerCommands extends Commands {

    public PlayerCommands() {
        Command multi = clientSidedCommand();
        commandMap.put("noclip", multi);
        commandMap.put("fpson", multi);
        commandMap.put("fpsoff", multi);
        commandMap.put("gc", multi);
        multi = getPosition();
        commandMap.put("pos", multi);
        commandMap.put("coords", multi);
        commandMap.put("loc", multi);
        multi = goHome();
        commandMap.put("home", multi);
        commandMap.put("default", multi);
        commandMap.put("def", multi);
    }

    private Command clientSidedCommand() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {

            }
        };
    }

    private Command getPosition() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
               player.getProtocol().sendMessage("Your current position is " + player.getLocation().toString());
            }
        };
    }

    private Command goHome() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getMagic().homeTele();
                //player.goHome();
            }
        };
    }

}
