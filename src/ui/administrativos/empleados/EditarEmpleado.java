/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos.empleados;

import javax.swing.JLabel;
import javax.swing.JTextField;
import logica.empleados.ListaEmpleados;
import ui.utilidades.EditadoExitosamente;

/**
 *
 * @author Nicolas
 */
public class EditarEmpleado extends javax.swing.JFrame {

    private int IDeditar;

    public int getIDeditar() {
        return IDeditar;
    }

    public void setIDeditar(int IDeditar) {
        this.IDeditar = IDeditar;
    }

    public JLabel getLbCedulaEmpleado() {
        return lbCedulaEmpleado;
    }

    public void setLbCedulaEmpleado(JLabel lbCedulaEmpleado) {
        this.lbCedulaEmpleado = lbCedulaEmpleado;
    }

    public JTextField getTxtfNUEVOAreaEmpleado() {
        return txtfNUEVOAreaEmpleado;
    }

    public void setTxtfNUEVOAreaEmpleado(JTextField txtfNUEVOAreaEmpleado) {
        this.txtfNUEVOAreaEmpleado = txtfNUEVOAreaEmpleado;
    }

    public JTextField getTxtfNUEVOClaveEmpleado() {
        return txtfNUEVOClaveEmpleado;
    }

    public void setTxtfNUEVOClaveEmpleado(JTextField txtfNUEVOClaveEmpleado) {
        this.txtfNUEVOClaveEmpleado = txtfNUEVOClaveEmpleado;
    }

    public JTextField getTxtfNUEVOContactoEmergenciaEmpleado() {
        return txtfNUEVOContactoEmergenciaEmpleado;
    }

    public void setTxtfNUEVOContactoEmergenciaEmpleado(JTextField txtfNUEVOContactoEmergenciaEmpleado) {
        this.txtfNUEVOContactoEmergenciaEmpleado = txtfNUEVOContactoEmergenciaEmpleado;
    }

    public JTextField getTxtfNUEVOContactoNombreEmpleado() {
        return txtfNUEVOContactoNombreEmpleado;
    }

    public void setTxtfNUEVOContactoNombreEmpleado(JTextField txtfNUEVOContactoNombreEmpleado) {
        this.txtfNUEVOContactoNombreEmpleado = txtfNUEVOContactoNombreEmpleado;
    }

    public JTextField getTxtfNUEVOCorreoEmpleado() {
        return txtfNUEVOCorreoEmpleado;
    }

    public void setTxtfNUEVOCorreoEmpleado(JTextField txtfNUEVOCorreoEmpleado) {
        this.txtfNUEVOCorreoEmpleado = txtfNUEVOCorreoEmpleado;
    }

    public JTextField getTxtfNUEVODireccionViviendaEmpleado() {
        return txtfNUEVODireccionViviendaEmpleado;
    }

    public void setTxtfNUEVODireccionViviendaEmpleado(JTextField txtfNUEVODireccionViviendaEmpleado) {
        this.txtfNUEVODireccionViviendaEmpleado = txtfNUEVODireccionViviendaEmpleado;
    }

    public JTextField getTxtfNUEVOEstadoCivilEmpleado() {
        return txtfNUEVOEstadoCivilEmpleado;
    }

    public void setTxtfNUEVOEstadoCivilEmpleado(JTextField txtfNUEVOEstadoCivilEmpleado) {
        this.txtfNUEVOEstadoCivilEmpleado = txtfNUEVOEstadoCivilEmpleado;
    }

    public JTextField getTxtfNUEVOFechaNacimiento() {
        return txtfNUEVOFechaNacimiento;
    }

    public void setTxtfNUEVOFechaNacimiento(JTextField txtfNUEVOFechaNacimiento) {
        this.txtfNUEVOFechaNacimiento = txtfNUEVOFechaNacimiento;
    }

    public JTextField getTxtfNUEVOIncentivosEmpleado() {
        return txtfNUEVOIncentivosEmpleado;
    }

    public void setTxtfNUEVOIncentivosEmpleado(JTextField txtfNUEVOIncentivosEmpleado) {
        this.txtfNUEVOIncentivosEmpleado = txtfNUEVOIncentivosEmpleado;
    }

