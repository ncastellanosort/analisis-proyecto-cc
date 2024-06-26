/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.contador.gastos;

import javax.swing.table.DefaultTableModel;
import logica.contador.gastos.ListaGastos;
import ui.utilidades.EliminadoExitosamente;
import ui.utilidades.Utilidades;

/**
 *
 * @author Nicolas
 */
public class GestionarGasto extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    String[] columnasTablaGastos = {"Identificación", "Cantidad monetaria", "Fecha gasto", "Concepto gasto", "Proveedor", "Número de recibo", "Categoria", "Área destino", "Método de pago"};

    /**
     * Creates new form BuscarGasto
     */
    public GestionarGasto() {
        initComponents();

        modelo.setColumnIdentifiers(columnasTablaGastos);

        tblUnicoGasto.setModel(modelo);
        tblUnicoGasto.setRowHeight(40);
        Utilidades.escalarLargoTablas(columnasTablaGastos.length, tblUnicoGasto);

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
        btnSalirVentadaBuscarGasto = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtfBuscarGastoID = new javax.swing.JTextField();
        btnEditarGasto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnicoGasto = new javax.swing.JTable();
        btnBuscarGastoID1 = new javax.swing.JButton();
        btnEliminarGasto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 550));
        setMinimumSize(new java.awt.Dimension(1120, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 550));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(1120, 90));
        jPanel6.setPreferredSize(new java.awt.Dimension(1120, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Gasto");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        btnSalirVentadaBuscarGasto.setBackground(new java.awt.Color(127, 156, 90));
        btnSalirVentadaBuscarGasto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnSalirVentadaBuscarGasto.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirVentadaBuscarGasto.setText("X");
        btnSalirVentadaBuscarGasto.setBorder(null);
        btnSalirVentadaBuscarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVentadaBuscarGastoActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalirVentadaBuscarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 90));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Número de identificación ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtfBuscarGastoID.setBackground(new java.awt.Color(153, 195, 84));
        txtfBuscarGastoID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfBuscarGastoID.setForeground(new java.awt.Color(0, 0, 0));
        txtfBuscarGastoID.setBorder(null);
        jPanel1.add(txtfBuscarGastoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 350, 45));

        btnEditarGasto.setBackground(new java.awt.Color(127, 156, 90));
        btnEditarGasto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEditarGasto.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarGasto.setText("Editarlo");
        btnEditarGasto.setBorder(null);
        btnEditarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGastoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 130, 45));

        tblUnicoGasto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblUnicoGasto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUnicoGasto.setAutoResizeMode(0);
        jScrollPane1.setViewportView(tblUnicoGasto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1090, 80));

        btnBuscarGastoID1.setBackground(new java.awt.Color(127, 156, 90));
        btnBuscarGastoID1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBuscarGastoID1.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarGastoID1.setText("Buscar");
        btnBuscarGastoID1.setBorder(null);
        btnBuscarGastoID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGastoID1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarGastoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 45));

        btnEliminarGasto1.setBackground(new java.awt.Color(127, 156, 90));
        btnEliminarGasto1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarGasto1.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarGasto1.setText("Eliminarlo");
        btnEliminarGasto1.setBorder(null);
        btnEliminarGasto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGasto1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarGasto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirVentadaBuscarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVentadaBuscarGastoActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirVentadaBuscarGastoActionPerformed

    private void btnEditarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGastoActionPerformed

        int ID = Integer.parseInt(txtfBuscarGastoID.getText());

        EditarGasto editarGasto = new EditarGasto();

        editarGasto.getLbIdentificadorGasto().setText(String.valueOf(ID));

        editarGasto.getTxtfNUEVOcantidadMon().setText(String.valueOf(ListaGastos.getGastosCentroComercial().get(ID).getCantidadMonetariaGasto()));

        editarGasto.getTxtfNUEVOfechaGasto().setText(ListaGastos.getGastosCentroComercial().get(ID).getFechaGasto());

        editarGasto.getTxtfNUEVOconcepto().setText(ListaGastos.getGastosCentroComercial().get(ID).getConceptoGasto());

        editarGasto.getTxtfNUEVOproveedor().setText(ListaGastos.getGastosCentroComercial().get(ID).getProveedorGasto());

        editarGasto.getTxtfNUEVOnumeroRecibo().setText(String.valueOf(ListaGastos.getGastosCentroComercial().get(ID).getNumeroReciboGasto()));

        editarGasto.getTxtfNUEVOcategoria().setText(String.valueOf(ListaGastos.getGastosCentroComercial().get(ID).getCategoriaGasto()));

        editarGasto.getTxtfNUEVOareaDestino().setText(String.valueOf(ListaGastos.getGastosCentroComercial().get(ID).getAreaDestinoGasto()));

        editarGasto.getTxtfNUEVOmetodoPago().setText(String.valueOf(ListaGastos.getGastosCentroComercial().get(ID).getMetodoPagoGasto()));

        editarGasto.setIDentificador(ID);

        this.dispose();

        editarGasto.setLocationRelativeTo(null);
        editarGasto.setResizable(false);
        editarGasto.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarGastoActionPerformed

    private void btnBuscarGastoID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGastoID1ActionPerformed

        int ID = Integer.parseInt(txtfBuscarGastoID.getText());

        ListaGastos.getGastosCentroComercial().get(ID); //aca ya esta el objeto

        Object[] ob = {ID, ListaGastos.getGastosCentroComercial().get(ID).getCantidadMonetariaGasto(), ListaGastos.getGastosCentroComercial().get(ID).getFechaGasto(), ListaGastos.getGastosCentroComercial().get(ID).getConceptoGasto(), ListaGastos.getGastosCentroComercial().get(ID).getProveedorGasto(), ListaGastos.getGastosCentroComercial().get(ID).getNumeroReciboGasto(), ListaGastos.getGastosCentroComercial().get(ID).getCategoriaGasto(), ListaGastos.getGastosCentroComercial().get(ID).getAreaDestinoGasto(), ListaGastos.getGastosCentroComercial().get(ID).getMetodoPagoGasto()};

        modelo.addRow(ob);
        Utilidades.escalarLargoTablas(columnasTablaGastos.length, tblUnicoGasto);

// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarGastoID1ActionPerformed

    private void btnEliminarGasto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGasto1ActionPerformed

        int ID = Integer.parseInt(txtfBuscarGastoID.getText());

        ListaGastos.getGastosCentroComercial().remove(ID);

        this.dispose();
        EliminadoExitosamente elim = new EliminadoExitosamente();

        elim.setLocationRelativeTo(null);
        elim.setResizable(false);
        elim.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarGasto1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarGastoID1;
    private javax.swing.JButton btnEditarGasto;
    private javax.swing.JButton btnEliminarGasto1;
    private javax.swing.JButton btnSalirVentadaBuscarGasto;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUnicoGasto;
    private javax.swing.JTextField txtfBuscarGastoID;
    // End of variables declaration//GEN-END:variables
}
