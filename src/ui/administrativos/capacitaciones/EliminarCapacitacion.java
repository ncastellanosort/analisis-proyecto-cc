/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos.capacitaciones;

import logica.administrativos.capacitaciones.ListaCapacitaciones;
import ui.utilidades.EliminadoExitosamente;
import ui.utilidades.ErrorAlEliminar;

/**
 *
 * @author Nicolas
 */
public class EliminarCapacitacion extends javax.swing.JFrame {

    /**
     * Creates new form EliminarCapacitacion
     */
    public EliminarCapacitacion() {
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
        btnVolverEliminarCapa = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtfEliminarCapacitacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
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
        jLabel20.setText("Eliminar capacitacion");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnVolverEliminarCapa.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverEliminarCapa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverEliminarCapa.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverEliminarCapa.setText("X");
        btnVolverEliminarCapa.setBorder(null);
        btnVolverEliminarCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverEliminarCapaActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverEliminarCapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Número de identificación");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtfEliminarCapacitacion.setBackground(new java.awt.Color(153, 195, 84));
        txtfEliminarCapacitacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfEliminarCapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtfEliminarCapacitacion.setBorder(null);
        jPanel1.add(txtfEliminarCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 350, 45));

        jButton1.setBackground(new java.awt.Color(127, 156, 90));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Eliminar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverEliminarCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverEliminarCapaActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverEliminarCapaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ErrorAlEliminar err = new ErrorAlEliminar();

        EliminadoExitosamente elimBien = new EliminadoExitosamente();

        try {

            int IDeliminar = Integer.parseInt(txtfEliminarCapacitacion.getText());

            ListaCapacitaciones.getCapacitacionesCentroComercial().remove(IDeliminar);

            elimBien.setLocationRelativeTo(null);
            elimBien.setResizable(false);
            elimBien.setVisible(true);

            this.dispose();
        } catch (Exception e) {

            err.setLocationRelativeTo(null);
            err.setResizable(false);
            err.setVisible(true);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCapacitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverEliminarCapa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtfEliminarCapacitacion;
    // End of variables declaration//GEN-END:variables
}
