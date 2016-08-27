package org.osrse.game.network;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;
import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.model.utility.Response;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;

import java.security.SecureRandom;

/**
 * Created by Jonathan on 1/5/16.
 */
public class ReplayHandshake extends ReplayingDecoder<ReplayHandshake.Protocol> {
    public enum Protocol { Handshake, Login, FileTransfer, Disconnect }

    @Override
    protected Object decode(ChannelHandlerContext channelHandlerContext, Channel channel, ChannelBuffer channelBuffer, Protocol protocol) throws Exception {
        if(channelBuffer.readable()) {
            Session session = Module.getManager().getSession(channel);
            switch(protocol) {
                case Handshake:
                        checkpoint(handshake(channel, channelBuffer));
                    case Login:

                    case FileTransfer:
                        break;
                    case Disconnect:
                        break;
                default:
                    throw new Exception("Unknown decoding state: " + protocol);
            }
        }
        return null;
    }



    final Protocol handshake(Channel channel, ChannelBuffer buffer) {
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
                return Protocol.Login;
            case 15:
                PacketBuilder pb = new PacketBuilder();
                if(WorldModule.getLogic().hasSupportFor(clientRevision)) {
                    channel.write(pb.putByte(Response.CONTINUE.intValue()).toPacket());
                    channel.getPipeline().replace("decoder", "decoder", new FileServerDecoder());
                } else {
                    channel.write(pb.putByte(Response.CLIENT_UPDATED.intValue()).toPacket()).addListener(ChannelFutureListener.CLOSE);
                    return Protocol.Disconnect;

                }
                return Protocol.FileTransfer;
        }
        return Protocol.Login;
    }


}
