package org.osrse.game.logic.object;

import org.osrse.game.file.parsers.ObjectDefinitionParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 1/6/14.
 */
public class ObjectDefinition {

    private static Map<Integer, ObjectDefinition> cachedDefinitions = new HashMap<Integer, ObjectDefinition>();

    public static ObjectDefinition forId(int id) {
        ObjectDefinition def = cachedDefinitions.get(id);
        if (def == null) {
            try {
                def = ObjectDefinitionParser.forId(id);
            } catch (Exception e) {
                System.err.println("Failed to init object definition for id : " + id+", "+e.getLocalizedMessage()/*, e*/);
                e.printStackTrace();
                def = new ObjectDefinition();
            }
            cachedDefinitions.put(id, def);
        }
        return def;
    }

    public int id;
    public String name = "null";
    public boolean walkable = true;
    public boolean clippingFlag = false;
    public String[] actions = new String[5];
    public int actionCount = 2;
    public int sizeX = 1;
    public int sizeY = 1;
    public int walkToData = 0;
    public int miniMapSpriteId = -1;
    public int varbitId, configId;
    public int[] childIds;

    public boolean hasActions() {
        for (String s : actions) {
            if (s != null && !s.equals("null") && !s.equals("")) {
                return true;
            }
        }
        return false;
    }
}