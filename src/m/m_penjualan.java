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
public class m_penjualan extends m_function {

    private ResultSet rs;

    public m_penjualan() throws SQLException {
    }

    public String cekIdPlayer(String username) throws SQLException {
        String query = "SELECT `id_user` FROM `user` WHERE `username` = '" + username + "'";
        return getDataString(query);
    }

    public int getMarningA(String idPlayer) throws SQLException {
        String query = "SELECT marningA FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }

    public int getMarningB(String idPlayer) throws SQLException {
        String query = "SELECT marningB FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }

    public int getMarningC(String idPlayer) throws SQLException {
        String query = "SELECT marningC FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }

    public int getEmpingA(String idPlayer) throws SQLException {
        String query = "SELECT empingA FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }

    public int getEmpingB(String idPlayer) throws SQLException {
        String query = "SELECT empingB FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }

    public int getEmpingC(String idPlayer) throws SQLException {
        String query = "SELECT empingC FROM `penjualan` where id_user = " + idPlayer;
        return getDataInt(query);
    }
}
