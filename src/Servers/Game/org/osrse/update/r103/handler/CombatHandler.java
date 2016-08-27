package org.osrse.update.r103.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 1/12/16.
 */
public class CombatHandler extends PacketHandler<Player> {
    @Override
    public void handle(Player player, Packet packet) {
        if(packet.getOpcode() == 133) {
            boolean somebool = packet.getC() == 1;
            int ent = packet.getShort();
            WorldModule.getLogic().getCombat().attackMob(player, WorldModule.getLogic().getMobs().get(ent));
        } else {
            System.out.println(packet.getOpcode());
        }
    }
}
