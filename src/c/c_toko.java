/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.home;
import v.tokoPenjualanProduk;

/**
 *
 * @author Rangora
 */
public class c_toko {

    private tokoPenjualanProduk vToko;
    private home vHome;

    public c_toko(home vHome) {
        vToko = new tokoPenjualanProduk();
        this.vHome = vHome;
        vToko.getBtnKembali().addActionListener(new kembaliAction());
        vToko.setVisible(true);
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vToko.setVisible(false);
            vHome.setVisible(true);
        }       
    }

}
