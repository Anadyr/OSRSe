package org.osrse.update.r103.handler;

import org.osrse.WorldModule;
import org.osrse.game.content.container.ClanContainer;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.utility.NameUtilities;

/**
 * Created by Jonathan on 1/8/16.
 */
public class Clan extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        System.out.println("klol");
        if(packet.getLength() == 0) {
            ClanContainer.handleLeave(player); //leave cc
        } else {
            String cc = packet.readGJString2(0, packet.getLength()-1);
            ClanContainer.handleJoin(player, cc);
        }
    }
}
