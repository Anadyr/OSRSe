/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content;

import org.osrse.game.content.command.*;
import org.osrse.game.logic.player.Player;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Jonathan
 */
public abstract class Commands {
    private static Map<Player.Privilege, Commands> commands = new LinkedHashMap<Player.Privilege, Commands>();

    static {
        commands.put(Player.Privilege.ADMINISTRATOR, new AdminCommands());
        commands.put(Player.Privilege.MODERATOR, new ModeratorCommands());
        commands.put(Player.Privilege.PLAYER, new PlayerCommands());
    }

    public static boolean handle(Player player, String command, String[] args) {
        boolean success = false;
        for(Commands c : commands.values()) {
            if(player.getPrivilege().getValue() >= c.required().getValue()) {
                try {
                    success = c.handle(command.toLowerCase(), player, args);
                } catch (Exception e) {
                    player.sendMessage("Error processing command - "+e.getLocalizedMessage()+", cmd="+command);
                    player.sendMessage("Args="+ Arrays.toString(args));
                    success = true;
                }
                if(success)
                    break;
            }
        }
        if(!success && player.getPrivilege() != Player.Privilege.PLAYER) {
            player.sendMessage("Invalid command [" + command + "]");
        }
        return success;
    }

    protected final Map<String, Command> commandMap = new HashMap<String, Command>();

    public boolean handle(String command, Player player, String[] args) {
        Command c = commandMap.get(command);
        if(c != null) {
            c.handle(player, args);
            return true;
        }
        return false;
    }

    protected Player.Privilege required() {
        return Player.Privilege.PLAYER;
    }
}
