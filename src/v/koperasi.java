/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Rangora
 */
public class koperasi extends javax.swing.JFrame {

    /**
     * Creates new form koperasi
     */
    public koperasi() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public JButton getBtnItem1() {
        return btnItem1;
    }

    public JButton getBtnItem2() {
        return btnItem2;
    }

    public JButton getBtnItem3() {
        return btnItem3;
    }

    public JButton getBtnItem4() {
        return btnItem4;
    }

    public JButton getBtnKembali() {
        return btnKembali;
    }

    public JLabel getLblGaram() {
        return lblGaram;
    }

    public JLabel getLblJagung() {
        return lblJagung;
    }

    public JLabel getLblKoin() {
        return lblKoin;
    }

    public JLabel getLblMinyak() {
        return lblMinyak;
    }

    public JLabel getLblBibit() {
        return lblBibit;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JButton();
        btnItem1 = new javax.swing.JButton();
        btnItem2 = new javax.swing.JButton();
        btnItem3 = new javax.swing.JButton();
        btnItem4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMinyak = new javax.swing.JLabel();
        lblKoin = new javax.swing.JLabel();
        lblJagung = new javax.swing.JLabel();
        lblGaram = new javax.swing.JLabel();
        lblBibit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isigudang/tier 1/tblClose.png"))); // NOI18N
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.setFocusable(false);
        btnKembali.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnKembali.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isigudang/tier 1/tblClosehover.png"))); // NOI18N
        btnKembali.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnKembali.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 130, 120));

        btnItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblGaram.png"))); // NOI18N
        btnItem1.setBorderPainted(false);
        btnItem1.setContentAreaFilled(false);
        btnItem1.setFocusable(false);
        btnItem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnItem1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblGaramhover.png"))); // NOI18N
        getContentPane().add(btnItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 270, 140));

        btnItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblminyak.png"))); // NOI18N
        btnItem2.setBorderPainted(false);
        btnItem2.setContentAreaFilled(false);
        btnItem2.setFocusable(false);
        btnItem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnItem2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnItem2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblminyakhover.png"))); // NOI18N
        getContentPane().add(btnItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 370, 150));

        btnItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblJagung.png"))); // NOI18N
        btnItem3.setBorderPainted(false);
        btnItem3.setContentAreaFilled(false);
        btnItem3.setFocusable(false);
        btnItem3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnItem3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnItem3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblJagunghover.png"))); // NOI18N
        getContentPane().add(btnItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 390, 180));

        btnItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblBibitJagung.png"))); // NOI18N
        btnItem4.setBorderPainted(false);
        btnItem4.setContentAreaFilled(false);
        btnItem4.setDefaultCapable(false);
        btnItem4.setFocusable(false);
        btnItem4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnItem4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnItem4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/tblBibitJagunghover.png"))); // NOI18N
        getContentPane().add(btnItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 620, 270));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gambar Orang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 120, 160));

        lblMinyak.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblMinyak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinyak.setText("minyak goreng");
        getContentPane().add(lblMinyak, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 343, 140, 32));

        lblKoin.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblKoin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKoin.setText("koin");
        getContentPane().add(lblKoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 252, 140, 35));

        lblJagung.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblJagung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJagung.setText("jagung");
        getContentPane().add(lblJagung, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 525, 140, 33));

        lblGaram.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblGaram.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGaram.setText("garam");
        getContentPane().add(lblGaram, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 436, 130, 34));

        lblBibit.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBibit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBibit.setText("bibit");
        getContentPane().add(lblBibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 607, 140, 33));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/indicator.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/isiKoperasi/rak.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(koperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(koperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(koperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(koperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new koperasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnItem1;
    private javax.swing.JButton btnItem2;
    private javax.swing.JButton btnItem3;
    private javax.swing.JButton btnItem4;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBibit;
    private javax.swing.JLabel lblGaram;
    private javax.swing.JLabel lblJagung;
    private javax.swing.JLabel lblKoin;
    private javax.swing.JLabel lblMinyak;
    // End of variables declaration//GEN-END:variables
}
