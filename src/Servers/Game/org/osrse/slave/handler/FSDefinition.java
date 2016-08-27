package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedPerson;

/**
 * Created by Jonathan on 8/25/2016.
 */
public class FSDefinition extends PacketHandler<LoginSession> {
	@Override
	public void handle(LoginSession session, Packet packet) {


		int playerStaticIndex = packet.getShort();
		Player player = WorldModule.getLogic().getPlayerFromStaticIndex(playerStaticIndex);
		int friendsList = packet.getSmart();
		int i = 0;
		System.out.println("Friends list size-"+friendsList);
		player.getCommunication().basic().setFriendsList(friendsList);
		if(friendsList != 0) {
			for(; i < friendsList; i++) {
				packet.recalculateBitPosition();
				int friendUID = packet.getBits(20);
				int friendRank = packet.getBits(3);
				boolean hasRelation = packet.getBits(1) == 1;
				if(hasRelation) {
					((ReferencedPerson) WorldModule.getLogic().getCommunicableNode(friendUID)).addFriend(playerStaticIndex);
				}
				player.getCommunication().basic().putFriend(packet.getString(), friendUID, friendRank);
			}
		}
		player.getProtocol().sendFriendList();
		int ignoreList = packet.getSmart();
		player.getCommunication().basic().setIgnoreList(ignoreList != 0 ? ignoreList : 1);
		if(ignoreList != 0) {
			for(; i < ignoreList; i++) {
				packet.recalculateBitPosition();
				int ignoreUID = packet.getBits(23);
				boolean hasRelation = packet.getBits(1) == 1;
				String name = packet.getString();
				if(hasRelation) {
					//should be really < .10 of the time, but still a safety precaution
					((ReferencedPerson) WorldModule.getLogic().getCommunicableNode(ignoreUID)).addFriend(playerStaticIndex);
				}
				player.getCommunication().basic().putIgnore(name, ignoreUID);
			}
		}
		player.getProtocol().sendIgnoreList();
	}
}
