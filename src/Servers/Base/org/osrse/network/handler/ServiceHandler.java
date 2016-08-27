package org.osrse.network.handler;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.*;
import org.osrse.Module;
import org.osrse.network.Packet;
import org.osrse.network.Session;

import java.io.IOException;


public class ServiceHandler extends SimpleChannelHandler {

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        Module.getManager().addSession(new Session(ctx.getChannel()));
    }

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        Module.getManager().remove(ctx.getChannel()).release();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
        if (!(e.getCause() instanceof IOException)) {
            System.err.println("Exception caught in networking!");
            e.getCause().printStackTrace();
        } else {
            e.getChannel().close();
        }
    }

    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) {
        if (e.getMessage() instanceof Packet) {
            Packet packet = (Packet) e.getMessage();
            ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
            if (!packet.isRaw()) {
                buffer.writeByte(packet.getOpcode());
                if (packet.getType() == Packet.Type.VAR_BYTE) {
                    buffer.writeByte(packet.getLength());
                } else if (packet.getType() == Packet.Type.VAR_SHORT) {
                    buffer.writeShort(packet.getLength());
                }
            }
            buffer.writeBytes(packet.getBuffer());
            Channels.write(ctx, e.getFuture(), buffer);
        }
    }

}

