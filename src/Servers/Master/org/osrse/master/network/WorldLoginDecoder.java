/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.master.network;

import org.osrse.MasterModule;
import org.osrse.Module;
import org.osrse.model.utility.Response;
import org.osrse.network.CommercialPackets;
import org.osrse.network.handler.MessageDecoder;
import org.osrse.master.model.World;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.utility.StreamUtilities;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/**
 * @author Jonathan
 */
public class WorldLoginDecoder extends FrameDecoder {

    @Override
    protected Object decode(ChannelHandlerContext chc, Channel channel, ChannelBuffer buffer) {
        Session session = Module.getManager().getSession(channel);
        if (buffer.readableBytes() >= 4) {
            int opcode = buffer.readByte() & 0xff;
            try {
                switch(CommercialPackets.WorldRequests.forId(opcode)) {
                    case INITIAL_REQUEST:
                        byte[] rsaArray = new byte[buffer.readShort() & 0xff];
                        buffer.readBytes(rsaArray);
                        ByteBuffer rsaBuffer = ByteBuffer.wrap(new BigInteger(rsaArray).modPow(MasterModule.getLogic().getBaseExponent(),
                                                                                               MasterModule.getLogic().getBaseModulus()).toByteArray());
                        int revision = rsaBuffer.get();
                            if (revision == 10) {
                                int[] is = { rsaBuffer.getInt(), rsaBuffer.getInt(), rsaBuffer.getInt(), rsaBuffer.getInt()};
                                int id = rsaBuffer.get();
                                int flag = rsaBuffer.get();
                                int online = rsaBuffer.getShort();
                                String address = StreamUtilities.getString(rsaBuffer);
                                String activity = StreamUtilities.getString(rsaBuffer);
                                session.setISAAC(is, true);
                                World w = new World(session, id, flag, address, activity);
                                w.setSyncing(online);
                                session.setAttachment(w);
                                MasterModule.getLogic().registerWorld(w);
                                channel.getPipeline().replace("decoder", "decoder", new MessageDecoder(Module.getManager().getMainNetwork()));
                            } else {
                                throw new IllegalStateException("Invalid RSA Encryption!");
                            }
                        break;
                    default:
                        throw new IllegalStateException("Invalid Request! "+ CommercialPackets.WorldRequests.forId(opcode));
                }
            } catch (Exception e) {
                e.printStackTrace();
                channel.write(new PacketBuilder(CommercialPackets.MasterResponse.LOGIN_RESPONSE).putByte(Response.ERROR.intValue()).toPacket()).addListener(ChannelFutureListener.CLOSE);
            }
        }
        return null;
    }

}
