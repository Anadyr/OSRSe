/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.network;

import org.osrse.game.logic.login.LoginCredentials;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.model.utility.Response;
import org.osrse.network.Session;
import org.jboss.netty.buffer.ChannelBuffer;

/**
 *
 * @author Jonathan
 * here we will edit blocks like
 * Login, handshake, js5
 */
public abstract class LoginProtocol {

    protected final LoginRequest createRequest(Session session, String name, String password, int detailType, int[] isaac) {
        boolean illegal = !name.matches("[a-zA-Z0-9 _]*") || !password.matches("[a-zA-Z0-9 _]*");
        LoginCredentials credentials = null;
        if(!illegal && name.length() <= 13  && password.length() <= 20) {
            session.setISAAC(isaac, false);
            credentials = new LoginCredentials(name, password, detailType);
        }
        final LoginRequest request = new LoginRequest(session, credentials);
        if(credentials == null) {
            request.setResponse(Response.INVALID_DETAILS);
        }
        return request;
    }

    public abstract LoginRequest handleLogin(ChannelBuffer buffer, Session session);

}