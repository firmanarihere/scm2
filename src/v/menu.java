/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rangora
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        usernameFrame.setLocationRelativeTo(this);
    }

    public JButton getBtnLoad() {
        return btnLoad;
    }

    public JButton getBtnKeluar() {
        return btnKeluar;
    }

    public JButton getBtnMulai() {
        return btnMulai;
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public JTextField getFieldUsername() {
        return fieldUsername;
    }

    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public JFrame getUsernameFrame() {
        return usernameFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameFrame = new javax.swing.JFrame();
        fieldUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        usernameFrame.setMinimumSize(new java.awt.Dimension(1280, 720));
        usernameFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldUsername.setFont(new java.awt.Font("Yu Gothic", 1, 65)); // NOI18N
        fieldUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFrame.getContentPane().add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 370, 580, 90));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isi nama/txtNama.png"))); // NOI18N
        usernameFrame.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 610, 110));

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembali.png"))); // NOI18N
        btnBatal.setBorderPainted(false);
        btnBatal.setContentAreaFilled(false);
        btnBatal.setFocusable(false);
        btnBatal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembaliHover.png"))); // NOI18N
        usernameFrame.getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isi nama/tblNama.png"))); // NOI18N
        btnOk.setBorderPainted(false);
        btnOk.setContentAreaFilled(false);
        btnOk.setFocusable(false);
        btnOk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isi nama/tblNamahover.png"))); // NOI18N
        usernameFrame.getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 320, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isi nama/backgroundCerahblurrer.png"))); // NOI18N
        jLabel4.setAutoscrolls(true);
        usernameFrame.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblExit.png"))); // NOI18N
        btnKeluar.setBorderPainted(false);
        btnKeluar.setContentAreaFilled(false);
        btnKeluar.setFocusable(false);
        btnKeluar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblExithover.png"))); // NOI18N
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 230, 90));

        btnMulai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblNewGame.png"))); // NOI18N
        btnMulai.setBorderPainted(false);
        btnMulai.setContentAreaFilled(false);
        btnMulai.setFocusable(false);
        btnMulai.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblNewGamehover.png"))); // NOI18N
        getContentPane().add(btnMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 230, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblHelp.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblHelphover.png"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 230, 90));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblAbout.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblAbouthover.png"))); // NOI18N
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 230, 90));

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblLanjutGame.png"))); // NOI18N
        btnLoad.setBorderPainted(false);
        btnLoad.setContentAreaFilled(false);
        btnLoad.setFocusable(false);
        btnLoad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/tblLanjutGamehover.png"))); // NOI18N
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 230, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mainmenu/mainMenuKosongan.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFrame usernameFrame;
    // End of variables declaration//GEN-END:variables
}
