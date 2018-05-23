/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.home;
import v.pabrik;

/**
 *
 * @author Rangora
 */
public class c_ruProduksi {

    private pabrik vPabrik;
    private home home;

    public c_ruProduksi() {
        vPabrik = new pabrik();
        home = new home();
        vPabrik.getBtnKembali().addActionListener(new kembaliAction());
        
    }

    public pabrik getView(){
        return vPabrik;
    }

    private class kembaliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}
