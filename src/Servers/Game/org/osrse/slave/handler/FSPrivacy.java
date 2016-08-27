package org.osrse.slave.handler;

import org.osrse.game.logic.player.PlayerCommunication;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedPerson;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FSPrivacy extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {
		int playerStaticIndex = packet.getShort();
		int basicMatterId = packet.get();
		if (basicMatterId != 3) {
			ReferencedPerson p = session.getPlayer(playerStaticIndex);
			p.setStatus(basicMatterId);
			PlayerCommunication.appendInteraction(p);
		} else {
			session.releasePerson(playerStaticIndex);
		}
	}
}
