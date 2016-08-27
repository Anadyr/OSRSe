/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.item;

import org.osrse.WorldModule;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class ItemDefinition {

    public static final Map<Integer, SQLItem> itemDefinitions = new HashMap<Integer, SQLItem>();

    public static void init(int revision) throws IOException {
        InputStream fis = new FileInputStream(revision > 192 ? WorldModule.getFile("definition/final_item_def.sql") : WorldModule.getProtocolDirectory(revision, "final_item_def.sql"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
        String line;
        while ((line = br.readLine()) != null) {
            SQLItem d = SQLItem.fromString(line);
            itemDefinitions.put(d.id, d);
        }
        br.close();
        fis.close();
        System.out.println("Loaded "+itemDefinitions.size()+" item definitions");
    }

    public static SQLItem get(int itemId) {
        return itemDefinitions.get(itemId);
    }
}
