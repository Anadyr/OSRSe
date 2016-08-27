package org.osrse.utility;

import org.jboss.netty.buffer.ChannelBuffer;
import org.osrse.network.Packet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class StreamUtilities {

    private static final char[] CHARACTERS = {
            '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
            '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
            '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
            '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
            '\u203a', '\u0153', '\0', '\u017e', '\u0178'
    };

    public static String getRS2String(ByteBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.get() & 0xff) != 10) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getRS2String(ChannelBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.readByte() & 0xff) != 10) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getRS2String(InputStream in) throws IOException {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = in.read()) != 10 && i != -1) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static int getSmart(InputStream in) throws IOException {
        int value = in.read();
        if (value == -1)
            throw new IOException("EOF");
        if (value < 128)
            return value;
        int value2 = in.read();
        if (value == -1)
            throw new IOException("EOF");
        return value << 8 | value2 - 32768;
    }

    public static int getSmartOld(ByteBuffer in) {
        int value = in.get() & 0xff;
        if (value < 128)
            return value;
        value = value << 8;
        value += (in.get() & 0xff);
        return value - 32768;
    }

    public static int getSmart(ByteBuffer in) {
        try {
            int value = in.get() & 0xff;
            if (value == -1)
                throw new IOException("EOF");
            if (value < 128)
                return value;
            int value2 = in.get() & 0xff;
            if (value == -1)
                throw new IOException("EOF");
            return (value << 8 + value2) - 32768;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getSmart(ChannelBuffer in) throws IOException {
        int value = in.readByte();
        if (value == -1)
            throw new IOException("EOF");
        if (value < 128)
            return value;
        int value2 = in.readByte();
        if (value == -1)
            throw new IOException("EOF");
        return value << 8 | value2 - 32768;
    }

    public static String getString(ByteBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.get() & 0xff) != 0) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getString(ChannelBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.readByte() & 0xff) != 0) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getUString(ChannelBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.readByte()) != 0) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getUString(ByteBuffer buffer) {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = buffer.get()) != 0) {
            string.append((char) i);
        }
        return string.toString();
    }

    public static String getString(InputStream in) throws IOException {
        StringBuilder string = new StringBuilder();
        int i;
        while ((i = in.read()) != 0 && i != -1) {
            string.append((char) i);
        }
        return string.toString();
    }

    /**
     * Reads a 'tri-byte' from the specified buffer.
     *
     * @param buf The buffer.
     * @return The value.
     */
    public static int getTriByte(InputStream buf) {
        try {
            return ((buf.read() & 0xFF) << 16) | ((buf.read() & 0xFF) << 8) | (buf.read() & 0xFF);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Writes a 'tri-byte' to the specified buffer.
     *
     * @param buf   The buffer.
     * @param value The value.
     */
    public static void putTriByte(OutputStream buf, int value) {
        try {
            buf.write((byte) (value >> 16));
            buf.write((byte) (value >> 8));
            buf.write((byte) value);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * @return
     */
    public static int getMedium(ByteBuffer buf) {
        return ((buf.get() & 0xFF) << 16) | ((buf.get() & 0xFF) << 8) | (buf.get() & 0xFF);
    }

    public static String getVarString(InputStream in) throws IOException {
        int value = in.read();
        if (value == -1)
            throw new IOException("EOF");
        int value2 = in.read();
        if (value == -1)
            throw new IOException("EOF");
        byte[] stringBytes = new byte[(value & 0xff) << 8 | value2 & 0xff];
        in.read(stringBytes);
        return new String(stringBytes, "UTF-8");
    }

    public static void putString(String string, OutputStream out) throws IOException {
        out.write(string.getBytes());
        out.write(0);
    }

    /**
     * @param name
     * @param buffer
     */
    public static void putString(String name, ByteBuffer buffer) {
        buffer.put(name.getBytes()).put((byte) 0);

    }

    public static void putVarString(String string, OutputStream out) throws IOException {
        byte[] stringBytes = string.getBytes("UTF-8");
        out.write(stringBytes.length >> 8);
        out.write(stringBytes.length & 0xff);
        out.write(stringBytes);
    }


    public static byte[] decryptXtea(int[] keys, byte[] data, int offset, int length) {
        int qword_count = (length - offset) / 8;
        XTEAStream xteaStream = new XTEAStream(data);
        xteaStream.pos = offset;
        for (int qword_pos = 0; qword_pos < qword_count; qword_pos++) {
            int dword_1 = xteaStream.readDWord();
            int dword_2 = xteaStream.readDWord();
            int const_1 = -957401312;
            int const_2 = -1640531527;
            int run_count = 32;
            while ((run_count-- ^ 0xffffffff) < -1) {
                dword_2 -= ((dword_1 >>> -1563092443 ^ dword_1 << 611091524) + dword_1
                        ^ const_1 + keys[const_1 >>> -1002502837 & 0x56c00003]);
                const_1 -= const_2;
                dword_1 -= ((dword_2 >>> 1337206757 ^ dword_2 << 363118692) - -dword_2
                        ^ const_1 + keys[const_1 & 0x3]);
            }
            xteaStream.pos -= 8;
            xteaStream.writeDWord(dword_1);
            xteaStream.writeDWord(dword_2);
        }
        return xteaStream.buffer;
    }

    public static int getSmartInt(ByteBuffer in) {
        int value = in.get();
        if (value < 0) {
            value = (((value & 0xff) << 24) +
                    ((in.get() & 0xff) << 16) +
                    ((in.get() & 0xff) << 8) +
                    (in.get() & 0xff));
            return (value & 0x7fffffff);
        }
        return (((value & 0xff) << 8) + (in.get() & 0xff));
    }

    private static class XTEAStream {
        public byte[] buffer;
        public int pos;

        public XTEAStream(byte[] data) {
            buffer = data;
            pos = 0;
        }

        public void writeDWord(int i_29_) {
            buffer[pos++] = (byte) (i_29_ >> 544537784);
            buffer[pos++] = (byte) (i_29_ >> 322362640);
            buffer[pos++] = (byte) (i_29_ >> 680567848);
            buffer[pos++] = (byte) i_29_;
        }

        public int readDWord() {
            pos += 4;
            return ((buffer[pos - 1] & 0xff) + ((buffer[pos - 3] << 16 & 0xff0000) + (((buffer[pos - 4] & 0xff) << 24) + (buffer[pos - 2] << 8 & 0xff00))));
        }

    }

    public static void writeInt(int val, int index, byte[] buffer) {
        buffer[index++] = (byte) (val >> 24);
        buffer[index++] = (byte) (val >> 16);
        buffer[index++] = (byte) (val >> 8);
        buffer[index++] = (byte) val;
    }

    public static int readInt(int index, byte[] buffer) {
        return ((buffer[index++] & 0xff) << 24) | ((buffer[index++] & 0xff) << 16) | ((buffer[index++] & 0xff) << 8) | (buffer[index++] & 0xff);
    }

    /**
     * @return
     */
    public static int getSmart2(ByteBuffer buffer) {
        int value = 0;
        int i;
        for (i = getSmart(buffer); i == 32767; i = getSmart(buffer))
            value += 32767;
        value += i;
        return value;
    }

    public static char getCPCharacter(ByteBuffer buffer) {
        int read = buffer.get() & 0xff;
        if (read == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(read, 16) + " provided");
        }
        if (read >= 128 && read < 160) {
            char cpChar = CHARACTERS[read - 128];
            if (cpChar == '\0') {
                cpChar = '?';
            }
            read = cpChar;
        }
        return (char) read;
    }


    public static String readJagString(byte[] buffer, int offset, int length) {
        char[] result = new char[length];
        int pos = 0;
        int offsetSub = offset;

        int currChar;
        for(int curr = length + offset; offsetSub < curr; result[pos++] = (char)currChar) {
            int encryptedChar = buffer[offsetSub++] & 255;
            if(encryptedChar < 128) {
                if(encryptedChar == 0) {
                    currChar = '\ufffd';
                } else {
                    currChar = encryptedChar;
                }
            } else if(encryptedChar < 192) {
                currChar = '\ufffd';
            } else if(encryptedChar >= 224) {
                if(encryptedChar < 240) {
                    if(1 + offsetSub < curr && (buffer[offsetSub] & 192) == 128 && 128 == (buffer[offsetSub + 1] & 192)) {
                        currChar = (encryptedChar & 15) << 12 | (buffer[offsetSub++] & 63) << 6 | buffer[offsetSub++] & 63;
                        if(currChar < 2048) {
                            currChar = '\ufffd';
                        }
                    } else {
                        currChar = '\ufffd';
                    }
                } else if(encryptedChar < 248) {
                    if(offsetSub + 2 < curr && (buffer[offsetSub] & 192) == 128 && 128 == (buffer[1 + offsetSub] & 192) && (buffer[offsetSub + 2] & 192) == 128) {
                        currChar = (encryptedChar & 7) << 18 | (buffer[offsetSub++] & 63) << 12 | (buffer[offsetSub++] & 63) << 6 | buffer[offsetSub++] & 63;
                        if(currChar >= 65536 && currChar <= 1114111) {
                            currChar = '\ufffd';
                        } else {
                            currChar = '\ufffd';
                        }
                    } else {
                        currChar = '\ufffd';
                    }
                } else {
                    currChar = '\ufffd';
                }
            } else if(offsetSub < curr && 128 == (buffer[offsetSub] & 192)) {
                currChar = (encryptedChar & 31) << 6 | buffer[offsetSub++] & 63;
                if(currChar < 128) {
                    currChar = '\ufffd';
                }
            } else {
                currChar = '\ufffd';
            }
        }

        return new String(result, 0, pos);
    }

}
