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
import m.m_penjualan;
import v.home;
import v.tokoPenjualanProduk;

/**
 *
 * @author Rangora
 */
public class c_toko {

    private tokoPenjualanProduk vToko;
    private home vHome;
    private m_penjualan mPenjualan;
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
    private int koin ;
    private time jualThread;
    private Random random = new Random();

    public c_toko(home vHome, String username) throws SQLException {
        vToko = new tokoPenjualanProduk();
        mPenjualan = new m_penjualan();
        mAset = new m_aset();
        this.vHome = vHome;
        this.username = username;
        marningA = mPenjualan.getMarningA(mPenjualan.cekIdPlayer(username));
        marningB = mPenjualan.getMarningB(mPenjualan.cekIdPlayer(username));
        marningC = mPenjualan.getMarningC(mPenjualan.cekIdPlayer(username));
        totalMarning = marningA + marningB + marningC;
        empingA = mPenjualan.getEmpingA(mPenjualan.cekIdPlayer(username));
        empingB = mPenjualan.getEmpingB(mPenjualan.cekIdPlayer(username));
        empingC = mPenjualan.getEmpingC(mPenjualan.cekIdPlayer(username));
        totalEmping = empingA + empingB + empingC;
        koin = mAset.getKoin(mAset.cekIdPlayer(username));
        
        vToko.getBtnKembali().addActionListener(new kembaliAction());
        vToko.getBtnMulaiJual().addActionListener(new mulaiJualAction());
        
        vToko.getLblKoin().setText(koin+"");
        vToko.getLblMarning().setText(totalMarning + "");
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
                    vToko.getBtnMulaiJual().setText("Stop Jual");
                }
            } else {
                jual = false;
                vToko.getBtnMulaiJual().setText("Mulai Jual");
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
                            }
                        }
                        if (marningB > 0) {
                            if (random.nextInt(5) == 1) {
                                marningB -= 1;
                            }
                        }
                        if (marningC > 0) {
                            if (random.nextInt(10) == 1) {
                                marningC -= 1;
                            }
                        }
                        System.out.println("marning a= " + marningA);
                        System.out.println("marning b= " + marningB);
                        System.out.println("marning c= " + marningC);
                        if (marningA == 0 && marningB == 0 && marningC == 0) {
                            jual = false;
                            vToko.getBtnMulaiJual().setText("Mulai Jual");
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public tokoPenjualanProduk getView() {
        return vToko;
    }
}
