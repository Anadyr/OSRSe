package org.osrse.game.file.player;


import org.osrse.utility.ArrayUtilities;
import static org.osrse.utility.ArrayUtilities.primitive;

import org.osrse.utility.NameUtilities;
import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.game.logic.utility.LogicConstants;

/**
 * Created by Jonathan on 4/13/14.
 */
public class TestLoader extends LoadableContext {


    @Override
    public PlayerDefinition loadPlayer(PlayerDefinition currentDetails) {
                      currentDetails.setStaticIndex(1);
                currentDetails.rights = 2;
        //2931, 4711

        //3145 9915 vannaka
        //3680 2983

                currentDetails.coordX = 3222;// 3225;
                currentDetails.coordY = 3222;///3425;
                currentDetails.coordZ = 0;
            //currentDetails.communications = new Communications(1, currentDetails.getUsername(), "Test", 0, 7);

            currentDetails.levels = primitive(ArrayUtilities.toArray("1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1", new Integer[0]));
            currentDetails.experiences = primitive(ArrayUtilities.toArray("1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1", new Double[0]));
            currentDetails.inv = primitive(ArrayUtilities.toArray("-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;", new Short[0]));
            currentDetails.inv_value = primitive(ArrayUtilities.toArray("0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0", new Integer[0]));
            currentDetails.equipment = primitive(ArrayUtilities.toArray("-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1", new Short[0]));
            currentDetails.equipment_value = primitive(ArrayUtilities.toArray("0;0;0;0;0;0;0;0;0;0;0;0;0;0", new Integer[0]));

                String bankQuery = null;
                if (bankQuery == null || bankQuery.equals("")) {
                    StringBuilder bankQuery1 = new StringBuilder();
                    for(int i = 0; i < LogicConstants.BANK_SIZE; i ++) {
                        bankQuery1.append(i==LogicConstants.BANK_SIZE-1 ? "-1" : "-1;");
                    }
                    bankQuery = bankQuery1.toString();
                }
                currentDetails.bank = primitive(ArrayUtilities.toArray(bankQuery, new Short[0]));
                bankQuery = null;
                if (bankQuery == null || bankQuery.equals("")) {
                    StringBuilder bankQuery1 = new StringBuilder();
                    for(int i = 0; i < LogicConstants.BANK_SIZE; i ++) {
                        bankQuery1.append(i==LogicConstants.BANK_SIZE-1 ? "0" : "0;");
                    }
                    bankQuery = bankQuery1.toString();
                }
                currentDetails.bank_value = primitive(ArrayUtilities.toArray(bankQuery, new Integer[0]));

                String friendQuery = null;
                if(friendQuery != null) {
                    String[] friends = ArrayUtilities.toArray(friendQuery, new String[0]);
                    friendQuery = null;
                    int[] friendV = primitive(ArrayUtilities.toArray(friendQuery, new Integer[0]));
                    //currentDetails.communications.friendsList = new HashMap<Integer, String>();
                    //currentDetails
                    //for(int i = 0; i < friends.length; i++) {
                    //    currentDetails.communications.friendsList.put(friendV[i], friends[i]);
                   // }
                }
        return currentDetails;
    }

    @Override
    public void applySaveHeader(String table, StringBuilder query, PlayerDefinition player) {
        query.append("global_id='").append(player.getStaticIndex()).append("'");
        query.append("name='").append(NameUtilities.protocolFormat(player.getUsername())).append("'");
        query.append("password='").append(player.getPassword()).append("'");
    }

    @Override
    public void finalizeSave(StringBuilder query, PlayerDefinition player) {

    }

}
