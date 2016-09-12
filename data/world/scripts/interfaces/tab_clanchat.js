importPackage(org.osrse.model.commercial);
importPackage(org.osrse.utility);
importPackage(org.osrse);

function handlecc(player, interfaceId, button, idx, idx2) {
    if (interfaceId == 589) {
        if (button == 9) {
            var gc = player.getCommunication().basic().getClanChat();
            if (gc.isValid()) {
                player.getProtocol().sendString(590, 29, NameUtilities.capitalizeFormat(gc.getChatName()))
            }
            player.getProtocol().sendString(590, 31, gc.getJoinReq().toString() + "+");
            player.getProtocol().sendString(590, 33, gc.getJoinReq().toString() + "+");
            player.getProtocol().sendString(590, 35, gc.getKickReq().toString() + "+");
            player.getProtocol().sendInterface(false, 590)
        }
    } else if (interfaceId == 590) {
        if (button == 29) {
            //change cc name
        } else if (button == 31) {
            //change cc join rank
        } else if (button == 33) {
            //change cc talk rank
        }
        //35 change kick packet now
        //17 close
    }
        player.sendMessage("" + interfaceId + ", " + button)

}

function leave(player) {
    player.getCommunication().leaveCC()
}

function join(player, cc) {
    var c = WorldModule.getLogic().getCommunicable(NameUtilities.capitalizeFormat(cc));
    player.sendMessage("Attempting to join channel...");
    if (WorldModule.isCommercial()) {
        /**
         * Second phase, offline clan, or out of world clan.
         * NOT registered to this world yet. Need Update server to give us credentials
         * WILL immediately update this player and add him to the channel if he can
         */
        //System.out.println("Requesting clan "+(c==null)+", "+cc)
        WorldModule.getLogic().getLoginSession().requestDefinedFS(false, 2, player.getStaticIndex(), (c == null ? -1 : c.getStaticIndex()), cc)
    } else {
        /**
         * Local Server CC
         */
        //check for player file
        //load clan if needed, otherwise tell them to get fukd
        player.sendMessage("Sorry server is commercial settings only.")
    }
}