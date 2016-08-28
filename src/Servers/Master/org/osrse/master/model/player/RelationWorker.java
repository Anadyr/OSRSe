package org.osrse.master.model.player;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.model.commercial.Alias;
import org.osrse.model.commercial.Communications;
import org.osrse.model.commercial.Communications.Request;
import org.osrse.network.database.DatabaseManager;
import org.osrse.utility.NameUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Jonathan on 1/15/16.
 */
public class RelationWorker implements Runnable, ComQuery {
    private final Map<Integer, HashSet<GameRequest>> requestMap = new HashMap<Integer, HashSet<GameRequest>>();

    private final PriorityQueue<GameRequest> requests = new PriorityQueue<GameRequest>(25, new CompareRequest());

    public void dispatch(GameRequest request) {
         requests.offer(request.handle());
    }

    public final boolean requiresUpdate() {
        return !requests.isEmpty();
    }

    Connection c = null;
    PreparedStatement s = null;
    String last = "";
    GameRequest request;

    long next = 0L;

    public void setIntreval() {
        next = System.currentTimeMillis() + 60000;
    }

    @Override
    public void run() {
        request = requests.peek();
        if (request != null) {
            boolean update = (request.getRequest().ordinal() < 4 ||
                    request.timestamp <= System.currentTimeMillis());
            if (update) {
                c = DatabaseManager.getConnection();
            }
            while (update) {
                if (!request.isValid()) {
                    requests.remove(request);
                    request = requests.peek();
                    update = request != null && (request.getRequest().ordinal() < 4 ||
                            request.timestamp <= System.currentTimeMillis());
                    if (!update)
                        break;
                }
                checkQuery(request);
                Communications main = MasterModule.getLogic().getCommunications(request.getStaticIndex());
                if(!handleSearch(request, main) && !handleFriendQuery(request)) {
                    handleUpdate(request, main);
                }
            }
            if (c != null) {
                DatabaseManager.closeStatement(s);
                DatabaseManager.closeConnection(c);
                c = null;
                s = null;
            }
        }
    }

    private class CompareRequest implements Comparator<GameRequest> {

        @Override
        public int compare(GameRequest o1, GameRequest o2) {
            return o2.compareTo(o1);
        }
    }

    private void loadIgnores(GameRequest request, Communications com) throws SQLException {
        PreparedStatement preparedStatement = c.prepareStatement(selectIgnores);
        preparedStatement.setInt(1, !request.join_clan ? request.player.getStaticIndex() : request.getIndex());
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()) {
            rs.last();
            int ignoreCount = rs.getRow();
            rs.first();
            com.ignoreList = new HashMap<Integer, String>(ignoreCount);
            String named;
            int ignored;
            for (int i2 = 0; i2 < ignoreCount; i2++) {
                named = NameUtilities.capitalizeFormat(rs.getString("username"));
                ignored = rs.getInt("ignored");
                com.ignoreList.put(ignored, named);
                rs.next();
            }
        } else
            com.ignoreList = new HashMap<Integer, String>(1);

