package org.osrse.slave.handler;

import org.osrse.game.logic.player.PlayerCommunication;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedPerson;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FSListEdit extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {
		int playerStaticIndex = packet.getShort();
		int them = packet.getShort();
		int removedFrom = packet.get();
		ReferencedPerson p = session.getPlayer(them);
		if (removedFrom == 0) {
			p.addFriend(playerStaticIndex);
		} else if (removedFrom == 1) {
			p.removeFriend(playerStaticIndex);
		} else if (removedFrom == 2) {
			p.addIgnore(playerStaticIndex);
		} else if (removedFrom == 3) {
			p.removeIgnore(playerStaticIndex);
		} else {
			throw new IndexOutOfBoundsException("invalid list edit");
		}
		PlayerCommunication.appendInteraction(p); //todo single update

	}
}
