/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.mantenimiento.mantenimientos;

/**
 *
 * @author Nicolas
 */
public class Mantenimiento {

    private String nombreMantenimiento;
    private String encargadoMantenimiento;
    private int cedulaEncargado;
    private String descripcionMantenimiento;
    private String finalizadoMantenimiento;
    private String zonaMantenimiento;
    private String horaFinalizacion;
    private String fechaFinalizacion;

    public Mantenimiento(String nombreMantenimiento, String encargadoMantenimiento, int cedulaEncargado, String descripcionMantenimiento, String finalizadoMantenimiento, String zonaMantenimiento, String horaFinalizacion, String fechaFinalizacion) {
        this.nombreMantenimiento = nombreMantenimiento;
        this.encargadoMantenimiento = encargadoMantenimiento;
        this.cedulaEncargado = cedulaEncargado;
        this.descripcionMantenimiento = descripcionMantenimiento;
        this.finalizadoMantenimiento = finalizadoMantenimiento;
        this.zonaMantenimiento = zonaMantenimiento;
        this.horaFinalizacion = horaFinalizacion;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(String horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }

    public String getNombreMantenimiento() {
        return nombreMantenimiento;
    }

    public void setNombreMantenimiento(String nombreMantenimiento) {
        this.nombreMantenimiento = nombreMantenimiento;
    }

    public String getEncargadoMantenimiento() {
        return encargadoMantenimiento;
    }

    public void setEncargadoMantenimiento(String encargadoMantenimiento) {
        this.encargadoMantenimiento = encargadoMantenimiento;
    }

    public int getCedulaEncargado() {
        return cedulaEncargado;
    }

    public void setCedulaEncargado(int cedulaEncargado) {
        this.cedulaEncargado = cedulaEncargado;
    }

    public String getFinalizadoMantenimiento() {
        return finalizadoMantenimiento;
    }

    public void setFinalizadoMantenimiento(String finalizadoMantenimiento) {
        this.finalizadoMantenimiento = finalizadoMantenimiento;
    }

    public String getZonaMantenimiento() {
        return zonaMantenimiento;
    }

    public void setZonaMantenimiento(String zonaMantenimiento) {
        this.zonaMantenimiento = zonaMantenimiento;
    }

}
