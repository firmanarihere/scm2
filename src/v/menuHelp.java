/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import javax.swing.JButton;

/**
 *
 * @author Rangora
 */
public class menuHelp extends javax.swing.JFrame {

    /**
     * Creates new form menuHelp
     */
    public menuHelp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getBtnGudang() {
        return btnGudang;
    }

    public JButton getBtnKembali() {
        return btnKembali;
    }

    public JButton getBtnMap() {
        return btnMap;
    }

    public JButton getBtnPabrik() {
        return btnPabrik;
    }

    public JButton getBtnSawah() {
        return btnSawah;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnPabrik = new javax.swing.JButton();
        btnMap = new javax.swing.JButton();
        btnGudang = new javax.swing.JButton();
        btnSawah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/TULISAN PETUNJUK.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 77, 606, 75));

        btnPabrik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblpabrik.png"))); // NOI18N
        btnPabrik.setBorderPainted(false);
        btnPabrik.setContentAreaFilled(false);
        btnPabrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPabrik.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblpabrikhover.png"))); // NOI18N
        getContentPane().add(btnPabrik, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 570, 70));

        btnMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblmap.png"))); // NOI18N
        btnMap.setBorderPainted(false);
        btnMap.setContentAreaFilled(false);
        btnMap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMap.setFocusable(false);
        btnMap.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblmaphover.png"))); // NOI18N
        getContentPane().add(btnMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 570, 70));

        btnGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblgudang.png"))); // NOI18N
        btnGudang.setBorderPainted(false);
        btnGudang.setContentAreaFilled(false);
        btnGudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGudang.setFocusable(false);
        btnGudang.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblgudanghover.png"))); // NOI18N
        getContentPane().add(btnGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 570, 70));

        btnSawah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblsawah.png"))); // NOI18N
        btnSawah.setBorderPainted(false);
        btnSawah.setContentAreaFilled(false);
        btnSawah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSawah.setFocusable(false);
        btnSawah.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblsawahhover.png"))); // NOI18N
        getContentPane().add(btnSawah, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 570, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblkoperasi.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tblkoperasihover.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 570, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tbltoko.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/tbltokohover.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 570, 70));

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembali.png"))); // NOI18N
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.setFocusable(false);
        btnKembali.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembaliHover.png"))); // NOI18N
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/petunjuk/helpMenu/mainMenuKosongan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
            java.util.logging.Logger.getLogger(menuHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGudang;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnPabrik;
    private javax.swing.JButton btnSawah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}