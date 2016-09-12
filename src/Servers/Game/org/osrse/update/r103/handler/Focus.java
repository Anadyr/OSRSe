package org.osrse.update.r103.handler;

import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 12/27/15.
 */
public class Focus extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        if(packet.getOpcode() == 23) {
            int mode = packet.get();
            int width = packet.getShort();
            int height = packet.getShort();
	        player.setScreenDisplay(mode == 1 ? Player.Display.Fixed : (player.hasAttribute("fixed_panel") ? Player.Display.Resizeable_Panel
			        : Player.Display.Resizeable_FixedPanel));
            player.getProtocol().sendWindow(player.getScreenDisplay().getWindowId());
            player.getProtocol().sendTabs();
        }
    }
}
