/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.update.r103.handler;


import org.osrse.Module;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * @author Jonathan
 */
public class Button extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        if (packet.getOpcode() == 255) {
            return;
        }
        if (player.hasAttribute("cutScene")) {
            return;
        }
        int widgetId = packet.getInt();
        int interfaceId = widgetId >> 16;
        int button = widgetId & 0xffff;
        int itemIndex = packet.getShort() & 0xffff;
        int otherIndex = packet.getShort();

        if (player.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
            player.sendMessage("button: i=" + interfaceId + ", c=" + button + ", idx=" + itemIndex + ", sdx=" + otherIndex);
        }
        String script = (String) Module.js.call("interfaces/button_container.findButtonScript", interfaceId, button, itemIndex, otherIndex);
        if (script.equalsIgnoreCase("unhandled")) {
            if (player.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
                player.sendMessage("unhandled button: interface=" + interfaceId + ", button=" + button + ", itemIndex=" + itemIndex + ", secondIndex=" + otherIndex);
            }
        } else {
            Module.js.call("interfaces/" + script, player, interfaceId, button, itemIndex, otherIndex);
        }
    }
}
