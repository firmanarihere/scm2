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
import javax.swing.JOptionPane;
import m.m_aset;
import m.m_marning;
import m.m_player;
import v.about;
import v.load;
import v.menu;

/**
 *
 * @author Rangora
 */
public class c_menu {

    private about vAbout;
    private menu vMenu;
    private load vLoad;
    private m_player mPlayer;
    private m_aset mAset;
    private m_marning mMarning;

    public c_menu() throws SQLException {
        vAbout = new about();
        vMenu = new menu();
        vLoad = new load();
        mPlayer = new m_player();
        mMarning = new m_marning();
        mAset = new m_aset();
        vMenu.getBtnMulai().addActionListener(new mulaiAction());
        vMenu.getBtnLoad().addActionListener(new loadAction());
        vMenu.getBtnBatal().addActionListener(new batalAction());
        vMenu.getBtnOk().addActionListener(new okAction());
        vLoad.getBtnOk().addActionListener(new okActionLoad());
        vLoad.getBtnBatal().addActionListener(new batalActionLoad());
        vMenu.getBtnKeluar().addActionListener(new keluarAction());
        vMenu.getBtnAbout().addActionListener(new aboutAction());
        vAbout.getBtnKembali().addActionListener(new kembaliAction());
        vMenu.setVisible(true);
    }

    private class aboutAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vAbout.setVisible(true);
            vMenu.setVisible(false);
        }

    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vAbout.setVisible(false);
            vMenu.setVisible(true);
        }
        
    }

    private class batalActionLoad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vLoad.dispose();
            vMenu.setVisible(true);
        }
    }

    private class okActionLoad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (vLoad.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(vLoad, "Pilih dahulu");
            } else {
                try {
                    new c_home(vLoad.getIdTabel());
                } catch (SQLException ex) {
                    Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                vLoad.setVisible(false);
            }
        }
    }

    private class loadAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vLoad.setVisible(true);
            try {
                vLoad.setTableModel(mPlayer.getTabel());
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            vMenu.setVisible(false);
        }
    }

    private class okAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (vMenu.getFieldUsername().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(vMenu, "Username tidak boleh kosong");
                } else {
                    mPlayer.insertUsername(vMenu.getFieldUsername().getText());
                    mAset.insertAset();
                    mMarning.insertProduk(mMarning.cekIdPlayer(vMenu.getFieldUsername().getText()));
                    JOptionPane.showMessageDialog(vMenu, "Username " + vMenu.getFieldUsername().getText() + " berhasil dibuat");
                    new c_home(vMenu.getFieldUsername().getText());
                    vMenu.getUsernameFrame().dispose();
                    vMenu.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vMenu.getUsernameFrame().setVisible(false);
        }

    }

    private class mulaiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vMenu.getUsernameFrame().setVisible(true);
        }

    }

    private class keluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vMenu, "Yakin Keluar Game..???",null,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }
}
