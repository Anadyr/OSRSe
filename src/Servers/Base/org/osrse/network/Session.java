package org.osrse.network;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.osrse.utility.Serviceable;
import org.osrse.utility.crypto.ISAAC;

import java.util.Arrays;

public class Session {
    private long sessionKey;
    private final Channel channel;
    private Serviceable attachment;
    private ISAAC inISAAC, outISAAC;

    public Session(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }


    /**
     * @param key Older RT3 Engine ISAAC
     *          Server Session setup
     */
    public void setKey(long key) {
        this.sessionKey = key;
    }

    public long getKey() {
        return sessionKey;
    }

    public Session setISAAC(int[] key, boolean server) {
        if (key != null) {
            if(server)
                outISAAC = new ISAAC(key);
            else
            inISAAC = new ISAAC(key);
            for (int i = 0; i < key.length; i++) {
                key[i] += 50;
            }
            if(server)
            inISAAC = new ISAAC(key);
            else
            outISAAC = new ISAAC(key);
        }
        return this;
    }

    public void setIn(ISAAC isaac) {
        this.inISAAC = isaac;
    }

    public ISAAC getIn() {
        return inISAAC;
    }

    public void setOut(ISAAC isaac) {
        this.outISAAC = isaac;
    }

    public ISAAC getOut() {
        return outISAAC;
    }

    /**
     * @return
     */
    public boolean isConnected() {
        return channel.isConnected();
    }

    public String getAddress() {
        return channel.getRemoteAddress().toString().substring(1, getChannel().getRemoteAddress().toString().indexOf(":"));
    }

    public byte[] getArrayedAddress() {
        byte[] shit = new byte[4];
        String[] shit2 = getAddress().split("\\.");
        for (int i = 0; i < 4; i++) {
            shit[i] = (byte) Integer.parseInt(shit2[i]);
        }
        return shit;
    }

    public Serviceable getAttachment() {
        return attachment;
    }

    public void setAttachment(Serviceable serviceable) {
        this.attachment = serviceable;
    }

    public void release() {
        if (attachment != null) {
            attachment.release(true);
        }
        close(); //check? not going to work
    }

    public ChannelFuture close() {
        return channel.close();
    }

    public ChannelFuture write(Packet packet) {
        if (packet == null || !channel.isConnected() || !channel.isOpen()) {
            return null;
        }
        if (getOut() != null && packet.getOpcode() != -1) {
            packet.setOpcode((packet.getOpcode() + getOut().getNextValue()) & 0xff);
        }
        //System.out.println("Packet out id="+packet.getOpcode()+", length="+packet.getLength());
        return channel.write(packet);
    }

    /**
     * Sends one packet as multiple, with Issac on each sub packet
     * @param main
     * @param subs
     * @return
     */
    public ChannelFuture writeSubPackets(PacketBuilder main, Packet... subs) {
        if (!channel.isConnected() || !channel.isOpen()) {
            return null;
        }
        if (main != null && getOut() != null && main.getOpcode() != -1) {
            main.setOpcode((main.getOpcode() + getOut().getNextValue()) & 0xff);
        }
        for(Packet p : subs) {
            if (getOut() != null) {
                p.setOpcode((p.getOpcode() + getOut().getNextValue()) & 0xff);
            }
            if(main == null) {
                main = new PacketBuilder(p.getOpcode(), p.getType());
                main.put(p.getBytes());
            } else {
                main.putByte(p.getOpcode());
                main.putShort(p.getLength());
                main.put(p.getBytes());
            }
        }
        //System.out.println("Packet out "+main.getOpcode()+", length="+main.getPosition()+", array="+ Arrays.toString(main.toPacket().getBytes()));
        return channel.write(main.toPacket());
    }

    @Override
    public String toString() {
        return attachment.toString();
    }
}
