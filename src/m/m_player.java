/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rangora
 */
public class m_player extends m_function {

    private ResultSet rs;

    public m_player() throws SQLException {

    }

    public int cekId() throws SQLException {
        String query = "select id_user from user where id_user = ";
        return checkId(query);
    }

    public boolean insertUsername(String username) throws SQLException {
        int id = cekId();
        String query = "INSERT INTO `user` values ('" + id + "','" + username + "')";
        return getStatusQuery(query);
    }

    public DefaultTableModel getTabel() throws SQLException {
        String kolom[] = {""};
        String query = "select username from user";
        return buatTabel(kolom, query);
    }
}
