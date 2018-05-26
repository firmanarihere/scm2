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
import javax.swing.JLabel;
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
    private JLabel notif[] = new JLabel[6];
    private int statusKotak[] = {1, 1, 1, 1, 1, 1};
    private int statusTime1[] = {0, 0, 0, 0, 0, 0};
    private int statusTime2[] = {0, 0, 0, 0, 0, 0};
    private int statusTime3[] = {0, 0, 0, 0, 0, 0};
    private boolean statusSiram[] = {false, false, false, false, false, false};
    private int bibit;
    private int jagung;
    private int detikSiram = 0;
    private boolean detikSiram1 = false;
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
        notif[0] = vSawah.getLblNotif();
        notif[1] = vSawah.getLblNotif1();
        notif[2] = vSawah.getLblNotif2();
        notif[3] = vSawah.getLblNotif5();
        notif[4] = vSawah.getLblNotif4();
        notif[5] = vSawah.getLblNotif3();
        for (int i = 0; i < notif.length; i++) {
            notif[i].setVisible(false);
        }
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
                    detikSiram1 = true;
                    notif[i].setVisible(true);
                    notif[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/siram.gif")));
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
                    vSawah.getBtnKotak1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak1().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[0] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[0] == 3) {//tumbuh 
                vSawah.getBtnKotak1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak1().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((3 - 2) + 1) + 2;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[0] = 1;
                statusSiram[0] = false;
                statusTime1[0] = 0;
                statusTime2[0] = 0;
                statusTime3[0] = 0;
            } else if (statusKotak[0] == 4) {//siap panen
                vSawah.getBtnKotak1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak1().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
                    vSawah.getBtnKotak2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak2().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[1] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[1] == 3) {//tumbuh 
                vSawah.getBtnKotak2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak2().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[1] = 1;
                statusSiram[1] = false;
                statusTime1[1] = 0;
                statusTime2[1] = 0;
                statusTime3[1] = 0;
            } else if (statusKotak[1] == 4) {//siap panen 
                vSawah.getBtnKotak2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak2().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
                    vSawah.getBtnKotak3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak3().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[2] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[2] == 3) {//tumbuh 
                vSawah.getBtnKotak3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak3().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                //ganti gambar tananh kososng
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[2] = 1;
                statusSiram[2] = false;
                statusTime1[2] = 0;
                statusTime2[2] = 0;
                statusTime3[2] = 0;
            } else if (statusKotak[2] == 4) {//siap panen 
                vSawah.getBtnKotak3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak3().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
                    vSawah.getBtnKotak4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak4().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[3] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[3] == 3) {//tumbuh 
                vSawah.getBtnKotak4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak4().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[3] = 1;
                statusSiram[3] = false;
                statusTime1[3] = 0;
                statusTime2[3] = 0;
                statusTime3[3] = 0;
            } else if (statusKotak[3] == 4) {//siap panen 
                vSawah.getBtnKotak4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak4().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
                    vSawah.getBtnKotak5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak5().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[4] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[4] == 3) {//tumbuh 
                vSawah.getBtnKotak5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak5().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[4] = 1;
                statusSiram[4] = false;
                statusTime1[4] = 0;
                statusTime2[4] = 0;
                statusTime3[4] = 0;
            } else if (statusKotak[4] == 4) {//siap panen 
                vSawah.getBtnKotak5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak5().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
                    vSawah.getBtnKotak6().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    vSawah.getBtnKotak6().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung.png")));
                    statusKotak[5] = 2;
                    bibit -= 1;
                    try {
                        mAset.updateBibit(bibit, mAset.cekIdPlayer(username));
                        vSawah.getLblBibit().setText(mAset.getBibit(mAset.cekIdPlayer(username)) + "");
                    } catch (SQLException ex) {
                        Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(vHome, "Tidak punya bibit");
                }
            } else if (statusKotak[5] == 3) {//tumbuh 
                vSawah.getBtnKotak6().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak6().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((3 - 1) + 1) + 1;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusKotak[5] = 1;
                statusSiram[5] = false;
                statusTime1[5] = 0;
                statusTime2[5] = 0;
                statusTime3[5] = 0;
            } else if (statusKotak[5] == 4) {//siap panen 
                vSawah.getBtnKotak6().setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                vSawah.getBtnKotak6().setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanah kosong.png")));
                jagung += random.nextInt((7 - 5) + 1) + 5;
                try {
                    mAset.updateJagung(jagung, mAset.cekIdPlayer(username));
                    vSawah.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
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
            try {
                vHome.getLblJagung().setText(mAset.getJagung(mAset.cekIdPlayer(username)) + "");
            } catch (SQLException ex) {
                Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class time extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    bibit = mAset.getBibit(mAset.cekIdPlayer(username));
                    jagung = mAset.getJagung(mAset.cekIdPlayer(username));
                    for (int i = 0; i < statusKotak.length; i++) {
                        if (statusKotak[i] == 2) {
                            statusTime1[i] += 1;
                            if (statusTime1[i] == 5) {
                                notif[i].setVisible(true);
                                notif[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/notif air.png")));
                                vSawah.getBtnAir().setEnabled(true);
                            }
                        }
                        if (statusSiram[i]) {

                            statusTime2[i] += 1;
                            if (statusTime2[i] == 2) {
                                notif[i].setVisible(false);
                            } else if (statusTime2[i] == 20) {
                                statusKotak[i] = 3;
                                btnKotak[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung1.png")));
                                btnKotak[i].setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung1hover.png")));
                            }
                        }
                        if (statusKotak[i] == 3) {
                            statusTime3[i] += 1;
                            if (statusTime3[i] == 40) {
                                statusKotak[i] = 4;
                                btnKotak[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung2.png")));
                                btnKotak[i].setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isisawah/tanahBerjagung2hover.png")));
                            }
                        }
                    }
//                    System.out.println("");
//                    System.out.println("air =" + statusSiram[0]);
//                    System.out.println("air2 =" + statusSiram[1]);
//                    System.out.println("");
//                    System.out.println("jagung= " + jagung);
//                    System.out.println("");
//                    System.out.println("kotak 1= " + statusKotak[0]);
//                    System.out.println("kotak 2= " + statusKotak[1]);
//                    System.out.println("kotak 3= " + statusKotak[2]);
//                    System.out.println("kotak 4= " + statusKotak[3]);
//                    System.out.println("kotak 5= " + statusKotak[4]);
//                    System.out.println("kotak 6= " + statusKotak[5]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(c_sawah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public sawah getView() {
        return vSawah;
    }

}
