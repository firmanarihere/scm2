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
import v.distribusi;
import v.home;

/**
 *
 * @author Rangora
 */
public class c_distribusi {

    private distribusi vDistribusi;
    private home vHome;
    private int time;

    public c_distribusi(home vHome) {
        vDistribusi = new distribusi();
        this.vHome = vHome;
        vDistribusi.getBtnBatal().addActionListener(new batalAction());
        
        time t=  new time();
        t.start();
        vDistribusi.setVisible(true);
    }

    private class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vDistribusi.setVisible(false);
            vHome.setVisible(true);
        }
        
    }
    
    private class time extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    time+=1;
                    System.out.println("detik= " + time);
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_distribusi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
