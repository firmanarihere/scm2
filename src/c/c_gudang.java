/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.gudang;
import v.home;

/**
 *
 * @author Rangora
 */
public class c_gudang {

    private gudang vGudang;
    private home vHome;

    public c_gudang(home vHome) {
        vGudang = new gudang();
        this.vHome = vHome;
        vGudang.getBtnKembali().addActionListener(new kembaliAction());
        vGudang.setVisible(true);
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vGudang.setVisible(false);
            vHome.setVisible(true);
        }
    }

}
