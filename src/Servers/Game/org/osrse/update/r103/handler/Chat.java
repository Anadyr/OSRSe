package org.osrse.update.r103.handler;

import org.osrse.WorldModule;
import org.osrse.game.content.Commands;
import org.osrse.game.logic.masks.ChatMessage;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.utility.TextUtilities;

import java.util.Arrays;

/**
 * 251
 * Created by Jonathan on 12/27/15.
 */
public class Chat extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        if (packet.getOpcode() == 87) {
            handleText(player, packet);
        } else if(packet.getOpcode() != 251) {
            handlePreferences(player, packet);
        }
    }

    private void handleText(Player player, Packet packet) {
        int effect = packet.get();
        int color = packet.get();
        int ok = packet.get();
        int length = packet.getSmart();
        byte[] textBuffer = new byte[packet.getLength() - packet.getPosition()];
        packet.get(textBuffer);
        String text = TextUtilities.optimizeText(TextUtilities.decompressHuffman(textBuffer, length));
        boolean success = (text.startsWith("::"));
        if(text.startsWith("/")) {
            success = player.getCommunication().isInClanChat();
            if(success)
                player.getCommunication().sendClanMessage(text.substring(1));
        } else if(text.startsWith("::")) {
            String[] args = text.split(" ");
            String command = args[0].toLowerCase().split("::")[1];
            args = Arrays.copyOfRange(args, 1, args.length);
            success = Commands.handle(player, command, args);
        }
        if(!success) {
            ChatMessage msg = new ChatMessage(text, color, effect);
            player.getMasks().setChat(msg);
        }
    }

    private void handlePreferences(Player player, Packet packet) {
        int publicPref = packet.get();
        int friendPref = packet.get();
        int tradePref = packet.get();
        System.out.println(publicPref+"/"+friendPref+"/"+tradePref);
        if (friendPref != player.getStatus()) {
            player.setStatus(friendPref);
            player.getCommunication().informFriends(true);
        }
    }

}
