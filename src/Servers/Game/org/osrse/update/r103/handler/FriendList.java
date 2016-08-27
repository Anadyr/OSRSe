package org.osrse.update.r103.handler;

import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.utility.NameUtilities;

/**
 * Created by Jonathan on 12/30/15
 */
public class FriendList extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        int opcode = packet.getOpcode();
         if (opcode == 248) {
            String username = NameUtilities.capitalizeFormat(packet.getString());
            int length = packet.getSmart();
            byte[] textBuffer = new byte[packet.getLength() - packet.getPosition()];
            packet.get(textBuffer);
            player.getCommunication().sendMessage(username, length, textBuffer);
        } else {
             String username = NameUtilities.capitalizeFormat(packet.readGJString2(0, packet.getLength() - 1));
             boolean dumbnigga =  username.equalsIgnoreCase(player.getUsername().replaceAll("_", " "));
             if(dumbnigga) {
                 player.sendMessage("You cant add yourself to your "+ (opcode == 164 ? "friends" : "ignore") +" list!");
                 return;
             }
             if (opcode == 164) {
                 player.getCommunication().addFriend(username);
                 System.out.println("Checking username-" + username);
             } else {
                 player.getCommunication().removeFriend(username);
                 System.out.println("removing username-" + username);
             }

        }
    }
}
