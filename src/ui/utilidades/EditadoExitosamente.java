/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.utilidades;

/**
 *
 * @author Nicolas
 */
public class EditadoExitosamente extends javax.swing.JFrame {

    /**
     * Creates new form EditadoExitosamente
     */
    public EditadoExitosamente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnVolverPrincipioEditadoCorrecP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Editado correctamente");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Editado correctamente");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        btnVolverPrincipioEditadoCorrecP.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverPrincipioEditadoCorrecP.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnVolverPrincipioEditadoCorrecP.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverPrincipioEditadoCorrecP.setText("Volver");
        btnVolverPrincipioEditadoCorrecP.setBorder(null);
        btnVolverPrincipioEditadoCorrecP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPrincipioEditadoCorrecPActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverPrincipioEditadoCorrecP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverPrincipioEditadoCorrecPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPrincipioEditadoCorrecPActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverPrincipioEditadoCorrecPActionPerformed

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
            java.util.logging.Logger.getLogger(EditadoExitosamente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditadoExitosamente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditadoExitosamente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditadoExitosamente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditadoExitosamente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverPrincipioEditadoCorrecP;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
