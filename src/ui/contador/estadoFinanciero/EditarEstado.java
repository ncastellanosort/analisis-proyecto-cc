/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.contador.estadoFinanciero;

import javax.swing.JLabel;
import javax.swing.JTextField;
import logica.contador.estadoFinanciero.LIstaEstadosFinancieros;
import ui.utilidades.EditadoExitosamente;

/**
 *
 * @author Nicolas
 */
public class EditarEstado extends javax.swing.JFrame {

    private int IDestadoEditar;

    public int getIDestadoEditar() {
        return IDestadoEditar;
    }

    public void setIDestadoEditar(int IDestadoEditar) {
        this.IDestadoEditar = IDestadoEditar;
    }

    /**
     * Creates new form EditarEstado
     */
    public EditarEstado() {
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
        btnVolverInicioEstadoEditar = new javax.swing.JButton();
        lbColocarIdentificador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfNUEVOcapitalActual = new javax.swing.JTextField();
        txtfNUEVOnmes = new javax.swing.JTextField();
        txtfNUEVOactivos = new javax.swing.JTextField();
        txtfNUEVOpasivos = new javax.swing.JTextField();
        txtfNUEVOpatrimonioN = new javax.swing.JTextField();
        txtfNUEVOefectivoEntra = new javax.swing.JTextField();
        txtfNUEVOefectivoSale = new javax.swing.JTextField();
        txtfNUEVOgananciasRete = new javax.swing.JTextField();
        btnEditarEstadoVentana = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(983, 880));
        setMinimumSize(new java.awt.Dimension(983, 880));
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
        jLabel19.setText("Editar estado financiero");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        btnVolverInicioEstadoEditar.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverInicioEstadoEditar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverInicioEstadoEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverInicioEstadoEditar.setText("X");
        btnVolverInicioEstadoEditar.setBorder(null);
        btnVolverInicioEstadoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioEstadoEditarActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverInicioEstadoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        lbColocarIdentificador.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        lbColocarIdentificador.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbColocarIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 230, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Activos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Flujo efectivo entrante");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Flujo efectivo saliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ganancias retenidas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Capital contante actual");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pasivos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Patrimonio neto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, 30));

        txtfNUEVOcapitalActual.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOcapitalActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOcapitalActual.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOcapitalActual.setBorder(null);
        jPanel1.add(txtfNUEVOcapitalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 350, 45));

        txtfNUEVOnmes.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOnmes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOnmes.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOnmes.setBorder(null);
        jPanel1.add(txtfNUEVOnmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 350, 45));

        txtfNUEVOactivos.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOactivos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOactivos.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOactivos.setBorder(null);
        jPanel1.add(txtfNUEVOactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 350, 45));

        txtfNUEVOpasivos.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOpasivos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOpasivos.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOpasivos.setBorder(null);
        jPanel1.add(txtfNUEVOpasivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 350, 45));

        txtfNUEVOpatrimonioN.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOpatrimonioN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOpatrimonioN.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOpatrimonioN.setBorder(null);
        jPanel1.add(txtfNUEVOpatrimonioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 350, 45));

        txtfNUEVOefectivoEntra.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOefectivoEntra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOefectivoEntra.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOefectivoEntra.setBorder(null);
        jPanel1.add(txtfNUEVOefectivoEntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 350, 45));

        txtfNUEVOefectivoSale.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOefectivoSale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOefectivoSale.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOefectivoSale.setBorder(null);
        jPanel1.add(txtfNUEVOefectivoSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 350, 45));

        txtfNUEVOgananciasRete.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOgananciasRete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOgananciasRete.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOgananciasRete.setBorder(null);
        jPanel1.add(txtfNUEVOgananciasRete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 350, 45));

        btnEditarEstadoVentana.setBackground(new java.awt.Color(127, 156, 90));
        btnEditarEstadoVentana.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEditarEstadoVentana.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarEstadoVentana.setText("Editar estado");
        btnEditarEstadoVentana.setBorder(null);
        btnEditarEstadoVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstadoVentanaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarEstadoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 250, 50));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Identificador");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioEstadoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioEstadoEditarActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioEstadoEditarActionPerformed

    public JTextField getTxtfNUEVOactivos() {
        return txtfNUEVOactivos;
    }

    public void setTxtfNUEVOactivos(JTextField txtfNUEVOactivos) {
        this.txtfNUEVOactivos = txtfNUEVOactivos;
    }

    public JTextField getTxtfNUEVOcapitalActual() {
        return txtfNUEVOcapitalActual;
    }

    public void setTxtfNUEVOcapitalActual(JTextField txtfNUEVOcapitalActual) {
        this.txtfNUEVOcapitalActual = txtfNUEVOcapitalActual;
    }

    public JTextField getTxtfNUEVOefectivoEntra() {
        return txtfNUEVOefectivoEntra;
    }

    public void setTxtfNUEVOefectivoEntra(JTextField txtfNUEVOefectivoEntra) {
        this.txtfNUEVOefectivoEntra = txtfNUEVOefectivoEntra;
    }

    public JTextField getTxtfNUEVOefectivoSale() {
        return txtfNUEVOefectivoSale;
    }

    public void setTxtfNUEVOefectivoSale(JTextField txtfNUEVOefectivoSale) {
        this.txtfNUEVOefectivoSale = txtfNUEVOefectivoSale;
    }

    public JTextField getTxtfNUEVOgananciasRete() {
        return txtfNUEVOgananciasRete;
    }

    public void setTxtfNUEVOgananciasRete(JTextField txtfNUEVOgananciasRete) {
        this.txtfNUEVOgananciasRete = txtfNUEVOgananciasRete;
    }

    public JTextField getTxtfNUEVOnmes() {
        return txtfNUEVOnmes;
    }

    public void setTxtfNUEVOnmes(JTextField txtfNUEVOnmes) {
        this.txtfNUEVOnmes = txtfNUEVOnmes;
    }

    public JTextField getTxtfNUEVOpasivos() {
        return txtfNUEVOpasivos;
    }

    public void setTxtfNUEVOpasivos(JTextField txtfNUEVOpasivos) {
        this.txtfNUEVOpasivos = txtfNUEVOpasivos;
    }

    public JTextField getTxtfNUEVOpatrimonioN() {
        return txtfNUEVOpatrimonioN;
    }

    public void setTxtfNUEVOpatrimonioN(JTextField txtfNUEVOpatrimonioN) {
        this.txtfNUEVOpatrimonioN = txtfNUEVOpatrimonioN;
    }

    public JLabel getLbColocarIdentificador() {
        return lbColocarIdentificador;
    }

    public void setLbColocarIdentificador(JLabel lbColocarIdentificador) {
        this.lbColocarIdentificador = lbColocarIdentificador;
    }

    private void btnEditarEstadoVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoVentanaActionPerformed

        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setMes(txtfNUEVOnmes.getText());
        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setActivos(txtfNUEVOactivos.getText());
        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setPasivos(txtfNUEVOpasivos.getText());
        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setPatrimonioNeto(txtfNUEVOpatrimonioN.getText());

        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setFlujoEfectivoEntrante(Integer.parseInt(txtfNUEVOefectivoEntra.getText()));
        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setFlujoEfectivoSaliente(Integer.parseInt(txtfNUEVOefectivoSale.getText()));

        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setGananciasRetenidas(Integer.parseInt(txtfNUEVOgananciasRete.getText()));
        LIstaEstadosFinancieros.getEstadosFinancieros().get(IDestadoEditar).setCapitalContanteActual(Integer.parseInt(txtfNUEVOcapitalActual.getText()));

        EditadoExitosamente editado = new EditadoExitosamente();

        this.dispose();
        
        editado.setLocationRelativeTo(null);
        editado.setResizable(false);
        editado.setVisible(true);

    }//GEN-LAST:event_btnEditarEstadoVentanaActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarEstadoVentana;
    private javax.swing.JButton btnVolverInicioEstadoEditar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbColocarIdentificador;
    private javax.swing.JTextField txtfNUEVOactivos;
    private javax.swing.JTextField txtfNUEVOcapitalActual;
    private javax.swing.JTextField txtfNUEVOefectivoEntra;
    private javax.swing.JTextField txtfNUEVOefectivoSale;
    private javax.swing.JTextField txtfNUEVOgananciasRete;
    private javax.swing.JTextField txtfNUEVOnmes;
    private javax.swing.JTextField txtfNUEVOpasivos;
    private javax.swing.JTextField txtfNUEVOpatrimonioN;
    // End of variables declaration//GEN-END:variables
}
