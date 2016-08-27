package org.osrse.update.r103.handler;

import org.osrse.game.content.container.WalkingContainer;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 1/12/14.
 */
public class Pathfinding extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        int lol = packet.getC();
        boolean run = lol == 1;
        int x = packet.getLEShortA();
        int y = packet.getLEShort();
        WalkingContainer.handleWalk(player, x, y, run);
    }
}