        rs.close();
        preparedStatement.close();
    }

    boolean handleFriendQuery(GameRequest request) {
        if (request.getRequest().equals(Request.SERVE) || request.getRequest().equals(Request.JOIN_CLAN)) {
            try {
                s.setInt(1, !request.join_clan ? request.player.getStaticIndex() : request.getIndex());
                ResultSet rs = s.executeQuery();
                Communications com = request.join_clan ? MasterModule.getLogic().getCommunications(request.getIndex()) : request.player.getCommunications();
                if (com == null) {
                    com = new Communications(request.getIndex(), request.name, request.clanname, request.clan_join, request.clan_kick);
                }
                boolean ok = rs.next();
                if (ok) {
                    rs.last();
                    int friendCount = rs.getRow();
                    rs.first();
                    String name;
                    int frienduid, clanrank;
                    com.relationData = new HashMap<Integer, Alias>(friendCount);
                    for (int i2 = 0; i2 < friendCount; i2++) {
                        name = NameUtilities.capitalizeFormat(rs.getString("username"));
                        frienduid = rs.getInt("friend_id");
                        clanrank = rs.getByte("clanrank");
                        com.putFriend(name, frienduid, clanrank);
                        rs.next();
                    }
                } else
                    com.relationData = new HashMap<Integer, Alias>(1);
                loadIgnores(request, com);

                if (request.join_clan) {
                    MasterModule.getLogic().setInChat(request.getIndex(), com);
                    GlobalPlayer p = MasterModule.getLogic().getPlayer(request.getStaticIndex());
                    com.getClanChat().open();
                    int i = com.joinResponse(p, true);
                    if(i == 0) {
                        System.out.println(com.currentChat+"/"+com.username()+"/"+com.getClanChat().getChatName());
                        request.clanRank = com.getRank(p.getStaticIndex()).ordinal(); //this is on purpose because values arent parellel to client
                        MasterModule.getLogic().addPlayerToCC(MasterModule.getLogic().getWorldContaining(p.getStaticIndex()), com, p, false);
                    } else {
                        request.ignore = true;
                        request.clanRank = -i;
                    }
                    World w = MasterModule.getLogic().worlds().get(p.getWorldId());
                    if (w != null) {
                        w.sendRequest(request);
                    }
                } else {
                    MasterModule.getLogic().setInChat(request.player.getStaticIndex(), com);
                    for (World w : MasterModule.getLogic().worlds().toList()) {
                        if (w.isOnline()) {
                            if (w.getIndex() != request.player.getWorldId()) {
                                w.announcePlayer(false, request.player);
                            } else {
                                w.sendFriendServer(request.player, com);
                            }
                        }
                    }
                }
                rs.close();
                request.setValid(false);
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    boolean handleSearch(GameRequest request, Communications com) {
        if (request.getRequest().equals(Request.FIND) || request.getRequest().equals(Request.FIND_CLAN)) {
            try {
                s.setString(1, request.name);
                ResultSet set = s.executeQuery();
                if (set.next()) {
                    int uid = set.getInt("uid");
                    request.setIndex(uid);
                    if (request.getRequest().equals(Request.FIND_CLAN)) {
                        request.join_clan = true;
                        request.clanname = set.getString("clan");
                        System.out.println(request.clanname);
                        if (!set.wasNull()) {
                            request.clan_join = set.getInt("clan_join");
                            request.clan_kick = set.getInt("clan_kick");
                            request.setType(Request.JOIN_CLAN);
                            checkQuery(request);
                            set.close();
                            return false;
                        } else {
                            System.out.println("could not find clan" + request.name);
                            request.clanname = "";
                        }
                    } else {
                        request.setType(request.remove ? Request.DEL : Request.ADD);
                        com.pushRequest(request.getRequest(), request.name, request.getStaticIndex(), request.getIndex(), request.ignore);
                    }
                } else {
                    if (request.getRequest().equals(Request.FIND_CLAN))
                        request.join_clan = true;
                }
                set.close();
                World w = MasterModule.getLogic().getWorldContaining(request.getStaticIndex());
                if (w != null) {
                    w.sendRequest(request);
                }
                request.setValid(false);
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    void handleUpdate(GameRequest request, Communications com) {
        try {
                s.setInt(1, request.getStaticIndex());
                s.setInt(2, request.getIndex());
                if (request.getRequest().equals(Request.EDIT_CLAN)) {
                    s.setInt(3, request.getClanRank());
                }
                com.pushRequest(request.getRequest(), request.name, request.getStaticIndex(), request.getIndex(), request.ignore);
                s.executeUpdate();
                request.setValid(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void checkQuery(GameRequest request) {
        try {
            String currQ = request.getRequest().equals(Request.ADD) ? (request.ignore ? addIgnore : addPlayer) :
                    request.getRequest().equals(Request.DEL) ? (request.ignore ? deleteIgnore : deleteFriend) :
                            request.getRequest().equals(Request.EDIT_CLAN) ? modifyClanSingle :
                                    request.getRequest().equals(Request.FIND) ? findPlayer :
                                            (request.getRequest().equals(Request.SERVE) || request.getRequest().equals(Request.JOIN_CLAN)) ? selectFriends : findClan;
            if(!last.equalsIgnoreCase(currQ) && s != null) {
                s.close();
            }
            s = c.prepareStatement(currQ);
            last = currQ;
        } catch (SQLException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
    }
}
