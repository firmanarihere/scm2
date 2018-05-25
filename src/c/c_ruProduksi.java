/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
    private int jagungCuci = 3;
    private int jagungRendam = 0;
    private int detikP1;
    private int detikP2;
    private int detikP3;
    private int wadahP1 = 0;
    private int wadahP2 = 0;

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
        vPabrik.getBtnMulaiP2().addActionListener(new mulaiP2Action());
        vPabrik.getBtnKurangP2().addActionListener(new kurangP2Action());
        vPabrik.getBtnTambahP2().addActionListener(new tambahP2Action());

        Thread proses = new proses();
        proses.start();
    }

    public pabrik getView() {
        return vPabrik;
    }

    private class tambahP2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vPabrik.getLblBanyakP2().getText()) == 30) {

            } else if (Integer.parseInt(vPabrik.getLblBanyakP2().getText()) == jagungCuci) {

            } else {
                vPabrik.getLblBanyakP2().setText((Integer.parseInt(vPabrik.getLblBanyakP2().getText()) + 1) + "");
            }
        }

    }

    private class kurangP2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vPabrik.getLblBanyakP2().getText()) == 1) {

            } else {
                vPabrik.getLblBanyakP2().setText((Integer.parseInt(vPabrik.getLblBanyakP2().getText()) - 1) + "");
            }
        }

    }

    private class mulaiP2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            wadahP2 = Integer.parseInt(vPabrik.getLblBanyakP2().getText());
            jagungCuci = jagungCuci - wadahP2;
            p2 = true;
            vPabrik.getLblBanyakP2().setText("1");
            vPabrik.getFrameP2().dispose();
            vPabrik.getBtnProses2().setEnabled(false);
        }

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
            wadahP1 = Integer.parseInt(vPabrik.getLblBanyakP1().getText());
            jagung = jagung - wadahP1;
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
                            if (wadahP1 <= 10) {
                                if (detikP1 == 15) {
                                    jagungCuci += wadahP1;
                                    wadahP1 = 0;
                                    detikP1 = 0;
                                    p1 = false;
                                    vPabrik.getBtnProses1().setEnabled(true);
                                }
                            } else if (wadahP1 > 10) {
                                if (detikP1 == 15) {
                                    detikP1 = 0;
                                    jagungCuci += 10;
                                    wadahP1 -= 10;
                                }
                            }
                        } else if (jumlahKaryawanP1 == 2) {
                            if (wadahP1 <= 20) {
                                if (detikP1 == 15) {
                                    jagungCuci += wadahP1;
                                    wadahP1 = 0;
                                    detikP1 = 0;
                                    p1 = false;
                                    vPabrik.getBtnProses1().setEnabled(true);
                                }
                            } else if (wadahP1 > 20) {
                                if (detikP1 == 15) {
                                    detikP1 = 0;
                                    jagungCuci += 20;
                                    wadahP1 -= 20;
                                }
                            }
                        } else if (jumlahKaryawanP1 == 3) {
                            if (detikP1 == 15) {
                                jagungCuci += wadahP1;
                                wadahP1 = 0;
                                detikP1 = 0;
                                p1 = false;
                                vPabrik.getBtnProses1().setEnabled(true);
                            }
                        }
                        System.out.println("");
                        System.out.println("detik: " + detikP1);
                        System.out.println("jagung: " + jagung);
                        System.out.println("jagungP1: " + wadahP1);
                        System.out.println("jagungCuci: " + jagungCuci);
                    }
                    if (p2) {
                        detikP2 += 1;
                        if (jumlahKaryawanP2 == 1) {
                            if (wadahP2 <= 10) {
                                if (detikP2 == 20) {
                                    jagungRendam += wadahP2;
                                    wadahP2 = 0;
                                    detikP2 = 0;
                                    p2 = false;
                                    vPabrik.getBtnProses2().setEnabled(true);
                                }
                            } else if (wadahP2 > 10) {
                                if (detikP2 == 20) {
                                    detikP2 = 0;
                                    jagungRendam += 10;
                                    wadahP2 -= 10;
                                }
                            }
                        } else if (jumlahKaryawanP2 == 2) {
                            if (wadahP2 <= 20) {
                                if (detikP2 == 20) {
                                    jagungRendam += wadahP2;
                                    wadahP2 = 0;
                                    detikP2 = 0;
                                    p2 = false;
                                    vPabrik.getBtnProses2().setEnabled(true);
                                }
                            } else if (wadahP2 > 20) {
                                if (detikP2 == 20) {
                                    detikP2 = 0;
                                    jagungRendam += 20;
                                    wadahP2 -= 20;
                                }
                            }
                        } else if (jumlahKaryawanP2 == 3) {
                            if (detikP2 == 20) {
                                jagungRendam += wadahP2;
                                wadahP2 = 0;
                                detikP2 = 0;
                                p2 = false;
                                vPabrik.getBtnProses2().setEnabled(true);
                            }
                        }
                        System.out.println("");
                        System.out.println("detik: " + detikP2);
                        System.out.println("jagungCuci: " + jagungCuci);
                        System.out.println("jagungP2: " + wadahP2);
                        System.out.println("jagungRendam: " + jagungRendam);
                    }
                    if (p3) {
                        detikP3 += 1;
                        if (jumlahKaryawanP3 == 1) {
                            
                        } else if (jumlahKaryawanP3 == 2) {

                        } else if (jumlahKaryawanP3 == 3) {

                        }
                    }
                    if (p4) {

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(c_ruProduksi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private int parameterKualitasJagung(double jagungRendam, double garam) {
        int hasil = (int) roundHalfDown(jagungRendam / garam);
        return hasil;
    }

    private double roundHalfDown(double d) {
        return new BigDecimal(d).setScale(0, RoundingMode.HALF_UP).doubleValue();
    }
}
