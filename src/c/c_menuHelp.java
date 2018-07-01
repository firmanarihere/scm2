/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.helpGudang;
import v.helpKoperasi;
import v.helpMap;
import v.helpPabrik;
import v.helpSawah;
import v.helpToko;
import v.menuHelp;

/**
 *
 * @author Rangora
 */
public class c_menuHelp {

    private menuHelp vMenuHelp;
    private helpMap vHelpMap;
    private helpGudang vHelpGudang;
    private helpSawah vHelpSawah;
    private helpPabrik vHelpPabrik;
    private helpKoperasi vHelpKoperasi;
    private helpToko vHelpToko;
    private String[] indexMap = new String[6];
    private String[] indexGudang = new String[2];
    private String[] indexSawah = new String[6];
    private String[] indexPabrik = new String[5];
    private String[] indexKoperasi = new String[3];
    private String[] indexToko = new String[3];
    private String posisi;
    private int iMap;
    private int iGudang;
    private int iSawah;
    private int iPabrik;
    private int iKoperasi;
    private int iToko;

    public c_menuHelp() {
        vMenuHelp = new menuHelp();
        vHelpGudang = new helpGudang();
        vHelpMap = new helpMap();
        vHelpPabrik = new helpPabrik();
        vHelpSawah = new helpSawah();
        vHelpKoperasi = new helpKoperasi();
        vHelpToko = new helpToko();

        indexMap[0] = "/gambar/petunjuk/map/overplaysawah.png";
        indexMap[1] = "/gambar/petunjuk/map/overplayKoperasi.png";
        indexMap[2] = "/gambar/petunjuk/map/overplayGudang.png";
        indexMap[3] = "/gambar/petunjuk/map/overplayPabrik.png";
        indexMap[4] = "/gambar/petunjuk/map/overplayToko.png";
        indexMap[5] = "/gambar/petunjuk/map/overplayinfoBar.png";

        indexGudang[0] = "/gambar/petunjuk/gudang/1.png";
        indexGudang[1] = "/gambar/petunjuk/gudang/2.png";

        indexSawah[0] = "/gambar/petunjuk/sawah/1selamatdatang.png";
        indexSawah[1] = "/gambar/petunjuk/sawah/2infobar.png";
        indexSawah[2] = "/gambar/petunjuk/sawah/3tombolsiram.png";
        indexSawah[3] = "/gambar/petunjuk/sawah/4benih.png";
        indexSawah[4] = "/gambar/petunjuk/sawah/5jagungmuda.png";
        indexSawah[5] = "/gambar/petunjuk/sawah/6jagungtua.png";

        indexPabrik[0] = "/gambar/petunjuk/pabrik/overview1.png";
        indexPabrik[1] = "/gambar/petunjuk/pabrik/overview2.png";
        indexPabrik[2] = "/gambar/petunjuk/pabrik/overview3.png";
        indexPabrik[3] = "/gambar/petunjuk/pabrik/overview4.png";
        indexPabrik[4] = "/gambar/petunjuk/pabrik/overviewbar.png";
        
        indexKoperasi[0] = "/gambar/petunjuk/koperasi/1.png";
        indexKoperasi[1] = "/gambar/petunjuk/koperasi/2.png";
        indexKoperasi[2] = "/gambar/petunjuk/koperasi/3.png";
        
        indexToko[0] = "/gambar/petunjuk/toko/1.png";
        indexToko[1] = "/gambar/petunjuk/toko/2.png";
        indexToko[2] = "/gambar/petunjuk/toko/3.png";

        //tombol di menuHelp
        vMenuHelp.getBtnKembali().addActionListener(new disposeAction());
        vMenuHelp.getBtnMap().addActionListener(new mapAction());
        vMenuHelp.getBtnGudang().addActionListener(new gudangAction());
        vMenuHelp.getBtnSawah().addActionListener(new sawahAction());
        vMenuHelp.getBtnPabrik().addActionListener(new pabrikAction());
        vMenuHelp.getBtnKoperasi().addActionListener(new koperasiAction());
        vMenuHelp.getBtnToko().addActionListener(new tokoAction());
        
        vHelpMap.getBtnKembali().addActionListener(new kembaliAction());
        vHelpGudang.getBtnKembali().addActionListener(new kembaliAction());
        vHelpSawah.getBtnKembali().addActionListener(new kembaliAction());
        vHelpPabrik.getBtnKembali().addActionListener(new kembaliAction());
        vHelpKoperasi.getBtnKembali().addActionListener(new kembaliAction());
        vHelpToko.getBtnKembali().addActionListener(new kembaliAction());

        //tombol di helpMap
        vHelpMap.getBtnKiri().addActionListener(new kiriAction());
        vHelpMap.getBtnKanan().addActionListener(new kananAction());

        //tombo di helpGudang
        vHelpGudang.getBtnKiri().addActionListener(new kiriAction());
        vHelpGudang.getBtnKanan().addActionListener(new kananAction());

        //tombo di helpSawah
        vHelpSawah.getBtnKiri().addActionListener(new kiriAction());
        vHelpSawah.getBtnKanan().addActionListener(new kananAction());

        //tombo di helpPabrik
        vHelpPabrik.getBtnKiri().addActionListener(new kiriAction());
        vHelpPabrik.getBtnKanan().addActionListener(new kananAction());
        
        //tombo di helpKoperasi
        vHelpKoperasi.getBtnKiri().addActionListener(new kiriAction());
        vHelpKoperasi.getBtnKanan().addActionListener(new kananAction());
        
        //tombo di helpToko
        vHelpToko.getBtnKiri().addActionListener(new kiriAction());
        vHelpToko.getBtnKanan().addActionListener(new kananAction());

        vHelpMap.getLblIniSawah().setVisible(false);
        vHelpMap.getLblIniKoperasi().setVisible(false);
        vHelpMap.getLblIniGudang().setVisible(false);
        vHelpMap.getLblIniPabrik().setVisible(false);
        vHelpMap.getLblIniToko().setVisible(false);
        vHelpMap.getLblIniBar().setVisible(false);

        vMenuHelp.setVisible(true);
    }

