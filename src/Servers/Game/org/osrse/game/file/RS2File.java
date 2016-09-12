package org.osrse.game.file;

import org.osrse.utility.StreamUtilities;
import org.osrse.utility.bzip2.CBZip2InputStream;
import org.osrse.utility.crypto.XTEA;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;


/**
 * @author Lazaro
 */
public class RS2File {

    public static final int COMPRESSION_NONE = 0, COMPRESSION_BZIP2 = 1, COMPRESSION_GZIP = 2;
    private Library rs2Store;
    private int indexId;
    private int id;
    private byte[] data;
    private boolean extracted = false;

    public RS2File(Library rs2Store, int indexId, int id, byte[] data) {
        this.rs2Store = rs2Store;
        this.indexId = indexId;
        this.id = id;
        this.data = data;
    }

    public int getIndexId() {
        return indexId;
    }

    public int getId() {
        return id;
    }

    public byte[] getData() {
        return data;
    }

    public byte[] getData(int offset) {
        byte[] subData = new byte[data.length - offset];
        System.arraycopy(data, offset, subData, 0, subData.length);
        return subData;
    }

    public byte[][] getArchivedFiles() {
        if (!extract()) {
            return null;
        }
        RS2IndexedChartEntry entry = rs2Store.getFIT(indexId).entries[id];
        RS2IndexedChartEntry.FITSubEntry[] subEntries = entry.subEntries;
        int subFileCount = entry.subEntries.length;
        int realSubFileCount = entry.maxSubFileCount;
 
        if (indexId == 255 || subFileCount == 0 || realSubFileCount == 0) {
            throw new UnsupportedOperationException("This file does not contain any archived files!");
        }
        byte[][] archivedFiles = new byte[realSubFileCount][];

        byte[] dataArray = getData();
        if(subFileCount > 1) {
            int pos;
            int length = dataArray.length;
            length--;
            int fileSeparator = dataArray[length] & 0xff;//?
            length -= fileSeparator * (subFileCount * 4);
            pos = length;
            int[] subWritePos = new int[subFileCount];
            for (int i_21_ = 0; i_21_ < fileSeparator; i_21_++) {
                int i_22_ = 0;
                for (int subIndex = 0; subIndex < subFileCount; subIndex++) {
                    i_22_ += StreamUtilities.readInt(pos, dataArray);
                    pos += 4;
                    subWritePos[subIndex] += i_22_;
                }
            }
            byte[][] subData = new byte[subFileCount][];
            for (int subIndex = 0; subIndex < subFileCount; subIndex++) {
                subData[subIndex] = new byte[subWritePos[subIndex]];
                subWritePos[subIndex] = 0;
            }
            int readPos = 0;
            pos = length;
            for (int i_27_ = 0; i_27_ < fileSeparator; i_27_++) {
                int i_28_ = 0;
                for (int childPos = 0; childPos < subFileCount; childPos++) {
                    i_28_ += StreamUtilities.readInt(pos, dataArray);
                    pos += 4;
                    System.arraycopy(dataArray, readPos, subData[childPos], subWritePos[childPos], i_28_);
                    readPos += i_28_;
                    subWritePos[childPos] += i_28_;
                }
            }
            for (int i = 0; i < subFileCount; i++) {
                int i_31_;
                if (subEntries != null) {
                    i_31_ = subEntries[i].pointer;
                }else{
                    i_31_ = i;
                }
                archivedFiles[i_31_] = subData[i];
            }
        } else {
            archivedFiles[0] = dataArray;
        }
        return archivedFiles;
    }

    public boolean extract(int[] key) {
        if (extracted) {
            return true;
        }
        try {

            ByteBuffer buffer;
            if (key != null && key[0] != 0 && key[1] != 0 && key[2] != 0
                    && key[3] != 0) {
                buffer = ByteBuffer.wrap(new XTEA(key, data, 5).decrypt(StreamUtilities.readInt(1, data)));
            } else {
               buffer = ByteBuffer.wrap(data);
            }
            int compression = buffer.get() & 0xff;
            int length = buffer.getInt();
            int decompressedLength = compression != COMPRESSION_NONE ? buffer.getInt() : length;
            byte[] out = new byte[decompressedLength];
            byte[] inputData = new byte[length];
            buffer.get(inputData);
            InputStream input;
            switch (compression) {
                case COMPRESSION_GZIP:
                    input = new InflaterInputStream(new ByteArrayInputStream(inputData, 10, inputData.length - 10), new Inflater(true));
                    break;
                case COMPRESSION_BZIP2:
                    input = new CBZip2InputStream(new ByteArrayInputStream(inputData));
                    break;
                default:
                    input = new ByteArrayInputStream(inputData);
                    break;
            }
            BufferedInputStream inputStream = new BufferedInputStream(input, decompressedLength);
            for (int i = 0; i < decompressedLength; i++) {
                int val = inputStream.read();
                if (val == -1) {
                    throw new IOException("EOF");
                }
                out[i] = (byte) val;
            }
            data = out;
            extracted = true;
            return true;
        } catch (Throwable e) {
	        System.err.println("Error extracting file [id=" + indexId + ", file=" + id + "], " + e.getLocalizedMessage());
	        return false;
        }
    }

    public boolean extract() {
        return extract(null);
    }

    public boolean isExtracted() {
        return extracted;
    }
}
