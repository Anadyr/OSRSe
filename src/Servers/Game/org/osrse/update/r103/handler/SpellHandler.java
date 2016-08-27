package org.osrse.update.r103.handler;

import org.osrse.WorldModule;
import org.osrse.game.content.combat.Combat;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;

/**
 * Created by Jonathan on 1/10/16.
 */
public class SpellHandler extends PacketHandler<Player> {

    @Override
    public void handle(Player player, Packet packet) {
        int mob_index = packet.getLEShort();
        boolean ok = packet.getA() == 1;
        int spellHash = packet.getInt2();
        int idfk = packet.getLEShortA();

        int book = spellHash >> 16;
        int spell = spellHash & 0xffff;

        if(idfk != -1)
        System.out.println(idfk);
        Combat.handleSpell(player, WorldModule.getLogic().getMobs().get(mob_index), spell);
    }
}