    public JTextField getTxtfNUEVONacionalidadEmpleado() {
        return txtfNUEVONacionalidadEmpleado;
    }

    public void setTxtfNUEVONacionalidadEmpleado(JTextField txtfNUEVONacionalidadEmpleado) {
        this.txtfNUEVONacionalidadEmpleado = txtfNUEVONacionalidadEmpleado;
    }

    public JTextField getTxtfNUEVONombreEMpleado() {
        return txtfNUEVONombreEMpleado;
    }

    public void setTxtfNUEVONombreEMpleado(JTextField txtfNUEVONombreEMpleado) {
        this.txtfNUEVONombreEMpleado = txtfNUEVONombreEMpleado;
    }

    public JTextField getTxtfNUEVONumeroTelefonoEmpleado() {
        return txtfNUEVONumeroTelefonoEmpleado;
    }

    public void setTxtfNUEVONumeroTelefonoEmpleado(JTextField txtfNUEVONumeroTelefonoEmpleado) {
        this.txtfNUEVONumeroTelefonoEmpleado = txtfNUEVONumeroTelefonoEmpleado;
    }

    public JTextField getTxtfNUEVOPuestoEmpleado() {
        return txtfNUEVOPuestoEmpleado;
    }

    public void setTxtfNUEVOPuestoEmpleado(JTextField txtfNUEVOPuestoEmpleado) {
        this.txtfNUEVOPuestoEmpleado = txtfNUEVOPuestoEmpleado;
    }

    public JTextField getTxtfNUEVORelacionConEmpleado() {
        return txtfNUEVORelacionConEmpleado;
    }

    public void setTxtfNUEVORelacionConEmpleado(JTextField txtfNUEVORelacionConEmpleado) {
        this.txtfNUEVORelacionConEmpleado = txtfNUEVORelacionConEmpleado;
    }

    public JTextField getTxtfNUEVOSueldoEmpleado() {
        return txtfNUEVOSueldoEmpleado;
    }

    public void setTxtfNUEVOSueldoEmpleado(JTextField txtfNUEVOSueldoEmpleado) {
        this.txtfNUEVOSueldoEmpleado = txtfNUEVOSueldoEmpleado;
    }

    public JTextField getTxtfNUEVOUsuarioEmpleado() {
        return txtfNUEVOUsuarioEmpleado;
    }

    public void setTxtfNUEVOUsuarioEmpleado(JTextField txtfNUEVOUsuarioEmpleado) {
        this.txtfNUEVOUsuarioEmpleado = txtfNUEVOUsuarioEmpleado;
    }

    public JTextField getTxtfNUEVOgeneroEmpleado() {
        return txtfNUEVOgeneroEmpleado;
    }

    public void setTxtfNUEVOgeneroEmpleado(JTextField txtfNUEVOgeneroEmpleado) {
        this.txtfNUEVOgeneroEmpleado = txtfNUEVOgeneroEmpleado;
    }

