/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rangora
 */
public class m_aset extends m_function {

    private ResultSet rs;

    public m_aset() throws SQLException {
    }
    
    public String cekIdPlayer(String username) throws SQLException {
        String query = "SELECT `id_user` FROM `user` WHERE `username` = '" + username + "'";
        return getDataString(query);
    }
    
    public int getKoin(String idPlayer) throws SQLException {
        String query = "SELECT koin FROM `aset` where id_user = " + idPlayer;
        return getDataInt(query);
    }
}
