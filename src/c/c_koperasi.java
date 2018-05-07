/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.home;
import v.koperasi;

/**
 *
 * @author Rangora
 */
public class c_koperasi {

    private koperasi vKoperasi;
    private home vHome;

    public c_koperasi(home vHome) {
        vKoperasi = new koperasi();
        this.vHome = vHome;
        vKoperasi.getBtnKembali().addActionListener(new kembaliAction());
        vKoperasi.setVisible(true);
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vKoperasi.setVisible(false);
            vHome.setVisible(true);
        }

    }

}
