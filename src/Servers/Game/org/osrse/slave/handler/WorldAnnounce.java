package org.osrse.slave.handler;

import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class WorldAnnounce extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {
		session.appendWorld(1, packet);
	}
}
