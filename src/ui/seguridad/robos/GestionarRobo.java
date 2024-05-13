/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.seguridad.robos;

import javax.swing.table.DefaultTableModel;
import logica.seguridad.robos.ListaRobos;
import ui.utilidades.EliminadoExitosamente;

/**
 *
 * @author Nicolas
 */
public class GestionarRobo extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    String[] columnas = {"Identificación", "Fecha", "Hora", "Descripcion", "Valor estimado", "Fue un local?", "Objetos robados", "Testigos", "Daños materiales", "Notificación autoridades?"};

    /**
     * Creates new form GestionarRobo
     */
    public GestionarRobo() {
        initComponents();
        modelo.setColumnIdentifiers(columnas);
        tblUnicoRobo.setModel(modelo);
        tblUnicoRobo.setRowHeight(45);

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
        btnSalirVentanaGestiRobo = new javax.swing.JButton();
        lbValorRobo = new javax.swing.JLabel();
        txtfIDRobo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnicoRobo = new javax.swing.JTable();
        btnBuscarRoboID = new javax.swing.JButton();
        btnEliminarRObo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1120, 550));
        setMinimumSize(new java.awt.Dimension(1120, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1120, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(1120, 90));
        jPanel6.setPreferredSize(new java.awt.Dimension(1120, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Robo");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        btnSalirVentanaGestiRobo.setBackground(new java.awt.Color(127, 156, 90));
        btnSalirVentanaGestiRobo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnSalirVentanaGestiRobo.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirVentanaGestiRobo.setText("X");
        btnSalirVentanaGestiRobo.setBorder(null);
        btnSalirVentanaGestiRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVentanaGestiRoboActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalirVentanaGestiRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 90));

        lbValorRobo.setBackground(new java.awt.Color(0, 0, 0));
        lbValorRobo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        lbValorRobo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbValorRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 190, 30));

        txtfIDRobo.setBackground(new java.awt.Color(153, 195, 84));
        txtfIDRobo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfIDRobo.setForeground(new java.awt.Color(0, 0, 0));
        txtfIDRobo.setBorder(null);
        jPanel1.add(txtfIDRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 350, 45));

        tblUnicoRobo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblUnicoRobo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUnicoRobo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1090, 80));

        btnBuscarRoboID.setBackground(new java.awt.Color(127, 156, 90));
        btnBuscarRoboID.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBuscarRoboID.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarRoboID.setText("Buscar");
        btnBuscarRoboID.setBorder(null);
        btnBuscarRoboID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRoboIDActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarRoboID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 45));

        btnEliminarRObo.setBackground(new java.awt.Color(127, 156, 90));
        btnEliminarRObo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarRObo.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarRObo.setText("Eliminarlo");
        btnEliminarRObo.setBorder(null);
        btnEliminarRObo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarROboActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRObo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 45));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Número de identificación ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Valor estimado ($)");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirVentanaGestiRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVentanaGestiRoboActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirVentanaGestiRoboActionPerformed

    private void btnBuscarRoboIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRoboIDActionPerformed

        int ID = Integer.parseInt(txtfIDRobo.getText());

        Object[] ob = {ID, ListaRobos.getRobosCentroComercial().get(ID).getFechaRobo(), ListaRobos.getRobosCentroComercial().get(ID).getHoraRobo(), ListaRobos.getRobosCentroComercial().get(ID).getDescripcionRobo(), ListaRobos.getRobosCentroComercial().get(ID).getValorEstimadoRobo(), ListaRobos.getRobosCentroComercial().get(ID).getEsLocalRobo(), ListaRobos.getRobosCentroComercial().get(ID).getObjetosRobadosRobo(), ListaRobos.getRobosCentroComercial().get(ID).getTestigoRobo(), ListaRobos.getRobosCentroComercial().get(ID).getDanosMaterialesRobo(), ListaRobos.getRobosCentroComercial().get(ID).getNotificacionAutoridadesRobo()};

        lbValorRobo.setText(ListaRobos.getRobosCentroComercial().get(ID).getValorEstimadoRobo());

        modelo.addRow(ob);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRoboIDActionPerformed

    private void btnEliminarROboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarROboActionPerformed
        int ID = Integer.parseInt(txtfIDRobo.getText());

        ListaRobos.getRobosCentroComercial().remove(ID);

        this.dispose();
        EliminadoExitosamente elim = new EliminadoExitosamente();

        elim.setLocationRelativeTo(null);
        elim.setResizable(false);
        elim.setVisible(true);
    }//GEN-LAST:event_btnEliminarROboActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarRobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarRobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarRobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarRobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarRobo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRoboID;
    private javax.swing.JButton btnEliminarRObo;
    private javax.swing.JButton btnSalirVentanaGestiRobo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbValorRobo;
    private javax.swing.JTable tblUnicoRobo;
    private javax.swing.JTextField txtfIDRobo;
    // End of variables declaration//GEN-END:variables
}