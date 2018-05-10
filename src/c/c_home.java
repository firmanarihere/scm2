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
import v.home;
import v.menu;
import v.tokoPenjualanProduk;

/**
 *
 * @author Rangora
 */
public class c_home {

    private home vHome;
    private tokoPenjualanProduk vToko;
    private m_aset mAset;
    private String username;

    public c_home(String username) throws SQLException {
        vHome = new home();
        vToko = new tokoPenjualanProduk();
        mAset = new m_aset();
        this.username = username;
        vHome.getBtnGudang().addActionListener(new gudangAction());
        vHome.getBtnKoperasi().addActionListener(new koperasiAction());
        vHome.getBtnSawah1().addActionListener(new sawahAction());
        vHome.getBtnToko().addActionListener(new tokoAction());
        vHome.getBtnRuProduksi().addActionListener(new ruProduksiAction());
        vHome.getBtnLogOut().addActionListener(new logOutAction());

        vHome.getLabelUsername().setText(username);
        vHome.setVisible(true);
    }

    private class logOutAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vHome, "Yakin Meniggalkan Game..??", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    private class ruProduksiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    private class tokoAction implements ActionListener {

        private c_toko toko;

        public tokoAction() throws SQLException {
            toko = new c_toko(vHome, username);
            toko.getView().setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            toko.getView().setVisible(true);
            vHome.setVisible(false);
        }

    }

    private class sawahAction implements ActionListener {

        private c_sawah sawah;

        public sawahAction() throws SQLException {
            sawah = new c_sawah(vHome, username);
            sawah.getView().setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                sawah.getView().getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                sawah.getView().getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
            sawah.getView().setVisible(true);
            vHome.setVisible(false);
        }
    }

    private class koperasiAction implements ActionListener {

        private c_koperasi koperasi;

        public koperasiAction() throws SQLException {
            koperasi = new c_koperasi(vHome, username);
            koperasi.getView().setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                koperasi.getView().getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                koperasi.getView().getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                koperasi.getView().getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                koperasi.getView().getLblGaram().setText(mAset.getGaram(mAset.cekIdPlayer(username)) + "");
                koperasi.getView().getLblMinyak().setText(mAset.getGaram(mAset.cekIdPlayer(username)) + "");
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
            koperasi.getView().setVisible(true);
            vHome.setVisible(false);
        }
    }

    private class gudangAction implements ActionListener {

        private c_gudang gudang;

        public gudangAction() {
            gudang = new c_gudang(vHome);
            gudang.getView().setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            gudang.getView().setVisible(true);
            vHome.setVisible(false);
        }
    }

}
