/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.contador.estadoFinanciero;

import logica.contador.estadoFinanciero.EstadoFinanciero;
import logica.contador.estadoFinanciero.LIstaEstadosFinancieros;
import ui.utilidades.AgregadoExitosamente;
import ui.utilidades.ErrorAlAgregar;

/**
 *
 * @author Nicolas
 */
public class AgregarEstadoFinanciero extends javax.swing.JFrame {

    /**
     * Creates new form AgregarEstadoFinanciero
     */
    public AgregarEstadoFinanciero() {
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
        btnVolverInicioRegistrarEstF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfInputCapitalContanteEstadoF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfIdentificadorEstado = new javax.swing.JTextField();
        txtfMesInputEstadoF = new javax.swing.JTextField();
        txtfInputActivosEstadoF = new javax.swing.JTextField();
        txtfInputPasivosEstadoF = new javax.swing.JTextField();
        txtfInputPatrimonioNetoEstadoF = new javax.swing.JTextField();
        txtfInputFlujoENTREstadoF = new javax.swing.JTextField();
        txtfInputGananciasReteEstadoF = new javax.swing.JTextField();
        asdasd8 = new javax.swing.JTextField();
        txtfInputFlujoSALIEstadoF = new javax.swing.JTextField();
        btnRegistrarEstadoF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(983, 880));
        setMinimumSize(new java.awt.Dimension(983, 880));
        setPreferredSize(new java.awt.Dimension(983, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(983, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(983, 880));
        jPanel1.setPreferredSize(new java.awt.Dimension(983, 880));
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
        jLabel19.setText("Registrar estado financiero");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        btnVolverInicioRegistrarEstF.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverInicioRegistrarEstF.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverInicioRegistrarEstF.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverInicioRegistrarEstF.setText("X");
        btnVolverInicioRegistrarEstF.setBorder(null);
        btnVolverInicioRegistrarEstF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioRegistrarEstFActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverInicioRegistrarEstF, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número de identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Activos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pasivos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 30));

        txtfInputCapitalContanteEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputCapitalContanteEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputCapitalContanteEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputCapitalContanteEstadoF.setText("0");
        txtfInputCapitalContanteEstadoF.setBorder(null);
        jPanel1.add(txtfInputCapitalContanteEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 350, 45));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Patrimonio neto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Capital contante actual");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ganancias retenidas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Flujo efectivo saliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Flujo efectivo entrante");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        txtfIdentificadorEstado.setBackground(new java.awt.Color(153, 195, 84));
        txtfIdentificadorEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfIdentificadorEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtfIdentificadorEstado.setText("0");
        txtfIdentificadorEstado.setBorder(null);
        jPanel1.add(txtfIdentificadorEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, 45));

        txtfMesInputEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfMesInputEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfMesInputEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfMesInputEstadoF.setText("Pendiente");
        txtfMesInputEstadoF.setBorder(null);
        jPanel1.add(txtfMesInputEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 350, 45));

        txtfInputActivosEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputActivosEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputActivosEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputActivosEstadoF.setText("Pendiente");
        txtfInputActivosEstadoF.setBorder(null);
        jPanel1.add(txtfInputActivosEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 45));

        txtfInputPasivosEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputPasivosEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputPasivosEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputPasivosEstadoF.setText("Pendiente");
        txtfInputPasivosEstadoF.setBorder(null);
        jPanel1.add(txtfInputPasivosEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 350, 45));

        txtfInputPatrimonioNetoEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputPatrimonioNetoEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputPatrimonioNetoEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputPatrimonioNetoEstadoF.setText("Pendiente");
        txtfInputPatrimonioNetoEstadoF.setBorder(null);
        jPanel1.add(txtfInputPatrimonioNetoEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 350, 45));

        txtfInputFlujoENTREstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputFlujoENTREstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputFlujoENTREstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputFlujoENTREstadoF.setText("0");
        txtfInputFlujoENTREstadoF.setBorder(null);
        jPanel1.add(txtfInputFlujoENTREstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 350, 45));

        txtfInputGananciasReteEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputGananciasReteEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputGananciasReteEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputGananciasReteEstadoF.setText("0");
        txtfInputGananciasReteEstadoF.setBorder(null);
        jPanel1.add(txtfInputGananciasReteEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 350, 45));

        asdasd8.setBackground(new java.awt.Color(153, 195, 84));
        asdasd8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        asdasd8.setForeground(new java.awt.Color(0, 0, 0));
        asdasd8.setText("0");
        asdasd8.setBorder(null);
        jPanel1.add(asdasd8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 350, 45));

        txtfInputFlujoSALIEstadoF.setBackground(new java.awt.Color(153, 195, 84));
        txtfInputFlujoSALIEstadoF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfInputFlujoSALIEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        txtfInputFlujoSALIEstadoF.setText("0");
        txtfInputFlujoSALIEstadoF.setBorder(null);
        jPanel1.add(txtfInputFlujoSALIEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 350, 45));

        btnRegistrarEstadoF.setBackground(new java.awt.Color(127, 156, 90));
        btnRegistrarEstadoF.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarEstadoF.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarEstadoF.setText("Registrar estado");
        btnRegistrarEstadoF.setBorder(null);
        btnRegistrarEstadoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstadoFActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarEstadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 983, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioRegistrarEstFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioRegistrarEstFActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioRegistrarEstFActionPerformed

    private void btnRegistrarEstadoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstadoFActionPerformed

        ErrorAlAgregar error = new ErrorAlAgregar();

        AgregadoExitosamente bien = new AgregadoExitosamente();

        try {

            int identificacionEstado = Integer.parseInt(txtfIdentificadorEstado.getText());
            String mesInput = txtfMesInputEstadoF.getText();
            String activosInput = txtfInputActivosEstadoF.getText();
            String pasivosInput = txtfInputPasivosEstadoF.getText();
            String patrimonioNetoInput = txtfInputPatrimonioNetoEstadoF.getText();
            int flujoEfectivoEntranteInput = Integer.parseInt(txtfInputFlujoENTREstadoF.getText());
            int flujoEfectivoSalienteInput = Integer.parseInt(txtfInputFlujoSALIEstadoF.getText());
            int gananciasRetenidasInput = Integer.parseInt(txtfInputGananciasReteEstadoF.getText());
            int capitalContanteInput = Integer.parseInt(txtfInputCapitalContanteEstadoF.getText());

            LIstaEstadosFinancieros.getEstadosFinancieros().put(identificacionEstado, new EstadoFinanciero(mesInput, activosInput, pasivosInput, patrimonioNetoInput, flujoEfectivoEntranteInput, flujoEfectivoSalienteInput, gananciasRetenidasInput, capitalContanteInput));

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
    }//GEN-LAST:event_btnRegistrarEstadoFActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarEstadoFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEstadoFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEstadoFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEstadoFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEstadoFinanciero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asdasd8;
    private javax.swing.JButton btnRegistrarEstadoF;
    private javax.swing.JButton btnVolverInicioRegistrarEstF;
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
    private javax.swing.JTextField txtfIdentificadorEstado;
    private javax.swing.JTextField txtfInputActivosEstadoF;
    private javax.swing.JTextField txtfInputCapitalContanteEstadoF;
    private javax.swing.JTextField txtfInputFlujoENTREstadoF;
    private javax.swing.JTextField txtfInputFlujoSALIEstadoF;
    private javax.swing.JTextField txtfInputGananciasReteEstadoF;
    private javax.swing.JTextField txtfInputPasivosEstadoF;
    private javax.swing.JTextField txtfInputPatrimonioNetoEstadoF;
    private javax.swing.JTextField txtfMesInputEstadoF;
    // End of variables declaration//GEN-END:variables
}