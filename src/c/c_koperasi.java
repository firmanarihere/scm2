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
    private int koin;
    private int bibit;
    private int jagung;
    private int garam;
    private int minyakGoreng;
    private int hargaBibit = 10;
    private int hargaJagung = 10;
    private int hargaGaram = 10;
    private int hargaMinyakGoreng = 10;

    public c_koperasi(home vHome, String username) throws SQLException {
        vKoperasi = new koperasi();
        this.vHome = vHome;
        this.username = username;
        mAset = new m_aset();
        koin = mAset.getKoin(mAset.cekIdPlayer(username));
        bibit = mAset.getBibit(mAset.cekIdPlayer(username));
        jagung = mAset.getJagung(mAset.cekIdPlayer(username));
        garam = mAset.getGaram(mAset.cekIdPlayer(username));
        minyakGoreng = mAset.getMinyakGoreng(mAset.cekIdPlayer(username));
        

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
                koin = koin - hargaBibit;
                bibit++;
                try {
                    mAset.updateKoin(koin, mAset.cekIdPlayer(username));
                    mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
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
                koin = koin - hargaJagung;
                jagung++;
                try {
                    mAset.updateKoin(koin, mAset.cekIdPlayer(username));
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
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
                koin = koin - hargaGaram;
                garam++;
                try {
                    mAset.updateKoin(koin, mAset.cekIdPlayer(username));
                    mAset.updateGaram(garam, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblGaram().setText(mAset.getGaram(mAset.cekIdPlayer(username))+"");
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
                koin = koin - hargaMinyakGoreng;
                minyakGoreng++;
                try {
                    mAset.updateKoin(koin, mAset.cekIdPlayer(username));
                    mAset.updateMinyakGoreng(minyakGoreng, mAset.cekIdPlayer(username));
                    vKoperasi.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                    vKoperasi.getLblMinyak().setText(mAset.getMinyakGoreng(mAset.cekIdPlayer(username))+"");
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
        }
    }

    public koperasi getView() {
        return vKoperasi;
    }
}
