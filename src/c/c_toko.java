/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.home;
import v.tokoPenjualanProduk;

/**
 *
 * @author Rangora
 */
public class c_toko {
    
    private tokoPenjualanProduk vToko;
    private home vHome;
    private boolean jual = true;
    private int marningA = 5;
    private int marningB = 10;
    private int marningC = 3;
    private time jualTime;
    
    public c_toko(home vHome) {
        vToko = new tokoPenjualanProduk();
        this.vHome = vHome;
        vToko.getBtnKembali().addActionListener(new kembaliAction());
        
        jualTime = new time();
        jualTime.start();
        vToko.setVisible(true);
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
            while (jual) {
                try {
                    Thread.sleep(1000);
                    if (marningA > 0) {
                        marningA -= 1;
                    }
                    if (marningB > 0) {
                        marningB -= 1;
                    }
                    if (marningC > 0) {
                        marningC -= 1;
                    }
                    if (marningA == 0 && marningB == 0 && marningC == 0) {
                        jual = false;
                        
                    }
                    System.out.println("marning a= " + marningA);
                    System.out.println("marning b= " + marningB);
                    System.out.println("marning c= " + marningC);
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
