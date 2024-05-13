/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos;

import java.awt.Color;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import logica.administrativos.capacitaciones.Capacitacion;
import logica.administrativos.capacitaciones.ListaCapacitaciones;
import logica.administrativos.contratosLocales.ContratoLocal;
import logica.administrativos.contratosLocales.ListaContratosLocales;
import logica.administrativos.convenios.Convenio;
import logica.administrativos.convenios.ListaConvenios;
import logica.administrativos.proveedores.ListaProveedores;
import logica.administrativos.proveedores.Proveedor;
import ui.administrativos.capacitaciones.AgendarCapacitacion;
import ui.administrativos.capacitaciones.BuscarCapacitacion;
import ui.administrativos.capacitaciones.EliminarCapacitacion;
import ui.administrativos.contratosLocal.AgregarContratoLocal;
import ui.administrativos.contratosLocal.GestionarContratoLocal;
import ui.administrativos.convenios.AgregarConvenio;
import ui.administrativos.convenios.GestionarConvenio;
import ui.administrativos.proveedores.AgregarProveedor;
import ui.administrativos.proveedores.BuscarProveedor;
import ui.administrativos.proveedores.EliminarProveedor;
import ui.administrativos.proveedores.IndiceEditarProveeedor;
import ui.login.Login;
import ui.utilidades.ListaVacia;

/**
 *
 * @author Nicolas
 */
public class AdministrativosFrame extends javax.swing.JFrame {

    Color colorBotonPresionado = new Color(108, 136, 69);

    Color colorBotonProveedorPresionado = new Color(153, 195, 84);

    DefaultTableModel modeloTablaProveedores = new DefaultTableModel();

    DefaultTableModel modeloTablaCapacitaciones = new DefaultTableModel();

    DefaultTableModel modeloTablaContratosLocales = new DefaultTableModel();

    DefaultTableModel modeloTablaConvenios = new DefaultTableModel();

    String[] columnasTablaProveedores = {"Identificación Fiscal", "Nombre empresa", "Dirección registrada", "Número contacto", "Dirección de correo", "Servicio suministrado", "Referencia comercial", "Término de pago"};

    String[] columnasTablaCapacitaciones = {"Identificador", "Nombre", "Instructor", "Descripción", "Área dirigida", "Fecha", "Hora inicio", "Hora fin", "Empresa encargada", "Finalizada?"};

    String[] columnasTablaContratosLocales = {"Identificación", "Nombre arrendatario", "Cedula", "Descripcion", "Duracion contrato", "Condiciones", "Monto mensual", "Plazos de pago", "Uso de local", "Nombre del local", "Seguros"};

    String[] columnasTablaConvenios = {"Identificación", "Nombre convenio", "Nombre firmante", "Cedula firmante", "Fecha firmante", "Partes involucradas", "Duración", "Objetivo", "Clausulas", "Beneficios", "Compensación", "Confidencialidad", "Leyes aplicables"};

    /**
     * Creates new form AdministrativosFrame
     */
    public AdministrativosFrame() {
        initComponents();

        modeloTablaConvenios.setColumnIdentifiers(columnasTablaConvenios);
        tblConvenios.setRowHeight(45);
        tblConvenios.setModel(modeloTablaConvenios);

        modeloTablaProveedores.setColumnIdentifiers(columnasTablaProveedores);

        tblProveedores.setModel(modeloTablaProveedores);

        tblProveedores.setRowHeight(40);

        modeloTablaCapacitaciones.setColumnIdentifiers(columnasTablaCapacitaciones);

        tblCapacitaciones.setModel(modeloTablaCapacitaciones);

        tblCapacitaciones.setRowHeight(40);

        modeloTablaContratosLocales.setColumnIdentifiers(columnasTablaContratosLocales);

        tblContratosLocales.setModel(modeloTablaContratosLocales);
        tblContratosLocales.setRowHeight(45);

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

    public void llenarTablaProveedores() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Identificación Fiscal", "Nombre empresa", "Dirección registrada", "Número contacto", "Dirección de correo", "Servicio suministrado", "Referencia comercial", "Término de pago"},
                0);

