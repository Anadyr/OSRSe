package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class PFinishLogin extends PacketHandler<World> {
	@Override
	public void handle(World world, Packet packet) {
		int playerIdentity = packet.getShort();
		MasterModule.getLogic().registerPlayer(packet, world, playerIdentity);
	}
}