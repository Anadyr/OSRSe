package org.osrse.slave;

import org.jboss.netty.channel.ChannelFuture;
import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.network.Session;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.osrse.network.handler.ServiceHandler;

/**
 * Created by Jonathan on 12/21/13.
 */
public class CommercialServiceHandler extends ServiceHandler {

    @Override
    public final void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        Session session =  new Session(ctx.getChannel());
        WorldModule.getLogic().getLoginSession().setSession(session);
        session.setAttachment(WorldModule.getLogic().getLoginSession());
        Module.getManager().addSession(session);
        session.getAttachment().release(true);
    }

    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        //Session session = Module.getManager().remove(ctx.getChannel());
        //session.release();
    }

}
