/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.MathContext;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import m.m_aset;
import v.home;
import v.sawah;

/**
 *
 * @author Rangora
 */
public class c_sawah {

    private sawah vSawah;
    private home vHome;
    private m_aset mAset;
    private JButton btnKotak[] = new JButton[6];
    private int statusKotak[] = {1, 1, 1, 1, 1, 1};
    private int statusTime1[] = {0, 0, 0, 0, 0, 0};
    private int statusTime2[] = {0, 0, 0, 0, 0, 0};
    private int statusTime3[] = {0, 0, 0, 0, 0, 0};
    private boolean statusSiram[] = {false, false, false, false, false, false};
    private int bibit;
    private int jagung;
    private String username;
    private Random random = new Random();

    private Thread t;

    public c_sawah(home vHome, String username) throws SQLException {
        vSawah = new sawah();
        mAset = new m_aset();
        this.vHome = vHome;
        this.username = username;
        btnKotak[0] = vSawah.getBtnKotak1();
        btnKotak[1] = vSawah.getBtnKotak2();
        btnKotak[2] = vSawah.getBtnKotak3();
        btnKotak[3] = vSawah.getBtnKotak4();
        btnKotak[4] = vSawah.getBtnKotak5();
        btnKotak[5] = vSawah.getBtnKotak6();
        bibit = mAset.getBibit(mAset.cekIdPlayer(username));
        jagung = mAset.getJagung(mAset.cekIdPlayer(username));

        vSawah.getBtnKembali().addActionListener(new kembaliAction());
        vSawah.getBtnKotak1().addActionListener(new kotak1Action());
        vSawah.getBtnKotak2().addActionListener(new kotak2Action());
        vSawah.getBtnKotak3().addActionListener(new kotak3Action());
        vSawah.getBtnKotak4().addActionListener(new kotak4Action());
        vSawah.getBtnKotak5().addActionListener(new kotak5Action());
        vSawah.getBtnKotak6().addActionListener(new kotak6Action());
        vSawah.getBtnAir().addActionListener(new airAction());

        vSawah.getLblBibit().setText(bibit + "");
        vSawah.getLblJagung().setText(jagung + "");
        vSawah.getBtnAir().setEnabled(false);

        t = new time();
        t.start();
    }

