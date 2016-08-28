package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.utility.NameUtilities;

import java.util.Map;

/**
 * Created by Jonathan on 8/26/2016.
 */
public class CCEdit extends PacketHandler<LoginSession> {

	@Override
	public void handle(LoginSession loginSession, Packet packet) {
		boolean remove = packet.getBoolean();
		int ccuid = packet.getInt();
		int uidOfEdit = packet.getInt();
		String username = NameUtilities.longToString(packet.getLong());
		int newccRank = packet.get();

		Communications cc = WorldModule.getLogic().getClanData().get(ccuid);
		if(cc != null) {
			Communicable foreigner = WorldModule.getLogic().getCommunicableNode(uidOfEdit);
			cc.putRelation(foreigner, newccRank);
			if (remove) {
				cc.getClanChat().remove(username);
			} else {
				cc.getClanChat().add(foreigner);
			}
			for (Map.Entry<String, Communicable> c : cc.getClanChat().getInChat().entrySet()) {
				if (c.getValue().getWorldId() == WorldModule.getLogic().getId()) {
					WorldModule.getLogic().getPlayerFromStaticIndex(c.getValue().getStaticIndex()).getProtocol().editCCMember(username, foreigner.getWorldId(), newccRank, remove);
				}
			}
		} else {
			//should probably send master server a request on clan data.
		}
	}
}
