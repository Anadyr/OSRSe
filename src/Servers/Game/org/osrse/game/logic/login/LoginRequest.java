/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.login;


import org.osrse.model.utility.Response;
import org.osrse.network.Session;

/**
 *
 * @author Jonathan
 */
public class LoginRequest {
    
    private final LoginCredentials credentials;
    private long transferRate = 0L;
    private final Session session;
    private int loginOpcode;
    private int clientRevision;
    public Response response = Response.LOGIN;


    public final Session getSession() {
        return session;
    }
    
    public LoginRequest(Session session, LoginCredentials credentials) {
        this.session = session;
        this.credentials = credentials;
        if(credentials == null) {
            response = Response.INVALID_DETAILS;
        }
    }

    public LoginRequest setResponse(Response resp) {
        this.response = resp;
        return this;
    }

    public int getLoginOpcode() {
        return loginOpcode;
    }

    public void setLoginOpcode(int opcode) {
        this.loginOpcode = opcode;
    }
    
    public final LoginCredentials getCredentials() {
        return this.credentials;
    }
    
    public final Response getResponse() {
        return this.response;
    }


    public final void setTransferTime(long mstime) {
        this.transferRate = mstime;
    }
    
    public int getTransferTime() {
        if(transferRate == 0L) {
            return 0;
        }
        return ((int) (30 - (((System.currentTimeMillis() - transferRate) / 1000))));
    }

    public boolean hasCredentials() {
        return credentials != null;
    }

    public void setRevision(int clientRevision) {
        this.clientRevision = clientRevision;
    }

    public int getClientRevision() {
        return clientRevision;
    }
}
