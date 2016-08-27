package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FCPrivacy extends PacketHandler<World> {
	@Override
	public void handle(World world, Packet packet) {
		int pDynamicWorldID = packet.getShort();
		int privacyDetails = packet.get();
		System.out.println("Privacy edit="+pDynamicWorldID+", det="+privacyDetails);
		MasterModule.getLogic().editPlayer(world, world.searchComponent(pDynamicWorldID), privacyDetails);
	}
}