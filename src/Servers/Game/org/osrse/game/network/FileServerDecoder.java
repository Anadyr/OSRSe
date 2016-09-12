/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.network;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;
import org.osrse.game.file.Library;
import org.osrse.network.Packet;
import org.osrse.task.Engine;

import java.util.LinkedList;
 
public class FileServerDecoder extends FrameDecoder {
    
    @Override
    protected Object decode(ChannelHandlerContext chx, final Channel channel, ChannelBuffer buffer) throws Exception {
        final LinkedList<int[]> requests = new LinkedList<int[]>(); 
        while (buffer.readableBytes() >= 4) { 
            final int opcode = buffer.readByte() & 0xff;
            final int index = buffer.readByte() & 0xff;
            final int file = buffer.readShort() & 0xffff;
            switch (opcode) {
                case 0:
                    requests.add(new int[]{index, file});
                    break;
                case 1:
                    Runnable r = new Runnable() {
                        public void run() {
                            try {
                                Packet filePacket = Library.rs2Store.prepareFilePacket(0, index, file);
                                if (filePacket != null) {
                                    channel.write(filePacket);
                                }
                            } catch (Exception e) {
	                            System.err.println("Error handling file [opcode=" + opcode + ", id=" + index + ", file=" + file + "]");
	                            e.printStackTrace();
                            }
                        }
                    };
                    if (index == 255 && file == 255) {
                        r.run();
                    } else {
                        Engine.getFileWorker().submit(r);
                    }
                    break;
                case 3:
                    requests.clear();
                    break;

            }
        }
        if (!requests.isEmpty()) {
            Engine.getFileWorker().submit(new Runnable() {
                public void run() {
                    while (requests.size() > 0) {
                        int[] req = requests.removeFirst();
                        try {
                                Packet filePacket = Library.rs2Store.prepareFilePacket(1, req[0], req[1]);
                            if (filePacket != null) {
                                channel.write(filePacket);
                            }
                        } catch (Exception e) {
	                        System.err.println("Error handling file [opcode=0, id=" + req[0] + ", file=" + req[1] + "]");
	                        e.printStackTrace();
                        }
                    }
                }
            });
        }
        return null;
    }

}
