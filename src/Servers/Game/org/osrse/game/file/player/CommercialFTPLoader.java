package org.osrse.game.file.player;

import org.osrse.game.logic.player.PlayerDefinition;

/**
 * Created by Jonathan on 12/27/15.
 */
public class CommercialFTPLoader extends LoadableContext {


    @Override
    public PlayerDefinition loadPlayer(PlayerDefinition currentDetails) {
        return null;
    }

    @Override
    public void applySaveHeader(String table, StringBuilder query, PlayerDefinition player) {

    }

    @Override
    public void finalizeSave(StringBuilder query, PlayerDefinition player) {

    }
}