    private class airAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < statusKotak.length; i++) {
                if (statusKotak[i] == 2) {
                    statusSiram[i] = true;
                    //set gif menyiram
                    //set label butuh air false
                    vSawah.getBtnAir().setEnabled(false);
                }
            }
        }
    }

    private class kotak1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[0] == 1) {//kosong
                if (bibit > 0) {
                    //ganti gambar tanah bibit
                    statusKotak[0] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[0] == 3) {//tumbuh 
                //ganti gambar tananh kososng
                //setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sapi dewasa.png")));
                jagung += random.nextInt((3 - 2) + 1) + 2;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[0] = 1;
                statusSiram[0] = false;
                statusTime1[0] = 0;
                statusTime2[0] = 0;
                statusTime3[0] = 0;
            } else if (statusKotak[0] == 4) {//siap panen
                //ganti gambar tanah kosong
                //setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sapi dewasa.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[0] = 1;
                statusSiram[0] = false;
                statusTime1[0] = 0;
                statusTime2[0] = 0;
                statusTime3[0] = 0;
            }
        }
    }

    private class kotak2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[1] == 1) {//kosong
                if (bibit > 0) {
                    statusKotak[1] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[1] == 3) {//tumbuh
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[1] = 1;
                statusSiram[1] = false;
                statusTime1[1] = 0;
                statusTime2[1] = 0;
                statusTime3[1] = 0;
            } else if (statusKotak[1] == 4) {//siap panen
                //ganti gambar tanah kosong
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[1] = 1;
                statusSiram[1] = false;
                statusTime1[1] = 0;
                statusTime2[1] = 0;
                statusTime3[1] = 0;
            }
        }
    }

    private class kotak3Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[2] == 1) {//kosong
                if (bibit > 0) {
                    statusKotak[2] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[2] == 3) {//tumbuh
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[2] = 1;
                statusSiram[2] = false;
                statusTime1[2] = 0;
                statusTime2[2] = 0;
                statusTime3[2] = 0;
            } else if (statusKotak[2] == 4) {//siap panen
                //ganti gambar tanah kosong
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[2] = 1;
                statusSiram[2] = false;
                statusTime1[2] = 0;
                statusTime2[2] = 0;
                statusTime3[2] = 0;
            }
        }

    }

    private class kotak4Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[3] == 1) {//kosong
                if (bibit > 0) {
                    statusKotak[3] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[3] == 3) {//tumbuh
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[3] = 1;
                statusSiram[3] = false;
                statusTime1[3] = 0;
                statusTime2[3] = 0;
                statusTime3[3] = 0;
            } else if (statusKotak[3] == 4) {//siap panen
                //ganti gambar tanah kosong
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[3] = 1;
                statusSiram[3] = false;
                statusTime1[3] = 0;
                statusTime2[3] = 0;
                statusTime3[3] = 0;
            }
        }

    }

    private class kotak5Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[4] == 1) {//kosong
                if (bibit > 0) {
                    statusKotak[4] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[4] == 3) {//tumbuh
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[4] = 1;
                statusSiram[4] = false;
                statusTime1[4] = 0;
                statusTime2[4] = 0;
                statusTime3[4] = 0;
            } else if (statusKotak[4] == 4) {//siap panen
                //ganti gambar tanah kosong
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[4] = 1;
                statusSiram[4] = false;
                statusTime1[4] = 0;
                statusTime2[4] = 0;
                statusTime3[4] = 0;
            }
        }

    }

    private class kotak6Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (statusKotak[5] == 1) {//kosong
                if (bibit > 0) {
                    statusKotak[5] = 2;
                    bibit -= 1;
                    try {
                        mAset.setBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(bibit + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[5] == 3) {//tumbuh
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[5] = 1;
                statusSiram[5] = false;
                statusTime1[5] = 0;
                statusTime2[5] = 0;
                statusTime3[5] = 0;
            } else if (statusKotak[5] == 4) {//siap panen
                //ganti gambar tanah kosong
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.setJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(jagung + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[5] = 1;
                statusSiram[5] = false;
                statusTime1[5] = 0;
                statusTime2[5] = 0;
                statusTime3[5] = 0;
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
                    for (int i = 0; i < statusKotak.length; i++) {
                        if (statusKotak[i] == 2) {
                            statusTime1[i] += 1;
                            if (statusTime1[i] == 5) {
                                //set label butuh air true
                                vSawah.getBtnAir().setEnabled(true);
                            }
                        }
                        if (statusSiram[i]) {
                            statusTime2[i] += 1;
                            if (statusTime2[i] == 20) {
                                statusKotak[i] = 3;
                                //setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sapi pucet kanan.png")));
                                //setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sapi dewasa.png")));
                            }
                        }
                        if (statusKotak[i] == 3) {
                            statusTime3[i] += 1;
                            if (statusTime3[i] == 40) {
                                statusKotak[i] = 4;
                                //setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sapi pucet kanan.png")));
                                //setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sapi dewasa.png")));
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("air =" + statusSiram[0]);
                    System.out.println("air2 =" + statusSiram[1]);
                    System.out.println("");
                    System.out.println("jagung= " + jagung);
                    System.out.println("");
                    System.out.println("kotak 1= " + statusKotak[0]);
                    System.out.println("kotak 2= " + statusKotak[1]);
                    System.out.println("kotak 3= " + statusKotak[2]);
                    System.out.println("kotak 4= " + statusKotak[3]);
                    System.out.println("kotak 5= " + statusKotak[4]);
                    System.out.println("kotak 6= " + statusKotak[5]);
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
