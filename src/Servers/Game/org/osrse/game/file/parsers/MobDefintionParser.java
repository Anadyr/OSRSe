package org.osrse.game.file.parsers;

import org.osrse.utility.StreamUtilities;

import java.nio.ByteBuffer;

/**
 * Created by Jonathan on 1/11/14.
 */
public class MobDefintionParser {

    public static void parse(ByteBuffer buffer) {
        int opcode;
        while ((opcode = (buffer.get() & 0xff)) != 0) {
            parseOpcode(opcode, buffer);
        }
    }

    private static void parseOpcode(int opcode, ByteBuffer buffer) {
        //System.out.println(opcode);
        if (opcode == 1) {
            final int i_15_ = buffer.get();
            for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
                buffer.getShort();
            }
        } else if (opcode == 2) {
            String name = StreamUtilities.getString(buffer);
            System.out.println("name=" + name);
        } else if (opcode == 12) {
            int mobSize = buffer.get() & 0xff;
            System.out.println("mobSize="+mobSize);
        } else if (opcode == 13) {
            ;
            System.out.println("WALKING=" + buffer.getShort());
        } else if (opcode == 14) {
            System.out.println("WALKING=" + buffer.getShort());
            //buffer.getShort();
        } else if (opcode == 15) {
            buffer.getShort();
        } else if (opcode == 16) {
            buffer.getShort();
        } else if (opcode == 17) {
            buffer.getShort();
            buffer.getShort();
            buffer.getShort();
            buffer.getShort();
        } else if (opcode >= 30 && opcode < 35) {
            StreamUtilities.getString(buffer);
        } else if (opcode == 40) {
            final int i_17_ = buffer.get();
            for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
                buffer.getShort();
                buffer.getShort();
            }
        } else if (opcode == 41) {
            final int i_19_ = buffer.get();
            for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
                buffer.getShort();
                buffer.getShort();
            }
        } else if (opcode == 60) {
            final int i_21_ = buffer.get();
            for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
                int l = buffer.getShort();
                System.out.println("l-"+l);
            }
        } else if (opcode == 93) {
        } else if (opcode == 95) {buffer.getShort();
        } else if (opcode == 97) {
            buffer.getShort();
        } else if (opcode == 98) {
            buffer.getShort();
        } else if (opcode == 99) {
        } else if (opcode == 100) {
            buffer.get();
        } else if (opcode == 101) {
            buffer.get();
        } else if (opcode == 102) {
            buffer.getShort();
        } else if (opcode == 103) {
            buffer.getShort();
        } else if (opcode == 106) {
            buffer.getShort();
            buffer.getShort();
            final int i_23_ = buffer.get();
            for (int i_24_ = 0; i_24_ <= i_23_; i_24_++) {
                buffer.getShort();
            }
        } else if (opcode == 107) {
        } else if (opcode == 109) {
        }
    }

}