    private class kananAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (posisi == "map") {
                if (iMap == indexMap.length - 1) {
                    iMap = 0;
                } else {
                    iMap += 1;
                }
                if (iMap == 0) {
                    vHelpMap.getLblIniSawah().setVisible(true);
                    vHelpMap.getLblIniKoperasi().setVisible(false);
                    vHelpMap.getLblIniGudang().setVisible(false);
                    vHelpMap.getLblIniPabrik().setVisible(false);
                    vHelpMap.getLblIniToko().setVisible(false);
                    vHelpMap.getLblIniBar().setVisible(false);
                } else if (iMap == 1) {
                    vHelpMap.getLblIniSawah().setVisible(false);
                    vHelpMap.getLblIniKoperasi().setVisible(true);
                    vHelpMap.getLblIniGudang().setVisible(false);
                    vHelpMap.getLblIniPabrik().setVisible(false);
                    vHelpMap.getLblIniToko().setVisible(false);
                    vHelpMap.getLblIniBar().setVisible(false);
                } else if (iMap == 2) {
                    vHelpMap.getLblIniSawah().setVisible(false);
                    vHelpMap.getLblIniKoperasi().setVisible(false);
                    vHelpMap.getLblIniGudang().setVisible(true);
                    vHelpMap.getLblIniPabrik().setVisible(false);
                    vHelpMap.getLblIniToko().setVisible(false);
                    vHelpMap.getLblIniBar().setVisible(false);
                } else if (iMap == 3) {
                    vHelpMap.getLblIniSawah().setVisible(false);
                    vHelpMap.getLblIniKoperasi().setVisible(false);
                    vHelpMap.getLblIniGudang().setVisible(false);
                    vHelpMap.getLblIniPabrik().setVisible(true);
                    vHelpMap.getLblIniToko().setVisible(false);
                    vHelpMap.getLblIniBar().setVisible(false);
                } else if (iMap == 4) {
                    vHelpMap.getLblIniSawah().setVisible(false);
                    vHelpMap.getLblIniKoperasi().setVisible(false);
                    vHelpMap.getLblIniGudang().setVisible(false);
                    vHelpMap.getLblIniPabrik().setVisible(false);
                    vHelpMap.getLblIniToko().setVisible(true);
                    vHelpMap.getLblIniBar().setVisible(false);
                } else if (iMap == 5) {
                    vHelpMap.getLblIniSawah().setVisible(false);
                    vHelpMap.getLblIniKoperasi().setVisible(false);
                    vHelpMap.getLblIniGudang().setVisible(false);
                    vHelpMap.getLblIniPabrik().setVisible(false);
                    vHelpMap.getLblIniToko().setVisible(false);
                    vHelpMap.getLblIniBar().setVisible(true);
                }
                vHelpMap.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexMap[iMap])));
            } else if (posisi == "gudang") {
                if (iGudang == indexGudang.length - 1) {
                    iGudang = 0;
                } else {
                    iGudang += 1;
                }
                vHelpGudang.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexGudang[iGudang])));
            } else if (posisi == "sawah") {
                if (iSawah == indexSawah.length - 1) {
                    iSawah = 0;
                } else {
                    iSawah += 1;
                }
                vHelpSawah.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexSawah[iSawah])));
            } else if (posisi == "pabrik") {
                if (iPabrik == indexPabrik.length - 1) {
                    iPabrik = 0;
                } else {
                    iPabrik += 1;
                }
                vHelpPabrik.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexPabrik[iPabrik])));
            }else if (posisi == "koperasi") {
                if (iKoperasi == indexKoperasi.length - 1) {
                    iKoperasi = 0;
                } else {
                    iKoperasi += 1;
                }
                vHelpKoperasi.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexKoperasi[iKoperasi])));
            }else if (posisi == "toko") {
                if (iToko == indexToko.length - 1) {
                    iToko = 0;
                } else {
                    iToko += 1;
                }
                vHelpToko.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexToko[iToko])));
            }
        }

    }

    private class kiriAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (posisi == "map") {
                if (iMap == 0) {
                    iMap = indexMap.length - 1;
                } else {
                    iMap -= 1;
                }
                vHelpMap.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexMap[iMap])));
            } else if (posisi == "gudang") {
                if (iGudang == 0) {
                    iGudang = indexGudang.length - 1;
                } else {
                    iGudang -= 1;
                }
                vHelpGudang.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexGudang[iGudang])));
            } else if (posisi == "sawah") {
                if (iSawah == 0) {
                    iSawah = indexSawah.length - 1;
                } else {
                    iSawah -= 1;
                }
                vHelpSawah.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexSawah[iSawah])));
            } else if (posisi == "pabrik") {
                if (iPabrik == 0) {
                    iPabrik = indexPabrik.length - 1;
                } else {
                    iPabrik -= 1;
                }
                vHelpPabrik.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexPabrik[iPabrik])));
            }else if (posisi =="koperasi") {
                if (iKoperasi == 0) {
                    iKoperasi = indexKoperasi.length - 1;
                } else {
                    iKoperasi -= 1;
                }
                vHelpKoperasi.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexKoperasi[iKoperasi])));
            }else if (posisi == "toko") {
                if (iToko == 0) {
                    iToko = indexToko.length - 1;
                } else {
                    iToko -= 1;
                }
                vHelpToko.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexToko[iToko])));
            }
        }

    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vHelpGudang.dispose();
            vHelpMap.dispose();
            vHelpPabrik.dispose();
            vHelpSawah.dispose();
            vHelpKoperasi.dispose();
            vHelpToko.dispose();
            vHelpMap.getLblIniSawah().setVisible(false);
            vHelpMap.getLblIniKoperasi().setVisible(false);
            vHelpMap.getLblIniGudang().setVisible(false);
            vHelpMap.getLblIniPabrik().setVisible(false);
            vHelpMap.getLblIniToko().setVisible(false);
            vHelpMap.getLblIniBar().setVisible(false);
            vMenuHelp.setVisible(true);
        }
    }

    private class tokoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iToko = 0;
            posisi = "toko";
            vHelpToko.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexToko[iToko])));
            vHelpToko.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }
    private class koperasiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iKoperasi = 0;
            posisi = "koperasi";
            vHelpKoperasi.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexKoperasi[iKoperasi])));
            vHelpKoperasi.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }
    private class pabrikAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iPabrik = 0;
            posisi = "pabrik";
            vHelpPabrik.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexPabrik[iPabrik])));
            vHelpPabrik.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }

    private class sawahAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iSawah = 0;
            posisi = "sawah";
            vHelpSawah.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexSawah[iSawah])));
            vHelpSawah.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }

    private class gudangAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iGudang = 0;
            posisi = "gudang";
            vHelpGudang.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexGudang[iGudang])));
            vHelpGudang.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }

    private class mapAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iMap = 0;
            posisi = "map";
            vHelpMap.getLblIniSawah().setVisible(true);
            vHelpMap.getLblGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource(indexMap[iMap])));
            vHelpMap.setVisible(true);
            vMenuHelp.setVisible(false);
        }

    }

    private class disposeAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vMenuHelp.dispose();
        }

    }

}
