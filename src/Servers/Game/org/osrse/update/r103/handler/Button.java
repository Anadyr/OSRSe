/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.update.r103.handler;


import org.osrse.game.content.container.ButtonContainer;
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
        int widgetId = packet.getInt();
        int interfaceId = widgetId >> 16;
        int button = widgetId & 0xffff;
        int itemIndex = packet.getShort() & 0xffff;
        int ok = packet.getShort();

        ButtonContainer.handleButton(player, widgetId, interfaceId, button, itemIndex);
    }
}
