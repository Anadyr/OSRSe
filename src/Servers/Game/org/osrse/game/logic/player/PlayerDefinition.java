/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.logic.player;

import org.osrse.Module;
import org.osrse.game.logic.login.LoginRequest;
import org.osrse.game.logic.map.Tile;
import org.osrse.network.handler.MessageDecoder;

import java.io.Serializable;

/**
 *
 * @author Jonathan
 */
public class PlayerDefinition implements Serializable {

    private final String username;
    private final String password;
    public boolean reconnecting = false;
    public int privateData, publicData, clanData, tradeData, assistData;
    public int coordX;
    public int coordY;
    public int coordZ;
    public int gender;
    public int hp;
    public int rights = 0;
    public boolean runToggled;
    public int runEnergy;
    public int specialEnergy;
    public int spellBook;
    public short[] bank;
    public int[] bank_value;
    public short[] equipment;
    public int[] equipment_value;
    public short[] inv;
    public int[] inv_value;
    public String[] friends;
    public int[] frienduid;
    public byte[] ranks;
    public String[] ignores;
    public String lastIP;
    public int[] levels;
    public double[] experiences;
    public int clanJoin = 0;
    public int clanKick = 7;
	public int clanTalk = -1;
	public String clanName;
    public boolean donator;
    /** used for player saving */

    public long timeLeft = 0L;
	private int staticIndex;

	public PlayerDefinition(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getRights() {
		return rights;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public int getPrivateData() {
		return privateData;
	}

	public void setPrivateData(int dat) {
		this.privateData = dat;
	}

	public int getStaticIndex() {
		return staticIndex;
	}

	public void setStaticIndex(int index) {
		this.staticIndex = index;
	}

    public boolean hasExpired(long time) {
        return true;//(time - timeLeft) / 1000 >= 30;
    }

    public final Player create(LoginRequest request) {
        Player p = new Player(request.getSession(), request.getClientRevision());
        if (coordX == -1 || coordY == -1 || coordZ == -1) {
            p.setLocation(p.getDefault()); //set player in tut/welcome stage
        } else {
            p.setLocation(Tile.locate(coordX, coordY, coordZ));
        }
        System.out.println("Location="+p.getLocation() +"/"+coordZ+", "+coordY+", "+coordX);

        p.setUsername(username);
        p.setPassword(password.replaceAll("", "*"));
        p.setRights(rights);
        p.setStaticIndex(staticIndex);
        p.setStatus(privateData);
        p.getAppearance().setGender(gender);
	    p.setCommunications(new PlayerCommunication(p, clanName, clanJoin, clanKick, clanTalk));

       // p.magic = new Standard(p);
        //if(frienduid != null)
       // for(int i = 0; i < frienduid.length; i++) {
            //p.getCommunication().basic().putFriend(frienduid[i], friends[i], ranks[i]);
      //  } //is now sent by login server

        for (int i = 0; i < Skills.SKILL_COUNT; i++) {
            if (i == Skills.PRAYER) {
                p.getSkills().setPrayerPoints(levels[i], false);
            }
            p.getSkills().setLevel(i, levels[i]);
            p.getSkills().setExperience(i, experiences[i]);
            p.getSkills().calculateCombat(true);
        }
        /*
        for (int i = 0; i < inv.length; i++) {
            int type = inv[i];
            int amount = inv_value[i];
            if (type != -1 && amount > 0) {
                p.getInventory().add(new Item(type, amount), i);
            }
        }
        for (int i = 0; i < equipment.length; i++) {
            int id = equipment[i];
            int amount = equipment_value[i];
            if (id != -1 && amount > 0) {
                p.getEquipment().add(new Item(id, amount), i);
            }
        }
        for (int i = 0; i < bank.length; i++) {
            int type = bank[i];
            int amount = bank_value[i];
            p.getBank().add(i, new int[]{type, amount});
        }*/
        p.getSession().getChannel().getPipeline().replace("decoder", "decoder", new MessageDecoder(Module.getManager().getMainNetwork()));
        return p;
    }
}
