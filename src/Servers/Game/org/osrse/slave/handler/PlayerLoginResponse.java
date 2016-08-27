package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.model.utility.Response;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class PlayerLoginResponse extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {
		int playerStaticIndex = packet.getShort();
		Player player = WorldModule.getLogic().getPlayerFromStaticIndex(playerStaticIndex);
		Response resp = Response.valueFor(packet.get());
		boolean sendFriendList = packet.getBoolean();
		if(resp == Response.LOGIN)
			player.setAttribute("com", sendFriendList);
		WorldModule.getLogic().finishPlayerLogin(resp, player);
	}
}
