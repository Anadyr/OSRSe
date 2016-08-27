package org.osrse.model.commercial;

import java.util.TreeMap;

/**
 * Created by Jonathan on 8/26/2016.
 */
public class GroupChat {

	public TreeMap<String, Communicable> inChat;
	public TreeMap<Integer, Boolean> worldsHosted;

	private String ccname = "";
	protected Communications.ClanRank joinReq, kickReq;

	public GroupChat(String chatName, int joinReq, int kickReq) {
		this.ccname = chatName;
		this.joinReq = Communications.ClanRank.forId(joinReq);
		this.kickReq = Communications.ClanRank.forId(kickReq);
	}

	public void open() {
		worldsHosted = new TreeMap<Integer, Boolean>();
		inChat = new TreeMap<String, Communicable>();
	}

	public void close() {
		worldsHosted.clear();
		worldsHosted = null;
		inChat.clear();
		inChat = null;
	}

	public void remove(String name) {
		inChat.remove(name);
	}

	/**
	 * Checks if room available, Owner always has a spot in his own CC
	 * @param com
	 * @param owner
	 * @return
	 */
	public void add(Communicable com) {

		inChat.put(com.getUsername(), com);
	}

	public String getChatName() {
		return ccname;
	}

	public void changeChat(String name, int joinReq, int kickReq) {
		if (!name.isEmpty()) {
			this.ccname = name;
		}
		if (joinReq != -1) {
			//force kick those in chat without shit without timeout...
		}
		if (kickReq != -1) {

		}
	}

	public boolean hostedIn(int worldVal) {
		return worldsHosted.containsKey(worldVal) ? worldsHosted.get(worldVal) : false;
	}

	public void editHost(int world, boolean add) {
		worldsHosted.put(world, add);
	}

	public TreeMap<String, Communicable> getInChat() {
		return inChat;
	}


	public boolean isValid() {
		return ccname != null && !ccname.isEmpty();
	}

	public boolean isOpen() {
		return inChat != null;
	}

	public Communications.ClanRank getJoinReq() {
		return joinReq;
	}

	public Communications.ClanRank getKickReq() {
		return kickReq;
	}

}
