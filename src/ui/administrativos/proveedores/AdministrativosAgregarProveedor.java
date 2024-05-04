/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos.proveedores;

import logica.administrativos.ListaProveedores;
import logica.administrativos.Proveedor;
import ui.utilidades.AgregadoExitosamente;
import ui.utilidades.ErrorAlAgregar;

/**
 *
 * @author Nicolas
 */
public class AdministrativosAgregarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form AdministrativosAgregarProveedor
     */
    public AdministrativosAgregarProveedor() {
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
        jLabel19 = new javax.swing.JLabel();
        btnVolverInicioAgregProv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfNumeroIdentificacionFiscal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfNombreProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfDireccionRegistrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfNumeroContactoProveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfDireccionCorreoProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfServicioSuministradoProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfReferenciaCProveedor = new javax.swing.JTextField();
        txtfTerminoDePagoProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(983, 880));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Agregar proveedor");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnVolverInicioAgregProv.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverInicioAgregProv.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverInicioAgregProv.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverInicioAgregProv.setText("X");
        btnVolverInicioAgregProv.setBorder(null);
        btnVolverInicioAgregProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioAgregProvActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverInicioAgregProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número de identificación fiscal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        txtfNumeroIdentificacionFiscal.setBackground(new java.awt.Color(153, 195, 84));
        txtfNumeroIdentificacionFiscal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNumeroIdentificacionFiscal.setForeground(new java.awt.Color(0, 0, 0));
        txtfNumeroIdentificacionFiscal.setText("0");
        txtfNumeroIdentificacionFiscal.setBorder(null);
        txtfNumeroIdentificacionFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfNumeroIdentificacionFiscalMouseClicked(evt);
            }
        });
        jPanel1.add(txtfNumeroIdentificacionFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, 45));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        txtfNombreProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNombreProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfNombreProveedor.setText("Pendiente");
        txtfNombreProveedor.setBorder(null);
        txtfNombreProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfNombreProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(txtfNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 350, 45));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dirección registrada");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 30));

        txtfDireccionRegistrada.setBackground(new java.awt.Color(153, 195, 84));
        txtfDireccionRegistrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfDireccionRegistrada.setForeground(new java.awt.Color(0, 0, 0));
        txtfDireccionRegistrada.setText("Pendiente");
        txtfDireccionRegistrada.setBorder(null);
        jPanel1.add(txtfDireccionRegistrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 45));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número de contacto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 30));

        txtfNumeroContactoProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfNumeroContactoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNumeroContactoProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfNumeroContactoProveedor.setText("0");
        txtfNumeroContactoProveedor.setBorder(null);
        jPanel1.add(txtfNumeroContactoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 350, 45));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dirección de correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 30));

        txtfDireccionCorreoProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfDireccionCorreoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfDireccionCorreoProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfDireccionCorreoProveedor.setText("Pendiente");
        txtfDireccionCorreoProveedor.setBorder(null);
        txtfDireccionCorreoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDireccionCorreoProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtfDireccionCorreoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 350, 45));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Servicio suministrado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        txtfServicioSuministradoProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfServicioSuministradoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfServicioSuministradoProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfServicioSuministradoProveedor.setText("Pendiente");
        txtfServicioSuministradoProveedor.setBorder(null);
        jPanel1.add(txtfServicioSuministradoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 350, 45));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Referencia comercial");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, 30));

        txtfReferenciaCProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfReferenciaCProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfReferenciaCProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfReferenciaCProveedor.setText("Pendiente");
        txtfReferenciaCProveedor.setBorder(null);
        txtfReferenciaCProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfReferenciaCProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtfReferenciaCProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 350, 45));

        txtfTerminoDePagoProveedor.setBackground(new java.awt.Color(153, 195, 84));
        txtfTerminoDePagoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfTerminoDePagoProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtfTerminoDePagoProveedor.setText("Pendiente");
        txtfTerminoDePagoProveedor.setBorder(null);
        jPanel1.add(txtfTerminoDePagoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 350, 45));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Término de pago");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 30));

        btnAgregarProveedor.setBackground(new java.awt.Color(127, 156, 90));
        btnAgregarProveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarProveedor.setText("Agregar proveedor");
        btnAgregarProveedor.setBorder(null);
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed

        ErrorAlAgregar error = new ErrorAlAgregar();

        AgregadoExitosamente bien = new AgregadoExitosamente();

        try {
            int numIdFiscal = Integer.parseInt(txtfNumeroIdentificacionFiscal.getText());
            String nombreProv = txtfNombreProveedor.getText();
            String direccionProv = txtfDireccionRegistrada.getText();
            long numContactoProv = Integer.parseInt(txtfNumeroContactoProveedor.getText());
            String direccCorrProv = txtfDireccionCorreoProveedor.getText();
            String servSumi = txtfServicioSuministradoProveedor.getText();
            String refCom = txtfReferenciaCProveedor.getText();
            String termPago = txtfTerminoDePagoProveedor.getText();

            ListaProveedores.getProveedoresCentroComercial().put(numIdFiscal, new Proveedor(nombreProv, direccionProv, numContactoProv, direccCorrProv, servSumi, refCom, termPago));

            bien.setLocationRelativeTo(null);
            bien.setResizable(false);
            bien.setVisible(true);

            this.dispose();

        } catch (Exception e) {

            error.setLocationRelativeTo(null);
            error.setResizable(false);
            error.setVisible(true);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void txtfReferenciaCProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfReferenciaCProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfReferenciaCProveedorActionPerformed

    private void txtfDireccionCorreoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDireccionCorreoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDireccionCorreoProveedorActionPerformed

    private void txtfNumeroIdentificacionFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfNumeroIdentificacionFiscalMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNumeroIdentificacionFiscalMouseClicked

    private void txtfNombreProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfNombreProveedorMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreProveedorMouseClicked

    private void btnVolverInicioAgregProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioAgregProvActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioAgregProvActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrativosAgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrativosAgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrativosAgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrativosAgregarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrativosAgregarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnVolverInicioAgregProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtfDireccionCorreoProveedor;
    private javax.swing.JTextField txtfDireccionRegistrada;
    private javax.swing.JTextField txtfNombreProveedor;
    private javax.swing.JTextField txtfNumeroContactoProveedor;
    private javax.swing.JTextField txtfNumeroIdentificacionFiscal;
    private javax.swing.JTextField txtfReferenciaCProveedor;
    private javax.swing.JTextField txtfServicioSuministradoProveedor;
    private javax.swing.JTextField txtfTerminoDePagoProveedor;
    // End of variables declaration//GEN-END:variables
}