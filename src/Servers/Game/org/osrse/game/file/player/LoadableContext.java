package org.osrse.game.file.player;


import org.osrse.WorldModule;
import org.osrse.utility.ArrayUtilities;
import org.osrse.utility.NameUtilities;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.game.logic.utility.LogicConstants;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.osrse.utility.ArrayUtilities.primitive;

/**
 * Created by Jonathan on 4/13/14.
 */
public abstract class LoadableContext {
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static final Map<String, PlayerDefinition> cachedplayersLeaving = new HashMap<String, PlayerDefinition>();
    private static LoadableContext loadableContext;

    public abstract PlayerDefinition loadPlayer(PlayerDefinition currentDetails);

    public abstract void applySaveHeader(String table, StringBuilder query, PlayerDefinition player);

    public abstract void finalizeSave(StringBuilder query, PlayerDefinition player);

    public final void save(PlayerDefinition player) {
        cachedplayersLeaving.remove(player.getUsername());
        StringBuilder query = new StringBuilder();
        //System.out.println("data_"+WorldModule.getLogic().getWorldActivity().toString().toLowerCase());
        applySaveHeader("data_"+WorldModule.getLogic().getWorldActivity().toString().toLowerCase(), query, player);
        //query.append("rights='").append(player.getRights()).append("'");
        query.append("x='").append(player.coordX).append("'");
        query.append(", y='").append(player.coordY).append("'");
        query.append(", z='").append(player.coordZ).append("'");
        //query.append(", login_date='").append(format.format(new Date())).append("'");
//        query.append(", levels='").append(ArrayUtilities.toString(player.levels)).append("'");
      //  query.append(", experience='").append(ArrayUtilities.toString(player.experiences)).append("'");
      //  query.append(", equip_list='").append(ArrayUtilities.toString(player.equipment)).append("'");
      //  query.append(", equip_values='").append(ArrayUtilities.toString(player.equipment_value)).append("'");
      //  query.append(", bank_list='").append(ArrayUtilities.toString(ArrayUtilities.removeJunk(-1, player.bank))).append("'");
      //  query.append(", bank_values='").append(ArrayUtilities.toString(ArrayUtilities.removeJunk(0, player.bank_value))).append("'");
      //  query.append(", inv_list='").append(ArrayUtilities.toString(player.inv)).append("'");
     //   query.append(", inv_values='").append(ArrayUtilities.toString(player.inv_value)).append("'");
        query.append(", chat_settings='").append(ArrayUtilities.toString(new int[]{player.publicData, player.privateData, player.clanData, player.tradeData, player.assistData})).append("'");
        finalizeSave(query, player);
    }

    public static void setup(boolean commercial) {
        //if commerical we load through the ls either sql or ftp
        //if not commercial but using a db or files we need another type of loading method
        loadableContext = WorldModule.isCommercial() ? new SQLPlayerLoader() : new TestLoader();//commercial ? newcache CommercialPlayerLoader() : Module.hasDatabasePolicy() ? newcache SQLPlayerLoader() : newcache TestLoader();
    }

    public static void process() {
        if (!cachedplayersLeaving.isEmpty()) {
            long time = System.currentTimeMillis();

            Collection<PlayerDefinition> defs = cachedplayersLeaving.values();
            synchronized (defs) {
                for (PlayerDefinition d : defs) {
                   // if (d.hasExpired(time)) {
                        cachedplayersLeaving.remove(NameUtilities.displayFormat(d.getUsername()));
                        loadableContext.save(d);
                        defs.remove(d);
                    //}
                }
            }
        }
    }

    public static PlayerDefinition load(PlayerDefinition currentDetails) {
        if (cachedplayersLeaving.containsKey(NameUtilities.capitalizeFormat(currentDetails.getUsername()))) {
            PlayerDefinition same = cachedplayersLeaving.get(NameUtilities.capitalizeFormat(currentDetails.getUsername()));
            if (same.getPassword().equalsIgnoreCase(currentDetails.getPassword())) {
                cachedplayersLeaving.remove(NameUtilities.capitalizeFormat(currentDetails.getUsername())); //remove due to no point in sending it.
                return same; //this is only for account transferring if logging out of world 2, and logging back into world 2.
            }
        }
        return loadableContext.loadPlayer(currentDetails);

    }

    public static void cachePlayer(Player player) {
        PlayerDefinition def = new PlayerDefinition(player.getUsername(), player.getPassword());//null;//player.getDefinition();
        //first we have to update things that change outside of the definition class.
        def.setStaticIndex(player.getStaticIndex());
        def.coordX = player.getX();
        def.coordY = player.getY();
        def.coordZ = player.getZ();
        /*
        def.runEnergy = player.getRunningEnergy();
        def.experiences = player.getSkills().getExperienceArray();
        def.levels = player.getSkills().getLevelArray();

        def.inv = new short[LogicConstants.INVENTORY_SIZE];
        def.inv_value = new int[LogicConstants.INVENTORY_SIZE];
        for (int i = 0; i < def.inv.length; i++) {
            Item item = player.getInventory().get(i);
            if (item == null) {
                def.inv[i] = -1;
                def.inv_value[i] = 0;
            } else {
                def.inv[i] = (short) item.getType();
                def.inv_value[i] = item.getAmount();
            }
        }
        def.equipment = new short[LogicConstants.EQUIPMENT_SIZE];
        def.equipment_value = new int[LogicConstants.EQUIPMENT_SIZE];
        for (int i = 0; i < def.equipment.length; i++) {
            Item item = player.getEquipment().get(i);
            if (item == null) {
                def.equipment[i] = -1;
                def.equipment_value[i] = 0;
            } else {
                def.equipment[i] = (short) item.getType();
                def.equipment_value[i] = item.getAmount();
            }
        }

        def.bank = new short[LogicConstants.BANK_SIZE];
        def.bank_value = new int[LogicConstants.BANK_SIZE];
        for (int i = 0; i < def.bank.length; i++) {
            int[] item = player.getBank().get(i);
            def.bank[i] = (short) item[0];
            def.bank_value[i] = item[1];
        }
        def.bank = primitive(ArrayUtilities.removeJunk(-1, def.bank));
        def.bank_value = primitive(ArrayUtilities.removeJunk(0, def.bank_value));
        */
        loadableContext.save(def);
        //def.timeLeft = System.currentTimeMillis();
        //cachedplayersLeaving.put(NameUtilities.capitalizeFormat(def.getUsername()), def);
    }


}