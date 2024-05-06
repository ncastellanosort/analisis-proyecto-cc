/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.empleados;

/**
 *
 * @author Nicolas
 */
public class Empleado {
    // key del hashmap: Número de identificación personal (DNI, cédula, pasaporte, etc.)

    private String nombreEmpleado;

    private String fechaNacimientoEmpleado;
    private String generoEmpleado;
    private String estadoCivilEmpleado;
    private String direccionViviendaEmpleado;
    private String numeroTelefonoEmpleado;
    private String correoElectronicoEmpleado;
    private String nacionalidadEmpleado;

    private String nombreContactoEmergenciaEmpleado;
    private String relacionConEmpleado;
    private String numeroContactoEmergenciaEmpleado;

    private String tituloPuestoTrabajoEmpleado;
    private String incentivosEmpleado;
    private String nombreUsuarioEmpleado;
    private String contrasenaEmpleado;

    public Empleado(String nombreEmpleado, String fechaNacimientoEmpleado, String generoEmpleado, String estadoCivilEmpleado, String direccionViviendaEmpleado, String numeroTelefonoEmpleado, String correoElectronicoEmpleado, String nacionalidadEmpleado, String nombreContactoEmergenciaEmpleado, String relacionConEmpleado, String numeroContactoEmergenciaEmpleado, String tituloPuestoTrabajoEmpleado, String incentivosEmpleado, String nombreUsuarioEmpleado, String contrasenaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
        this.generoEmpleado = generoEmpleado;
        this.estadoCivilEmpleado = estadoCivilEmpleado;
        this.direccionViviendaEmpleado = direccionViviendaEmpleado;
        this.numeroTelefonoEmpleado = numeroTelefonoEmpleado;
        this.correoElectronicoEmpleado = correoElectronicoEmpleado;
        this.nacionalidadEmpleado = nacionalidadEmpleado;
        this.nombreContactoEmergenciaEmpleado = nombreContactoEmergenciaEmpleado;
        this.relacionConEmpleado = relacionConEmpleado;
        this.numeroContactoEmergenciaEmpleado = numeroContactoEmergenciaEmpleado;
        this.tituloPuestoTrabajoEmpleado = tituloPuestoTrabajoEmpleado;
        this.incentivosEmpleado = incentivosEmpleado;
        this.nombreUsuarioEmpleado = nombreUsuarioEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getFechaNacimientoEmpleado() {
        return fechaNacimientoEmpleado;
    }

    public void setFechaNacimientoEmpleado(String fechaNacimientoEmpleado) {
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
    }

    public String getGeneroEmpleado() {
        return generoEmpleado;
    }

    public void setGeneroEmpleado(String generoEmpleado) {
        this.generoEmpleado = generoEmpleado;
    }

    public String getEstadoCivilEmpleado() {
        return estadoCivilEmpleado;
    }

    public void setEstadoCivilEmpleado(String estadoCivilEmpleado) {
        this.estadoCivilEmpleado = estadoCivilEmpleado;
    }

    public String getDireccionViviendaEmpleado() {
        return direccionViviendaEmpleado;
    }

    public void setDireccionViviendaEmpleado(String direccionViviendaEmpleado) {
        this.direccionViviendaEmpleado = direccionViviendaEmpleado;
    }

    public String getNumeroTelefonoEmpleado() {
        return numeroTelefonoEmpleado;
    }

    public void setNumeroTelefonoEmpleado(String numeroTelefonoEmpleado) {
        this.numeroTelefonoEmpleado = numeroTelefonoEmpleado;
    }

    public String getCorreoElectronicoEmpleado() {
        return correoElectronicoEmpleado;
    }

    public void setCorreoElectronicoEmpleado(String correoElectronicoEmpleado) {
        this.correoElectronicoEmpleado = correoElectronicoEmpleado;
    }

    public String getNacionalidadEmpleado() {
        return nacionalidadEmpleado;
    }

    public void setNacionalidadEmpleado(String nacionalidadEmpleado) {
        this.nacionalidadEmpleado = nacionalidadEmpleado;
    }

    public String getNombreContactoEmergenciaEmpleado() {
        return nombreContactoEmergenciaEmpleado;
    }

    public void setNombreContactoEmergenciaEmpleado(String nombreContactoEmergenciaEmpleado) {
        this.nombreContactoEmergenciaEmpleado = nombreContactoEmergenciaEmpleado;
    }

    public String getRelacionConEmpleado() {
        return relacionConEmpleado;
    }

    public void setRelacionConEmpleado(String relacionConEmpleado) {
        this.relacionConEmpleado = relacionConEmpleado;
    }

    public String getNumeroContactoEmergenciaEmpleado() {
        return numeroContactoEmergenciaEmpleado;
    }

    public void setNumeroContactoEmergenciaEmpleado(String numeroContactoEmergenciaEmpleado) {
        this.numeroContactoEmergenciaEmpleado = numeroContactoEmergenciaEmpleado;
    }

    public String getTituloPuestoTrabajoEmpleado() {
        return tituloPuestoTrabajoEmpleado;
    }

    public void setTituloPuestoTrabajoEmpleado(String tituloPuestoTrabajoEmpleado) {
        this.tituloPuestoTrabajoEmpleado = tituloPuestoTrabajoEmpleado;
    }

    public String getIncentivosEmpleado() {
        return incentivosEmpleado;
    }

    public void setIncentivosEmpleado(String incentivosEmpleado) {
        this.incentivosEmpleado = incentivosEmpleado;
    }

    public String getNombreUsuarioEmpleado() {
        return nombreUsuarioEmpleado;
    }

    public void setNombreUsuarioEmpleado(String nombreUsuarioEmpleado) {
        this.nombreUsuarioEmpleado = nombreUsuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

}
