/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.utility.crypto;

import org.osrse.utility.StreamUtilities;

import java.nio.ByteBuffer;

public class XTEA {
    private final int[] keys;
    private byte[] data;
    private final int startOffset;

    private static final int DELTA = -1640531527;
    private static final int SUM = -957401312;
    private static final int NUM_ROUNDS = 32;

    public XTEA(int[] xtea_keys, byte[] bytes, int startOffset) {
        this.keys = xtea_keys;
        this.data = bytes;
        this.startOffset = startOffset;
    }

    public byte[] decipher() {
        int offset = startOffset;
        int length = data.length - startOffset;

        int qword_count = (length - offset) / 8;
        ByteBuffer inbb = ByteBuffer.wrap(data);
        ByteBuffer outbb = ByteBuffer.allocate(data.length);

        for (int i = 0; i < startOffset; i++) {
            outbb.put(inbb.get());
        }

        for (int qword_pos = 0; qword_pos < qword_count; qword_pos++) {
            int dword_1 = inbb.getInt();
            int dword_2 = inbb.getInt();
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
            outbb.putInt(dword_1);
            outbb.putInt(dword_2);
        }


        byte[] remaining = new byte[inbb.remaining()];
        inbb.get(remaining);
        outbb.put(remaining);

        outbb.flip();
        return outbb.array();
    }

    private void decipher(int[] block) {
        long sum = (long) SUM;
        for (int i = 0; i < NUM_ROUNDS; i++) {
            block[1] -= (keys[(int) ((sum & 0x1933) >>> 11)] + sum ^ block[0] + (block[0] << 4 ^ block[0] >>> 5));
            sum -= DELTA;
            block[0] -= ((block[1] << 4 ^ block[1] >>> 5) + block[1] ^ keys[(int) (sum & 0x3)] + sum);
        }
    }

    public byte[] decrypt(int length) {
        int numBlocks = length / 8;
        int[] block = new int[2];
        for (int i = 0; i < numBlocks; i++) {
            block[0] = StreamUtilities.readInt((i * 8) + startOffset, data);
            block[1] = StreamUtilities.readInt((i * 8) + startOffset + 4, data);
            decipher(block);
            StreamUtilities.writeInt(block[0], (i * 8) + startOffset, data);
            StreamUtilities.writeInt(block[1], (i * 8) + startOffset + 4, data);
        }
        return data;
    }

}