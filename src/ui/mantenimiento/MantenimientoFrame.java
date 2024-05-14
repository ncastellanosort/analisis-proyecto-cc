/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.mantenimiento;

import java.awt.Color;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import logica.mantenimiento.mantenimientos.ListaMantenimientos;
import logica.mantenimiento.mantenimientos.Mantenimiento;
import ui.login.Login;
import ui.mantenimiento.mantenimientos.AgregarMantenimiento;
import ui.mantenimiento.mantenimientos.GestionarMantenimiento;
import ui.utilidades.ListaVacia;
import ui.utilidades.Utilidades;

/**
 *
 * @author Nicolas
 */
public class MantenimientoFrame extends javax.swing.JFrame {

    Color colorBotonPresionado = new Color(108, 136, 69);

    Color colorBotonProveedorPresionado = new Color(153, 195, 84);

    String[] columnasTablaMantenimiento = {"Identificación", "Nombre", "Encargado", "Cedula", "Descripción", "Finalizado?", "Zona", "Hora finalización", "Fecha finalización"};
    DefaultTableModel modeloTablaMantenimiento = new DefaultTableModel();

    /**
     * Creates new form MantenimientoFrame
     */
    public MantenimientoFrame() {
        initComponents();

        modeloTablaMantenimiento.setColumnIdentifiers(columnasTablaMantenimiento);

        tblMantenimientos.setModel(modeloTablaMantenimiento);
        tblMantenimientos.setRowHeight(45);
        
        Utilidades.escalarLargoTablas(columnasTablaMantenimiento.length, tblMantenimientos);

    }
    


    public void botonPresionado(JButton boton) {

        boton.setBackground(colorBotonPresionado);

        boton.setForeground(Color.white);

    }

    public void botonDespresionado(JButton boton) {

        boton.setBackground(Color.white);

        boton.setForeground(Color.BLACK);

    }

