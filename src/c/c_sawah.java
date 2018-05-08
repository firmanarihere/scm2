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
import v.sawah;

/**
 *
 * @author Rangora
 */
public class c_sawah {

    private sawah vSawah;
    private home vHome;

    public c_sawah(home vHome) {
        vSawah = new sawah();
        this.vHome = vHome;
        vSawah.getBtnKembali().addActionListener(new kembaliAction());
        vSawah.setVisible(true);
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vSawah.setVisible(false);
            vHome.setVisible(true);
        }
        
    }
    private class time extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public sawah getView() {
        return vSawah;
    }

}
