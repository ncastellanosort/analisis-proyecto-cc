/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.contador.gastos;

import logica.contador.gastos.Gasto;
import logica.contador.gastos.ListaGastos;
import ui.utilidades.AgregadoExitosamente;
import ui.utilidades.ErrorAlAgregar;

/**
 *
 * @author Nicolas
 */
public class AgregarGasto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarGasto
     */
    public AgregarGasto() {
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
        btnVolverRegistrarGasto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfMetodoPagoGasto = new javax.swing.JTextField();
        txtfINPUTnumIDGasto = new javax.swing.JTextField();
        txtfCantMonetariaGast = new javax.swing.JTextField();
        txtfIFechaGasto = new javax.swing.JTextField();
        txtfConceptoGasto = new javax.swing.JTextField();
        txtfProveedorGasto = new javax.swing.JTextField();
        txtfNumeroReciboGasto = new javax.swing.JTextField();
        txtfCategoriaGasto = new javax.swing.JTextField();
        txtfAreaDestinoGasto = new javax.swing.JTextField();
        btnRegistrarGastoVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(983, 880));
        setMinimumSize(new java.awt.Dimension(983, 880));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(983, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(983, 880));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setMaximumSize(new java.awt.Dimension(983, 880));
        jPanel6.setMinimumSize(new java.awt.Dimension(983, 880));
        jPanel6.setPreferredSize(new java.awt.Dimension(983, 880));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Registrar gasto");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        btnVolverRegistrarGasto.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverRegistrarGasto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverRegistrarGasto.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverRegistrarGasto.setText("X");
        btnVolverRegistrarGasto.setBorder(null);
        btnVolverRegistrarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRegistrarGastoActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverRegistrarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número de identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Número recibo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad monetaria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha del gasto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Método de pago");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Concepto ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Categoría");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Área destino");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 30));

        txtfMetodoPagoGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfMetodoPagoGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfMetodoPagoGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfMetodoPagoGasto.setText("Pendiente");
        txtfMetodoPagoGasto.setBorder(null);
        jPanel1.add(txtfMetodoPagoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 350, 45));

        txtfINPUTnumIDGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfINPUTnumIDGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfINPUTnumIDGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfINPUTnumIDGasto.setText("0");
        txtfINPUTnumIDGasto.setBorder(null);
        jPanel1.add(txtfINPUTnumIDGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, 45));

        txtfCantMonetariaGast.setBackground(new java.awt.Color(153, 195, 84));
        txtfCantMonetariaGast.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfCantMonetariaGast.setForeground(new java.awt.Color(0, 0, 0));
        txtfCantMonetariaGast.setText("0");
        txtfCantMonetariaGast.setBorder(null);
        jPanel1.add(txtfCantMonetariaGast, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 350, 45));

        txtfIFechaGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfIFechaGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfIFechaGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfIFechaGasto.setText("Pendiente");
        txtfIFechaGasto.setBorder(null);
        jPanel1.add(txtfIFechaGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 45));

        txtfConceptoGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfConceptoGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfConceptoGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfConceptoGasto.setText("Pendiente");
        txtfConceptoGasto.setBorder(null);
        jPanel1.add(txtfConceptoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 350, 45));

        txtfProveedorGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfProveedorGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfProveedorGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfProveedorGasto.setText("Pendiente");
        txtfProveedorGasto.setBorder(null);
        jPanel1.add(txtfProveedorGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 350, 45));

        txtfNumeroReciboGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfNumeroReciboGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNumeroReciboGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfNumeroReciboGasto.setText("0");
        txtfNumeroReciboGasto.setBorder(null);
        jPanel1.add(txtfNumeroReciboGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 350, 45));

        txtfCategoriaGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfCategoriaGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfCategoriaGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfCategoriaGasto.setText("Pendiente");
        txtfCategoriaGasto.setBorder(null);
        jPanel1.add(txtfCategoriaGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 350, 45));

        txtfAreaDestinoGasto.setBackground(new java.awt.Color(153, 195, 84));
        txtfAreaDestinoGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfAreaDestinoGasto.setForeground(new java.awt.Color(0, 0, 0));
        txtfAreaDestinoGasto.setText("Pendiente");
        txtfAreaDestinoGasto.setBorder(null);
        jPanel1.add(txtfAreaDestinoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 350, 45));

        btnRegistrarGastoVentana.setBackground(new java.awt.Color(127, 156, 90));
        btnRegistrarGastoVentana.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarGastoVentana.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarGastoVentana.setText("Registrar gasto");
        btnRegistrarGastoVentana.setBorder(null);
        btnRegistrarGastoVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarGastoVentanaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarGastoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverRegistrarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistrarGastoActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverRegistrarGastoActionPerformed

    private void btnRegistrarGastoVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGastoVentanaActionPerformed

        ErrorAlAgregar error = new ErrorAlAgregar();

        AgregadoExitosamente bien = new AgregadoExitosamente();

        try {

            int identificacionGasto = Integer.parseInt(txtfINPUTnumIDGasto.getText());
            int cantidadMonetariaInput = Integer.parseInt(txtfCantMonetariaGast.getText());
            String fechaGastoInput = txtfIFechaGasto.getText();
            String proveedorGastoInput = txtfProveedorGasto.getText();
            String conceptoInput = txtfConceptoGasto.getText();
            int numeroReciboInput = Integer.parseInt(txtfNumeroReciboGasto.getText());
            String categoriaGastoInput = txtfCategoriaGasto.getText();
            String areaDestinoInput = txtfAreaDestinoGasto.getText();
            String metodoPagoInput = txtfMetodoPagoGasto.getText();

            ListaGastos.getGastosCentroComercial().put(identificacionGasto, new Gasto(cantidadMonetariaInput, fechaGastoInput, conceptoInput, proveedorGastoInput, numeroReciboInput, categoriaGastoInput, areaDestinoInput, metodoPagoInput));

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
    }//GEN-LAST:event_btnRegistrarGastoVentanaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarGastoVentana;
    private javax.swing.JButton btnVolverRegistrarGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtfAreaDestinoGasto;
    private javax.swing.JTextField txtfCantMonetariaGast;
    private javax.swing.JTextField txtfCategoriaGasto;
    private javax.swing.JTextField txtfConceptoGasto;
    private javax.swing.JTextField txtfIFechaGasto;
    private javax.swing.JTextField txtfINPUTnumIDGasto;
    private javax.swing.JTextField txtfMetodoPagoGasto;
    private javax.swing.JTextField txtfNumeroReciboGasto;
    private javax.swing.JTextField txtfProveedorGasto;
    // End of variables declaration//GEN-END:variables
}
