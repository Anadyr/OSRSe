package org.osrse.game.file.parsers;

import org.osrse.WorldModule;
import org.osrse.game.file.Library;
import org.osrse.game.file.RS2File;
import org.osrse.game.logic.map.Region;
import org.osrse.utility.StreamUtilities;

import java.nio.ByteBuffer;

/**
 * Created by Jonathan on 1/7/14.
 */
public class MapDefinitionParser {


    public boolean loadMap(Region region, int regionX, int regionY) {
        boolean failed = false;
        try {
        ByteBuffer str1 = null, str2 = null;

        RS2File landscapeMap = Library.rs2Store
                .getIndex(5).getFileForName("m" + regionX + "_" + regionY);
        RS2File objectMap = Library.rs2Store
                .getIndex(5).getFileForName("l" + regionX + "_" + regionY);

        if (landscapeMap == null && objectMap == null) {
            //System.err.println("Map [" + regionX + ", " + regionY + "] was not found in the cache!");
            return false;
        }
        if (landscapeMap != null) {
            landscapeMap.extract();
        }
        if (objectMap != null) {
            int[] key = WorldModule.getLogic().getLibrary().getKey(regionX << 8 | regionY);
            if (key == null) {
                key = new int[4];
                // logger.warn("No mapdata for region : " + (x << 8 | y));
            }

            if (!objectMap.extract(key)) {
                failed = true;
            }
        }


        if (landscapeMap != null && landscapeMap.isExtracted()) {
            str2 = ByteBuffer.wrap(landscapeMap.getData());
        }
        if (objectMap != null && objectMap.isExtracted()) {
            str1 = ByteBuffer.wrap(objectMap.getData());
        }
        byte[][][] landscapeData = new byte[4][64][64];
        if (str2 != null) {
            for (int tileSubHeight = 0; tileSubHeight < 4; tileSubHeight++) {
                for (int tileX = 0; tileX < 64; tileX++) {
                    for (int tileY = 0; tileY < 64; tileY++) {
                        while (true) {
                            int variableType = str2.get() & 0xff;
                            if (variableType == 0) {
                                break;
                            } else if (variableType == 1) {
                                str2.get();
                                break;
                            } else if (variableType <= 49) {
                                str2.get();
                            } else if (variableType <= 81) {
                                landscapeData[tileSubHeight][tileX][tileY] = (byte) (variableType - 49);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int x2 = 0; x2 < 64; x2++) {
                    for (int y2 = 0; y2 < 64; y2++) {
                        if ((landscapeData[i][x2][y2] & 1) == 1) {
                            int z = i;
                            if ((landscapeData[1][x2][y2] & 2) == 2) {
                                z--;
                            }
                            if (z >= 0 && z <= 3) {
                                region.clip(x2, y2, z, 0x200000);
                            }
                        }
                    }
                }
            }
        }
        if (str1 != null) {
            int trueIncrement = -1;
            for(;;) {
                final int objectBaseValue = StreamUtilities.getSmartOld(str1);
                if (objectBaseValue == 0) {
                    break;
                }
                trueIncrement += objectBaseValue;
                int inlineIncrement = 0;
                    for (;;) {
                        final int objectAdditionalValue = StreamUtilities.getSmartOld(str1);
                            if (objectAdditionalValue == 0) {
                                break;
                            }
                            inlineIncrement += objectAdditionalValue - 1;
                            int x = (inlineIncrement >> 6 & 0x3f);
                            int y = (inlineIncrement & 0x3f);
                            int height = inlineIncrement >> 12;
                            int objectData = str1.get() & 0xff;
                            int type = objectData >> 2;
                            int direction = objectData & 0x3;
                            if (x < 0 || x >= 64 || y < 0 || y >= 64) {
                                continue;
                            }
                            if ((landscapeData[1][x][y] & 2) == 2) {
                                height--;
                            }
                            if (height >= 0 && height <= 3) {
                                region.addObject(trueIncrement, x, y, height, type, direction, true);
                            }

                    }
            }
        }
        }catch (Exception e) {

        }
        return failed;
    }
}
