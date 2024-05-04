/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos.proveedores;

import javax.swing.JTextField;
import logica.administrativos.proveedores.ListaProveedores;
import ui.utilidades.ErrorSeleccionarIndice;

/**
 *
 * @author Nicolas
 */
public class IndiceEditarProveeedor extends javax.swing.JFrame {

    /**
     * Creates new form IndiceEditarProveeedor
     */
    public IndiceEditarProveeedor() {
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
        btnSalirIndiceProveedor = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtfIndiceGESTIONPROVEEDOR = new javax.swing.JTextField();
        btnSeleccionarIDEditarPRov = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(600, 90));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Gestionar proveedor");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnSalirIndiceProveedor.setBackground(new java.awt.Color(127, 156, 90));
        btnSalirIndiceProveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnSalirIndiceProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirIndiceProveedor.setText("X");
        btnSalirIndiceProveedor.setBorder(null);
        btnSalirIndiceProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirIndiceProveedorActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalirIndiceProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Número de identificación fiscal");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtfIndiceGESTIONPROVEEDOR.setBackground(new java.awt.Color(153, 195, 84));
        txtfIndiceGESTIONPROVEEDOR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfIndiceGESTIONPROVEEDOR.setForeground(new java.awt.Color(0, 0, 0));
        txtfIndiceGESTIONPROVEEDOR.setBorder(null);
        txtfIndiceGESTIONPROVEEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIndiceGESTIONPROVEEDORActionPerformed(evt);
            }
        });
        jPanel1.add(txtfIndiceGESTIONPROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 350, 45));

        btnSeleccionarIDEditarPRov.setBackground(new java.awt.Color(127, 156, 90));
        btnSeleccionarIDEditarPRov.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSeleccionarIDEditarPRov.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionarIDEditarPRov.setText("Seleccionar");
        btnSeleccionarIDEditarPRov.setBorder(null);
        btnSeleccionarIDEditarPRov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarIDEditarPRovActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarIDEditarPRov, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirIndiceProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirIndiceProveedorActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirIndiceProveedorActionPerformed

    private void btnSeleccionarIDEditarPRovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarIDEditarPRovActionPerformed

        try {

            int IDEditar = Integer.parseInt(txtfIndiceGESTIONPROVEEDOR.getText());

            EditarProveedor.setINDICE(IDEditar);

//        ListaProveedores.getProveedoresCentroComercial().get(IDEditar);
            EditarProveedor edPR = new EditarProveedor();

            edPR.getLbNumeroIdFiscalProv().setText(String.valueOf(IDEditar));

            edPR.getTxtfNUEVONombreProveedor().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getNombreEmpresaProveedor());

            edPR.getTxtfNUEVODireccionRegistrada().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getDireccionRegistradaProveedor());

            edPR.getTxtfNUEVONumeroContactoProveedor().setText(String.valueOf(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getNumeroContactoProveedor()));

            edPR.getTxtfNUEVODireccionCorreoProveedor().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getDireccionCorreoProveedor());

            edPR.getTxtfNUEVOServicioSuministradoProveedor().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getServicioSuministradoProveedor());

            edPR.getTxtfNUEVOReferenciaCProveedor().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getReferenciaComercialProveedor());

            edPR.getTxtfNUEVOTerminoDePagoProveedor().setText(ListaProveedores.getProveedoresCentroComercial().get(IDEditar).getTerminoDePagoProveedor());

            this.dispose();

            edPR.setLocationRelativeTo(null);
            edPR.setResizable(false);
            edPR.setVisible(true);

        } catch (Exception e) {

            ErrorSeleccionarIndice errIn = new ErrorSeleccionarIndice();
            errIn.setLocationRelativeTo(null);
            errIn.setResizable(false);
            errIn.setVisible(true);
            //ERROR EN EL INDICE

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionarIDEditarPRovActionPerformed

    public JTextField getTxtfIndiceGESTIONPROVEEDOR() {
        return txtfIndiceGESTIONPROVEEDOR;
    }

    public void setTxtfIndiceGESTIONPROVEEDOR(JTextField txtfIndiceGESTIONPROVEEDOR) {
        this.txtfIndiceGESTIONPROVEEDOR = txtfIndiceGESTIONPROVEEDOR;
    }


    private void txtfIndiceGESTIONPROVEEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIndiceGESTIONPROVEEDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIndiceGESTIONPROVEEDORActionPerformed

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
            java.util.logging.Logger.getLogger(IndiceEditarProveeedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndiceEditarProveeedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndiceEditarProveeedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndiceEditarProveeedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndiceEditarProveeedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirIndiceProveedor;
    private javax.swing.JButton btnSeleccionarIDEditarPRov;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtfIndiceGESTIONPROVEEDOR;
    // End of variables declaration//GEN-END:variables
}
