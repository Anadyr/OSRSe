package org.osrse.game.content.container;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.utility.NameUtilities;

/**
 * Created by Jonathan on 1/15/16.
 */
public class ClanContainer {


    public static void handleJoin(Player player, String cc) {

        Communicable c = WorldModule.getLogic().getCommunicable(NameUtilities.capitalizeFormat(cc));

        player.sendMessage("Attempting to join channel...");
        boolean failed = false;
        String msg = "The channel you tried to join does not exist.";
        /**
         * First phase check what has been listed
         *
        if(c != null) {
            //change this and worldsided coms so loaded shit
            // can just cache ccs online w/ owner offline this is horrible
            Communications c1 = WorldModule.getLogic().getClanData().get(c.getStaticIndex());
            System.out.println(c1== null);
            if(c1 != null) {
                int join = c1.joinResponse(player, false);
                msg =    join == 1 ? "You do not have a high enough rank to join this friends chat channel." :
                         join == 2 ? "The channel you tried to join is currently full." :
                         join == 3 ? "You are not allowed to join this user's friends chat channel." : msg;
                //String temp = "You have been temporarily banned from this user's friend chat channel.";
                failed = join != 0;
                System.out.println("Join ="+join);
            }
        }*/
        if(!failed) {
            if(WorldModule.isCommercial()) {
                /**
                 * Second phase, offline clan, or out of world clan.
                 * NOT registered to this world yet. Need Update server to give us credentials
                 * WILL immediately update this player and add him to the channel if he can
                 */
                System.out.println("Requesting clan "+(c==null)+", "+cc);
                WorldModule.getLogic().getLoginSession().requestDefinedFS(false, 2, player.getStaticIndex(), c == null ? -1 : c.getStaticIndex(), cc);
            } else {
                /**
                 * Local Server CC
                 */
                //check for player file
                //load clan if needed, otherwise tell them to get fukd
                player.sendMessage("Sorry server is commercial settings only.");
            }
        } else {
            player.sendMessage(msg);
            System.out.println("clan container - failed="+failed);
        }
    }

    public static void handleLeave(Player player) {
        player.getCommunication().leaveCC(WorldModule.getLogic().getClanData().get(player.getCommunication().getClanChat()));

    }
}
