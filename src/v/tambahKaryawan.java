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
public class tambahKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form tambahKaryawan
     */
    public tambahKaryawan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public JButton getBtnKurangP1() {
        return btnKurangP1;
    }

    public JButton getBtnKurangP2() {
        return btnKurangP2;
    }

    public JButton getBtnKurangP3() {
        return btnKurangP3;
    }

    public JButton getBtnKurangP4() {
        return btnKurangP4;
    }

    public JButton getBtnTambahKaryawan() {
        return btnTambahKaryawan;
    }

    public JButton getBtnTambahP1() {
        return btnTambahP1;
    }

    public JButton getBtnTambahP2() {
        return btnTambahP2;
    }

    public JButton getBtnTambahP3() {
        return btnTambahP3;
    }

    public JButton getBtnTambahP4() {
        return btnTambahP4;
    }

    public JLabel getLblBanyakP1() {
        return lblBanyakP1;
    }

    public JLabel getLblBanyakP2() {
        return lblBanyakP2;
    }

    public JLabel getLblBanyakP3() {
        return lblBanyakP3;
    }

    public JLabel getLblBanyakP4() {
        return lblBanyakP4;
    }

    public JLabel getLblUang() {
        return lblUang;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBatal = new javax.swing.JButton();
        lblUang = new javax.swing.JLabel();
        lblBanyakP4 = new javax.swing.JLabel();
        lblBanyakP1 = new javax.swing.JLabel();
        lblBanyakP2 = new javax.swing.JLabel();
        lblBanyakP3 = new javax.swing.JLabel();
        btnKurangP3 = new javax.swing.JButton();
        btnTambahP3 = new javax.swing.JButton();
        btnKurangP2 = new javax.swing.JButton();
        btnTambahP2 = new javax.swing.JButton();
        btnKurangP1 = new javax.swing.JButton();
        btnTambahP1 = new javax.swing.JButton();
        btnTambahP4 = new javax.swing.JButton();
        btnKurangP4 = new javax.swing.JButton();
        btnTambahKaryawan = new javax.swing.JButton();
        lblBanyakP1Max = new javax.swing.JLabel();
        lblBanyakP2Max = new javax.swing.JLabel();
        lblBanyakP3Max = new javax.swing.JLabel();
        lblBanyakP4Max = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembali.png"))); // NOI18N
        btnBatal.setBorderPainted(false);
        btnBatal.setContentAreaFilled(false);
        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatal.setFocusable(false);
        btnBatal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tblKembaliHover.png"))); // NOI18N
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 60));

        lblUang.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblUang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUang.setText("Uang");
        getContentPane().add(lblUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 218, 32));

        lblBanyakP4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP4.setText("0");
        getContentPane().add(lblBanyakP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 60, 50));

        lblBanyakP1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP1.setText("0");
        getContentPane().add(lblBanyakP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 60, 50));

        lblBanyakP2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP2.setText("0");
        getContentPane().add(lblBanyakP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 70, 50));

        lblBanyakP3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP3.setText("0");
        getContentPane().add(lblBanyakP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 60, 50));

        btnKurangP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinus.png"))); // NOI18N
        btnKurangP3.setBorderPainted(false);
        btnKurangP3.setContentAreaFilled(false);
        btnKurangP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKurangP3.setFocusable(false);
        btnKurangP3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinusHover.png"))); // NOI18N
        getContentPane().add(btnKurangP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 80, 80));

        btnTambahP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlus.png"))); // NOI18N
        btnTambahP3.setBorderPainted(false);
        btnTambahP3.setContentAreaFilled(false);
        btnTambahP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahP3.setFocusable(false);
        btnTambahP3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlusHover.png"))); // NOI18N
        getContentPane().add(btnTambahP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 80, 80));

        btnKurangP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinus.png"))); // NOI18N
        btnKurangP2.setBorderPainted(false);
        btnKurangP2.setContentAreaFilled(false);
        btnKurangP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKurangP2.setFocusable(false);
        btnKurangP2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinusHover.png"))); // NOI18N
        getContentPane().add(btnKurangP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 80, 80));

        btnTambahP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlus.png"))); // NOI18N
        btnTambahP2.setBorderPainted(false);
        btnTambahP2.setContentAreaFilled(false);
        btnTambahP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahP2.setFocusable(false);
        btnTambahP2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlusHover.png"))); // NOI18N
        getContentPane().add(btnTambahP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 80, 80));

        btnKurangP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinus.png"))); // NOI18N
        btnKurangP1.setBorderPainted(false);
        btnKurangP1.setContentAreaFilled(false);
        btnKurangP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKurangP1.setFocusable(false);
        btnKurangP1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinusHover.png"))); // NOI18N
        getContentPane().add(btnKurangP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 80, 80));

        btnTambahP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlus.png"))); // NOI18N
        btnTambahP1.setBorderPainted(false);
        btnTambahP1.setContentAreaFilled(false);
        btnTambahP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahP1.setFocusable(false);
        btnTambahP1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlusHover.png"))); // NOI18N
        getContentPane().add(btnTambahP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 80, 80));

        btnTambahP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlus.png"))); // NOI18N
        btnTambahP4.setBorderPainted(false);
        btnTambahP4.setContentAreaFilled(false);
        btnTambahP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahP4.setFocusable(false);
        btnTambahP4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblPlusHover.png"))); // NOI18N
        getContentPane().add(btnTambahP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 80, 80));

        btnKurangP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinus.png"))); // NOI18N
        btnKurangP4.setBorderPainted(false);
        btnKurangP4.setContentAreaFilled(false);
        btnKurangP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKurangP4.setFocusable(false);
        btnKurangP4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblMinusHover.png"))); // NOI18N
        getContentPane().add(btnKurangP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 80, 80));

        btnTambahKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblTambah.png"))); // NOI18N
        btnTambahKaryawan.setBorderPainted(false);
        btnTambahKaryawan.setContentAreaFilled(false);
        btnTambahKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahKaryawan.setFocusable(false);
        btnTambahKaryawan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/tblTambahhover.png"))); // NOI18N
        getContentPane().add(btnTambahKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 300, 90));

        lblBanyakP1Max.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP1Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP1Max.setText("/  2");
        getContentPane().add(lblBanyakP1Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 60, 50));

        lblBanyakP2Max.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP2Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP2Max.setText("/  2");
        getContentPane().add(lblBanyakP2Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 70, 50));

        lblBanyakP3Max.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP3Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP3Max.setText("/  1");
        getContentPane().add(lblBanyakP3Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 60, 50));

        lblBanyakP4Max.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblBanyakP4Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanyakP4Max.setText("/  2");
        getContentPane().add(lblBanyakP4Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 60, 50));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("15000/orang");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 120, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("10000/orang");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 120, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("15000/orang");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 110, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("20000/orang");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/ikonUang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pabrik/tambahKaryawan/background.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(tambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKurangP1;
    private javax.swing.JButton btnKurangP2;
    private javax.swing.JButton btnKurangP3;
    private javax.swing.JButton btnKurangP4;
    private javax.swing.JButton btnTambahKaryawan;
    private javax.swing.JButton btnTambahP1;
    private javax.swing.JButton btnTambahP2;
    private javax.swing.JButton btnTambahP3;
    private javax.swing.JButton btnTambahP4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBanyakP1;
    private javax.swing.JLabel lblBanyakP1Max;
    private javax.swing.JLabel lblBanyakP2;
    private javax.swing.JLabel lblBanyakP2Max;
    private javax.swing.JLabel lblBanyakP3;
    private javax.swing.JLabel lblBanyakP3Max;
    private javax.swing.JLabel lblBanyakP4;
    private javax.swing.JLabel lblBanyakP4Max;
    private javax.swing.JLabel lblUang;
    // End of variables declaration//GEN-END:variables
}
