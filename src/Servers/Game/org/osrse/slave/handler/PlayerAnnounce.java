package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedPerson;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class PlayerAnnounce extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {

		int playerStaticIndex = packet.getShort();
		String username = packet.getString();
		packet.recalculateBitPosition();
		int announceable = packet.getBits(1); //if there is a sync in process with that world, or this
		int worldId = packet.getBits(8);
		int privacy = packet.getBits(3);
		ReferencedPerson person = session.getPlayer(playerStaticIndex);
		if(person == null) {
			person = new ReferencedPerson(worldId, playerStaticIndex, privacy);
		} else {
			person.setIndex(worldId);
			person.setStatus(privacy);
		}
		person.setUsername(username);
		if(announceable == 0) {
			for(int i = 0; i < packet.remaining()/2; i++) {
				int key = packet.getShort();
				person.addFriend(key);
			}
		}
		session.appendReferencedPerson(announceable == 0, person);
	}
}
