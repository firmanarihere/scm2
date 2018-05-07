/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.home;
import v.menu;

/**
 *
 * @author Rangora
 */
public class c_home {

    private home vHome;
    private String username;

    public c_home(String username) {
        vHome = new home();
        this.username = username;
        vHome.getBtnGudang().addActionListener(new gudangAction());
        vHome.getBtnKoperasi().addActionListener(new koperasiAction());
        vHome.getBtnSawah1().addActionListener(new sawahAction());
        vHome.getBtnSawah2().addActionListener(new sawahAction());
        vHome.getBtnSawah3().addActionListener(new sawahAction());
        vHome.getBtnToko().addActionListener(new tokoAction());
        vHome.getBtnRuProduksi().addActionListener(new ruProduksiAction());
        vHome.getBtnDistribusi().addActionListener(new distribusiAction());
        vHome.getBtnLogOut().addActionListener(new logOutAction());
        
        vHome.getLabelUsername().setText(this.username);
        vHome.setVisible(true);
    }

    private class logOutAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vHome.setVisible(false);
            try {
                new c_menu();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class distribusiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_distribusi(vHome);
            vHome.setVisible(false);
        }

    }

    private class ruProduksiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    private class tokoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_toko(vHome);
            vHome.setVisible(false);
        }

    }

    private class sawahAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_sawah(vHome);
            vHome.setVisible(false);
        }
    }

    private class koperasiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_koperasi(vHome);
            vHome.setVisible(false);
        }
    }

    private class gudangAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_gudang(vHome);
            vHome.setVisible(false);
        }
    }

    
    
}
