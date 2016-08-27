/*
 * The MIT License
 *
 * Copyright 2013 Jonathan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.osrse.network;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.jboss.netty.bootstrap.Bootstrap;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.osrse.task.Engine;
import org.osrse.task.event.Event;
import org.osrse.utility.ArrayUtilities;
import org.osrse.utility.Serviceable;

import java.net.InetSocketAddress;

/**
 * @author Jonathan
 */
public class ServiceManager {
    private final BiMap<Session, Channel> sessions = HashBiMap.create();
    private final BiMap<Channel, Session> channels = sessions.inverse();

    public final class Network implements Runnable {
        private final int[] ports;
        protected Bootstrap bootstrap;
        private String commercialAddress;
        private AbstractPacketDispatcher<? extends Serviceable> packetDispatcher;
        private ChannelFuture clientFuture = null;


        /**
         * used for the ls network
         *
         * @param commercialAddress the address for the loginserver
         * @param ports             the port(s) listened to or connected to
         */
        public Network(String commercialAddress, int... ports) {
            this.commercialAddress = commercialAddress;
            this.bootstrap = Engine.createBootstrap(isServer());
            this.ports = ArrayUtilities.removeValue(ports, -1);
        }

        public final boolean isServer() {
            return commercialAddress != null && commercialAddress.isEmpty();
        }

        protected final void apply(int port) {
            if (port != -1) {
                ((ServerBootstrap) bootstrap).bind(new InetSocketAddress(port));
            } else {
                Engine.scheduleClientNetwork(this);
            }
        }

        public final ChannelFuture reconnect() {
            return ((ClientBootstrap) bootstrap).connect(new InetSocketAddress(commercialAddress, ports[0]));
        }

        public final void setHandlers(ChannelHandler handler, ChannelHandler decoder) {
            ChannelPipeline pipe = bootstrap.getPipeline();
            pipe.addLast("handler", handler);
            pipe.addLast("decoder", decoder);
        }

        public final AbstractPacketDispatcher getProtocol() {
            return packetDispatcher;
        }

        public final void setProtocolDispatcher(AbstractPacketDispatcher proto) {
            this.packetDispatcher = proto;
        }

        @Override
        public void run() {
            if(clientFuture == null || !clientFuture.getChannel().isConnected()) {
                clientFuture = reconnect();
            }
        }
    }

    private Network mainNetwork, clientNetwork;

    /**
     * @param proto       packethandler
     * @param mainAddress the address to connect to, leave "" if Server
     * @param server      SERVER, CLIENT
     * @param port        ports being bound/connected to
     * @return
     */
    public Network setNetwork(AbstractPacketDispatcher<?> proto, boolean server, String mainAddress, int... port) {
        Network net = new Network(mainAddress, port);
        net.setProtocolDispatcher(proto);
        if(server) mainNetwork = net;
           else    clientNetwork = net;
        return net;
    }

    public Network getNetwork(int id) {
        return id == 0 ? mainNetwork : clientNetwork;
    }

    public Network getMainNetwork() {
        return mainNetwork;
    }

    public Network getClientNetwork() {
        return clientNetwork;
    }

    /**
     * Program
     * here we take all available networks, and launch them
     * Starting with the main network (server), then the client
     * If we are a commercial server. (connecting to login server)
     */
    public void program() {
        for (int netId = 0; netId < 2; netId++) {
            Network net = getNetwork(netId);
            if (net != null) {
                if (net.packetDispatcher != null) {
                    net.packetDispatcher.loadHandlers();
                }
                net.bootstrap.setOption("keepAlive", true);
                net.bootstrap.setOption("tcpNoDelay", true);
                String bindings = (net.isServer() ? "Bound" : "Connecting") + " to port";
                if (net.ports.length > 1 && (net.ports.length >= 2 && net.ports[1] == -1)) {
                    bindings += "s";
                }
                bindings += ": ";

                boolean hasMulti = net.ports.length > 1;
                for (int i = 0; i < net.ports.length; i++) {
                    if (net.ports[i] == -1) {
                        continue;
                    }
                    net.apply(net.isServer() ? net.ports[i] : -1);
                    if (hasMulti && (i == (net.ports.length - 1))) {
                        bindings += "and " + net.ports[i];
                    } else if (hasMulti) {
                        bindings += net.ports[i] + ((net.ports[i + 1] == -1 && net.ports[i + 2] == -1) ? "" : ", ");
                    } else {
                        bindings += net.ports[i];
                    }
                }
                bindings += ".";
                System.out.println(bindings);
            }
        }
    }

    public Session addSession(Session session) {
        sessions.put(session, session.getChannel());
        return session;
    }

    public Session getSession(Channel channel) {
        return channels.get(channel);
    }

    public void remove(Session session) {
        sessions.remove(session);
    }

    public Session remove(Channel channel) {
        Session session = getSession(channel);
        if (session != null) {
            sessions.remove(session);
        }
        return session;
    }
}
