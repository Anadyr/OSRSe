/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.model;

import org.osrse.Module;
import org.osrse.network.PacketHandler;
import org.osrse.network.Session;
import org.osrse.utility.Configuration;
import org.osrse.utility.OutputDisplay;

import java.math.BigInteger;


/**
 * @author Jonathan
 */
public abstract class ModuleStore implements Runnable {

    /**
     * used for server encryption Master <-> Game on login.
     */
    private BigInteger storeModulus, storeExponent;

    protected Configuration moduleConfig;

    public final void start() throws Exception {
        moduleConfig = new Configuration(Module.getFile("config.inf"));
        storeModulus = new BigInteger(moduleConfig.getString("RSA_MODULUS"));
        storeExponent = new BigInteger(moduleConfig.getString("RSA_EXPONENT"));
        System.out.println("Starting logic..");
        OutputDisplay.increment();
        finishLogic();
        OutputDisplay.decrement();
    }

    /**
     * BaseExponent the rsa in the base for the login-world module login packet
     *
     * @return
     */
    public final BigInteger getBaseExponent() {
        return storeExponent;
    }


    /**
     * BaseModulus the rsa in the base for the login-world module login packet
     *
     * @return
     */
    public final BigInteger getBaseModulus() {
        return storeModulus;
    }

    protected abstract void finishLogic() throws Exception;

    public abstract int getReferencePort();

    /**
     * Here we create a PacketHandler with the class name of @name
     */
    @Deprecated
    public PacketHandler<?> createHandler(String name) {
        return null;
    }

    /**
     * The modules main response to a connected client
     */
    public abstract void sendResponse(Session session);


}
