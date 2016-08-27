package org.osrse.network;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferOutputStream;
import org.jboss.netty.buffer.ChannelBuffers;
import org.osrse.utility.Identifyable;
import org.osrse.utility.TextUtilities;

import java.io.ObjectOutputStream;


public class PacketBuilder {
    private int bitPosition;
    private ChannelBuffer buffer;
    private int opcode;
    private Packet.Type type;

    public PacketBuilder() {
        this(-1);
    }

    public PacketBuilder(int opcode) {
        this(opcode, 128);
    }

    public PacketBuilder(int opcode, int size) {
        this.opcode = opcode;
        this.type = Packet.Type.FIXED;
        this.buffer = ChannelBuffers.dynamicBuffer(size);
    }

    public PacketBuilder(int opcode, Packet.Type type) {
        this.opcode = opcode;
        this.type = type;
        this.buffer = ChannelBuffers.dynamicBuffer();
    }

    public PacketBuilder(Identifyable identifyable, Packet.Type varByte) {
        this(identifyable.getId(), varByte);
    }

    public PacketBuilder(Identifyable identifyable) {
        this(identifyable.getId());
    }

    public void setOpcode(int opcode) {
        this.opcode = opcode;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getPosition() {
        return buffer.writerIndex();
    }

    public PacketBuilder put(ChannelBuffer b) {
        buffer.writeBytes(b);
        return this;
    }

    public PacketBuilder put(byte b) {
        buffer.writeByte(b);
        return this;
    }

    public PacketBuilder put(byte[] bytes) {
        buffer.writeBytes(bytes);
        return this;
    }

    public PacketBuilder put(byte[] bytes, int offset, int length) {
        buffer.writeBytes(bytes, offset, length);
        return this;
    }

    public PacketBuilder putA(byte b) {
        buffer.writeByte((byte) ((b & 0xff) + 128));
        return this;
    }

    public PacketBuilder putA(byte[] src) {
        putA(src, 0, src.length);
        return this;
    }

    public PacketBuilder putA(byte[] src, int offset, int length) {
        for (int i = 0; i < length; i++) {
            putA(src[i]);
        }
        return this;
    }

    public PacketBuilder putBackwardsInt(int[] seed) {
        putBackwardsInt(seed, 0, seed.length);
        return this;
    }

    public PacketBuilder putBackwardsInt(int[] src, int offset, int length) {
        for (int i = length - 1; i >= offset; i--) {
            putInt(src[i]);
        }
        return this;
    }

    public PacketBuilder putBackwards(byte[] src) {
        putBackwards(src, 0, src.length);
        return this;
    }

    public PacketBuilder putBackwards(byte[] src, int offset, int length) {
        for (int i = length - 1; i >= offset; i--) {
            put(src[i]);
        }
        return this;
    }

    public PacketBuilder putBackwardsA(byte[] src) {
        putBackwards(src, 0, src.length);
        return this;
    }

    public PacketBuilder putBackwardsA(byte[] src, int offset, int length) {
        for (int i = length - 1; i >= offset; i--) {
            putA(src[i]);
        }
        return this;
    }

    public PacketBuilder putBackwardsC(byte[] src) {
        putBackwards(src, 0, src.length);
        return this;
    }

    public PacketBuilder putBackwardsC(byte[] src, int offset, int length) {
        for (int i = length - 1; i >= offset; i--) {
            putC(src[i]);
        }
        return this;
    }

    public PacketBuilder putBackwardsS(byte[] src) {
        putBackwards(src, 0, src.length);
        return this;
    }

    public PacketBuilder putBackwardsS(byte[] src, int offset, int length) {
        for (int i = length - 1; i >= offset; i--) {
            putS(src[i]);
        }
        return this;
    }

    public PacketBuilder putBits(int numBits, int value) {
        /* Prepare for adding bits */
        int bytePos = bitPosition >> 3;
        int bitOffset = 8 - (bitPosition & 7);
        bitPosition += numBits;
        int pos = (bitPosition + 7) / 8;
        while (pos + 1 > buffer.capacity()) {
            buffer.writeByte((byte) 0); // Netty does not provide any other way
            // of resizing the buffer.
        }
        buffer.writerIndex(pos);
        /* Write the bits */
        byte b;
        for (; numBits > bitOffset; bitOffset = 8) {
            b = buffer.getByte(bytePos);
            buffer.setByte(bytePos, (byte) (b & ~Packet.BIT_MASK[bitOffset]));
            buffer.setByte(bytePos, (byte) (b | (value >> (numBits - bitOffset)) & Packet.BIT_MASK[bitOffset]));
            bytePos++;
            numBits -= bitOffset;
        }
        b = buffer.getByte(bytePos);
        if (numBits == bitOffset) {
            buffer.setByte(bytePos, (byte) (b & ~Packet.BIT_MASK[bitOffset]));
            buffer.setByte(bytePos, (byte) (b | value & Packet.BIT_MASK[bitOffset]));
        } else {
            buffer.setByte(bytePos, (byte) (b & ~(Packet.BIT_MASK[numBits] << (bitOffset - numBits))));
            buffer.setByte(bytePos, (byte) (b | (value & Packet.BIT_MASK[numBits]) << (bitOffset - numBits)));
        }
        return this;
    }

    public PacketBuilder setByte(int pos, int value) {
        buffer.setByte(pos, value);
        return this;
    }

    public PacketBuilder putByte(int i) {
        buffer.writeByte((byte) i);
        return this;
    }

    public PacketBuilder putByteA(int i) {
        buffer.writeByte((byte) (i + 128));
        return this;
    }

    public PacketBuilder putByteC(int i) {
        buffer.writeByte((byte) -i);
        return this;
    }

    public PacketBuilder putByteS(int i) {
        buffer.writeByte(128 - i);
        return this;
    }

    public PacketBuilder putC(byte b) {
        buffer.writeByte((byte) -(b & 0xff));
        return this;
    }

    public PacketBuilder putGJString2(String string) {
        byte[] packed = new byte[TextUtilities.calculateGJString2Length(string)];
        int length = TextUtilities.packGJString2(0, packed, string);
        putByte(0).put(packed, 0, length).putByte(0);
        return this;
    }

    public PacketBuilder putInt(int i) {
        buffer.writeInt(i);
        return this;
    }

    public PacketBuilder putInt1(int i) {
        buffer.writeByte((byte) (i >> 8));
        buffer.writeByte((byte) i);
        buffer.writeByte((byte) (i >> 24));
        buffer.writeByte((byte) (i >> 16));
        return this;
    }

    public PacketBuilder putInt2(int i) {
        buffer.writeByte((byte) (i >> 16));
        buffer.writeByte((byte) (i >> 24));
        buffer.writeByte((byte) i);
        buffer.writeByte((byte) (i >> 8));
        return this;
    }

    public PacketBuilder putLEInt(int i) {
        buffer.writeByte((byte) i);
        buffer.writeByte((byte) (i >> 8));
        buffer.writeByte((byte) (i >> 16));
        buffer.writeByte((byte) (i >> 24));
        return this;
    }

    public PacketBuilder putLEShort(int i) {
        buffer.writeByte((byte) i);
        buffer.writeByte((byte) (i >> 8));
        return this;
    }

    public PacketBuilder putLEShortA(int i) {
        buffer.writeByte((byte) (i + 128));
        buffer.writeByte((byte) (i >> 8));
        return this;
    }

    public PacketBuilder putLong(long l) {
        buffer.writeLong(l);
        return this;
    }

    public PacketBuilder putObject(Object object) {
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new ChannelBufferOutputStream(buffer));
            stream.writeObject(object);
            stream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public PacketBuilder putRS2String(String string) {
        put(string.getBytes()).putByte(10);
        return this;
    }

    public PacketBuilder putS(byte b) {
        buffer.writeByte((byte) (128 - (b & 0xff)));
        return this;
    }

    public PacketBuilder putS(byte[] src) {
        putS(src, 0, src.length);
        return this;
    }

    public PacketBuilder putS(byte[] src, int offset, int length) {
        for (int i = 0; i < length; i++) {
            putS(src[i]);
        }
        return this;
    }

    public PacketBuilder putShort(int i) {
        buffer.writeShort((short) i);
        return this;
    }

    public PacketBuilder putShortA(int i) {
        buffer.writeByte((byte) (i >> 8));
        buffer.writeByte((byte) (i + 128));
        return this;
    }

    public PacketBuilder putSmart(int i) {
        if (i >= 128) {
            putShort(i + 32768);
        } else {
            putByte(i);
        }
        return this;
    }

    public PacketBuilder putSmartA(int i) {
        if (i >= 128) {
            putShort(i + '\u8000');
        } else {
            putByte(i);
        }
        return this;
    }


    public PacketBuilder putSmartInt(int i) {
        if (i < 65535) {
            putShort(i + 32768);
        } else {
            putInt(i);
        }
        return this;
    }


    public PacketBuilder putString(String string) {
        put(string.getBytes()).putByte(0);
        return this;
    }

    public PacketBuilder putTriByte(int i) {
        buffer.writeByte((byte) (i >> 16));
        buffer.writeByte((byte) (i >> 8));
        buffer.writeByte((byte) i);
        return this;
    }

    public PacketBuilder putVariable(int i) {
        if ((~0x7f & i) != 0) {
            if ((i & ~0x3fff) != 0) {
                if ((i & ~0x1fffff) != 0) {
                    if ((~0xfffffff & i) != 0)
                        putByte(i >>> 28 | 0x80);
                    putByte((0x101e39d8 | i) >>> 21);
                }
                putByte(i >>> 14 | 0x80);
            }
            putByte(i >>> 7 | 0x80);
        }
        putByte(i & 0x7f);
        return this;
    }

    /**
     * This is to be called if you are adding bits when the offset is not 0.
     *
     * @return
     */
    public PacketBuilder recalculateBitPosition() {
        bitPosition = buffer.writerIndex() * 8;
        return this;
    }

    public Packet toPacket() {
        return new Packet(opcode, buffer.writerIndex(), type, buffer);
    }

    public PacketBuilder putBoolean(boolean b) {
        return putByte(b ? 1 : 0);
    }
}
