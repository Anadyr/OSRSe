/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.network;

import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.network.AbstractPacketDispatcher;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 *
 * @author Jonathan
 */
public class MultiPacketDispatcher extends AbstractPacketDispatcher<Player> {


    public MultiPacketDispatcher() {
        super(256);
    }

	@Override
	public final void loadHandlers() {
        try {
	        String[] handlerNames = new String[256];
	        Module.js.call("packets_" + WorldModule.getLogic().getRevision() + ".load", handlerNames, packetLength);
	        for (int i = 0; i < handlerNames.length; i++) {
                if (handlerNames[i] != null) {
                    packetHandlers[i] = getHandler(handlerNames[i].replaceAll(" ", ""));
                }
            }
        } catch (Exception e) {
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
