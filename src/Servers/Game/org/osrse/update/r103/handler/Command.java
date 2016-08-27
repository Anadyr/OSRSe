package org.osrse.update.r103.handler;

import org.osrse.game.content.Commands;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

import java.util.Arrays;

/**
 * Created by Jonathan on 1/6/16.
 */
public class Command extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        String commandString = packet.readGJString2(0, packet.getLength() - 1);
        String[] args = commandString.split(" ");
        String command = args[0].toLowerCase();
        args = Arrays.copyOfRange(args, 1, args.length);
        Commands.handle(player, command, args);
    }
}
