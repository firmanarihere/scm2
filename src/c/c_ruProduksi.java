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
import v.home;
import v.pabrik;

/**
 *
 * @author Rangora
 */
public class c_ruProduksi {

    private pabrik vPabrik;
    private home vHome;
    private boolean p1 = false;
    private boolean p2 = false;
    private boolean p3 = false;
    private boolean p4 = false;
    private int jumlahKaryawanP1 = 1;
    private int jumlahKaryawanP2 = 1;
    private int jumlahKaryawanP3 = 1;
    private int jumlahKaryawanP4 = 1;
    private int jagung = 13;
    private int jagungCuci = 0;
    private int detikP1;
    private int jagungP1 = 0;

    public c_ruProduksi(home home) {
        vPabrik = new pabrik();
        vHome = home;
        vPabrik.getBtnKembali().addActionListener(new kembaliAction());
        vPabrik.getBtnProses1().addActionListener(new proses1Action());
        vPabrik.getBtnProses2().addActionListener(new proses2Action());
        vPabrik.getBtnProses3().addActionListener(new proses3Action());
        vPabrik.getBtnProses4().addActionListener(new proses4Action());
        vPabrik.getBtnBatalP1().addActionListener(new batalAction());
        vPabrik.getBtnBatalP2().addActionListener(new batalAction());
        vPabrik.getBtnBatalP3().addActionListener(new batalAction());
        vPabrik.getBtnBatalP4().addActionListener(new batalAction());
        vPabrik.getBtnTambahKaryawan().addActionListener(new tambahKaryawanAction());
        vPabrik.getBtnMulaiP1().addActionListener(new mulaiP1Action());
        vPabrik.getBtnKurangP1().addActionListener(new kurangP1Action());
        vPabrik.getBtnTambahP1().addActionListener(new tambahP1Action());

        Thread proses = new proses();
        proses.start();
    }

    public pabrik getView() {
        return vPabrik;
    }

    private class tambahP1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vPabrik.getLblBanyakP1().getText()) == 30) {

            } else if (Integer.parseInt(vPabrik.getLblBanyakP1().getText()) == jagung) {

            } else {
                vPabrik.getLblBanyakP1().setText((Integer.parseInt(vPabrik.getLblBanyakP1().getText()) + 1) + "");
            }
        }

    }

    private class kurangP1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vPabrik.getLblBanyakP1().getText()) == 1) {
            } else {
                vPabrik.getLblBanyakP1().setText((Integer.parseInt(vPabrik.getLblBanyakP1().getText()) - 1) + "");
            }
        }

    }

    private class mulaiP1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jagungP1 = Integer.parseInt(vPabrik.getLblBanyakP1().getText());
            jagung = jagung - jagungP1;
            p1 = true;
            vPabrik.getLblBanyakP1().setText("1");
            vPabrik.getFrameP1().dispose();
            vPabrik.getBtnProses1().setEnabled(false);
        }
    }

    private class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.getLblBanyakP1().setText("1");
            vPabrik.getLblBanyakP2().setText("1");
            vPabrik.getLblBanyakJRP3().setText("1");
            vPabrik.getLblBanyakGP3().setText("1");
            vPabrik.getLblBanyakP4().setText("1");
            vPabrik.getFrameP1().dispose();
            vPabrik.getFrameP2().dispose();
            vPabrik.getFrameP3().dispose();
            vPabrik.getFrameP4().dispose();
        }

    }

    private class proses1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.getFrameP1().setVisible(true);
        }

    }

    private class proses2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.getFrameP2().setVisible(true);
        }

    }

    private class proses3Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.getFrameP3().setVisible(true);
        }

    }

    private class proses4Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.getFrameP4().setVisible(true);
        }

    }

    private class tambahKaryawanAction implements ActionListener {

        private c_tambahKaryawan karyawan;

        public tambahKaryawanAction() {
            karyawan = new c_tambahKaryawan(vPabrik);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            karyawan.getView().setVisible(true);
            vPabrik.setVisible(false);
        }
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vPabrik.setVisible(false);
            vHome.setVisible(true);
        }
    }

    private class proses extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    if (p1) {
                        detikP1 += 1;
                        if (jumlahKaryawanP1 == 1) {
                            if (jagungP1 <= 10) {
                                if (detikP1 == 15) {
                                    jagungCuci += jagungP1;
                                    jagungP1 = 0;
                                    detikP1 = 0;
                                    p1 = false;
                                    vPabrik.getBtnProses1().setEnabled(true);
                                }
                            } else if (jagungP1 > 10) {
                                if (detikP1 == 15) {
                                    detikP1 = 0;
                                    jagungCuci += 10;
                                    jagungP1 -= 10;
                                }
                            }
                        } else if (jumlahKaryawanP1 == 2) {
                            if (jagungP1 <= 20) {
                                if (detikP1 == 15) {
                                    jagungCuci += jagungP1;
                                    jagungP1 = 0;
                                    detikP1 = 0;
                                    p1 = false;
                                    vPabrik.getBtnProses1().setEnabled(true);
                                }
                            } else if (jagungP1 > 20) {
                                if (detikP1 == 15) {
                                    detikP1 = 0;
                                    jagungCuci += 20;
                                    jagungP1 -= 20;
                                }
                            }
                        } else if (jumlahKaryawanP1 == 3) {
                            if (detikP1 == 15) {
                                jagungCuci += jagungP1;
                                jagungP1 = 0;
                                detikP1 = 0;
                                p1 = false;
                                vPabrik.getBtnProses1().setEnabled(true);
                            }
                        }
                        System.out.println("");
                        System.out.println("detik: " + detikP1);
                        System.out.println("jagung: " + jagung);
                        System.out.println("jagungP1: " + jagungP1);
                        System.out.println("jagungCuci: " + jagungCuci);
                    }
                    if (p2) {

                    }
                    if (p3) {

                    }
                    if (p4) {

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_ruProduksi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
