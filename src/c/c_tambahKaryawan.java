/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v.pabrik;
import v.tambahKaryawan;

/**
 *
 * @author Rangora
 */
public class c_tambahKaryawan {

    private tambahKaryawan vTambahKaryawan;
    private pabrik vPabrik;

    public c_tambahKaryawan(pabrik pabrik) {
        vTambahKaryawan = new tambahKaryawan();
        vPabrik = pabrik;
        vTambahKaryawan.getBtnBatal().addActionListener(new batalAction());
        
    }
    
    public tambahKaryawan getView(){
        return vTambahKaryawan;
    }

    private class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vTambahKaryawan.setVisible(false);
            vPabrik.setVisible(true);
        }
    }

}
