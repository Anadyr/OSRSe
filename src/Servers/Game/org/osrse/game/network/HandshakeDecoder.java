/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osrse.game.network;

import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.model.utility.Response;
import org.osrse.network.Session;
import org.osrse.network.PacketBuilder;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import java.security.SecureRandom;

/**
 *
 * @author Jonathan
 */
public class HandshakeDecoder extends FrameDecoder {

    @Override
    protected Object decode(ChannelHandlerContext chc, Channel channel, ChannelBuffer buffer) throws Exception {
        if (buffer.readable()) {
            int handShakeOpcode = buffer.readByte() & 0xff;
            int clientRevision = handShakeOpcode == 14 ? 0 : buffer.readInt();
            switch (handShakeOpcode) {
                case 14:
                    if(buffer.readableBytes() == 1) {
                        buffer.readByte(); // <= 377
                        channel.write(new PacketBuilder().putLong(0).putByte(Response.CONTINUE.intValue()).putLong(new SecureRandom().nextLong()).toPacket());
                    } else {
                        channel.write(new PacketBuilder().putByte(Response.CONTINUE.intValue()).toPacket());
                    }
                    channel.getPipeline().replace("decoder", "decoder", new LoginDecoder());
                    break;
                case 15:
                    PacketBuilder pb = new PacketBuilder();
                    if(WorldModule.getLogic().hasSupportFor(clientRevision)) {
                        channel.write(pb.putByte(Response.CONTINUE.intValue()).toPacket());
                        channel.getPipeline().replace("decoder", "decoder", new FileServerDecoder());
                    } else {
                        channel.write(pb.putByte(Response.CLIENT_UPDATED.intValue()).toPacket()).addListener(ChannelFutureListener.CLOSE);
                    }
                    break;
                case 17://custom wl on 83
                    if(clientRevision == WorldModule.getLogic().getRevision()) {
                        Session session = Module.getManager().getSession(channel);
                        session.setKey(clientRevision);
                        WorldModule.getLogic().sendResponse(session);
                    }
                    break;
            }
        }
        return null;
    }
}