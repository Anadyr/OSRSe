/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.master.network;
 
import org.osrse.master.model.World;
import org.osrse.master.network.handler.*;
import org.osrse.network.AbstractPacketDispatcher;
import org.osrse.network.PacketHandler;

/**
 *
 * @author Jonathan
 */
public class WorldProtocolDispatcher extends AbstractPacketDispatcher<World> {
    
    public WorldProtocolDispatcher() {
        super(50);
    }


    public void loadHandlers() {
        PacketHandler<World> p;
        packetHandlers[0]= new WSyncReq();
        packetHandlers[1]= new PLoginReq();
        packetHandlers[2]= new PFinishLogin();
        packetHandlers[3]= new FCPrivacy();
        packetHandlers[4]= new FCMessage();
        packetHandlers[5]= new FSDefinedReq();


        packetLength[0]=-2;
        packetLength[1]=-1;
        packetLength[2]=-2;
        packetLength[3]=-1;
        packetLength[4]=-2;
        packetLength[5]=-1;
    }
}
