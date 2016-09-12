package org.osrse.game.file.player;


import org.osrse.WorldModule;
import org.osrse.game.logic.player.PlayerDefinition;
import org.osrse.game.logic.utility.LogicConstants;
import org.osrse.network.database.DatabaseManager;
import org.osrse.utility.ArrayUtilities;
import org.osrse.utility.NameUtilities;
import org.osrse.utility.crypto.PasswordHash;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Set;

import static org.osrse.utility.ArrayUtilities.primitive;

/**
 * Created by Jonathan on 12/27/13.
 */
public class SQLPlayerLoader extends LoadableContext {

	public static String convert(Set<Integer> list) {
		String res = "";
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
			res += iterator.next() + (iterator.hasNext() ? "," : "");
		}
		return res;
	}

    @Override
    public void applySaveHeader(String table, StringBuilder query, PlayerDefinition player) {
        query.append("UPDATE ").append(table).append(" SET ");
    }

    @Override
    public void finalizeSave(StringBuilder query, PlayerDefinition player) {
        cachedplayersLeaving.remove(player.getUsername());
        try {
            Connection c = DatabaseManager.getConnection();
            query.append(" WHERE uid='").append(player.getStaticIndex()).append("'");
            Statement statement = c.createStatement();
            statement.executeUpdate(query.toString());
            System.out.println(query.toString());
            DatabaseManager.closeAll(c, statement, null);
        } catch (Exception e) {
            System.err.println("Error saving player [name=" + player.getUsername() + "]");
            e.printStackTrace();
        }
        System.out.println("Saved -"+player.getUsername());
    }

    private ResultSet getAccount(Connection c, String username, String password) throws SQLException, InvalidKeySpecException, NoSuchAlgorithmException {
        Statement s = c.createStatement();
        //Todo forum impl
        ResultSet rs = s.executeQuery("SELECT * FROM playerinfo WHERE username='" + NameUtilities.protocolFormat(username) + "' LIMIT 1");
        if (!rs.next()) {
            Statement s2 = c.createStatement();
            String pw = PasswordHash.createHash(password);
            s2.executeUpdate("INSERT INTO playerinfo (username, password) VALUES ('" +  NameUtilities.protocolFormat(username) + "', '" + pw +"')");
            DatabaseManager.closeStatement(s2);
            DatabaseManager.closeAll(null, s, rs);
            return getAccount(c, username, password);
        }
        String hash = rs.getString("password");
        if(hash == null || hash.isEmpty() || PasswordHash.validatePassword(password, hash)) {
            return rs;
        }
        DatabaseManager.closeAll(c, s, rs);
        return null;
    }

    private ResultSet getIndexIn(String table, int uid, Statement s) throws SQLException {
        ResultSet rs = s.executeQuery("SELECT * FROM "+table+" WHERE uid='" + uid + "' LIMIT 1");
        if(!rs.next()) {
            s.execute("INSERT INTO "+table+" (uid) VALUES ('" + uid +"')");
            return getIndexIn(table, uid, s);
        }
        return rs;
    }

    public final PlayerDefinition loadPlayer(PlayerDefinition def) {
        try {
            Connection c = DatabaseManager.getConnection();
            ResultSet rs = getAccount(c, def.getUsername(), def.getPassword());
            if (rs == null) {
                //todo add request to ip
                return null;
            }

            String table = "data_"+WorldModule.getLogic().getWorldActivity().toString().toLowerCase();
            /*
            PreparedStatement accounts = c.prepareStatement(
                    "SELECT username, friend_id, clanrank\n" +
                            "FROM friends\n" +
                            "LEFT JOIN_CLAN data\n" +
                            "ON friends.friend_id = data.uid\n" +
                            "WHERE friends.uid = ?");
            */
            def.setStaticIndex(rs.getInt("uid"));
            //accounts.setInt(1, def.getStaticIndex());
            def.rights = rs.getInt("privilege");
            String chatName = rs.getString("clan");
            int join = rs.getInt("clan_join");
            int kick = rs.getInt("clan_kick");
	        int talk = rs.getInt("clan_talk");

            DatabaseManager.closeResultSet(rs);
            Statement s = c.createStatement();
            rs = getIndexIn(table, def.getStaticIndex(), s);

            def.coordX = rs.getInt("x");
            def.coordY = rs.getInt("y");
            def.coordZ = rs.getInt("z");

            def.clanName = chatName;
            def.clanJoin = join;
            def.clanKick = kick;
	        def.clanTalk = talk;

            def.levels = primitive(ArrayUtilities.toArray(rs.getString("levels"), new Integer[0]));
            def.experiences = primitive(ArrayUtilities.toArray(rs.getString("exp"), new Double[0]));

            String inv = rs.getString("inv_list");
            String invN = rs.getString("inv_values");
            String equip = rs.getString("equip_list");
            String equipN = rs.getString("equip_values");

            if(inv == null || inv.isEmpty()) {
                inv = "-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1";
                invN = "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0";
            }
            if(equip == null || equip.isEmpty()) {
                equip = "-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1";
                equipN = "0;0;0;0;0;0;0;0;0;0;0;0;0;0";
            }
            def.inv = primitive(ArrayUtilities.toArray(inv, new Short[0]));
            def.inv_value = primitive(ArrayUtilities.toArray(invN, new Integer[0]));
            def.equipment = primitive(ArrayUtilities.toArray(equip, new Short[0]));
            def.equipment_value = primitive(ArrayUtilities.toArray(equipN, new Integer[0]));

            String bankQuery = rs.getString("bank_list");
            if (bankQuery == null || bankQuery.equals("")) {
                StringBuilder bankQuery1 = new StringBuilder();
                    bankQuery1.append("995;");
                for (int i = 1; i < LogicConstants.BANK_SIZE; i++) {
                    bankQuery1.append(i == LogicConstants.BANK_SIZE - 1 ? "-1" : "-1;");
                }
                bankQuery = bankQuery1.toString();
            }
            def.bank = primitive(ArrayUtilities.toArray(bankQuery, new Short[0]));
            bankQuery = rs.getString("bank_values");
            if (bankQuery == null || bankQuery.equals("")) {
                StringBuilder bankQuery1 = new StringBuilder();
                bankQuery1.append("15000;");
                for (int i = 1; i < LogicConstants.BANK_SIZE; i++) {
                    bankQuery1.append(i == LogicConstants.BANK_SIZE - 1 ? "0" : "0;");
                }
                bankQuery = bankQuery1.toString();
            }
            def.bank_value = primitive(ArrayUtilities.toArray(bankQuery, new Integer[0]));
            /*if(WorldModule.getLogic().getClanData().get(def.getStaticIndex()) == null) {
                DatabaseManager.closeAll(null, s, rs);
                rs = accounts.executeQuery();
                rs.last();
                int friendCount = rs.getRow();
                rs.first();
                def.friends = new String[friendCount];
                def.frienduid = new int[friendCount];
                def.ranks = new byte[friendCount];
                for(int i = 0; i < friendCount;i++) {
                    def.friends[i] = NameUtilities.capitalizeFormat(rs.getString("username"));
                    def.frienduid[i] = rs.getInt("friend_id");
                    def.ranks[i] = rs.getByte("clanrank");
                    rs.next();
                }
            }*/
            DatabaseManager.closeAll(c, s, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return def;
    }


}
