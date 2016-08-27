package org.osrse.master.model.player.dep;

import org.osrse.MasterModule;
import org.osrse.master.model.World;
import org.osrse.master.model.player.ComQuery;
import org.osrse.master.model.player.GameRequest;
import org.osrse.master.model.player.GlobalPlayer;
import org.osrse.model.commercial.Communications;
import org.osrse.network.database.DatabaseManager;
import org.osrse.utility.NameUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashSet;


/**
 * Created by Jonathan on 1/15/16.
 */
public class OldAssembler implements Runnable, ComQuery {

    public enum Request {ADD_FRIEND, DEL_FRIEND, ADD_IGNORE, DEL_IGNORE, CLAN_EDIT, FIND}

    private volatile long nextDBPush = 0L;
    private boolean hasFIND = false;

    private boolean updateDB() {
        return hasFIND || !databaseUpdate.isEmpty() && (System.currentTimeMillis() - nextDBPush) >= 0;
    }

    public final void requestFriendServer(GlobalPlayer p) {
        friendServerQueue.offer(p);
    }

    public void queueDel(int owner, int personTo, boolean ignoreList) {
        GameRequest req = new GameRequest(owner, personTo, ignoreList);
        check(req, Request.FIND);
    }

    public void queueAdd(int owner, int personTo, String username, boolean ignoreList) {
        GameRequest req = new GameRequest(owner, personTo, username, ignoreList);
        check(req, Request.DEL_IGNORE);
    }

    private void queue(GameRequest req) {
        check(req, Request.DEL_IGNORE);
    }

    void check(GameRequest req, Request ignore) {
        synchronized (requests) {
            if (requests.get(req.getStaticIndex()) != null) {
                for (GameRequest re : requests.get(req.getStaticIndex())) {
                    if (ignore != null && re.getIndex() == req.getIndex() && re.type != ignore && re.type != Request.FIND) {
                        re.setValid(false); //more than likely, this kid is spamming delete remove. this stops that.
                    }
                }
            } else {
                requests.put(req.getStaticIndex(), new HashSet<GameRequest>());
            }
            requests.get(req.getStaticIndex()).add(req);
            instantHandlingQueue.offer(req);
        }
    }

    public boolean alterPostRequest(int from, int index, int rank) {
        if (requests.get(from) != null) {
            for (GameRequest fr : requests.get(from)) {
                if (fr.getStaticIndex() == from && fr.getIndex() == index) {
                    fr.clanRank = rank;
                    return true;
                }
            }
        }
        return false;
    }

    public void queueRank(int owner, int clanmember, int rank) {
        if (!alterPostRequest(owner, clanmember, rank)) {
            GameRequest request = new GameRequest(owner, clanmember, rank);
            check(request, Request.ADD_FRIEND);
        }
    }


    Connection c = null;
    PreparedStatement s = null;
    String last = "";
    ResultSet rs = null;
    GameRequest request;

    boolean usedLast = false;

