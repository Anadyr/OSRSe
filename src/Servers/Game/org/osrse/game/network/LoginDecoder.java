package org.osrse.game.network;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;
import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.model.utility.Response;
import org.osrse.network.Session;
import org.osrse.game.logic.login.LoginRequest;

/**
 * Created by Jonathan on 5/5/14.
 */
public class LoginDecoder extends FrameDecoder {

    @Override
    protected Object decode(final ChannelHandlerContext chc, final Channel channel, ChannelBuffer buffer) throws Exception {
        Session session = Module.getManager().getSession(channel);
        if (buffer.readableBytes() >= 4) {
            buffer.markReaderIndex();
            int loginOpcode = buffer.readByte() & 0xff;
            int predictedLength = buffer.readableBytes() -1;
            int loginBlockLength = buffer.readByte() & 0xff;
            if(predictedLength >= loginBlockLength) {
                loginBlockLength = (loginBlockLength & 0xff << 8) + buffer.readByte() & 0xff;
            }
            if (buffer.readableBytes() >= loginBlockLength) {
                int[] revisionBuffer = new int[4];
                int clientRevision;
                int oldHeader = buffer.readByte() & 0xff;
                    revisionBuffer[0] = oldHeader == 255 ? (buffer.readByte() & 0xff) : oldHeader;
                    revisionBuffer[1] = (buffer.readByte() & 0xff);
                clientRevision = (revisionBuffer[0] << 8) + revisionBuffer[1]; //short
                if(!WorldModule.getLogic().hasSupportFor(clientRevision)) {
                    revisionBuffer[2] = (buffer.readByte() & 0xff);
                    revisionBuffer[3] = (buffer.readByte() & 0xff);
                    clientRevision = (revisionBuffer[0] << 24) +
                                     (revisionBuffer[1] << 16) +
                                     (revisionBuffer[2] << 8) +
                                      revisionBuffer[3];
                } //317 uses short with a 255 header so we check, but then if its not we read an integer to check the revision.
                final Response basicResponse = handleLoginBasics(loginOpcode, clientRevision);
                LoginRequest request;
                if(basicResponse == Response.LOGIN) {
                   request = WorldModule.getLogic().getLoginHandler().handleLogin(buffer, session);
                   request.setRevision(clientRevision);
                   request.setLoginOpcode(loginOpcode);
                } else {
                    request = new LoginRequest(session, null);
                }
                WorldModule.getLogic().situateRequest(request, clientRevision);
            }
        }
        return null;
    }

    final Response handleLoginBasics(int opcode, int clientRevision) {
        if (WorldModule.getLogic().isUpdating()) {
            return Response.CURRENTLY_UPDATING;
        }
        if (WorldModule.getLogic().getPlayers().isFull()) {
            return Response.WORLD_FULL;
        }
        if (!WorldModule.getLogic().hasSupportFor(clientRevision)) {
            return Response.CLIENT_UPDATED;
        }
        if(opcode != 16 && opcode != 18 || opcode == 19 && clientRevision < 593) {
            return Response.ERROR;
        }
        if(WorldModule.isCommercial() && (WorldModule.getLogic().getLoginSession() == null || WorldModule.getLogic().getLoginSession().getSession() == null || !WorldModule.getLogic().getLoginSession().getSession().isConnected() || WorldModule.getLogic().getLoginSession().isInSynch())) {
            return Response.LOGIN_SERVER_OFFLINE;
        }
        return Response.LOGIN;
    }
}
