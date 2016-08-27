package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FCMessage extends PacketHandler<World> {
	@Override
	public void handle(World world, Packet packet) {
		int from = packet.getShort();
				int rights = packet.get();
				int to = packet.getShort();
				int length = packet.getSmart();
				byte[] textBuffer = new byte[packet.getLength() - packet.getPosition()];
				packet.get(textBuffer);
				World w = MasterModule.getLogic().getWorldContaining(to);
				if(w != null)
					w.sendPrivateMessage(from, rights, w.retrieve(to).getIndex(), length, textBuffer);
	}
}