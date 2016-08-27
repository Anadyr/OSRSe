package org.osrse.master.model.player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Jonathan on 1/15/16.
 */
public interface ComQuery {

     final Map<Integer, HashSet<GameRequest>> requests = new HashMap<Integer, HashSet<GameRequest>>();
     final ConcurrentLinkedQueue<GlobalPlayer> friendServerQueue = new ConcurrentLinkedQueue<GlobalPlayer>();
     final ConcurrentLinkedQueue<GameRequest> instantHandlingQueue = new ConcurrentLinkedQueue<GameRequest>();
    /**
     * Update on intervals per minute.
     */
     final ConcurrentLinkedQueue<GameRequest> databaseUpdate = new ConcurrentLinkedQueue<GameRequest>();


    final String selectIgnores = "SELECT username, ignores.uid, ignored \n" +
            "FROM ignores \n" +
            "LEFT JOIN playerinfo \n" +
            "ON ignores.ignored = playerinfo.uid\n" +
            "WHERE ignores.uid = ?";
    final String selectFriends = "SELECT username, friend_id, clanrank\n" +
            "FROM friends\n" +
            "LEFT JOIN playerinfo\n" +
            "ON friends.friend_id = playerinfo.uid\n" +
            "WHERE friends.uid = ?";

    final String modifyClanSingle = "UPDATE friends\n" +
            "SET clanrank = ?\n" +
            "WHERE uid = ? AND friend_id = ?;";

    final String addPlayer = "INSERT INTO friends (uid, friend_id)" +
            " VALUES (?, ?);";

    final String findPlayer = "SELECT uid FROM playerinfo WHERE username = ?";

    final String deleteFriend = "DELETE FROM friends " +
            "WHERE uid = ? AND friend_id = ?;";

    final String addIgnore = "INSERT INTO ignores (uid, ignored)" +
            " VALUES (?,?);";

    final String deleteIgnore = "DELETE FROM ignores" +
            " WHERE uid = ? AND ignored = ?;";

    final String findClan = "SELECT uid, clan, clan_join, clan_kick FROM playerinfo WHERE username = ?";

    final String oldFindClan = "SELECT A.uid, A.clan, A.clan_join, A.clan_kick, B.friend_id, B.clanrank" +
                            " FROM playerinfo A JOIN friends B ON A.uid = B.uid " +
                            "WHERE a.username = ?";

    final String additionalVals = ", (?, ?)";

}
