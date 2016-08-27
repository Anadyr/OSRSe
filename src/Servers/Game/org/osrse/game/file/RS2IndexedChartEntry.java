package org.osrse.game.file;

/**
 * @author Lazaro
 */
public class RS2IndexedChartEntry {
    public static class FITSubEntry {
        public int pointer = 0;
        public int nameHash = 0;
    }

    public int id;
    public boolean exists = false;
    public int crc = 0;
    public int revision = 0; // TODO Apparently this is not the file indexHashTag!
    public int nameHash = 0;
    public byte[] whirlpoolChecksum = null;
    public FITSubEntry[] subEntries = null;
    public int maxSubFileCount = -1;

    public RS2IndexedChartEntry(int fileId) {
        this.id = fileId;
    }
}
