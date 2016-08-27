package org.osrse.model.commercial;


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jonathan on 12/30/15.
 */
public class Communications {
	public enum Request {SERVE, FIND, FIND_CLAN, JOIN_CLAN, ADD, DEL, EDIT_CLAN}
    public enum ClanRank { NONE(-1), FRIEND(0), RECRUIT(1), CORPORAL(2), SERGEANT(3),  LIEUTENANT(4), CAPTAIN(5), GENERAL(6), OWNER(7), ADMIN(127);
        private int id;

        ClanRank(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static ClanRank forId(int id) {
            if(id > values().length || id < 0) {
               return NONE;
            }
            return values()[id];
        }
    }

    public Map<Integer, Alias> relationData;
    public Map<Integer, String> ignoreList;

    public final int uid;
    private String username;

    private final GroupChat clanChat;
    private static final Object lock = new Object();

    public Communications(int uid, String owner, String clanName, int joinReq, int kickReq) {
        this.uid = uid;
        this.username = owner;
        this.clanChat = new GroupChat(clanName, joinReq, kickReq);
        if(clanChat.isValid() && !clanChat.isOpen()) {
            clanChat.open();
        }
    }

    public String username() {
        return username;
    }

    public GroupChat getClanChat() {
        return clanChat;
    }

    public void pushRequest(Request request, String username, int index, int rank, boolean ignore) {
        synchronized (lock) {
            if(request.equals(Request.ADD)) {
                if(ignore)
                    ignoreList.put(index, username);
                else
                    relationData.put(index, new Alias(username, ClanRank.FRIEND));
            } else if(request.equals(Request.DEL)) {
                if(ignore)
                    ignoreList.remove(index);
                else
                    relationData.remove(index);
            } else if(request.equals(Request.EDIT_CLAN)) {
                relationData.get(index).setRank(ClanRank.forId(rank));
            }
        }
    }

    public boolean hasIgnore(int staticIndex) {
        return ignoreList != null && ignoreList.containsKey(staticIndex);
    }

    public boolean isLoaded() {
        return relationData != null || ignoreList != null || clanChat.isValid();
    }

    public void setFriendsList(int friendsList) {
        this.relationData = new HashMap<Integer, Alias>(friendsList);
    }

    public void setIgnoreList(int size) {
        this.ignoreList = new HashMap<Integer, String>(size);
    }

    public void putFriend(String username, int index, int rank) {
        synchronized (lock) {
            relationData.put(index, new Alias(username, ClanRank.forId(rank)));
        }
    }

    public void putIgnore(String username, int index) {
        synchronized (lock) {
            ignoreList.put(index, username);
        }
    }

    public void removeIgnore(int staticIndex) {
        synchronized (lock) {
            ignoreList.remove(staticIndex);
        }
    }


    /**
     * This is for if the player isn't online and is removed.
     * @param username
     */
    public int removeFriend(String username) {
        synchronized (lock) {
            for(Map.Entry<Integer, Alias> a: relationData.entrySet()) {
                if(a.getValue().toString().equalsIgnoreCase(username)) {
                    relationData.remove(a.getKey());
                    return a.getKey();
                }
            }
        }
        return 0;
    }

    public Alias removeFriend(int index) {
        synchronized (lock) {
             return relationData.remove(index);
        }
    }

    /**
     * Manage Relation
     * edits a Players Rank in this cc
     * @param friendId
     * @param rank
     */
    public void manageRelation(int friendId, int rank) {
        synchronized (lock) {
            Alias a = relationData.get(friendId);
            a.setRank(ClanRank.forId(rank));
            System.out.println("added clan rank id="+friendId+", rank="+rank);
        }
    }

    public boolean hasFriend(int staticIndex) {
        return (staticIndex == this.uid) || hasFriends() &&  relationData.get(staticIndex) != null;
    }

    //TODO make multipurpose and able to tell admin rank without searching maybe list when joined
    public ClanRank getRank(int staticIndex) {
        //todo find admin rank
        if(uid == staticIndex) {
            return ClanRank.OWNER;
        }
        if(staticIndex == 1) {
            return ClanRank.ADMIN;
        }
        synchronized (lock) {
            return (relationData != null && relationData.containsKey(staticIndex)) ? relationData.get(staticIndex).getRank() : ClanRank.NONE;
        }
    }

    public synchronized Map<Integer, Alias> getRelationData() {
        synchronized (lock) {
            return relationData;
        }
    }

    public synchronized Map<Integer, String> getIgnores() {
        synchronized (lock) {
            return this.ignoreList;
        }
    }


    /**
     *
     * @param com
     * @return  0 success, 1 rank problem, 2 full, 3 not allowed, 4 does not exist, 5 error.
     */
    public synchronized int joinResponse(Communicable com, boolean join) {
        synchronized (lock) {
            if(com == null) {
                System.err.println("Synchronization error?");
                return 5;
            }
            if(!getClanChat().isOpen() && com.getStaticIndex() != uid) {
                System.err.println("inchat is null wtf");
                return 4;
            }
            if(ignoreList != null && ignoreList.containsKey(com.getStaticIndex())) {
                return 3;
            }
            if(clanChat.joinReq != ClanRank.NONE) { //change this when you add FC and CC type rs versions
                if(getRank(com.getStaticIndex()).getId() < clanChat.joinReq.getId()) {
                    return 1;
                }
            }

            System.out.println(join+"/"+ clanChat.isValid() +"/"+ !clanChat.isOpen());
            boolean success = (clanChat.getInChat().size() < 99 || com.getStaticIndex() == uid);
            if (join && success) {
                clanChat.add(com);
            }
            return success ? 0 : 2;
        }
    }

    /**
     *  We have to wonder if this kid is a loser
     * @return
     */
    public boolean hasFriends() {
        return relationData != null && relationData.size() > 0;
    }

    public int get(String username, boolean ignore) {
        if(ignore) {
            for(Map.Entry<Integer, String> a : ignoreList.entrySet()) {
                if(a.getValue().equalsIgnoreCase(username)) {
                    return a.getKey();
                }
            }
        } else {
            for(Map.Entry<Integer, Alias> a : relationData.entrySet()) {
                if(a.getValue().getUsername().equalsIgnoreCase(username)) {
                    return a.getKey();
                }
            }
        }
        return -1;
    }



}
