/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.slave;

import org.osrse.network.AbstractPacketDispatcher;
import org.osrse.slave.handler.*;

import java.util.logging.Level;

/**
 *
 * @author Jonathan
 */
public class CommercialProtocol extends AbstractPacketDispatcher<LoginSession> {

        //@Override
        //0 response fixed
        //1 register world varbyte
        //2 register player, string name int finalIndex, int privstatus, int[] friendsonthatWorld, varbyte
        //3 remove player, int finalIndex/can be used for kick
        //4 setPlayer priv status
        //5 sendPm finalIndex, string msg, finalIndex To
        //6 create/edit communications 1 ?, indexWho
        //7 join communications/leaveClan, indexClan, indexWho
        //8 promote, byte howmany, smartint index(s)Who
        //lol funny how ^ changed
    public CommercialProtocol() {
        super(50);
    }

    public void loadHandlers() {
        try {
            packetHandlers[0]= new WorldResponse(); //register our world
            packetHandlers[1]= new WorldAnnounce(); //register foreign world
            packetHandlers[2]= new WorldSync(); //sync players on multiple worlds
            packetHandlers[3]= new PlayerLoginResponse(); //playeraccept
            packetHandlers[4]= new PlayerAnnounce(); //playerbroadcast
            packetHandlers[5]= new FSPrivacy(); //other world privacy change
            packetHandlers[6]= new FSListEdit(); //deleted someone on this world
            packetHandlers[7]= new FSMessage(); //messaged someone on this world
            packetHandlers[8]= new FSDefinition(); //when you add someone on another world will u see them
            packetHandlers[9]= new FCResponse();
            packetHandlers[10]= new CCDefinition();//syncs clan with this world
            packetHandlers[11] = new CCEdit();

            packetLength[0]=-1;
            packetLength[1]=-1;
            packetLength[2]=-2;
            packetLength[3]=4;
            packetLength[4]=-2;
            packetLength[5]=3;
            packetLength[6]=5;
            packetLength[7]=-2;
            packetLength[8]=-2;
            packetLength[9]=-1;
            packetLength[10] = -1;
            packetLength[11] = 18;
            packetLength[12] = 9;


        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error loading packet handlers!");
            e.printStackTrace();
        }
    }
}
