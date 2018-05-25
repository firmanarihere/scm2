/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import m.m_aset;
import m.m_marning;
import v.home;
import v.tokoPenjualanProduk;

/**
 *
 * @author Rangora
 */
public class c_toko {

    private tokoPenjualanProduk vToko;
    private home vHome;
    private m_marning mMarning;
    private m_aset mAset;
    private String username;
    private boolean jual;
    private int marningA;
    private int marningB;
    private int marningC;
    private int empingA;
    private int empingB;
    private int empingC;
    private int totalMarning;
    private int totalEmping;
    private int koin;
    private time jualThread;
    private Random random = new Random();

    public c_toko(home vHome, String username) throws SQLException {
        vToko = new tokoPenjualanProduk();
        mMarning = new m_marning();
        mAset = new m_aset();
        this.vHome = vHome;
        this.username = username;
        koin = mAset.getKoin(mAset.cekIdPlayer(username));
        marningA = mMarning.getMarningA(mMarning.cekIdPlayer(username));
        marningB = mMarning.getMarningB(mMarning.cekIdPlayer(username));
        marningC = mMarning.getMarningC(mMarning.cekIdPlayer(username));
        totalMarning = marningA + marningB + marningC;
        empingA = mMarning.getEmpingA(mMarning.cekIdPlayer(username));
        empingB = mMarning.getEmpingB(mMarning.cekIdPlayer(username));
        empingC = mMarning.getEmpingC(mMarning.cekIdPlayer(username));
        totalEmping = empingA + empingB + empingC;

        vToko.getBtnKembali().addActionListener(new kembaliAction());
        vToko.getBtnMulaiJual().addActionListener(new mulaiJualAction());

        jualThread = new time();
        jualThread.start();
    }

    private class mulaiJualAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jual == false) {
                if (marningA == 0 && marningB == 0 && marningC == 0) {
                    JOptionPane.showMessageDialog(vToko, "Stok di Toko Habis");
                } else {
                    jual = true;
                    vToko.getBtnMulaiJual().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isitoko/tblBukaToko.png")));
                    vToko.getBtnMulaiJual().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isitoko/tblBukaTokoHover.png")));
                }
            } else {
                jual = false;
                vToko.getBtnMulaiJual().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isitoko/tblTutupToko.png")));
                vToko.getBtnMulaiJual().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isitoko/tblTutupTokoHover.png")));
            }
        }
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vToko.setVisible(false);
            vHome.setVisible(true);
        }
    }

    private class time extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                    if (jual) {
                        if (marningA > 0) {
                            if (random.nextInt(3) == 1) {
                                marningA -= 1;
                                koin += 70;
                                mMarning.updateMarningA(marningA, mMarning.cekIdPlayer(username));
                            }
                        }
                        if (marningB > 0) {
                            if (random.nextInt(5) == 1) {
                                marningB -= 1;
                                koin += 70;
                                mMarning.updateMarningB(marningB, mMarning.cekIdPlayer(username));
                            }
                        }
                        if (marningC > 0) {
                            if (random.nextInt(10) == 1) {
                                marningC -= 1;
                                koin += 70;
                                mMarning.updateMarningC(marningC, mMarning.cekIdPlayer(username));
                            }
                        }
                        if (marningA == 0 && marningB == 0 && marningC == 0) {
                            jual = false;
                            vToko.getBtnMulaiJual().setText("Mulai Jual");
                        }
                        mAset.updateKoin(koin, mAset.cekIdPlayer(username));
                        System.out.println("marning a= " + marningA);
                        System.out.println("marning b= " + marningB);
                        System.out.println("marning c= " + marningC);
                    }
                    totalMarning = marningA + marningB + marningC;
                    vToko.getLblMarning().setText(totalMarning + "");
                    vToko.getLblKoin().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public tokoPenjualanProduk getView() {
        return vToko;
    }
}
