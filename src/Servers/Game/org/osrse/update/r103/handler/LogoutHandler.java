package org.osrse.update.r103.handler;

import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 1/10/16.
 */
public class LogoutHandler extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        if(!player.hasAttribute("logout")) {
            player.setAttribute("logout", System.currentTimeMillis());
        } else {
            long timeout = player.getUsername().equalsIgnoreCase("John") ? 240000 : 120000;
            if(System.currentTimeMillis() - player.getAttributes().getLong("logout") >= timeout) {
                System.out.println(System.currentTimeMillis() - player.getAttributes().getLong("logout"));
                player.getProtocol().sendLogout();
            }
        }
    }
}