        for (Map.Entry<Integer, Proveedor> codigo : ListaProveedores.getProveedoresCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            Proveedor valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreEmpresaProveedor(), valor.getDireccionRegistradaProveedor(), valor.getNumeroContactoProveedor(), valor.getDireccionCorreoProveedor(), valor.getServicioSuministradoProveedor(), valor.getReferenciaComercialProveedor(), valor.getTerminoDePagoProveedor()};
            modelo.addRow(fila);

        }

        tblProveedores.setModel(modelo);

    }

    public void llenarTablaCapacitaciones() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Identificador", "Nombre", "Instructor", "Descripción", "Área dirigida", "Fecha", "Hora inicio", "Hora fin", "Empresa encargada", "Finalizada?"},
                0);

        for (Map.Entry<Integer, Capacitacion> codigo : ListaCapacitaciones.getCapacitacionesCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            Capacitacion valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreCapacitacion(), valor.getNombreInstructorCapacitacion(), valor.getDescripcionCapacitacion(), valor.getAreaCapacitacion(), valor.getFecha(), valor.getHoraInicio(), valor.getHoraFin(), valor.getEmpresaEncargadaCapacitacion(), valor.getFinalizada()};
            modelo.addRow(fila);

        }

        tblCapacitaciones.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionarConvenios = new javax.swing.JButton();
        btnRegistrarHorarioPersonal = new javax.swing.JButton();
        btnGestionarEventos = new javax.swing.JButton();
        btnGestionarEncuentrosCapacitacion = new javax.swing.JButton();
        btnProveedoresAdmin = new javax.swing.JButton();
        btnRegresarInicioAdmin = new javax.swing.JButton();
        btnGestionarEmpleados3 = new javax.swing.JButton();
        btnGestionarContratos = new javax.swing.JButton();
        panelGeneralAdmin = new javax.swing.JTabbedPane();
        gestionarPersonalFrame = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        btnGestionarEmpleado = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        gestionarHorarioPersonal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorarioPersonal = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnGestionarHorasPersonal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarHorasExtra = new javax.swing.JButton();
        gestionarEventos = new javax.swing.JPanel();
        btnEliminarEvento = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGestionarEventos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGestionarEvento = new javax.swing.JButton();
        btnAgregarEvento = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gestionarCapacitacion = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnActualizarTablaCapacitaciones = new javax.swing.JScrollPane();
        tblCapacitaciones = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnAgregarCapacitacion = new javax.swing.JButton();
        btnSeguimientoCapacitacion = new javax.swing.JButton();
        btnACTUALIZARTABLAcapacitacion = new javax.swing.JButton();
        btnEliminarCapacitacion = new javax.swing.JButton();
        gestionarProveedores = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarProveedor = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnGestionarProveedores = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnActualizarTablaProveedores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        gestionarContratos = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblContratosLocales = new javax.swing.JTable();
        btnActualizarContratosLocal = new javax.swing.JButton();
        btnRegistrarContratoLocal = new javax.swing.JButton();
        btnGestionarContratoLocal = new javax.swing.JButton();
        gestionarConvenios = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnActualizarConvenios = new javax.swing.JButton();
        btnRegistrarConvenio = new javax.swing.JButton();
        btnGestionarConvenio = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblConvenios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 880));
        setMinimumSize(new java.awt.Dimension(1400, 880));
        setPreferredSize(new java.awt.Dimension(1400, 880));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(108, 136, 69));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Administrativos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1320, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnGestionarConvenios.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarConvenios.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarConvenios.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarConvenios.setText("     Gestionar convenios");
        btnGestionarConvenios.setBorder(null);
        btnGestionarConvenios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarConvenios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarConveniosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarConveniosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarConveniosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestionarConveniosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestionarConveniosMouseReleased(evt);
            }
        });
        btnGestionarConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarConveniosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 280, 50));

        btnRegistrarHorarioPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarHorarioPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarHorarioPersonal.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarHorarioPersonal.setText("     Horario del personal");
        btnRegistrarHorarioPersonal.setBorder(null);
        btnRegistrarHorarioPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarHorarioPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarHorarioPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarHorarioPersonalMouseExited(evt);
            }
        });
        btnRegistrarHorarioPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHorarioPersonalActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarHorarioPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 50));

        btnGestionarEventos.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarEventos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarEventos.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarEventos.setText("     Gestionar eventos");
        btnGestionarEventos.setBorder(null);
        btnGestionarEventos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarEventosMouseExited(evt);
            }
        });
        btnGestionarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEventosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 50));

        btnGestionarEncuentrosCapacitacion.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarEncuentrosCapacitacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarEncuentrosCapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarEncuentrosCapacitacion.setText("     Encuentros de capacitación");
        btnGestionarEncuentrosCapacitacion.setBorder(null);
        btnGestionarEncuentrosCapacitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarEncuentrosCapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarEncuentrosCapacitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarEncuentrosCapacitacionMouseExited(evt);
            }
        });
        btnGestionarEncuentrosCapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEncuentrosCapacitacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarEncuentrosCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 280, 50));

        btnProveedoresAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedoresAdmin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnProveedoresAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnProveedoresAdmin.setText("     Proveedores");
        btnProveedoresAdmin.setBorder(null);
        btnProveedoresAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedoresAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresAdminMouseExited(evt);
            }
        });
        btnProveedoresAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedoresAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 50));

        btnRegresarInicioAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresarInicioAdmin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegresarInicioAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarInicioAdmin.setText("     Cerrar sesión");
        btnRegresarInicioAdmin.setBorder(null);
        btnRegresarInicioAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarInicioAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarInicioAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarInicioAdminMouseExited(evt);
            }
        });
        btnRegresarInicioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInicioAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresarInicioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 280, 50));

        btnGestionarEmpleados3.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarEmpleados3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarEmpleados3.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarEmpleados3.setText("     Gestionar personal");
        btnGestionarEmpleados3.setBorder(null);
        btnGestionarEmpleados3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarEmpleados3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleados3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleados3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleados3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleados3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleados3MouseReleased(evt);
            }
        });
        btnGestionarEmpleados3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEmpleados3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarEmpleados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 50));

        btnGestionarContratos.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarContratos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarContratos.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarContratos.setText("     Gestionar contratos");
        btnGestionarContratos.setBorder(null);
        btnGestionarContratos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionarContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarContratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarContratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarContratosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestionarContratosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestionarContratosMouseReleased(evt);
            }
        });
        btnGestionarContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarContratosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGestionarContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 880));

        panelGeneralAdmin.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelGeneralAdmin.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        gestionarPersonalFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gestionar personal");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPersonal);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 800, -1));

        btnGestionarEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarEmpleado.setText("GESTIONAR EMPLEADO");
        btnGestionarEmpleado.setBorder(null);
        jPanel3.add(btnGestionarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 250, 50));

        btnAgregarEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        btnAgregarEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpleado.setText("AGREGAR EMPLEADO");
        btnAgregarEmpleado.setBorder(null);
        jPanel3.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 230, 50));

        btnEliminarEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        btnEliminarEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpleado.setText("ELIMINAR EMPLEADO");
        btnEliminarEmpleado.setBorder(null);
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 220, 50));

        gestionarPersonalFrame.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 780));

        panelGeneralAdmin.addTab("tab1", gestionarPersonalFrame);

        gestionarHorarioPersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Registrar horario personal");
        gestionarHorarioPersonal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        tblHorarioPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblHorarioPersonal);

        gestionarHorarioPersonal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 800, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Gestionar horas");
        gestionarHorarioPersonal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        btnGestionarHorasPersonal.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarHorasPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarHorasPersonal.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarHorasPersonal.setText("ENTRAR");
        btnGestionarHorasPersonal.setBorder(null);
        gestionarHorarioPersonal.add(btnGestionarHorasPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 160, 50));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Agregar horas extra");
        gestionarHorarioPersonal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, -1, -1));

        btnAgregarHorasExtra.setBackground(new java.awt.Color(153, 195, 84));
        btnAgregarHorasExtra.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarHorasExtra.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarHorasExtra.setText("AGREGAR");
        btnAgregarHorasExtra.setBorder(null);
        gestionarHorarioPersonal.add(btnAgregarHorasExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 160, 50));

        panelGeneralAdmin.addTab("tab2", gestionarHorarioPersonal);

        gestionarEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarEvento.setBackground(new java.awt.Color(153, 195, 84));
        btnEliminarEvento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarEvento.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarEvento.setText("ELIMINAR");
        btnEliminarEvento.setBorder(null);
        gestionarEventos.add(btnEliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 160, 50));

        tblGestionarEventos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblGestionarEventos);

        gestionarEventos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 800, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Agregar evento");
        gestionarEventos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Gestionar evento");
        gestionarEventos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, -1));

        btnGestionarEvento.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarEvento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarEvento.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarEvento.setText("GESTIONAR");
        btnGestionarEvento.setBorder(null);
        gestionarEventos.add(btnGestionarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 160, 50));

        btnAgregarEvento.setBackground(new java.awt.Color(153, 195, 84));
        btnAgregarEvento.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarEvento.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarEvento.setText("AGREGAR");
        btnAgregarEvento.setBorder(null);
        gestionarEventos.add(btnAgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 160, 50));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Eliminar evento");
        gestionarEventos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Eventos");
        gestionarEventos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        panelGeneralAdmin.addTab("tab3", gestionarEventos);

        gestionarCapacitacion.setMaximumSize(new java.awt.Dimension(1120, 770));
        gestionarCapacitacion.setMinimumSize(new java.awt.Dimension(1120, 770));
        gestionarCapacitacion.setPreferredSize(new java.awt.Dimension(1120, 770));
        gestionarCapacitacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCapacitaciones.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblCapacitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        btnActualizarTablaCapacitaciones.setViewportView(tblCapacitaciones);
        if (tblCapacitaciones.getColumnModel().getColumnCount() > 0) {
            tblCapacitaciones.getColumnModel().getColumn(0).setResizable(false);
            tblCapacitaciones.getColumnModel().getColumn(1).setResizable(false);
            tblCapacitaciones.getColumnModel().getColumn(2).setResizable(false);
            tblCapacitaciones.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(btnActualizarTablaCapacitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1090, -1));

        jPanel8.setBackground(new java.awt.Color(127, 156, 90));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Gestionar capacitaciones");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 90));

        jPanel9.setBackground(new java.awt.Color(153, 195, 84));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarCapacitacion.setBackground(new java.awt.Color(153, 195, 84));
        btnAgregarCapacitacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarCapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCapacitacion.setText("Agendar");
        btnAgregarCapacitacion.setBorder(null);
        btnAgregarCapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCapacitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCapacitacionMouseExited(evt);
            }
        });
        btnAgregarCapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCapacitacionActionPerformed(evt);
            }
        });
        jPanel9.add(btnAgregarCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 280, 50));

        btnSeguimientoCapacitacion.setBackground(new java.awt.Color(153, 195, 84));
        btnSeguimientoCapacitacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnSeguimientoCapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnSeguimientoCapacitacion.setText("Seguimiento");
        btnSeguimientoCapacitacion.setBorder(null);
        btnSeguimientoCapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSeguimientoCapacitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSeguimientoCapacitacionMouseExited(evt);
            }
        });
        btnSeguimientoCapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoCapacitacionActionPerformed(evt);
            }
        });
        jPanel9.add(btnSeguimientoCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 280, 50));

        btnACTUALIZARTABLAcapacitacion.setBackground(new java.awt.Color(153, 195, 84));
        btnACTUALIZARTABLAcapacitacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnACTUALIZARTABLAcapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnACTUALIZARTABLAcapacitacion.setText("Actualizar tabla");
        btnACTUALIZARTABLAcapacitacion.setBorder(null);
        btnACTUALIZARTABLAcapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnACTUALIZARTABLAcapacitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnACTUALIZARTABLAcapacitacionMouseExited(evt);
            }
        });
        btnACTUALIZARTABLAcapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARTABLAcapacitacionActionPerformed(evt);
            }
        });
        jPanel9.add(btnACTUALIZARTABLAcapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        btnEliminarCapacitacion.setBackground(new java.awt.Color(153, 195, 84));
        btnEliminarCapacitacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarCapacitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarCapacitacion.setText("Eliminar");
        btnEliminarCapacitacion.setBorder(null);
        btnEliminarCapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarCapacitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCapacitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCapacitacionMouseExited(evt);
            }
        });
        btnEliminarCapacitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCapacitacionActionPerformed(evt);
            }
        });
        jPanel9.add(btnEliminarCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 280, 50));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1120, 50));

        gestionarCapacitacion.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 770));

        panelGeneralAdmin.addTab("tab4", gestionarCapacitacion);

        gestionarProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedores.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblProveedores);
        if (tblProveedores.getColumnModel().getColumnCount() > 0) {
            tblProveedores.getColumnModel().getColumn(0).setResizable(false);
            tblProveedores.getColumnModel().getColumn(1).setResizable(false);
            tblProveedores.getColumnModel().getColumn(2).setResizable(false);
            tblProveedores.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, 520));

        jPanel5.setBackground(new java.awt.Color(153, 195, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarProveedor.setBackground(new java.awt.Color(153, 195, 84));
        btnAgregarProveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAgregarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarProveedor.setText("Agregar proveedor");
        btnAgregarProveedor.setBorder(null);
        btnAgregarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseExited(evt);
            }
        });
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 224, 50));

        btnBuscarProveedor.setBackground(new java.awt.Color(153, 195, 84));
        btnBuscarProveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBuscarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarProveedor.setText("Buscar proveedor");
        btnBuscarProveedor.setBorder(null);
        btnBuscarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProveedorMouseExited(evt);
            }
        });
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 224, 50));

        btnGestionarProveedores.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarProveedores.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarProveedores.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarProveedores.setText("Gestionar proveedor");
        btnGestionarProveedores.setBorder(null);
        btnGestionarProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarProveedoresMouseExited(evt);
            }
        });
        btnGestionarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarProveedoresActionPerformed(evt);
            }
        });
        jPanel5.add(btnGestionarProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 224, 50));

        btnEliminarProveedor.setBackground(new java.awt.Color(153, 195, 84));
        btnEliminarProveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProveedor.setText("Eliminar proveedor");
        btnEliminarProveedor.setBorder(null);
        btnEliminarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProveedorMouseExited(evt);
            }
        });
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 230, 50));

        btnActualizarTablaProveedores.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarTablaProveedores.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarTablaProveedores.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarTablaProveedores.setText("Actualizar tabla");
        btnActualizarTablaProveedores.setBorder(null);
        btnActualizarTablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarTablaProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarTablaProveedoresMouseExited(evt);
            }
        });
        btnActualizarTablaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaProveedoresActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizarTablaProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 224, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1120, 50));

        jPanel6.setBackground(new java.awt.Color(127, 156, 90));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Gestionar proveedores");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 90));

        gestionarProveedores.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 770));

        panelGeneralAdmin.addTab("tab5", gestionarProveedores);

        gestionarContratos.setMaximumSize(new java.awt.Dimension(1120, 770));
        gestionarContratos.setMinimumSize(new java.awt.Dimension(1120, 770));
        gestionarContratos.setPreferredSize(new java.awt.Dimension(1120, 770));
        gestionarContratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(1120, 770));
        jPanel11.setMinimumSize(new java.awt.Dimension(1120, 770));
        jPanel11.setPreferredSize(new java.awt.Dimension(1120, 770));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(127, 156, 90));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Gestionar contratos de locales");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        tblContratosLocales.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblContratosLocales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblContratosLocales);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, -1));

        btnActualizarContratosLocal.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarContratosLocal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarContratosLocal.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarContratosLocal.setText("Actualizar tabla");
        btnActualizarContratosLocal.setBorder(null);
        btnActualizarContratosLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarContratosLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarContratosLocalMouseExited(evt);
            }
        });
        btnActualizarContratosLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarContratosLocalActionPerformed(evt);
            }
        });
        jPanel11.add(btnActualizarContratosLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 373, 50));

        btnRegistrarContratoLocal.setBackground(new java.awt.Color(153, 195, 84));
        btnRegistrarContratoLocal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarContratoLocal.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarContratoLocal.setText("Registrar contrato");
        btnRegistrarContratoLocal.setBorder(null);
        btnRegistrarContratoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarContratoLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarContratoLocalMouseExited(evt);
            }
        });
        btnRegistrarContratoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContratoLocalActionPerformed(evt);
            }
        });
        jPanel11.add(btnRegistrarContratoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 373, 50));

        btnGestionarContratoLocal.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarContratoLocal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarContratoLocal.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarContratoLocal.setText("Gestionar contrato");
        btnGestionarContratoLocal.setBorder(null);
        btnGestionarContratoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarContratoLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarContratoLocalMouseExited(evt);
            }
        });
        btnGestionarContratoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarContratoLocalActionPerformed(evt);
            }
        });
        jPanel11.add(btnGestionarContratoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 380, 50));

        gestionarContratos.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 770));

        panelGeneralAdmin.addTab("tab6", gestionarContratos);

        gestionarConvenios.setMaximumSize(new java.awt.Dimension(1120, 770));
        gestionarConvenios.setMinimumSize(new java.awt.Dimension(1120, 770));
        gestionarConvenios.setPreferredSize(new java.awt.Dimension(1120, 770));
        gestionarConvenios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(1120, 770));
        jPanel13.setMinimumSize(new java.awt.Dimension(1120, 770));
        jPanel13.setPreferredSize(new java.awt.Dimension(1120, 770));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(127, 156, 90));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Gestionar convenio");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        btnActualizarConvenios.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarConvenios.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarConvenios.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarConvenios.setText("Actualizar tabla");
        btnActualizarConvenios.setBorder(null);
        btnActualizarConvenios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarConveniosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarConveniosMouseExited(evt);
            }
        });
        btnActualizarConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarConveniosActionPerformed(evt);
            }
        });
        jPanel13.add(btnActualizarConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 373, 50));

        btnRegistrarConvenio.setBackground(new java.awt.Color(153, 195, 84));
        btnRegistrarConvenio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarConvenio.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarConvenio.setText("Registrar convenio");
        btnRegistrarConvenio.setBorder(null);
        btnRegistrarConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarConvenioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarConvenioMouseExited(evt);
            }
        });
        btnRegistrarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConvenioActionPerformed(evt);
            }
        });
        jPanel13.add(btnRegistrarConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 373, 50));

        btnGestionarConvenio.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarConvenio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarConvenio.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarConvenio.setText("Gestionar convenio");
        btnGestionarConvenio.setBorder(null);
        btnGestionarConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarConvenioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarConvenioMouseExited(evt);
            }
        });
        btnGestionarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarConvenioActionPerformed(evt);
            }
        });
        jPanel13.add(btnGestionarConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 380, 50));

        tblConvenios.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblConvenios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblConvenios);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, -1));

        gestionarConvenios.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 770));

        panelGeneralAdmin.addTab("tab7", gestionarConvenios);

        getContentPane().add(panelGeneralAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 1180, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarConveniosActionPerformed
        panelGeneralAdmin.setSelectedIndex(6);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConveniosActionPerformed

    private void btnGestionarEncuentrosCapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEncuentrosCapacitacionActionPerformed
        panelGeneralAdmin.setSelectedIndex(3);// TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEncuentrosCapacitacionActionPerformed

    private void btnGestionarConveniosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConveniosMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConveniosMouseClicked

    private void btnGestionarConveniosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConveniosMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConveniosMousePressed

    private void btnGestionarConveniosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConveniosMouseReleased
//

    }//GEN-LAST:event_btnGestionarConveniosMouseReleased

    private void btnGestionarConveniosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConveniosMouseEntered
        botonPresionado(btnGestionarConvenios);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConveniosMouseEntered

    private void btnGestionarConveniosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConveniosMouseExited

        botonDespresionado(btnGestionarConvenios);

// TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConveniosMouseExited

    private void btnRegistrarHorarioPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioPersonalMouseEntered
        botonPresionado(btnRegistrarHorarioPersonal);

// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHorarioPersonalMouseEntered

    private void btnRegistrarHorarioPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioPersonalMouseExited
        botonDespresionado(btnRegistrarHorarioPersonal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHorarioPersonalMouseExited

    private void btnGestionarEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEventosMouseEntered

        botonPresionado(btnGestionarEventos);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEventosMouseEntered

    private void btnGestionarEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEventosMouseExited

        botonDespresionado(btnGestionarEventos);
// TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEventosMouseExited

    private void btnGestionarEncuentrosCapacitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEncuentrosCapacitacionMouseEntered

        botonPresionado(btnGestionarEncuentrosCapacitacion);
// TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEncuentrosCapacitacionMouseEntered

    private void btnGestionarEncuentrosCapacitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEncuentrosCapacitacionMouseExited
        botonDespresionado(btnGestionarEncuentrosCapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEncuentrosCapacitacionMouseExited

    private void btnProveedoresAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresAdminActionPerformed
        panelGeneralAdmin.setSelectedIndex(4);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresAdminActionPerformed

    private void btnProveedoresAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresAdminMouseEntered
        botonPresionado(btnProveedoresAdmin);

// TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresAdminMouseEntered

    private void btnProveedoresAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresAdminMouseExited
        botonDespresionado(btnProveedoresAdmin);// TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresAdminMouseExited

    private void btnRegistrarHorarioPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioPersonalActionPerformed
        panelGeneralAdmin.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHorarioPersonalActionPerformed

    private void btnGestionarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEventosActionPerformed
        panelGeneralAdmin.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEventosActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnRegresarInicioAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarInicioAdminMouseEntered
        botonPresionado(btnRegresarInicioAdmin);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarInicioAdminMouseEntered

    private void btnRegresarInicioAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarInicioAdminMouseExited
        botonDespresionado(btnRegresarInicioAdmin);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarInicioAdminMouseExited

    private void btnRegresarInicioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInicioAdminActionPerformed
        Login login = new Login();

        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);

        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarInicioAdminActionPerformed

    private void btnAgregarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseEntered
        botonPresionado(btnAgregarProveedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProveedorMouseEntered

    private void btnAgregarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseExited
        botonProveedorDespresionado(btnAgregarProveedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProveedorMouseExited

    private void btnGestionarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarProveedoresActionPerformed

        IndiceEditarProveeedor IDeditar = new IndiceEditarProveeedor();

        ListaVacia listav = new ListaVacia();

        if (ListaProveedores.getProveedoresCentroComercial().isEmpty()) {
            listav.setLocationRelativeTo(null);
            listav.setResizable(false);
            listav.setVisible(true);
        } else {

            IDeditar.setLocationRelativeTo(null);
            IDeditar.setResizable(false);
            IDeditar.setVisible(true);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarProveedoresActionPerformed

    private void btnGestionarProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarProveedoresMouseEntered
        botonPresionado(btnGestionarProveedores);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarProveedoresMouseEntered

    private void btnGestionarProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarProveedoresMouseExited

        botonProveedorDespresionado(btnGestionarProveedores);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarProveedoresMouseExited

    private void btnEliminarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProveedorMouseEntered

        botonPresionado(btnEliminarProveedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProveedorMouseEntered

    private void btnEliminarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProveedorMouseExited
        botonProveedorDespresionado(btnEliminarProveedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProveedorMouseExited

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        AgregarProveedor adminAgregarProv = new AgregarProveedor();

        adminAgregarProv.setLocationRelativeTo(null);
        adminAgregarProv.setResizable(false);
        adminAgregarProv.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void btnBuscarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProveedorMouseEntered
        botonPresionado(btnBuscarProveedor);

// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProveedorMouseEntered

    private void btnBuscarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProveedorMouseExited
        botonProveedorDespresionado(btnBuscarProveedor);

// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProveedorMouseExited

    private void btnActualizarTablaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaProveedoresActionPerformed

        llenarTablaProveedores();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaProveedoresActionPerformed

    private void btnActualizarTablaProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTablaProveedoresMouseEntered

        botonPresionado(btnActualizarTablaProveedores);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaProveedoresMouseEntered

    private void btnActualizarTablaProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTablaProveedoresMouseExited

        botonProveedorDespresionado(btnActualizarTablaProveedores);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaProveedoresMouseExited

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed

        EliminarProveedor elim = new EliminarProveedor();

        ListaVacia vacia = new ListaVacia();

        if (ListaProveedores.getProveedoresCentroComercial().isEmpty()) {
            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {
            elim.setLocationRelativeTo(null);
            elim.setResizable(false);
            elim.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed

        BuscarProveedor buscarP = new BuscarProveedor();
        ListaVacia vacia = new ListaVacia();

        if (ListaProveedores.getProveedoresCentroComercial().isEmpty()) {
            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            buscarP.setLocationRelativeTo(null);
            buscarP.setResizable(false);
            buscarP.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnAgregarCapacitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionMouseEntered

        botonPresionado(btnAgregarCapacitacion);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionMouseEntered

    private void btnAgregarCapacitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionMouseExited
        botonProveedorDespresionado(btnAgregarCapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionMouseExited

    private void btnACTUALIZARTABLAcapacitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnACTUALIZARTABLAcapacitacionMouseEntered

        botonPresionado(btnACTUALIZARTABLAcapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnACTUALIZARTABLAcapacitacionMouseEntered

    private void btnACTUALIZARTABLAcapacitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnACTUALIZARTABLAcapacitacionMouseExited
        botonProveedorDespresionado(btnACTUALIZARTABLAcapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnACTUALIZARTABLAcapacitacionMouseExited

    private void btnSeguimientoCapacitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeguimientoCapacitacionMouseEntered
        botonPresionado(btnSeguimientoCapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguimientoCapacitacionMouseEntered

    private void btnSeguimientoCapacitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeguimientoCapacitacionMouseExited

        botonProveedorDespresionado(btnSeguimientoCapacitacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguimientoCapacitacionMouseExited

    private void btnEliminarCapacitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCapacitacionMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCapacitacionMouseClicked

    private void btnEliminarCapacitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCapacitacionMouseEntered
        botonPresionado(btnEliminarCapacitacion);
    }//GEN-LAST:event_btnEliminarCapacitacionMouseEntered

    private void btnEliminarCapacitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCapacitacionMouseExited

        botonProveedorDespresionado(btnEliminarCapacitacion);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCapacitacionMouseExited

    private void btnACTUALIZARTABLAcapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARTABLAcapacitacionActionPerformed
        llenarTablaCapacitaciones();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnACTUALIZARTABLAcapacitacionActionPerformed

    private void btnAgregarCapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCapacitacionActionPerformed

        AgendarCapacitacion agendarCapacitacion = new AgendarCapacitacion();

        agendarCapacitacion.setLocationRelativeTo(null);
        agendarCapacitacion.setResizable(false);
        agendarCapacitacion.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCapacitacionActionPerformed

    private void btnEliminarCapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCapacitacionActionPerformed

        EliminarCapacitacion elim = new EliminarCapacitacion();

        ListaVacia vacia = new ListaVacia();

        if (ListaCapacitaciones.getCapacitacionesCentroComercial().isEmpty()) {
            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {
            elim.setLocationRelativeTo(null);
            elim.setResizable(false);
            elim.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCapacitacionActionPerformed

    private void btnSeguimientoCapacitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoCapacitacionActionPerformed
        BuscarCapacitacion buscarCapa = new BuscarCapacitacion();

        ListaVacia vacia = new ListaVacia();

        if (ListaCapacitaciones.getCapacitacionesCentroComercial().isEmpty()) {
            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {
            buscarCapa.setLocationRelativeTo(null);
            buscarCapa.setResizable(false);
            buscarCapa.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguimientoCapacitacionActionPerformed

    private void btnGestionarEmpleados3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseClicked

    private void btnGestionarEmpleados3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseEntered

    private void btnGestionarEmpleados3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseExited

    private void btnGestionarEmpleados3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MousePressed

    private void btnGestionarEmpleados3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseReleased

    private void btnGestionarEmpleados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3ActionPerformed

    private void btnActualizarContratosLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarContratosLocalMouseEntered
        botonPresionado(btnActualizarContratosLocal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarContratosLocalMouseEntered

    private void btnActualizarContratosLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarContratosLocalMouseExited
        botonProveedorDespresionado(btnActualizarContratosLocal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarContratosLocalMouseExited

    private void btnActualizarContratosLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarContratosLocalActionPerformed

        llenarTablaContratosLocal();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarContratosLocalActionPerformed

    public void llenarTablaContratosLocal() {

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Identificación", "Nombre arrendatario", "Cedula", "Descripcion", "Duracion contrato", "Condiciones", "Monto mensual", "Plazos de pago", "Uso de local", "Nombre del local", "Seguros"},
                0);

        for (Map.Entry<Integer, ContratoLocal> codigo : ListaContratosLocales.getContratosCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            ContratoLocal valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreArrendatarioContrato(), valor.getCedulaArrendatario(), valor.getDescripcionContrato(), valor.getDuracionContrato(), valor.getCondicionesDeRenovacionContrato(), valor.getMontoMensualContrato(), valor.getPlazosDePagoContrato(), valor.getUsoDelLocalContrato(), valor.getNombreLocalContrato(), valor.getSeguros()};
            modelo.addRow(fila);

        }

        tblContratosLocales.setModel(modelo);

    }

    private void btnRegistrarContratoLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarContratoLocalMouseEntered
        botonPresionado(btnRegistrarContratoLocal);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarContratoLocalMouseEntered

    private void btnRegistrarContratoLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarContratoLocalMouseExited

        botonProveedorDespresionado(btnRegistrarContratoLocal);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarContratoLocalMouseExited

    private void btnRegistrarContratoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarContratoLocalActionPerformed
        AgregarContratoLocal agregarContratoLocal = new AgregarContratoLocal();
        agregarContratoLocal.setLocationRelativeTo(null);
        agregarContratoLocal.setResizable(false);
        agregarContratoLocal.setVisible(true);
    }//GEN-LAST:event_btnRegistrarContratoLocalActionPerformed

    private void btnGestionarContratoLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratoLocalMouseEntered

        botonPresionado(btnGestionarContratoLocal);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratoLocalMouseEntered

    private void btnGestionarContratoLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratoLocalMouseExited
        botonProveedorDespresionado(btnGestionarContratoLocal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratoLocalMouseExited

    private void btnGestionarContratoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarContratoLocalActionPerformed

        ListaVacia vacia = new ListaVacia();

        GestionarContratoLocal gestCont = new GestionarContratoLocal();

        if (ListaContratosLocales.getContratosCentroComercial().isEmpty()) {

            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            gestCont.setLocationRelativeTo(null);
            gestCont.setResizable(false);
            gestCont.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratoLocalActionPerformed

    private void btnGestionarContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMouseClicked

    private void btnGestionarContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMouseEntered

    private void btnGestionarContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMouseExited

    private void btnGestionarContratosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMousePressed

    private void btnGestionarContratosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMouseReleased

    private void btnGestionarContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarContratosActionPerformed
        panelGeneralAdmin.setSelectedIndex(5);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosActionPerformed

    private void btnActualizarConveniosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarConveniosMouseEntered
        botonPresionado(btnActualizarConvenios);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarConveniosMouseEntered

    private void btnActualizarConveniosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarConveniosMouseExited
        botonProveedorDespresionado(btnActualizarConvenios);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarConveniosMouseExited

    private void btnActualizarConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarConveniosActionPerformed

        llenarTablaConvenios();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarConveniosActionPerformed

    public void llenarTablaConvenios() {

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Identificación", "Nombre convenio", "Nombre firmante", "Cedula firmante", "Fecha firmante", "Partes involucradas", "Duración", "Objetivo", "Clausulas", "Beneficios", "Compensación", "Confidencialidad", "Leyes aplicables"},
                0);

        for (Map.Entry<Integer, Convenio> codigo : ListaConvenios.getListaConveniosCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            Convenio valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreConvenio(), valor.getNombreFirmante(), valor.getCedulaFirmante(), valor.getFechaFirma(), valor.getPartesInvolucradas(), valor.getDuracionConvenio(), valor.getObjetivo(), valor.getClausulasOcondiciones(), valor.getBeneficiosMutuos(), valor.getCompensacionConvenio(), valor.getClausulasConfidencialidad(), valor.getLeyesAplicables()};
            modelo.addRow(fila);

        }

        tblConvenios.setModel(modelo);

    }
    private void btnRegistrarConvenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarConvenioMouseEntered
        botonPresionado(btnRegistrarConvenio);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarConvenioMouseEntered

    private void btnRegistrarConvenioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarConvenioMouseExited

        botonProveedorDespresionado(btnRegistrarConvenio);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarConvenioMouseExited

    private void btnRegistrarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConvenioActionPerformed
        AgregarConvenio agregarConvenio = new AgregarConvenio();
        agregarConvenio.setLocationRelativeTo(null);
        agregarConvenio.setResizable(false);
        agregarConvenio.setVisible(true);
    }//GEN-LAST:event_btnRegistrarConvenioActionPerformed

    private void btnGestionarConvenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConvenioMouseEntered

        botonPresionado(btnGestionarConvenio);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConvenioMouseEntered

    private void btnGestionarConvenioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarConvenioMouseExited
        botonProveedorDespresionado(btnGestionarConvenio);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConvenioMouseExited

    private void btnGestionarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarConvenioActionPerformed

        ListaVacia vacia = new ListaVacia();

        GestionarConvenio gestConv = new GestionarConvenio();

        if (ListaConvenios.getListaConveniosCentroComercial().isEmpty()) {

            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            gestConv.setLocationRelativeTo(null);
            gestConv.setResizable(false);
            gestConv.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarConvenioActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrativosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrativosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrativosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrativosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrativosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZARTABLAcapacitacion;
    private javax.swing.JButton btnActualizarContratosLocal;
    private javax.swing.JButton btnActualizarConvenios;
    private javax.swing.JScrollPane btnActualizarTablaCapacitaciones;
    private javax.swing.JButton btnActualizarTablaProveedores;
    private javax.swing.JButton btnAgregarCapacitacion;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarHorasExtra;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnEliminarCapacitacion;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGestionarContratoLocal;
    private javax.swing.JButton btnGestionarContratos;
    private javax.swing.JButton btnGestionarConvenio;
    private javax.swing.JButton btnGestionarConvenios;
    private javax.swing.JButton btnGestionarEmpleado;
    private javax.swing.JButton btnGestionarEmpleados3;
    private javax.swing.JButton btnGestionarEncuentrosCapacitacion;
    private javax.swing.JButton btnGestionarEvento;
    private javax.swing.JButton btnGestionarEventos;
    private javax.swing.JButton btnGestionarHorasPersonal;
    private javax.swing.JButton btnGestionarProveedores;
    private javax.swing.JButton btnProveedoresAdmin;
    private javax.swing.JButton btnRegistrarContratoLocal;
    private javax.swing.JButton btnRegistrarConvenio;
    private javax.swing.JButton btnRegistrarHorarioPersonal;
    private javax.swing.JButton btnRegresarInicioAdmin;
    private javax.swing.JButton btnSeguimientoCapacitacion;
    private javax.swing.JPanel gestionarCapacitacion;
    private javax.swing.JPanel gestionarContratos;
    private javax.swing.JPanel gestionarConvenios;
    private javax.swing.JPanel gestionarEventos;
    private javax.swing.JPanel gestionarHorarioPersonal;
    private javax.swing.JPanel gestionarPersonalFrame;
    private javax.swing.JPanel gestionarProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane panelGeneralAdmin;
    private javax.swing.JTable tblCapacitaciones;
    private javax.swing.JTable tblContratosLocales;
    private javax.swing.JTable tblConvenios;
    private javax.swing.JTable tblGestionarEventos;
    private javax.swing.JTable tblHorarioPersonal;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables
}