    /**
     * Creates new form EditarEmpleado
     */
    public EditarEmpleado() {
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
        btnVolverInicioAgregarEmpleado = new javax.swing.JButton();
        txtfNUEVOSueldoEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtfNUEVOCorreoEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfNUEVONacionalidadEmpleado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtfNUEVOAreaEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfNUEVOContactoNombreEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfNUEVORelacionConEmpleado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtfNUEVOContactoEmergenciaEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfNUEVOEstadoCivilEmpleado = new javax.swing.JTextField();
        txtfNUEVOClaveEmpleado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtfNUEVOUsuarioEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfNUEVOIncentivosEmpleado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfNUEVOPuestoEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lbCedulaEmpleado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfNUEVONombreEMpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfNUEVOgeneroEmpleado = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtfNUEVOFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfNUEVODireccionViviendaEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfNUEVONumeroTelefonoEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnEditarEmpleadoEnviar = new javax.swing.JButton();

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
        jLabel19.setText("Editar empleado");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        btnVolverInicioAgregarEmpleado.setBackground(new java.awt.Color(127, 156, 90));
        btnVolverInicioAgregarEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolverInicioAgregarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverInicioAgregarEmpleado.setText("X");
        btnVolverInicioAgregarEmpleado.setBorder(null);
        btnVolverInicioAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioAgregarEmpleadoActionPerformed(evt);
            }
        });
        jPanel6.add(btnVolverInicioAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        txtfNUEVOSueldoEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOSueldoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOSueldoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOSueldoEmpleado.setText("0");
        txtfNUEVOSueldoEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOSueldoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 270, 45));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sueldo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 30));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Correo electrónico");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));

        txtfNUEVOCorreoEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOCorreoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOCorreoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOCorreoEmpleado.setText("Pendiente");
        txtfNUEVOCorreoEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 270, 45));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacionalidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 30));

        txtfNUEVONacionalidadEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVONacionalidadEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVONacionalidadEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVONacionalidadEmpleado.setText("Pendiente");
        txtfNUEVONacionalidadEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVONacionalidadEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 270, 45));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Área");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 30));

        txtfNUEVOAreaEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOAreaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOAreaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOAreaEmpleado.setText("Pendiente");
        txtfNUEVOAreaEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOAreaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 270, 45));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre contacto de emergencia");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, 30));

        txtfNUEVOContactoNombreEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOContactoNombreEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOContactoNombreEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOContactoNombreEmpleado.setText("Pendiente");
        txtfNUEVOContactoNombreEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOContactoNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 270, 45));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Relación con empleado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 30));

        txtfNUEVORelacionConEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVORelacionConEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVORelacionConEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVORelacionConEmpleado.setText("Pendiente");
        txtfNUEVORelacionConEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVORelacionConEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 270, 45));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Contacto de emergencia");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, 30));

        txtfNUEVOContactoEmergenciaEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOContactoEmergenciaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOContactoEmergenciaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOContactoEmergenciaEmpleado.setText("Pendiente");
        txtfNUEVOContactoEmergenciaEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOContactoEmergenciaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 270, 45));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado civil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, -1, 30));

        txtfNUEVOEstadoCivilEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOEstadoCivilEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOEstadoCivilEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOEstadoCivilEmpleado.setText("Pendiente");
        txtfNUEVOEstadoCivilEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOEstadoCivilEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 720, 270, 45));

        txtfNUEVOClaveEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOClaveEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOClaveEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOClaveEmpleado.setText("Pendiente");
        txtfNUEVOClaveEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOClaveEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 270, 45));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Clave");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, 30));

        txtfNUEVOUsuarioEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOUsuarioEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOUsuarioEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOUsuarioEmpleado.setText("Pendiente");
        txtfNUEVOUsuarioEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOUsuarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 270, 45));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre de usuario");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, 30));

        txtfNUEVOIncentivosEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOIncentivosEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOIncentivosEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOIncentivosEmpleado.setText("Pendiente");
        txtfNUEVOIncentivosEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOIncentivosEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 270, 45));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Incentivos");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 30));

        txtfNUEVOPuestoEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOPuestoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOPuestoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOPuestoEmpleado.setText("Pendiente");
        txtfNUEVOPuestoEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOPuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 270, 45));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Puesto del empleado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, 30));

        lbCedulaEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        lbCedulaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbCedulaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        txtfNUEVONombreEMpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVONombreEMpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVONombreEMpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVONombreEMpleado.setText("Pendiente");
        txtfNUEVONombreEMpleado.setBorder(null);
        jPanel1.add(txtfNUEVONombreEMpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 270, 45));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Género");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        txtfNUEVOgeneroEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOgeneroEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOgeneroEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOgeneroEmpleado.setText("Pendiente");
        txtfNUEVOgeneroEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVOgeneroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 270, 45));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Fecha nacimiento");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 30));

        txtfNUEVOFechaNacimiento.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVOFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVOFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVOFechaNacimiento.setText("Pendiente");
        txtfNUEVOFechaNacimiento.setBorder(null);
        jPanel1.add(txtfNUEVOFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 270, 45));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección de vivienda");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, 30));

        txtfNUEVODireccionViviendaEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVODireccionViviendaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVODireccionViviendaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVODireccionViviendaEmpleado.setText("Pendiente");
        txtfNUEVODireccionViviendaEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVODireccionViviendaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 270, 45));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Número de telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, 30));

        txtfNUEVONumeroTelefonoEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        txtfNUEVONumeroTelefonoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfNUEVONumeroTelefonoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtfNUEVONumeroTelefonoEmpleado.setText("Pendiente");
        txtfNUEVONumeroTelefonoEmpleado.setBorder(null);
        jPanel1.add(txtfNUEVONumeroTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 270, 45));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cédula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        btnEditarEmpleadoEnviar.setBackground(new java.awt.Color(127, 156, 90));
        btnEditarEmpleadoEnviar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEditarEmpleadoEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarEmpleadoEnviar.setText("Editar empleado");
        btnEditarEmpleadoEnviar.setBorder(null);
        btnEditarEmpleadoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarEmpleadoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 800, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioAgregarEmpleadoActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioAgregarEmpleadoActionPerformed

    private void btnEditarEmpleadoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoEnviarActionPerformed

        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNombreEmpleado(txtfNUEVONombreEMpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setFechaNacimientoEmpleado(txtfNUEVOFechaNacimiento.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setGeneroEmpleado(txtfNUEVOgeneroEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setEstadoCivilEmpleado(txtfNUEVOEstadoCivilEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setDireccionViviendaEmpleado(txtfNUEVODireccionViviendaEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNumeroTelefonoEmpleado(txtfNUEVONumeroTelefonoEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setCorreoElectronicoEmpleado(txtfNUEVOCorreoEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNacionalidadEmpleado(txtfNUEVONacionalidadEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNombreContactoEmergenciaEmpleado(txtfNUEVOContactoNombreEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setRelacionConEmpleado(txtfNUEVORelacionConEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNumeroContactoEmergenciaEmpleado(txtfNUEVOContactoEmergenciaEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setTituloPuestoTrabajoEmpleado(txtfNUEVOPuestoEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setIncentivosEmpleado(txtfNUEVOIncentivosEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setNombreUsuarioEmpleado(txtfNUEVOUsuarioEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setContrasenaEmpleado(txtfNUEVOClaveEmpleado.getText());
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setSueldo(Integer.parseInt(txtfNUEVOSueldoEmpleado.getText()));
        ListaEmpleados.getEmpleadosCentroComercial().get(IDeditar).setAreaEmpleado(txtfNUEVOAreaEmpleado.getText());

        EditadoExitosamente editado = new EditadoExitosamente();

        this.dispose();

        editado.setLocationRelativeTo(null);
        editado.setResizable(false);
        editado.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEmpleadoEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarEmpleadoEnviar;
    private javax.swing.JButton btnVolverInicioAgregarEmpleado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbCedulaEmpleado;
    private javax.swing.JTextField txtfNUEVOAreaEmpleado;
    private javax.swing.JTextField txtfNUEVOClaveEmpleado;
    private javax.swing.JTextField txtfNUEVOContactoEmergenciaEmpleado;
    private javax.swing.JTextField txtfNUEVOContactoNombreEmpleado;
    private javax.swing.JTextField txtfNUEVOCorreoEmpleado;
    private javax.swing.JTextField txtfNUEVODireccionViviendaEmpleado;
    private javax.swing.JTextField txtfNUEVOEstadoCivilEmpleado;
    private javax.swing.JTextField txtfNUEVOFechaNacimiento;
    private javax.swing.JTextField txtfNUEVOIncentivosEmpleado;
    private javax.swing.JTextField txtfNUEVONacionalidadEmpleado;
    private javax.swing.JTextField txtfNUEVONombreEMpleado;
    private javax.swing.JTextField txtfNUEVONumeroTelefonoEmpleado;
    private javax.swing.JTextField txtfNUEVOPuestoEmpleado;
    private javax.swing.JTextField txtfNUEVORelacionConEmpleado;
    private javax.swing.JTextField txtfNUEVOSueldoEmpleado;
    private javax.swing.JTextField txtfNUEVOUsuarioEmpleado;
    private javax.swing.JTextField txtfNUEVOgeneroEmpleado;
    // End of variables declaration//GEN-END:variables
}
