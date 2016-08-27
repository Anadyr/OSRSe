package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.CommercialPackets;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FSMessage extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {
			int playerStaticIndex = packet.getShort();
			int rights = packet.get();
			int to = packet.getShort();
			int length = packet.getSmart();
			byte[] textBuffer = new byte[packet.getLength() - packet.getPosition()];
			packet.get(textBuffer);
			Player player = WorldModule.getLogic().getPlayers().get(to);
			player.getCommunication().sendMessageFrom(WorldModule.getLogic().getLoginSession().getPlayer(playerStaticIndex).getUsername(),
					WorldModule.getLogic().getLoginSession().getPlayer(playerStaticIndex).getWorldId(), rights, length, textBuffer);
	}
}

