/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.administrativos;

import java.awt.Color;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.administrativos.capacitaciones.Capacitacion;
import logica.administrativos.capacitaciones.ListaCapacitaciones;
import logica.administrativos.contratosLocales.ContratoLocal;
import logica.administrativos.contratosLocales.ListaContratosLocales;
import logica.administrativos.convenios.Convenio;
import logica.administrativos.convenios.ListaConvenios;
import logica.administrativos.proveedores.ListaProveedores;
import logica.administrativos.proveedores.Proveedor;
import logica.empleados.Empleado;
import logica.empleados.ListaEmpleados;
import logica.empleados.datosEmpleadoHorario.EmpleadoTrabajoHorario;
import logica.empleados.datosEmpleadoHorario.ListaEmpleadosHorarios;
import ui.administrativos.capacitaciones.AgendarCapacitacion;
import ui.administrativos.capacitaciones.BuscarCapacitacion;
import ui.administrativos.capacitaciones.EliminarCapacitacion;
import ui.administrativos.contratosLocal.AgregarContratoLocal;
import ui.administrativos.contratosLocal.GestionarContratoLocal;
import ui.administrativos.convenios.AgregarConvenio;
import ui.administrativos.convenios.GestionarConvenio;
import ui.administrativos.empleados.AgregarEmpleado;
import ui.administrativos.empleados.GestionarEmpleado;
import ui.administrativos.empleadosTrabajo.AgregarEmpleadoTrabajo;
import ui.administrativos.empleadosTrabajo.GestionarEmpleadoTrabajo;
import ui.administrativos.proveedores.AgregarProveedor;
import ui.administrativos.proveedores.BuscarProveedor;
import ui.administrativos.proveedores.EliminarProveedor;
import ui.administrativos.proveedores.IndiceEditarProveeedor;
import ui.login.Login;
import ui.utilidades.ListaVacia;
import ui.utilidades.Utilidades;

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

    DefaultTableModel modeloTablaEmpeleados = new DefaultTableModel();

    DefaultTableModel modeloTablaEmpeleadosHorarios = new DefaultTableModel();

    String[] columnasTablaProveedores = {"Identificación Fiscal", "Nombre empresa", "Dirección registrada", "Número contacto", "Dirección de correo", "Servicio suministrado", "Referencia comercial", "Término de pago"};

    String[] columnasTablaCapacitaciones = {"Identificador", "Nombre", "Instructor", "Descripción", "Área dirigida", "Fecha", "Hora inicio", "Hora fin", "Empresa encargada", "Finalizada?"};

    String[] columnasTablaContratosLocales = {"Identificación", "Nombre arrendatario", "Cedula", "Descripcion", "Duracion contrato", "Condiciones", "Monto mensual", "Plazos de pago", "Uso de local", "Nombre del local", "Seguros"};

    String[] columnasTablaConvenios = {"Identificación", "Nombre convenio", "Nombre firmante", "Cedula firmante", "Fecha firmante", "Partes involucradas", "Duración", "Objetivo", "Clausulas", "Beneficios", "Compensación", "Confidencialidad", "Leyes aplicables"};

    private String[] columnasTablaEmpleados = {"Cédula", "Nombre", "Fecha nacimiento", "Genero", "Estado civil", "Direccion vivienda", "Teléfono", "Correo", "Nacionalidad", "Contacto emergencia", "Relación", "Contacto", "Puesto empleado", "Incentivos", "Usuario", "Clave", "Sueldo", "Área"};

    String[] columnasTablaEmpleadosHorario = {"Cédula", "Fecha", "Nombre empleado", "Área", "Hora entrada", "Hora salida", "Horas extra"};

    public String[] getColumnasTablaEmpleados() {
        return columnasTablaEmpleados;
    }

    public void setColumnasTablaEmpleados(String[] columnasTablaEmpleados) {
        this.columnasTablaEmpleados = columnasTablaEmpleados;
    }

    /**
     * Creates new form AdministrativosFrame
     */
    public AdministrativosFrame() {
        initComponents();

        modeloTablaEmpeleadosHorarios.setColumnIdentifiers(columnasTablaEmpleadosHorario);
        tblHorariosPersonal.setModel(modeloTablaEmpeleadosHorarios);
        tblHorariosPersonal.setRowHeight(45);

        modeloTablaEmpeleados.setColumnIdentifiers(columnasTablaEmpleados);
        tblPersonal.setModel(modeloTablaEmpeleados);
        tblPersonal.setRowHeight(45);

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

        Utilidades.escalarLargoTablas(columnasTablaProveedores.length, tblProveedores);
        Utilidades.escalarLargoTablas(columnasTablaCapacitaciones.length, tblCapacitaciones);
        Utilidades.escalarLargoTablas(columnasTablaContratosLocales.length, tblContratosLocales);
        Utilidades.escalarLargoTablas(columnasTablaConvenios.length, tblConvenios);
        Utilidades.escalarLargoTablas(columnasTablaEmpleados.length, tblPersonal);
        Utilidades.escalarLargoTablas(columnasTablaEmpleadosHorario.length, tblHorariosPersonal);

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
        Utilidades.escalarLargoTablas(columnasTablaProveedores.length, tblProveedores);
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
        Utilidades.escalarLargoTablas(columnasTablaCapacitaciones.length, tblCapacitaciones);

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
        btnGestionarEncuentrosCapacitacion = new javax.swing.JButton();
        btnProveedoresAdmin = new javax.swing.JButton();
        btnRegresarInicioAdmin = new javax.swing.JButton();
        btnGestionarEmpleados3 = new javax.swing.JButton();
        btnGestionarContratos = new javax.swing.JButton();
        panelGeneralAdmin = new javax.swing.JTabbedPane();
        gestionarPersonalFrame = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnActualizarPersonal = new javax.swing.JButton();
        btnRegistrarPersonal = new javax.swing.JButton();
        btnGestionarPersonal = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        gestionarHorarioPersonal = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btnActualizarHorariosEmpleados = new javax.swing.JButton();
        btnRegistrarHorarioEmpleado = new javax.swing.JButton();
        btnGestionarHorarios = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorariosPersonal = new javax.swing.JTable();
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
        jPanel2.add(btnGestionarConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 50));

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
        jPanel2.add(btnGestionarEncuentrosCapacitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 50));

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
        jPanel2.add(btnProveedoresAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 280, 50));

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
        jPanel2.add(btnRegresarInicioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 280, 50));

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
        jPanel2.add(btnGestionarContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 880));

        panelGeneralAdmin.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelGeneralAdmin.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        gestionarPersonalFrame.setMaximumSize(new java.awt.Dimension(1120, 770));
        gestionarPersonalFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarPersonal.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarPersonal.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarPersonal.setText("Actualizar tabla");
        btnActualizarPersonal.setBorder(null);
        btnActualizarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarPersonalMouseExited(evt);
            }
        });
        btnActualizarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPersonalActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 373, 50));

        btnRegistrarPersonal.setBackground(new java.awt.Color(153, 195, 84));
        btnRegistrarPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarPersonal.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarPersonal.setText("Registrar personal");
        btnRegistrarPersonal.setBorder(null);
        btnRegistrarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarPersonalMouseExited(evt);
            }
        });
        btnRegistrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonalActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 373, 50));

        btnGestionarPersonal.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarPersonal.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarPersonal.setText("Gestionar personal");
        btnGestionarPersonal.setBorder(null);
        btnGestionarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarPersonalMouseExited(evt);
            }
        });
        btnGestionarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPersonalActionPerformed(evt);
            }
        });
        jPanel3.add(btnGestionarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 380, 50));

        jPanel15.setBackground(new java.awt.Color(127, 156, 90));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Gestionar personal");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        tblPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
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
        tblPersonal.setAutoResizeMode(0);
        jScrollPane1.setViewportView(tblPersonal);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, -1));

        gestionarPersonalFrame.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 770));

        panelGeneralAdmin.addTab("tab1", gestionarPersonalFrame);

        gestionarHorarioPersonal.setMaximumSize(new java.awt.Dimension(1120, 770));
        gestionarHorarioPersonal.setMinimumSize(new java.awt.Dimension(1120, 770));
        gestionarHorarioPersonal.setPreferredSize(new java.awt.Dimension(1120, 770));
        gestionarHorarioPersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(1120, 770));
        jPanel16.setMinimumSize(new java.awt.Dimension(1120, 770));
        jPanel16.setPreferredSize(new java.awt.Dimension(1120, 770));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarHorariosEmpleados.setBackground(new java.awt.Color(153, 195, 84));
        btnActualizarHorariosEmpleados.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnActualizarHorariosEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarHorariosEmpleados.setText("Actualizar tabla");
        btnActualizarHorariosEmpleados.setBorder(null);
        btnActualizarHorariosEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarHorariosEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarHorariosEmpleadosMouseExited(evt);
            }
        });
        btnActualizarHorariosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarHorariosEmpleadosActionPerformed(evt);
            }
        });
        jPanel16.add(btnActualizarHorariosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 373, 50));

        btnRegistrarHorarioEmpleado.setBackground(new java.awt.Color(153, 195, 84));
        btnRegistrarHorarioEmpleado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnRegistrarHorarioEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarHorarioEmpleado.setText("Registrar horario");
        btnRegistrarHorarioEmpleado.setBorder(null);
        btnRegistrarHorarioEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarHorarioEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarHorarioEmpleadoMouseExited(evt);
            }
        });
        btnRegistrarHorarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHorarioEmpleadoActionPerformed(evt);
            }
        });
        jPanel16.add(btnRegistrarHorarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 373, 50));

        btnGestionarHorarios.setBackground(new java.awt.Color(153, 195, 84));
        btnGestionarHorarios.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnGestionarHorarios.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionarHorarios.setText("Gestionar horario");
        btnGestionarHorarios.setBorder(null);
        btnGestionarHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarHorariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarHorariosMouseExited(evt);
            }
        });
        btnGestionarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarHorariosActionPerformed(evt);
            }
        });
        jPanel16.add(btnGestionarHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 380, 50));

        jPanel17.setBackground(new java.awt.Color(127, 156, 90));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Gestionar horarios de empleados");
        jPanel17.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 90));

        tblHorariosPersonal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        tblHorariosPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHorariosPersonal.setAutoResizeMode(0);
        jScrollPane2.setViewportView(tblHorariosPersonal);

        jPanel16.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1080, -1));

        gestionarHorarioPersonal.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 770));

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
        tblCapacitaciones.setAutoResizeMode(0);
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
        tblProveedores.setAutoResizeMode(0);
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
        tblContratosLocales.setAutoResizeMode(0);
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
        tblConvenios.setAutoResizeMode(0);
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
        botonPresionado(btnGestionarEmpleados3);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseEntered

    private void btnGestionarEmpleados3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseExited
        botonDespresionado(btnGestionarEmpleados3);      // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseExited

    private void btnGestionarEmpleados3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MousePressed

    private void btnGestionarEmpleados3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarEmpleados3MouseReleased

    private void btnGestionarEmpleados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEmpleados3ActionPerformed
        panelGeneralAdmin.setSelectedIndex(0);
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

            Object[] fila = {clave, valor.getNombreArrendatarioContrato(),
                valor.getCedulaArrendatario(),
                valor.getDescripcionContrato(),
                valor.getDuracionContrato(),
                valor.getCondicionesDeRenovacionContrato(),
                valor.getMontoMensualContrato(),
                valor.getPlazosDePagoContrato(),
                valor.getUsoDelLocalContrato(),
                valor.getNombreLocalContrato(),
                valor.getSeguros()
            };
            modelo.addRow(fila);

        }

        tblContratosLocales.setModel(modelo);
        Utilidades.escalarLargoTablas(columnasTablaContratosLocales.length, tblContratosLocales);

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
        botonPresionado(btnGestionarContratos);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarContratosMouseEntered

    private void btnGestionarContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarContratosMouseExited
        botonDespresionado(btnGestionarContratos);

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
        Utilidades.escalarLargoTablas(columnasTablaConvenios.length, tblConvenios);

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

    private void btnActualizarPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarPersonalMouseEntered
        botonPresionado(btnActualizarPersonal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarPersonalMouseEntered

    private void btnActualizarPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarPersonalMouseExited
        botonProveedorDespresionado(btnActualizarPersonal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarPersonalMouseExited

    private void btnActualizarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPersonalActionPerformed

        llenarTablaPersonal();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarPersonalActionPerformed

    public void llenarTablaPersonal() {

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Cédula", "Nombre", "Fecha nacimiento", "Genero", "Estado civil", "Direccion vivienda", "Teléfono", "Correo", "Nacionalidad", "Contacto emergencia", "Relación", "Contacto", "Puesto empleado", "Incentivos", "Usuario", "Clave", "Sueldo", "Área"},
                0);

        for (Map.Entry<Integer, Empleado> codigo : ListaEmpleados.getEmpleadosCentroComercial().entrySet()) {
            int clave = codigo.getKey();

            Empleado valor = codigo.getValue();

            Object[] fila = {clave, valor.getNombreEmpleado(), valor.getFechaNacimientoEmpleado(), valor.getGeneroEmpleado(), valor.getEstadoCivilEmpleado(), valor.getDireccionViviendaEmpleado(), valor.getNumeroTelefonoEmpleado(), valor.getCorreoElectronicoEmpleado(), valor.getNacionalidadEmpleado(), valor.getNombreContactoEmergenciaEmpleado(), valor.getRelacionConEmpleado(), valor.getNumeroContactoEmergenciaEmpleado(), valor.getTituloPuestoTrabajoEmpleado(), valor.getIncentivosEmpleado(), valor.getNombreUsuarioEmpleado(), valor.getContrasenaEmpleado(), valor.getSueldo(), valor.getAreaEmpleado()};
            modelo.addRow(fila);

        }

        tblPersonal.setModel(modelo);
        Utilidades.escalarLargoTablas(columnasTablaEmpleados.length, tblPersonal);

    }

    public JTable getTblPersonal() {
        return tblPersonal;
    }

    public void setTblPersonal(JTable tblPersonal) {
        this.tblPersonal = tblPersonal;
    }


    private void btnRegistrarPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalMouseEntered
        botonPresionado(btnRegistrarPersonal);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarPersonalMouseEntered

    private void btnRegistrarPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalMouseExited

        botonProveedorDespresionado(btnRegistrarPersonal);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarPersonalMouseExited

    private void btnRegistrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalActionPerformed
        AgregarEmpleado agregarEmpleado = new AgregarEmpleado();
        agregarEmpleado.setLocationRelativeTo(null);
        agregarEmpleado.setResizable(false);
        agregarEmpleado.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPersonalActionPerformed

    private void btnGestionarPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarPersonalMouseEntered

        botonPresionado(btnGestionarPersonal);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarPersonalMouseEntered

    private void btnGestionarPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarPersonalMouseExited
        botonProveedorDespresionado(btnGestionarPersonal);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarPersonalMouseExited

    private void btnGestionarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPersonalActionPerformed

        ListaVacia vacia = new ListaVacia();

        GestionarEmpleado gestEmp = new GestionarEmpleado();

        if (ListaEmpleados.getEmpleadosCentroComercial().isEmpty()) {

            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            gestEmp.setLocationRelativeTo(null);
            gestEmp.setResizable(false);
            gestEmp.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarPersonalActionPerformed

    private void btnActualizarHorariosEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarHorariosEmpleadosMouseEntered
        botonPresionado(btnActualizarHorariosEmpleados);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarHorariosEmpleadosMouseEntered

    private void btnActualizarHorariosEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarHorariosEmpleadosMouseExited
        botonProveedorDespresionado(btnActualizarHorariosEmpleados);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarHorariosEmpleadosMouseExited

    private void btnActualizarHorariosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarHorariosEmpleadosActionPerformed

        llenarActualizarHorariosEmpleados();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarHorariosEmpleadosActionPerformed
    public void llenarActualizarHorariosEmpleados() {

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Cédula", "Fecha", "Nombre empleado", "Área", "Hora entrada", "Hora salida", "Horas extra"},
                0);

        for (Map.Entry<Integer, EmpleadoTrabajoHorario> codigo : ListaEmpleadosHorarios.getHorariosEmpleados().entrySet()) {
            int clave = codigo.getKey();

            EmpleadoTrabajoHorario valor = codigo.getValue();

            Object[] fila = {clave, valor.getFecha(), valor.getNombreEmpleadoRonda(), valor.getAreaEmpleado(), valor.getHoraEntrada(), valor.getHoraSalida(), valor.getHorasExtra()};
            modelo.addRow(fila);

        }

        tblHorariosPersonal.setModel(modelo);
        Utilidades.escalarLargoTablas(columnasTablaEmpleadosHorario.length, tblHorariosPersonal);

    }
    private void btnRegistrarHorarioEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioEmpleadoMouseEntered
        botonPresionado(btnRegistrarHorarioEmpleado);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHorarioEmpleadoMouseEntered

    private void btnRegistrarHorarioEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioEmpleadoMouseExited

        botonProveedorDespresionado(btnRegistrarHorarioEmpleado);// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHorarioEmpleadoMouseExited

    private void btnRegistrarHorarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioEmpleadoActionPerformed
        AgregarEmpleadoTrabajo agregarEmpleadoTrabajo = new AgregarEmpleadoTrabajo();
        agregarEmpleadoTrabajo.setLocationRelativeTo(null);
        agregarEmpleadoTrabajo.setResizable(false);
        agregarEmpleadoTrabajo.setVisible(true);
    }//GEN-LAST:event_btnRegistrarHorarioEmpleadoActionPerformed

    private void btnGestionarHorariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarHorariosMouseEntered

        botonPresionado(btnGestionarHorarios);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarHorariosMouseEntered

    private void btnGestionarHorariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarHorariosMouseExited
        botonProveedorDespresionado(btnGestionarHorarios);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarHorariosMouseExited

    private void btnGestionarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarHorariosActionPerformed

        ListaVacia vacia = new ListaVacia();

        GestionarEmpleadoTrabajo gestEmpTr = new GestionarEmpleadoTrabajo();

        if (ListaEmpleadosHorarios.getHorariosEmpleados().isEmpty()) {

            vacia.setLocationRelativeTo(null);
            vacia.setResizable(false);
            vacia.setVisible(true);

        } else {

            gestEmpTr.setLocationRelativeTo(null);
            gestEmpTr.setResizable(false);
            gestEmpTr.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarHorariosActionPerformed

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
    private javax.swing.JButton btnActualizarHorariosEmpleados;
    private javax.swing.JButton btnActualizarPersonal;
    private javax.swing.JScrollPane btnActualizarTablaCapacitaciones;
    private javax.swing.JButton btnActualizarTablaProveedores;
    private javax.swing.JButton btnAgregarCapacitacion;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnEliminarCapacitacion;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGestionarContratoLocal;
    private javax.swing.JButton btnGestionarContratos;
    private javax.swing.JButton btnGestionarConvenio;
    private javax.swing.JButton btnGestionarConvenios;
    private javax.swing.JButton btnGestionarEmpleados3;
    private javax.swing.JButton btnGestionarEncuentrosCapacitacion;
    private javax.swing.JButton btnGestionarEvento;
    private javax.swing.JButton btnGestionarHorarios;
    private javax.swing.JButton btnGestionarPersonal;
    private javax.swing.JButton btnGestionarProveedores;
    private javax.swing.JButton btnProveedoresAdmin;
    private javax.swing.JButton btnRegistrarContratoLocal;
    private javax.swing.JButton btnRegistrarConvenio;
    private javax.swing.JButton btnRegistrarHorarioEmpleado;
    private javax.swing.JButton btnRegistrarHorarioPersonal;
    private javax.swing.JButton btnRegistrarPersonal;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
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
    private javax.swing.JTable tblHorariosPersonal;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables
}
