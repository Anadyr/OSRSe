package org.osrse.update.r103.handler;

import org.osrse.Module;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 1/8/16.
 */
public class Clan extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        if(packet.getLength() == 0) {
	        Module.js.call("interfaces/tab_clanchat.leave", player);
        } else {
            String cc = packet.readGJString2(0, packet.getLength()-1);
	        Module.js.call("interfaces/tab_clanchat.join", player, cc);
        }
    }
}
