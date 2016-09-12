package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FCResponse extends PacketHandler<LoginSession> {

	@Override
	public void handle(LoginSession session, Packet packet) {
        int playerStaticIndex = packet.getShort();
        int type = packet.get();
        String name = packet.getString();
        int ownerIndex = packet.getShort();
        Player player = WorldModule.getLogic().getPlayerFromStaticIndex(playerStaticIndex);

        if (player != null) {
            player.getCommunication().finishRequest(type, ownerIndex, name);
        } else {
	        System.err.println("could not find player id=" + playerStaticIndex);
        }
	}
}
