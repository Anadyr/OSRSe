package org.osrse.game.file;

import org.osrse.WorldModule;
import org.osrse.network.Packet;
import org.osrse.network.PacketBuilder;
import org.osrse.utility.StreamUtilities;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;
 

/**
 * @author Lazaro
 */
public class Library {

    public static Library rs2Store;

    public static void start(int revision) throws IOException {
        if(revision > 400 || revision < 120) {
            rs2Store = new Library();
            rs2Store.load(new File(WorldModule.getProtocolDirectory("cache")));
        }
    }

	private FileChannel channel = null;

	private RS2Index[] indexes = null;
	private RS2Index fitIndex = null;

	private RS2IndexedChart[] rs2IndexedCharts = null;
	private RS2File fitChecksumFile = null;

	private final void load(File dir) throws IOException {
		channel = new RandomAccessFile(new File(dir, "main_file_cache.dat2"), "rw").getChannel();

		RandomAccessFile fitIndexFile = new RandomAccessFile(new File(dir, "main_file_cache.idx255"), "rw");
		fitIndex = new RS2Index(rs2Store, 255, fitIndexFile.getChannel(), null);

		int cacheIndicies = fitIndex.getLength();

		indexes = new RS2Index[cacheIndicies];
		rs2IndexedCharts = new RS2IndexedChart[cacheIndicies];
		for (int i = 0; i < cacheIndicies; i++) {
			FileChannel indexFileChannel = new RandomAccessFile(new File(dir, "main_file_cache.idx" + i), "rw").getChannel();
			RS2File fitFile = fitIndex.getFile(i);
			RS2IndexedChart RS2IndexedChart = null;
			if (fitFile != null) {
				RS2IndexedChart = rs2IndexedCharts[i] = new RS2IndexedChart(fitFile);
			}
			indexes[i] = new RS2Index(rs2Store, i, indexFileChannel, RS2IndexedChart);
		}
		int realIndexCount = fitIndex.getLength();
		CRC32 crc = new CRC32();
		ByteBuffer buffer = ByteBuffer.allocate(realIndexCount * 8 + 5);
		buffer.put((byte) RS2File.COMPRESSION_NONE).putInt(realIndexCount * 8);
		for (int i = 0; i < realIndexCount; i++) {
            RS2File file = fitIndex.getFile(i);
			if (file == null) {
				buffer.putInt(0).putInt(0);
			} else {
				byte[] fileData = file.getData();
				crc.update(fileData);
				buffer.putInt((int) crc.getValue());
				buffer.putInt(rs2IndexedCharts[i].indexHashTag);
				crc.reset();
			}
		}
		buffer.rewind();
		fitChecksumFile = new RS2File(rs2Store, 255, 255, buffer.array());
	}

	public RS2Index getIndex(int id) {
		return indexes[id];
	}

	public RS2File getFile(int indexId, int fileId) {
		if (indexId == 255 && fileId == 255) {
			return fitChecksumFile;
		}
		RS2Index index = indexId != 255 ? indexes[indexId] : fitIndex;
		if (index != null) {
			return index.getFile(fileId);
		}
		return null;
	}

	public RS2IndexedChart getFIT(int indexId) {
		return rs2IndexedCharts[indexId];
	}

	public FileChannel getFileChannel() {
		return channel;
	}


    public Packet prepareFilePacket(int opcode, int container, int id) {
        RS2File file = getFile(container, id);
        if(file == null) {
            return null;
        }
        byte[] data = file.getData();

        int compression = data[0] & 0xff;
        int length = StreamUtilities.readInt(1, data);


        PacketBuilder pb = new PacketBuilder();
        pb.putByte(file.getIndexId()).putShort(file.getId()).putByte(
                compression).putInt(length);

        if (compression != RS2File.COMPRESSION_NONE) {
            length += 4;
        }
        int blockOffset = 8;
        for (int offset = 5; offset < length + 5; offset++) {
            if (blockOffset == 512) {
                pb.putByte(255);
                blockOffset = 1;
            }
            pb.put(data[offset]);
            blockOffset++;
        }
        return pb.toPacket();
    }
}
