/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos.convenios;

import logica.administrativos.convenios.Convenio;
import logica.administrativos.convenios.ListaConvenios;
import ui.utilidades.AgregadoExitosamente;
import ui.utilidades.ErrorAlAgregar;

/**
 *
 * @author Nicolas
 */
public class AgregarConvenio extends javax.swing.JFrame {

    /**
     * Creates new form AgregarConvenio
     */
    public AgregarConvenio() {
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
        btnVolverInicioRegistrarConv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfCedulaFirmanteConvenio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfDuracionConvenio = new javax.swing.JTextField();
        txtfNombreConvenio = new javax.swing.JTextField();
        txtfNombreFirmanteConvenio = new javax.swing.JTextField();
        txtfFechaConvenio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfPartesInvolucradas = new javax.swing.JTextField();
        txtfNumIdentificacionConvenio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfObjetivoConvenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfClausulasCondiciones = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfBeneficiosMutuos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfCompensacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfClausulasConfidencialidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfLeyesAplicables = new javax.swing.JTextField();
        btnRegistrarConvenioFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(990, 880));
        setMinimumSize(new java.awt.Dimension(990, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(990, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(990, 880));
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
        jLabel19.setText("Registrar convenio");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnVolverInicioRegistrarConv.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverInicioRegistrarConv.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverInicioRegistrarConv.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverInicioRegistrarConv.setText("X");
        btnVolverInicioRegistrarConv.setBorder(null);
        btnVolverInicioRegistrarConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioRegistrarConvActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverInicioRegistrarConv, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número de identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 30));

        txtfCedulaFirmanteConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfCedulaFirmanteConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfCedulaFirmanteConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfCedulaFirmanteConvenio.setText("Pendiente");
        txtfCedulaFirmanteConvenio.setBorder(null);
        jPanel1.add(txtfCedulaFirmanteConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 350, 45));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del convenio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre del firmante");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cedula del firmante");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Duración del convenio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, 30));

        txtfDuracionConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfDuracionConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfDuracionConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfDuracionConvenio.setText("Pendiente");
        txtfDuracionConvenio.setBorder(null);
        jPanel1.add(txtfDuracionConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 350, 45));

        txtfNombreConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfNombreConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNombreConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfNombreConvenio.setText("Pendiente");
        txtfNombreConvenio.setBorder(null);
        jPanel1.add(txtfNombreConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 350, 45));

        txtfNombreFirmanteConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfNombreFirmanteConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNombreFirmanteConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfNombreFirmanteConvenio.setText("Pendiente");
        txtfNombreFirmanteConvenio.setBorder(null);
        jPanel1.add(txtfNombreFirmanteConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 350, 45));

        txtfFechaConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfFechaConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfFechaConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfFechaConvenio.setText("Pendiente");
        txtfFechaConvenio.setBorder(null);
        jPanel1.add(txtfFechaConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 350, 45));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Partes involucradas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, -1, 30));

        txtfPartesInvolucradas.setBackground(new java.awt.Color(153, 195, 84));
        txtfPartesInvolucradas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfPartesInvolucradas.setForeground(new java.awt.Color(0, 0, 0));
        txtfPartesInvolucradas.setText("Pendiente");
        txtfPartesInvolucradas.setBorder(null);
        jPanel1.add(txtfPartesInvolucradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, 350, 45));

        txtfNumIdentificacionConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfNumIdentificacionConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNumIdentificacionConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfNumIdentificacionConvenio.setText("0");
        txtfNumIdentificacionConvenio.setBorder(null);
        jPanel1.add(txtfNumIdentificacionConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 350, 45));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Objetivo del convenio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, 30));

        txtfObjetivoConvenio.setBackground(new java.awt.Color(153, 195, 84));
        txtfObjetivoConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfObjetivoConvenio.setForeground(new java.awt.Color(0, 0, 0));
        txtfObjetivoConvenio.setText("Pendiente");
        txtfObjetivoConvenio.setBorder(null);
        jPanel1.add(txtfObjetivoConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 350, 45));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Clausulas o condiciones");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, 30));

        txtfClausulasCondiciones.setBackground(new java.awt.Color(153, 195, 84));
        txtfClausulasCondiciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfClausulasCondiciones.setForeground(new java.awt.Color(0, 0, 0));
        txtfClausulasCondiciones.setText("Pendiente");
        txtfClausulasCondiciones.setBorder(null);
        jPanel1.add(txtfClausulasCondiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 350, 45));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Beneficios mutuos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, 30));

        txtfBeneficiosMutuos.setBackground(new java.awt.Color(153, 195, 84));
        txtfBeneficiosMutuos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfBeneficiosMutuos.setForeground(new java.awt.Color(0, 0, 0));
        txtfBeneficiosMutuos.setText("Pendiente");
        txtfBeneficiosMutuos.setBorder(null);
        jPanel1.add(txtfBeneficiosMutuos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 350, 45));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Compensación");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, 30));

        txtfCompensacion.setBackground(new java.awt.Color(153, 195, 84));
        txtfCompensacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfCompensacion.setForeground(new java.awt.Color(0, 0, 0));
        txtfCompensacion.setText("0");
        txtfCompensacion.setBorder(null);
        jPanel1.add(txtfCompensacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 350, 45));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Clausulas de confidencialidad");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, 30));

        txtfClausulasConfidencialidad.setBackground(new java.awt.Color(153, 195, 84));
        txtfClausulasConfidencialidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfClausulasConfidencialidad.setForeground(new java.awt.Color(0, 0, 0));
        txtfClausulasConfidencialidad.setText("Pendiente");
        txtfClausulasConfidencialidad.setBorder(null);
        jPanel1.add(txtfClausulasConfidencialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, 350, 45));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Leyes aplicables");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, -1, 30));

        txtfLeyesAplicables.setBackground(new java.awt.Color(153, 195, 84));
        txtfLeyesAplicables.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfLeyesAplicables.setForeground(new java.awt.Color(0, 0, 0));
        txtfLeyesAplicables.setText("Pendiente");
        txtfLeyesAplicables.setBorder(null);
        jPanel1.add(txtfLeyesAplicables, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, 350, 45));

        btnRegistrarConvenioFrame.setBackground(new java.awt.Color(127, 156, 90));
        btnRegistrarConvenioFrame.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarConvenioFrame.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarConvenioFrame.setText("Registrar convenio");
        btnRegistrarConvenioFrame.setBorder(null);
        btnRegistrarConvenioFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConvenioFrameActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarConvenioFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 790, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioRegistrarConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioRegistrarConvActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioRegistrarConvActionPerformed

    private void btnRegistrarConvenioFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConvenioFrameActionPerformed

        ErrorAlAgregar error = new ErrorAlAgregar();

        AgregadoExitosamente bien = new AgregadoExitosamente();

        try {

            int identificacionConvenio = Integer.parseInt(txtfNumIdentificacionConvenio.getText());
            String nombreCon = txtfNombreConvenio.getText();
            String nombreFirm = txtfNombreFirmanteConvenio.getText();
            String cedulaFirm = txtfCedulaFirmanteConvenio.getText();
            String fechaFirm = txtfFechaConvenio.getText();
            String partesInv = txtfPartesInvolucradas.getText();
            String duracion = txtfDuracionConvenio.getText();
            String objetivo = txtfObjetivoConvenio.getText();
            String clausulasCond = txtfClausulasCondiciones.getText();
            String beneMutuos = txtfBeneficiosMutuos.getText();
            int compensacion = Integer.parseInt(txtfCompensacion.getText());
            String clausulasConf = txtfClausulasConfidencialidad.getText();
            String leyesAp = txtfLeyesAplicables.getText();

            ListaConvenios.getListaConveniosCentroComercial().put(identificacionConvenio, new Convenio(nombreCon, nombreFirm, cedulaFirm, fechaFirm, partesInv, duracion, objetivo, clausulasCond, beneMutuos, compensacion, clausulasConf, leyesAp));

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
    }//GEN-LAST:event_btnRegistrarConvenioFrameActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarConvenioFrame;
    private javax.swing.JButton btnVolverInicioRegistrarConv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtfBeneficiosMutuos;
    private javax.swing.JTextField txtfCedulaFirmanteConvenio;
    private javax.swing.JTextField txtfClausulasCondiciones;
    private javax.swing.JTextField txtfClausulasConfidencialidad;
    private javax.swing.JTextField txtfCompensacion;
    private javax.swing.JTextField txtfDuracionConvenio;
    private javax.swing.JTextField txtfFechaConvenio;
    private javax.swing.JTextField txtfLeyesAplicables;
    private javax.swing.JTextField txtfNombreConvenio;
    private javax.swing.JTextField txtfNombreFirmanteConvenio;
    private javax.swing.JTextField txtfNumIdentificacionConvenio;
    private javax.swing.JTextField txtfObjetivoConvenio;
    private javax.swing.JTextField txtfPartesInvolucradas;
    // End of variables declaration//GEN-END:variables
}
