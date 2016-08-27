package org.osrse.network;

import org.osrse.utility.Serviceable;

public abstract class PacketHandler<H extends Serviceable> {

    public abstract void handle(H h, Packet packet);

} 