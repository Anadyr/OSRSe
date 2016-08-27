package org.osrse.game.file;

import org.osrse.utility.StreamUtilities;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lazaro
 */
public class RS2IndexedChart {
    public int version = 0;
    public int indexHashTag = 0;
    public boolean hasHashTags = false;
    public RS2IndexedChartEntry[] entries = null;
    public Map<Integer, RS2IndexedChartEntry> fileEntryMap = null;

    public RS2IndexedChart(RS2File fitFile) throws IOException {
        if (!fitFile.extract()) {
            entries = new RS2IndexedChartEntry[0];
            fileEntryMap = new HashMap<Integer, RS2IndexedChartEntry>();
            return;
        }
        ByteBuffer buffer = ByteBuffer.wrap(fitFile.getData());
        version = buffer.get();
        if (version >= 6) indexHashTag = buffer.getInt();
        int flags = buffer.get() & 0xff;
        hasHashTags = (0x1 & flags) != 0;
        int count = (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
        int entryCount = 0;
        int maxFile = -1;
        int[] spacing = new int[count];
        for (int i = 0; i < count; i++) {
            spacing[i] = entryCount += (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
            if (spacing[i] > maxFile) {
                maxFile = spacing[i];
            }
        }
        entries = new RS2IndexedChartEntry[maxFile + 1];
        for (int i = 0; i < count; i++) {
            entries[spacing[i]] = new RS2IndexedChartEntry(i);
        }
        if (hasHashTags) {
            fileEntryMap = new HashMap<Integer, RS2IndexedChartEntry>();
            for (int i = 0; i < count; i++) {
                RS2IndexedChartEntry entry = entries[spacing[i]];
                fileEntryMap.put(entry.nameHash = buffer.getInt(), entry);
            }
        }
        for (int i = 0; i < count; i++) {
            entries[spacing[i]].exists = true;
            entries[spacing[i]].crc = buffer.getInt();
        }
        for (int i = 0; i < count; i++) {
            entries[spacing[i]].revision = buffer.getInt(); // TODO Apparently // this is not // actually a // indexHashTag number!
        }
        for (int i = 0; i < count; i++) {
            RS2IndexedChartEntry entry = entries[spacing[i]];
            RS2IndexedChartEntry.FITSubEntry[] subEntries = new RS2IndexedChartEntry.FITSubEntry[buffer.getShort() & 0xffff];
            for (int j = 0; j < subEntries.length; j++) {
                subEntries[j] = new RS2IndexedChartEntry.FITSubEntry();
            }
            entry.subEntries = subEntries;
        }
        for (int i = 0; i < count; i++) {
            RS2IndexedChartEntry entry = entries[spacing[i]];
            entryCount = 0;
            for (int j = 0; j < entry.subEntries.length; j++) {
                int pointer = entry.subEntries[j].pointer = entryCount += (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
                if (entry.maxSubFileCount < pointer) {
                    entry.maxSubFileCount = pointer;
                }
            }
            entry.maxSubFileCount++;
        }
        if (hasHashTags) {
            for (int i = 0; i < count; i++) {
                RS2IndexedChartEntry entry = entries[spacing[i]];
                for (int j = 0; j < entry.subEntries.length; j++) {
                    entries[spacing[i]].subEntries[j].nameHash = buffer.getInt();
                }
            }
        }
    }
        /*ByteBuffer buffer = ByteBuffer.wrap(fitFile.getData());
        version = buffer.get() & 0xff;
        if(version >= 5) { //has info
            if(version <= 7) {
                if(version >= 6) {
                    indexHashTag = buffer.getInt();
                }
                int flags = buffer.get() & 0xff;
                hasHashTags = flags != 0;
                int count = (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
                int entryCount = 0;
                int maxFile = -1;
                int[] spacing = newcache int[count];
                for (int i = 0; i < count; i++) {
                    spacing[i] = entryCount += (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
                    if(spacing[i] > maxFile) {
                        maxFile = spacing[i];
                    }
                }
                entries = newcache RS2IndexedChartEntry[maxFile+1];
                for (int i = 0; i < count; i++) {
                    entries[i] = newcache RS2IndexedChartEntry(i);
                }
                if (hasHashTags) {
                    fileEntryMap = newcache HashMap<Integer, RS2IndexedChartEntry>();
                    for(int i = 0; i < count; i++) {
                        RS2IndexedChartEntry entry = entries[i];
                        fileEntryMap.put(entry.nameHash = buffer.getInt(), entry);
                    }
                }
                for(int i = 0; i < count; i++) {
                    entries[i].exists = true;
                    entries[i].crc = buffer.getInt();
                }
                for(int i = 0; i < count; i++) {
                    entries[i].revision = buffer.getInt(); // TODO Apparently
                    // this is not
                    // actually a
                    // indexHashTag number!
                }
                for(int i = 0; i < count; i++) {
                    RS2IndexedChartEntry entry = entries[i];
                    RS2IndexedChartEntry.FITSubEntry[] subEntries = newcache RS2IndexedChartEntry.FITSubEntry[buffer.getShort() & 0xffff];
                    for (int j = 0; j < subEntries.length; j++) {
                        subEntries[j] = newcache RS2IndexedChartEntry.FITSubEntry();
                    }
                    entry.subEntries = subEntries;
                }
                for(int i = 0; i < count; i++) {
                    RS2IndexedChartEntry entry = entries[i];
                    entryCount = 0;
                    for (int j = 0; j < entry.subEntries.length; j++) {
                        int pointer = entry.subEntries[j].pointer = entryCount += (version >= 7 ? StreamUtilities.getSmartInt(buffer) : (buffer.getShort() & 0xffff));
                        if (entry.maxSubFileCount < pointer) {
                            entry.maxSubFileCount = pointer;
                        }
                    }
                    entry.maxSubFileCount++;
                }
                if (hasHashTags) {
                    for(int i = 0; i < count; i++) {
                        RS2IndexedChartEntry entry = entries[i];
                        for (int j = 0; j < entry.subEntries.length; j++) {
                            entries[i].subEntries[j].nameHash = buffer.getInt();
                        }
                    }
                }
            }
        }
    }*/

    public static int hashName(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + ((r << 5) - r);
        }
        return r;
    }
}

