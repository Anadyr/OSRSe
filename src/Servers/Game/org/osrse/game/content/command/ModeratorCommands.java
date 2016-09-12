package org.osrse.game.content.command;

import org.osrse.WorldModule;
import org.osrse.game.content.Commands;
import org.osrse.game.logic.player.Player;
import org.osrse.utility.NameUtilities;

/**
 * Created by Jonathan on 1/8/16.
 */
public class ModeratorCommands extends Commands {

    public ModeratorCommands() {
        Command multi = mutePlayer();
        commandMap.put("mute", multi);
        commandMap.put("sil", multi);
        commandMap.put("silence", multi);
        multi = kickPlayer();
        commandMap.put("kick", multi);
        commandMap.put("dc", multi);
        multi = banPlayer();
        commandMap.put("ban", multi);
        commandMap.put("ostr", multi);
    }

    private Command mutePlayer() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {

            }
        };
    }

    private Command kickPlayer() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                Player player1 = WorldModule.getLogic().getPlayerMap().get(NameUtilities.capitalizeFormat(args[0]));
	            if (player1 != null && player1.isOnline()) {
		            if (player.getPrivilege().getValue() > player1.getPrivilege().getValue() || player1.getStaticIndex() == player.getStaticIndex()) {
			            player1.getProtocol().sendLogout();
		            } else {
			            System.out.println(player.getAttributes().get("misuse"));
			            if (!player.hasAttribute("misuse")) {
				            player.getAttributes().set("misuse", true);
				            player.sendMessage("Your account has been flagged for misuse.");
			            } else {
				            player.setRights(0);
				            player.sendMessage("Your have been demoted. Talk to a staff member for help.");
			            }
                    }
                }
            }
        };
    }

    private Command banPlayer() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {

            }
        };
    }

    protected final Player.Privilege required() {
        return Player.Privilege.MODERATOR;
    }
}
