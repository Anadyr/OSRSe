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
		//System.out.println("hasindex="+hasTheirIndex+", index="+index+", name="+name+", req="+clanRequest);
		if(clanRequest) {
			//if remove leave cc
			Communications clanToJoin = hasTheirIndex ? MasterModule.getLogic().getCommunications(index) : MasterModule.getLogic().forName(name);
			if(clanToJoin != null && clanToJoin.isLoaded()) {
				request.setValid(false);
				//System.out.println("Found Comm! "+clanToJoin.username());
				MasterModule.getLogic().setInChat(request.getIndex(), clanToJoin);
				GlobalPlayer playerJoining = MasterModule.getLogic().getPlayer(request.getStaticIndex());
				if(clanToJoin.getClanChat().isValid() && !clanToJoin.getClanChat().isOpen()) {
					clanToJoin.getClanChat().open();
				}
				int response = clanToJoin.joinResponse(playerJoining, true);
				if(response == 0) {
					MasterModule.getLogic().addPlayerToCC(world, clanToJoin, playerJoining, remove);
				} else {
					request.clanRank = -response;
				}
				request.clanname = clanToJoin.getClanChat().getChatName();
				world.sendRequest(request);
				return;
			} else {
				//check this, maybe wrong when they have no friends, ignores or clan setup...
				//System.out.println("FIND CLAN");
				request.setType(Communications.Request.FIND_CLAN);
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
