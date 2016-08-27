package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

import java.util.Map;

/**
 * Created by Jonathan on 8/26/2016.
 */
public class USELESS extends PacketHandler<LoginSession> {

	@Override
	public void handle(LoginSession loginSession, Packet packet) {
		int requester = packet.getInt();
		int owner = packet.getInt();
		int resp = packet.get();
		String username = packet.getString();

		Player p = WorldModule.getLogic().getPlayerFromStaticIndex(requester);
		Communications com = WorldModule.getLogic().getClanData().get(owner);
		if(resp != 0) {
				p.getCommunication().finishRequest(resp, owner, com == null ? username : com.username());
		} else if(com != null && com.joinResponse(p, true) != 0) {
			for(Map.Entry<String, Communicable> comm : com.getClanChat().getInChat().entrySet()) {
				if(comm.getValue().getWorldId() == WorldModule.getLogic().getId()) {
					//later check if they are still in cc otherwise update shit
					Player p1 = WorldModule.getLogic().getPlayerFromStaticIndex(comm.getValue().getStaticIndex());

					if(comm.getValue().getStaticIndex() == requester) {
						p1.getProtocol().sendClanChat(com);
					} else {
						p1.getProtocol().editCCMember(p.getUsername(), WorldModule.getLogic().getId(), com.getRank(requester).getId(), false);
					}
				}
			}
		} else {
			p.sendMessage("System busy - please try again later."); //hm
		}

	}
}
