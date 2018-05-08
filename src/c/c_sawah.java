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
    private int statusKotak[] = {1,1,1,1,1,1};
    private Thread t ;
    public c_sawah(home vHome) {
        vSawah = new sawah();
        this.vHome = vHome;
        vSawah.getBtnKembali().addActionListener(new kembaliAction());
        vSawah.getBtnKotak1().addActionListener(new kotak1Action());
        vSawah.getBtnKotak2().addActionListener(new kotak2Action());
        vSawah.getBtnKotak3().addActionListener(new kotak3Action());
        vSawah.getBtnKotak4().addActionListener(new kotak4Action());
        vSawah.getBtnKotak5().addActionListener(new kotak5Action());
        vSawah.getBtnKotak6().addActionListener(new kotak6Action());
        
        t = new time();
        t.start();
    }

    private class kotak1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[0] == 1) {//kosong
                statusKotak[0] = 2;
            } else if (statusKotak[0] == 3) {//tumbuh
                statusKotak[0] = 1;
            } else if (statusKotak[0] == 4) {//siap panen
                statusKotak[0] = 1;
            }
        }
    }
    private class kotak2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[1] == 1) {//kosong
                statusKotak[1] = 2;
            } else if (statusKotak[1] == 3) {//tumbuh
                statusKotak[1] = 1;
            } else if (statusKotak[1] == 4) {//siap panen
                statusKotak[1] = 1;
            }
        }
    }
    private class kotak3Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[2] == 1) {//kosong
                statusKotak[2] = 2;
            } else if (statusKotak[2] == 3) {//tumbuh
                statusKotak[2] = 1;
            } else if (statusKotak[2] == 4) {//siap panen
                statusKotak[2] = 1;
            }
        }

    }
    private class kotak4Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[3] == 1) {//kosong
                statusKotak[3] = 2;
            } else if (statusKotak[3] == 3) {//tumbuh
                statusKotak[3] = 1;
            } else if (statusKotak[3] == 4) {//siap panen
                statusKotak[3] = 1;
            }
        }

    }
    private class kotak5Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[4] == 1) {//kosong
                statusKotak[4] = 2;
            } else if (statusKotak[4] == 3) {//tumbuh
                statusKotak[4] = 1;
            } else if (statusKotak[4] == 4) {//siap panen
                statusKotak[4] = 1;
            }
        }

    }
    private class kotak6Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[5] == 1) {//kosong
                statusKotak[5] = 2;
            } else if (statusKotak[5] == 3) {//tumbuh
                statusKotak[5] = 1;
            } else if (statusKotak[5] == 4) {//siap panen
                statusKotak[5] = 1;
            }
        }

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
                    System.out.println("");
                    System.out.println("kotak 1= "+statusKotak[0]);
                    System.out.println("kotak 2= "+statusKotak[1]);
                    System.out.println("kotak 3= "+statusKotak[2]);
                    System.out.println("kotak 4= "+statusKotak[3]);
                    System.out.println("kotak 5= "+statusKotak[4]);
                    System.out.println("kotak 6= "+statusKotak[5]);
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
