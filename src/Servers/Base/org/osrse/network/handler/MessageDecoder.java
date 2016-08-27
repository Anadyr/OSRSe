package org.osrse.network.handler;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;
import org.osrse.Module;
import org.osrse.network.Packet;
import org.osrse.network.ServiceManager;
import org.osrse.network.Session;


public class MessageDecoder extends FrameDecoder {

    private final ServiceManager.Network network;

    public MessageDecoder(ServiceManager.Network network) {
        this.network = network;
    }

    @Override
    protected Object decode(ChannelHandlerContext chc, Channel channel, ChannelBuffer buffer) throws Exception {
        Session session = Module.getManager().getSession(channel);
        if (buffer.readableBytes() >= 1) {
            buffer.markReaderIndex();
            int opcode = buffer.readByte() & 0xff;
            if(session.getIn() != null) {
                opcode = opcode - session.getIn().getNextValue() & 0xff;
            }
            int length = network.getProtocol().getLength(opcode);
            switch (length) {
                case -1:
                    length = buffer.readByte() & 0xff;
                    break;
                case -2:
                    length = buffer.readShort() & 0xffff;
                    break;
                case -3:
                    System.err.println("Invalid message length [opcode=" + opcode + ", length=" + length + "] avail='" + buffer.readableBytes() + "'");
                    length = buffer.readableBytes();
                    break;
            }
            if (buffer.readableBytes() >= length) {
                ChannelBuffer data = ChannelBuffers.buffer(length);
                buffer.readBytes(data, 0, length);
                data.setIndex(0, length);
                if (session != null && session.isConnected()) {
                    network.getProtocol().dispatchPacket(session.getAttachment(), new Packet(opcode, length, null, data));
                }
            } else {
                buffer.resetReaderIndex();
                return null;
            }
        }
        return null;
    }
}
