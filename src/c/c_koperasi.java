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
import v.koperasi;

/**
 *
 * @author Rangora
 */
public class c_koperasi {

    private koperasi vKoperasi;
    private home vHome;
    private m_aset mAset;
    private String username;
    private int hargaBibit = 280;
    private int hargaJagung = 60;
    private int hargaGaram = 150;
    private int hargaMinyakGoreng = 300;

    public c_koperasi(home vHome, String username) throws SQLException {
        vKoperasi = new koperasi();
        mAset = new m_aset();
        this.vHome = vHome;
        this.username = username;

        vKoperasi.getBtnKembali().addActionListener(new kembaliAction());
        vKoperasi.getBtnItem1().addActionListener(new minyakAction());
        vKoperasi.getBtnItem2().addActionListener(new garamAction());
        vKoperasi.getBtnItem3().addActionListener(new jagungAction());
        vKoperasi.getBtnItem4().addActionListener(new bibitAction());
    }

    private class bibitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vHome, "Yakin beli..?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    mAset.updateKoin(mAset.getKoin(mAset.cekIdPlayer(username)) - hargaBibit, mAset.cekIdPlayer(username));
                    mAset.updateBibit(mAset.getBibit(mAset.cekIdPlayer(username)) + 1, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_koperasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class jagungAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vHome, "Yakin beli..?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    mAset.updateKoin(mAset.getKoin(mAset.cekIdPlayer(username)) - hargaJagung, mAset.cekIdPlayer(username));
                    mAset.updateJagung(mAset.getJagung(mAset.cekIdPlayer(username)) + 1, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_koperasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    private class garamAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vHome, "Yakin beli..?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    mAset.updateKoin(mAset.getKoin(mAset.cekIdPlayer(username))-hargaGaram, mAset.cekIdPlayer(username));
                    mAset.updateGaram(mAset.getGaram(mAset.cekIdPlayer(username))+1, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblGaram().setText(mAset.getGaram(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_koperasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class minyakAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(vHome, "Yakin beli..?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    mAset.updateKoin(mAset.getKoin(mAset.cekIdPlayer(username))- hargaMinyakGoreng, mAset.cekIdPlayer(username));
                    mAset.updateMinyakGoreng(mAset.getMinyakGoreng(mAset.cekIdPlayer(username)) + 1, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblMinyak().setText(mAset.getMinyakGoreng(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_koperasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vKoperasi.setVisible(false);
            vHome.setVisible(true);
            vHome.toFront();
        }
    }

    public koperasi getView() {
        return vKoperasi;
    }
}
