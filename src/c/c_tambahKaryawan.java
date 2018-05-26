/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import m.m_aset;
import v.pabrik;
import v.tambahKaryawan;

/**
 *
 * @author Rangora
 */
public class c_tambahKaryawan {

    private tambahKaryawan vTambahKaryawan;
    private m_aset mAset;
    private pabrik vPabrik;
    private c_ruProduksi cPabrik;
    private String username;
    private int wadahP1;
    private int wadahP2;
    private int wadahP3;
    private int wadahP4;

    public c_tambahKaryawan(c_ruProduksi cPabrik ,pabrik vPabrik, String username) throws SQLException {
        vTambahKaryawan = new tambahKaryawan();
        mAset = new m_aset();
        this.vPabrik = vPabrik;
        this.username = username;
        this.cPabrik = cPabrik;
        vTambahKaryawan.getBtnBatal().addActionListener(new batalAction());
        vTambahKaryawan.getBtnTambahP1().addActionListener(new tambahP1Action());
        vTambahKaryawan.getBtnTambahP2().addActionListener(new tambahP2Action());
        vTambahKaryawan.getBtnTambahP3().addActionListener(new tambahP3Action());
        vTambahKaryawan.getBtnTambahP4().addActionListener(new tambahP4Action());
        vTambahKaryawan.getBtnKurangP1().addActionListener(new kurangP1Action());
        vTambahKaryawan.getBtnKurangP2().addActionListener(new kurangP2Action());
        vTambahKaryawan.getBtnKurangP3().addActionListener(new kurangP3Action());
        vTambahKaryawan.getBtnKurangP4().addActionListener(new kurangP4Action());
        vTambahKaryawan.getBtnTambahKaryawan().addActionListener(new tambahKaryawanAction());

        vTambahKaryawan.getLblUang().setText(mAset.getKoin(mAset.cekIdPlayer(username)) + "");
    }

    public tambahKaryawan getView() {
        return vTambahKaryawan;
    }

    private class tambahKaryawanAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            wadahP1 = Integer.parseInt(vTambahKaryawan.getLblBanyakP1().getText());
            wadahP2 = Integer.parseInt(vTambahKaryawan.getLblBanyakP2().getText());
            wadahP3 = Integer.parseInt(vTambahKaryawan.getLblBanyakP3().getText());
            wadahP4 = Integer.parseInt(vTambahKaryawan.getLblBanyakP4().getText());
            vPabrik.getLblJumlahKaryawan().setText((wadahP1 + wadahP2 + wadahP3 + wadahP4) + "");
            cPabrik.setKaryawan(wadahP1, wadahP2, wadahP3, wadahP4);
            vTambahKaryawan.setVisible(false);
            vPabrik.setVisible(true);
        }

    }

    private class kurangP1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP1().getText()) == 0) {
            } else {
                vTambahKaryawan.getLblBanyakP1().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP1().getText()) - 1) + "");
            }
        }

    }

    private class kurangP2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP2().getText()) == 0) {
            } else {
                vTambahKaryawan.getLblBanyakP2().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP2().getText()) - 1) + "");
            }
        }

    }

    private class kurangP3Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP3().getText()) == 0) {
            } else {
                vTambahKaryawan.getLblBanyakP3().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP3().getText()) - 1) + "");
            }
        }

    }

    private class kurangP4Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP4().getText()) == 0) {
            } else {
                vTambahKaryawan.getLblBanyakP4().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP4().getText()) - 1) + "");
            }
        }

    }

    private class tambahP1Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP1().getText()) == 2) {

            } else {
                vTambahKaryawan.getLblBanyakP1().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP1().getText()) + 1) + "");
            }
        }

    }

    private class tambahP2Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP2().getText()) == 2) {

            } else {
                vTambahKaryawan.getLblBanyakP2().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP2().getText()) + 1) + "");
            }
        }

    }

    private class tambahP3Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP3().getText()) == 1) {

            } else {
                vTambahKaryawan.getLblBanyakP3().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP3().getText()) + 1) + "");
            }
        }

    }

    private class tambahP4Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(vTambahKaryawan.getLblBanyakP4().getText()) == 2) {

            } else {
                vTambahKaryawan.getLblBanyakP4().setText((Integer.parseInt(vTambahKaryawan.getLblBanyakP4().getText()) + 1) + "");
            }
        }

    }

    private class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vTambahKaryawan.setVisible(false);
            vPabrik.setVisible(true);
        }
    }

}
