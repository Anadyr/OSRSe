/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.master.network.handler;

import org.osrse.MasterModule;
import org.osrse.master.LoginBase;
import org.osrse.master.model.World;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 *
 * @author Jonathan
 */
public class WSyncReq extends PacketHandler<World> {

    private final int RELEASE = 0, SYNC = 1;

    @Override
    public void handle(World world, Packet packet) {
        int option = packet.get();
        switch(option) {
            case RELEASE:
                world.release(false);
                break;
            case SYNC:
                MasterModule.getLogic().syncWorld(world, packet);
                break;
        }

    }
    
}
