/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.network;
import org.osrse.WorldModule;
import org.osrse.network.Packet;
import org.osrse.network.Session;
import org.osrse.utility.Configuration;
import org.osrse.game.logic.player.Player;
import org.osrse.network.AbstractPacketDispatcher;
import org.osrse.network.PacketHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class MultiPacketDispatcher extends AbstractPacketDispatcher<Player> {


    public MultiPacketDispatcher() {
        super(256);
    }

    public final void loadHandlers() {
        try {
            Configuration config = new Configuration(WorldModule.getProtocolDirectory("protocol.inf"));
            String[] handlerNames = config.getStringArray("packet_handler");
            for (int i = 0; i < handlerNames.length; i++) {
                if (handlerNames[i] != null) {
                    packetHandlers[i] = getHandler(handlerNames[i].replaceAll(" ", ""));
                }
            }
            String[] lengths = config.getStringArray("packet_lengths");
            if(lengths != null) {
                for (int i = 0; i < lengths.length; i++) {
                    if(lengths[i] != null) {
                        packetLength[i] = Integer.parseInt(lengths[i]);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading packet handlers!");
            e.printStackTrace();
        }
    }

    public void dispatchPacket(Player p, Packet packet) {
        PacketHandler handler = packetHandlers[packet.getOpcode()];
        if(handler != null) {
            handler.handle(p, packet);
        } else if(p.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
            p.sendMessage("Unhandled packet - "+packet.getOpcode());
        } else {
            System.err.println("Unhandled packet - "+packet.getOpcode()+", "+ p.toString());
        }
    }

    @Override
    protected PacketHandler<Player> getHandler(String name) {
        return WorldModule.getLogic().createHandler(name);
    }

    @Override
    public String getProtocolDispenser() {
        return WorldModule.getProtocolDirectory("protocol.inf");
    }
}
