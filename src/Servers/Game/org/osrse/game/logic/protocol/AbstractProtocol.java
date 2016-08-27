/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.protocol;

import org.jboss.netty.channel.ChannelFutureListener;
import org.osrse.model.utility.Response;
import org.osrse.network.PacketBuilder;
import org.osrse.network.Session;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.game.logic.player.Player;

/**
 * @author Jonathan
 */
public abstract class AbstractProtocol implements RunescapeProtocol {

    protected final Player player;

    public AbstractProtocol(Player player) {
        this.player = player;
    }

    public static void sendLoginResponse(LoginRequest request, Response resp) {
        Session session = request.getSession();
        if (session != null && session.isConnected()) {
            PacketBuilder bldr = new PacketBuilder();
            bldr.putByte(resp.intValue());
            if (resp == Response.LOGIN) {
                Player player = (Player) session.getAttachment();
                player.getProtocol().applyLoginBlock(bldr);
                player.write(bldr.toPacket());
                player.sendLogin();
            } else {
                if (resp == Response.TANSFERRING) {
                    bldr.put((byte) request.getTransferTime());
                }
                session.write(bldr.toPacket()).addListener(ChannelFutureListener.CLOSE);
            }
        }
    }

    protected void applyLoginBlock(PacketBuilder bldr) {
        bldr.putByte(0); //authenticator boolean
        bldr.putInt(0); //authenticator code regardless of boolean is skipped

        bldr.putByte(player.getPrivilege().getClientReference());
        bldr.putByte(0);
        bldr.putShort(player.getIndex()); //player index
        bldr.putByte(0);
    }





}
