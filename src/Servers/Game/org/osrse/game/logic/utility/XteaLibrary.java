/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.utility;

import org.osrse.WorldModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jonathan
 */
public class XteaLibrary {

    private Map<Integer, int[]> mapData = new HashMap<Integer, int[]>();


    public XteaLibrary() {
        try {
            File[] files = new File(WorldModule.getProtocolDirectory("xtea")).listFiles();
            if(files != null) {
                for (File file : files) {
                    if (file == null) {
                        continue;
                    }
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    int[] mapParts = new int[4];
                    String line = reader.readLine();
                    String[] regex = line.replaceAll(" ", "").split(",");
                    if (regex.length < 4) {
                        if (line.equalsIgnoreCase("0")) {
                            //System.out.println("BAD XTEA=" + file.getName());
                        }
                        regex = new String[]{line, reader.readLine(), reader.readLine(), reader.readLine()};

                    }
                    for (int i = 0; i < 4; i++) {
                        mapParts[i] = Integer.valueOf(regex[i]);
                    }

                    int regionId = Integer.parseInt(file.getName().replace(".txt", ""));
                    mapData.put(regionId, mapParts);
                }
                System.out.println("Loaded " + mapData.size() + " map XTEA.");
            } else if(WorldModule.getLogic().getRevision() > 400 && WorldModule.getLogic().getRevision() < 130) {
                //for osrs and xtea versions of rs
                System.err.println("Failed to load XTEA data in ["+WorldModule.getProtocolDirectory("xtea")+"]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] getKey(int region) {
        int[] data = mapData.get(region);
        if (data == null) {
            //System.out.println("no mapdata for "+region);
            data = new int[4];
        }
        return data;
    }
}

