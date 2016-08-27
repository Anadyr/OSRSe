package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class CCEditSettings extends PacketHandler<World> {

	@Override
	public void handle(World world, Packet packet) {
		int actionOwner = packet.getInt();
		int clanOwnerIndex = packet.getInt();

		int bitInfo = packet.get();

		boolean kick = (bitInfo & 1) != 0;
		boolean rankEdit = (bitInfo & 2) != 0;
		boolean ccJoinEdit = (bitInfo & 4) != 0;
		boolean ccKickEdit = (bitInfo & 8) != 0;
		Communications clanToJoin =  MasterModule.getLogic().getCommunications(clanOwnerIndex);
		if(kick) {
			//clanToJoin.
		} else if(rankEdit) {

		} else if(ccJoinEdit) {

		} else if(ccKickEdit) {

		}
	}
}