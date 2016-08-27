/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse;

import org.osrse.network.handler.ServiceHandler;
import org.osrse.master.LoginBase;
import org.osrse.master.network.WorldLoginDecoder;

import org.osrse.master.network.WorldProtocolDispatcher;

/**
 * @author Jonathan
 */
public class MasterModule extends Module {

    public MasterModule() {
        super(Type.MASTER, new LoginBase());
    }

    @Override
    public final void commenceNetworking() {
        manager.setNetwork(new WorldProtocolDispatcher(), true, "", moduleBase.getReferencePort())
               .setHandlers(new ServiceHandler(), new WorldLoginDecoder());
    }

    @Override
    protected final void load() {
        //TODO load grand exchange economy
        //TODO load? clans
    }

    public static LoginBase getLogic() {
        return (LoginBase) moduleBase;
    }
}