    public void botonProveedorDespresionado(JButton boton) {

        boton.setBackground(colorBotonProveedorPresionado);

        boton.setForeground(Color.BLACK);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionarAreaMantenimiento = new javax.swing.JButton();
        btnCerrarSesionMantenimiento1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelGeneralMantenimiento = new javax.swing.JTabbedPane();
        panelAreaMantenimiento = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnActualizarTablaMantenimientos = new javax.swing.JButton();
        btnAgendarMantenimiento = new javax.swing.JButton();
        btnGestionarMantenimiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantenimientos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 880));
        setMinimumSize(new java.awt.Dimension(1400, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 880));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnGestionarAreaMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarAreaMantenimiento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarAreaMantenimiento.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarAreaMantenimiento.setText("     Gestionar área");
        btnGestionarAreaMantenimiento.setBorder(null);
        btnGestionarAreaMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarAreaMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarAreaMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarAreaMantenimientoMouseExited(evt);
            }
        });
        btnGestionarAreaMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarAreaMantenimientoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarAreaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 50));

        btnCerrarSesionMantenimiento1.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesionMantenimiento1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnCerrarSesionMantenimiento1.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesionMantenimiento1.setText("     Cerrar sesión");
        btnCerrarSesionMantenimiento1.setBorder(null);
        btnCerrarSesionMantenimiento1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesionMantenimiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMantenimiento1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMantenimiento1MouseExited(evt);
            }
        });
        btnCerrarSesionMantenimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionMantenimiento1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarSesionMantenimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 880));

        jPanel3.setBackground(new java.awt.Color(108, 136, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mantenimiento");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1320, 110));

        panelGeneralMantenimiento.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        panelAreaMantenimiento.setMaximumSize(new java.awt.Dimension(1170, 770));
        panelAreaMantenimiento.setMinimumSize(new java.awt.Dimension(1170, 770));
        panelAreaMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(1170, 770));
        jPanel4.setMinimumSize(new java.awt.Dimension(1170, 770));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Gestionar mantenimiento");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        btnActualizarTablaMantenimientos.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarTablaMantenimientos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarTablaMantenimientos.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarTablaMantenimientos.setText("Actualizar tabla");
        btnActualizarTablaMantenimientos.setBorder(null);
        btnActualizarTablaMantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarTablaMantenimientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarTablaMantenimientosMouseExited(evt);
            }
        });
        btnActualizarTablaMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaMantenimientosActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizarTablaMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 373, 50));

        btnAgendarMantenimiento.setBackground(new java.awt.Color(153, 195, 84));
        btnAgendarMantenimiento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgendarMantenimiento.setForeground(new java.awt.Color(0, 0, 0));
        btnAgendarMantenimiento.setText("Agendar mantenimiento");
        btnAgendarMantenimiento.setBorder(null);
        btnAgendarMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendarMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendarMantenimientoMouseExited(evt);
            }
        });
        btnAgendarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarMantenimientoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgendarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 373, 50));

        btnGestionarMantenimiento.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarMantenimiento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarMantenimiento.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarMantenimiento.setText("Gestionar mantenimiento");
        btnGestionarMantenimiento.setBorder(null);
        btnGestionarMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarMantenimientoMouseExited(evt);
            }
        });
        btnGestionarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarMantenimientoActionPerformed(evt);
            }
        });
        jPanel4.add(btnGestionarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 380, 50));

        tblMantenimientos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblMantenimientos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMantenimientos.setAutoResizeMode(0);
        jScrollPane1.setViewportView(tblMantenimientos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, -1));

        panelAreaMantenimiento.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 770));

        panelGeneralMantenimiento.addTab("tab1", panelAreaMantenimiento);

        jPanel1.add(panelGeneralMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 1180, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarAreaMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarAreaMantenimientoMouseEntered
        botonPresionado(btnGestionarAreaMantenimiento);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarAreaMantenimientoMouseEntered

    private void btnGestionarAreaMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarAreaMantenimientoMouseExited
        botonDespresionado(btnGestionarAreaMantenimiento);        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarAreaMantenimientoMouseExited

    private void btnGestionarAreaMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarAreaMantenimientoActionPerformed
        panelGeneralMantenimiento.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarAreaMantenimientoActionPerformed

    private void btnCerrarSesionMantenimiento1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMantenimiento1MouseEntered
        botonPresionado(btnCerrarSesionMantenimiento1);
// TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionMantenimiento1MouseEntered

    private void btnCerrarSesionMantenimiento1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMantenimiento1MouseExited
        botonDespresionado(btnCerrarSesionMantenimiento1);     // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionMantenimiento1MouseExited

    private void btnCerrarSesionMantenimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionMantenimiento1ActionPerformed

        Login login = new Login();

        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);

        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionMantenimiento1ActionPerformed

    private void btnActualizarTablaMantenimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTablaMantenimientosMouseEntered
        botonPresionado(btnActualizarTablaMantenimientos);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaMantenimientosMouseEntered

    private void btnActualizarTablaMantenimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTablaMantenimientosMouseExited
        botonProveedorDespresionado(btnActualizarTablaMantenimientos);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaMantenimientosMouseExited

    private void btnActualizarTablaMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaMantenimientosActionPerformed

        llenarTablaMantenimientos();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaMantenimientosActionPerformed

    public void llenarTablaMantenimientos() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Identificación", "Nombre", "Encargado", "Cedula", "Descripción", "Finalizado?", "Zona", "Hora finalización", "Fecha finalización"},
                0);

        for (Map.Entry<Integer, Mantenimiento> codigo : ListaMantenimientos.getMantenimientosCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            Mantenimiento valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreMantenimiento(), valor.getEncargadoMantenimiento(), valor.getCedulaEncargado(), valor.getDescripcionMantenimiento(), valor.getFinalizadoMantenimiento(), valor.getZonaMantenimiento(), valor.getHoraFinalizacion(), valor.getFechaFinalizacion()};
            modelo.addRow(fila);

        }

        tblMantenimientos.setModel(modelo);
        Utilidades.escalarLargoTablas(columnasTablaMantenimiento.length, tblMantenimientos);

    }

    private void btnAgendarMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMantenimientoMouseEntered
        botonPresionado(btnAgendarMantenimiento);// TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarMantenimientoMouseEntered

    private void btnAgendarMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMantenimientoMouseExited

        botonProveedorDespresionado(btnAgendarMantenimiento);// TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarMantenimientoMouseExited

    private void btnAgendarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarMantenimientoActionPerformed
        AgregarMantenimiento agregaMantenimiento = new AgregarMantenimiento();
        agregaMantenimiento.setLocationRelativeTo(null);
        agregaMantenimiento.setResizable(false);
        agregaMantenimiento.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarMantenimientoActionPerformed

    private void btnGestionarMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarMantenimientoMouseEntered

        botonPresionado(btnGestionarMantenimiento);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarMantenimientoMouseEntered

    private void btnGestionarMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarMantenimientoMouseExited
        botonProveedorDespresionado(btnGestionarMantenimiento);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarMantenimientoMouseExited

    private void btnGestionarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarMantenimientoActionPerformed

        ListaVacia vacia = new ListaVacia();

        GestionarMantenimiento gestionarMan = new GestionarMantenimiento();

        if (ListaMantenimientos.getMantenimientosCentroComercial().isEmpty()) {

            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            gestionarMan.setLocationRelativeTo(null);
            gestionarMan.setResizable(false);
            gestionarMan.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarMantenimientoActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTablaMantenimientos;
    private javax.swing.JButton btnAgendarMantenimiento;
    private javax.swing.JButton btnCerrarSesionMantenimiento1;
    private javax.swing.JButton btnGestionarAreaMantenimiento;
    private javax.swing.JButton btnGestionarMantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAreaMantenimiento;
    private javax.swing.JTabbedPane panelGeneralMantenimiento;
    private javax.swing.JTable tblMantenimientos;
    // End of variables declaration//GEN-END:variables
}
