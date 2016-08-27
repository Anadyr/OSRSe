package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FCResponse extends PacketHandler<LoginSession> {

	@Override
	public void handle(LoginSession session, Packet packet) {
        int playerStaticIndex = packet.getShort();
        int type = packet.get();
        String name = packet.getString();
        int ownerIndex = packet.getShort();
        Player player = WorldModule.getLogic().getPlayerFromStaticIndex(playerStaticIndex);
		System.out.println(playerStaticIndex+"/"+type+"/"+name+"/"+ownerIndex);

        if (player != null) {
           /* if(type == 2) {
                String clan = packet.getString();
                int joinReq = packet.get();
                int kickReq = packet.get();
                int rankReq = packet.get();
                Communications com = new Communications(ownerIndex, name, clan, joinReq, kickReq);
                com.setFriendsList(1);
                com.setIgnoreList(1);
                WorldModule.getLogic().getClanData().put(ownerIndex, com);
                System.out.println(joinReq+"/"+kickReq+"/"+rankReq+"/"+ownerIndex+"/"+name+"/"+clan);
                if(rankReq >= 0) {

                    if(rankReq > 0) {
                        WorldModule.getLogic().getClanData().get(ownerIndex).putFriend(player.getUsername(), player.getStaticIndex(), rankReq);
                    }
                    player.getCommunication().setClanIdentifier(ownerIndex);
                    com.getClanChat().open();
                    if(com.joinResponse(player, true) != 0) {
                        System.err.println("Error with Clan chat force. Map full, or out of sync!");
                    }
                    player.getCommunication().currentCCName = com.getClanChat().getChatName();
                    if(rankReq > 0) {
            //wtf am i looking at LOLLLLL
                    }
                } else {
                    type = rankReq;
                }
            }*/
            player.getCommunication().finishRequest(type, ownerIndex, name);
        }
	}
}
