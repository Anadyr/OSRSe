package org.osrse.slave.handler;

import org.osrse.WorldModule;
import org.osrse.game.logic.player.Player;
import org.osrse.model.commercial.Communicable;
import org.osrse.model.commercial.Communications;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.slave.LoginSession;
import org.osrse.slave.ReferencedPerson;
import org.osrse.utility.NameUtilities;

import java.lang.ref.Reference;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jonathan on 12/21/13.
 */
public class CCDefinition extends PacketHandler<LoginSession> {

    @Override
    public void handle(LoginSession session, Packet packet) {
        int ccOwner = packet.getInt();
        int size = packet.get();
        boolean defineBlock = packet.getBoolean();
        Communications com = WorldModule.getLogic().getClanData().get(ccOwner);
        System.out.println("CCDEF ="+ccOwner+","+size+", "+defineBlock+"/"+(com == null));
        ReferencedPerson person = new ReferencedPerson(0, ccOwner, 3);
        if(defineBlock) {
            int joinreq = packet.get();
            int kickreq = packet.get();
            String username = packet.getString();
            String ccname = packet.getString();
            person.setUsername(username);
            WorldModule.getLogic().getLoginSession().appendFake(person);
            WorldModule.getLogic().getLoginSession().getIndexToName().put(ccOwner, NameUtilities.capitalizeFormat(username));
            if(com == null) {
                com = new Communications(ccOwner, username, ccname, joinreq, kickreq);
                com.getClanChat().open();
                WorldModule.getLogic().getClanData().put(ccOwner, com);
            }
        } else {
            if(!com.getClanChat().isOpen()) {
                com.getClanChat().open();
            }
        }
        if(packet.remaining() >= size * 5) { //min
            for (int i = 0; i < size; i++) {
                int id = packet.getInt();
                //int worldId = packet.getShort();
                int rank = packet.get();
                Communicable ccc = WorldModule.getLogic().getCommunicableNode(id);
                System.out.println("DEFINING" +(ccc == null) +"/"+ccc.getUsername()+"/"+rank+"/"+(com == null)+"/"+id);
                //com.putFriend(ccc.getUsername(), id, rank);

                com.getClanChat().getInChat().put(ccc.getUsername(), ccc);
            }
        } else {
            System.err.println("SEVERE sync issue on CCDef Packet. owner="+ccOwner+", size="+size+", defined="+defineBlock);
        }

    }

}
