package org.osrse.update.r103;

import org.jboss.netty.buffer.ChannelBuffer;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.game.network.LoginProtocol;
import org.osrse.model.utility.Response;
import org.osrse.network.Session;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.StreamUtilities;
import org.osrse.utility.crypto.XTEA;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/**
 * Created by Jonathan on 10/29/15.
 */
public class Login103 extends LoginProtocol {

    @Override
    public LoginRequest handleLogin(ChannelBuffer buffer, Session session) {
        byte[] rsaArray = new byte[buffer.readShort() & 0xff];
        buffer.readBytes(rsaArray);
        ByteBuffer rsaBuffer = ByteBuffer.wrap(new BigInteger(rsaArray).toByteArray());//.modPow(Constants.RSA_EXPONENT, Constants.RSA_MODULUS).toByteArray());

        int rsaHeaderKey = rsaBuffer.get();
        if (rsaHeaderKey != 1) {
            return new LoginRequest(session, null).setResponse(Response.ERROR);
        }
        rsaBuffer.get();// newcache

        int[] xtea = new int[4];
        for (int i = 0; i < 4; i++) {
            xtea[i] = rsaBuffer.getInt();
        }

        rsaBuffer.getLong();
        String password = StreamUtilities.getUString(rsaBuffer);
        byte[] xteabytes = new byte[buffer.readableBytes() - 2];
        buffer.readBytes(xteabytes);
        ByteBuffer xteaBuffer = ByteBuffer.wrap(new XTEA(xtea, xteabytes, 0).decipher());

        String name = NameUtilities.displayFormat(StreamUtilities.getUString(xteaBuffer));
        int detailType = xteaBuffer.get();

        boolean resizable = (detailType >> 1) == 1;
        int unusable = (detailType & 0x1) ;
        detailType = (detailType >> 1);

        xteaBuffer.getShort(); //clientx
        xteaBuffer.getShort();//clienty

        byte[] settingbytes = new byte[24];
        xteaBuffer.get(settingbytes);

        StreamUtilities.getString(xteaBuffer); //newcache

        int[] var = new int[5];//newcache
        for (int i = 0; i < var.length; i++)
            var[i] = xteaBuffer.getInt();//newcache

        xteaBuffer.get();//newcache

        int[] archiveCrcs = new int[16]; //now 16
        for (int i = 0; i < 15; i++) {
            archiveCrcs[i] = xteaBuffer.getInt();
        }
        return createRequest(session, name, password, detailType, xtea);
    }

}