    @Override
    public void run() {
        try {
            c = DatabaseManager.getConnection();
            while (!friendServerQueue.isEmpty()) {
                GlobalPlayer gp = friendServerQueue.remove();
                if (gp != null) {
                    if (gp.getCommunications().getRelationData().isEmpty()) {
                        if (s == null) {
                            s = c.prepareStatement(selectFriends);
                            usedLast = true;
                        }
                        s.setInt(1, gp.getStaticIndex());
                        rs = s.executeQuery();
                        if (rs.next()) {
                            rs.last();
                            int friendCount = rs.getRow();
                            rs.first();
                            String name;
                            int frienduid, clanrank;
                            for (int i = 0; i < friendCount; i++) {
                                name = NameUtilities.capitalizeFormat(rs.getString("username"));
                                frienduid = rs.getInt("friend_id");
                                clanrank = rs.getByte("clanrank");
                                gp.getCommunications().putFriend(name, frienduid, clanrank);
                                rs.next();
                            }
                        }
                        MasterModule.getLogic().setInChat(gp.getStaticIndex(), gp.getCommunications());
                    }
                    for (World w : MasterModule.getLogic().worlds().toList()) {
                        if (w.isOnline()) {
                            if (w.getIndex() != gp.getWorldId()) {
                                w.announcePlayer(false, gp);
                            } else {
                                w.sendFriendServer(gp, gp.getCommunications());
                            }
                        }
                    }
                }
            }
            while (!instantHandlingQueue.isEmpty()) {
                request = instantHandlingQueue.poll();
                if (request.isValid()) {
                    Communications com = MasterModule.getLogic().getCommunications(request.getStaticIndex());
                    if (request.type != Request.CLAN_EDIT) {
                        if (request.type != Request.FIND) {
                            World w1 = MasterModule.getLogic().getWorldContaining(request.getIndex());
                            if (w1 != null) {
                                w1.editRelationBetween(request.getIndex(), request.getStaticIndex(), request.type.ordinal()); //remove or adding to a list
                            }
                            if (request.type == Request.DEL_IGNORE) {
                                com.removeIgnore(request.getIndex());
                            } else if (request.type == Request.DEL_FRIEND) {
                                com.removeFriend(request.getIndex());
                            }
                        }

                    }
                    request.timestamp();
                    databaseUpdate.offer(request);
                }
                instantHandlingQueue.remove(request);
            }
            while (updateDB()) {
                request = databaseUpdate.poll();
                find:
                if (hasFIND) {
                    int i = databaseUpdate.size();
                    for (; i > 0; i--) {
                        request = databaseUpdate.poll();
                        if (hasFIND && request != null && request.type != Request.FIND) {
                            break find;
                        }
                    }
                    hasFIND = false;
                }
                if (request == null) {
                    hasFIND = false;
                    break;
                }
                if (request.type != Request.FIND && request.timestamp <= System.currentTimeMillis() || request.type == Request.FIND) {
                    if (request.isValid()) { //in case some kid is going to change his mind at the last time
                        Communications com = MasterModule.getLogic().getCommunications(request.getStaticIndex());
                        handleQuery(request, com);
                        //MasterModule.getLogic().updater().dispatch(request);
                        if (requests.containsKey(request.getStaticIndex())) {
                            requests.get(request.getStaticIndex()).remove(request); //spam protector
                            if (requests.get(request.getStaticIndex()).isEmpty()) {
                                requests.remove(request.getStaticIndex()); //why not
                            }
                        }
                    }
                    databaseUpdate.remove(request);
                } else {
                    nextDBPush = request.timestamp;
                }
            }
            if (c != null) {
                DatabaseManager.closeAll(c, s, rs);
                c = null;
                s = null;
                rs = null;
                usedLast = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void handleQuery(GameRequest request, Communications com) {
        try {
            secondStatement(request.type);
            if (request.type == Request.FIND) {
                s.setString(1, request.name);
                ResultSet set = s.executeQuery();
                if (set.next()) {
                    int uid = set.getInt("uid");
                    request.setIndex(uid);
                    request.type = request.ignore ? Request.ADD_IGNORE : Request.ADD_FRIEND;
                    requests.get(request.getStaticIndex()).remove(request);
                    queue(request);
                }
                set.close();

                World w = MasterModule.getLogic().getWorldContaining(com.uid);
                if (w != null) {
                    w.sendRequest(request);
                }
            } else {
                s.setInt(1, request.getStaticIndex());
                s.setInt(2, request.getIndex());
                if(request.type == Request.CLAN_EDIT) {
                    s.setInt(3, request.getIndex());
                }
                s.executeUpdate();
                if (request.type == Request.ADD_FRIEND) {
                    com.putFriend(request.name, request.getIndex(), Communications.ClanRank.FRIEND.ordinal());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void secondStatement(Request request) {
        try {
            String currQ =
                    (request == Request.DEL_IGNORE ? deleteIgnore :
                            request == Request.ADD_IGNORE ? addIgnore :
                                    request == Request.ADD_FRIEND ? addPlayer :
                                            request == Request.DEL_FRIEND ? deleteFriend :
                                                    request == Request.CLAN_EDIT ? modifyClanSingle : findPlayer);
            //System.out.println(currQ);
            boolean kek = (!last.equalsIgnoreCase(currQ));
            if(kek || (s == null)) {
                if(kek && s != null) {
                    s.close();
                }
                s = c.prepareStatement(currQ);
                last = currQ;
            }

            if (s == null) {
            } else  if (!last.equalsIgnoreCase(currQ)) {
                s.close();
                s = c.prepareStatement(currQ);
                last = currQ;
            }
        } catch (SQLException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
    }

    public final boolean update() {
        return !friendServerQueue.isEmpty() || !instantHandlingQueue.isEmpty() || updateDB();
    }
}
