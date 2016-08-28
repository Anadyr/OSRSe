package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.master.model.player.GameRequest;
import org.osrse.master.model.player.GlobalPlayer;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FSDefinedReq extends PacketHandler<World> {

	@Override
	public void handle(World world, Packet packet) {
		int from = packet.getShort();
		int bitInfo = packet.get();
		boolean ignoreList = (bitInfo & 1) != 0;
		boolean clanRequest = (bitInfo & 2) != 0;
		boolean remove = (bitInfo & 4) != 0;
		boolean hasTheirIndex = (bitInfo & 8) != 0;

		String name = "";
		int index = -1;
		if(hasTheirIndex) {
			index = packet.getShort();
		} else {
			name = packet.getString();
		}
		GameRequest request = new GameRequest(from, index);
		request.setType(Communications.Request.FIND);
		request.setName(name);
		request.setIgnore(ignoreList);
		request.setRemove(remove);
		request.setClanRequest(clanRequest);
		if(clanRequest) {
			request.setType(Communications.Request.FIND_CLAN);
			Communications clanToJoin = hasTheirIndex ? MasterModule.getLogic().getCommunications(index) : MasterModule.getLogic().forName(name);
			if(clanToJoin != null && clanToJoin.isLoaded()) {
				GlobalPlayer playerJoining = MasterModule.getLogic().getPlayer(request.getStaticIndex());
				MasterModule.getLogic().setInChat(request.getIndex(), clanToJoin);
				if(clanToJoin.getClanChat().isValid() && !clanToJoin.getClanChat().isOpen()) {
					clanToJoin.getClanChat().open();
				}
				int response = clanToJoin.joinResponse(playerJoining, true);
				System.out.println("Response join="+response);
				request.setIndex(clanToJoin.uid);
				if(response == 0) {
					request.clanname = clanToJoin.getClanChat().getChatName();
					MasterModule.getLogic().addPlayerToCC(world, clanToJoin, playerJoining, remove);
				} else {
					request.ignore = true;
					request.clanRank = -response;
				}
				if(!remove)
					world.sendRequest(request);
				return;
			}
		}
		if(index != -1 && !clanRequest) {
			request.setType(remove ? Communications.Request.DEL : Communications.Request.ADD);
			World w1 = MasterModule.getLogic().getWorldContaining(index);
			if (w1 != null) {
				int old = remove ? 1 : 0;
				int old2 = ignoreList ? 2:0;
				w1.editRelationBetween(from, index, (old+old2)); //remove or adding to a list
			}
		}
		MasterModule.getLogic().worker().dispatch(request);
	}

}
