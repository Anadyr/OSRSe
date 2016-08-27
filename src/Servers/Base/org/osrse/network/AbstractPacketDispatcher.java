/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.network;

import org.osrse.utility.Configuration;
import org.osrse.utility.Serviceable;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @param <P> the destroyable entity
 * @author Jonathan
 */
public abstract class AbstractPacketDispatcher<P extends Serviceable> {

    /**
     * The logger for this class.
     */
    protected static final Logger logger = Logger.getLogger(AbstractPacketDispatcher.class.getName());

    protected PacketHandler[] packetHandlers;
    protected int[] packetLength;

    protected AbstractPacketDispatcher(int maximum) {
        packetLength = new int[maximum];
        for (int i = 0; i < maximum; i++) {
            packetLength[i] = -3;
        }
        packetHandlers = new PacketHandler[maximum];
    }

    public void dispatchPacket(P p, Packet packet) {
        PacketHandler handler = packetHandlers[packet.getOpcode()];
        if (handler != null) {
            handler.handle(p, packet);
        } else {
            logger.log(Level.WARNING, "Unhandled packet - " + packet.getOpcode() + ", " + p.toString());
        }
    }

    public String getProtocolDispenser() {
        return "";
    }

    protected PacketHandler getHandler(String name) {
        return null;
    }

    public int getLength(int opcode) {
        return packetLength[opcode];
    }

    public void loadHandlers() {
        try {
            int count = 0;
            Configuration config = new Configuration(getProtocolDispenser());
            String[] handlerNames = config.getStringArray("packet_handler");
            for (int i = 0; i < handlerNames.length; i++) {
                if (handlerNames[i] != null) {
                    PacketHandler handler = getHandler(handlerNames[i].replaceAll(" ", ""));
                    packetHandlers[i] = handler;
                    count++;
                }
            }
            String[] lengths = config.getStringArray("packet_lengths");
            if(lengths != null) {
                for (int i = 0; i < lengths.length; i++) {
                    if(lengths[i] != null) {
                        packetLength[i] = Integer.parseInt(lengths[i]);
                    }  else {
                        packetLength[i] = -3;
                    }
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error loading packet handlers!");
            e.printStackTrace();
        }
    }
}
