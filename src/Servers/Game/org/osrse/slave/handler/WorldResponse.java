package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.model.utility.Response;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class WorldResponse extends PacketHandler<LoginSession> {

	@Override
	public void handle(LoginSession session, Packet packet) {
		Response response = Response.valueFor(packet.get());
		if (response != Response.LOGIN) {
			throw new RuntimeException("LS Mismatch! - " + response);
		}
		int yakuleet = WorldModule.getLogic().getPlayers().size();
		int worldAmt = packet.get();
		session.appendWorld(worldAmt, packet);
		if(yakuleet > 0) {
			session.sendSync();
		}
	}
}
