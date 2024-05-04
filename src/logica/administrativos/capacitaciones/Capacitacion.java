/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.capacitaciones;

/**
 *
 * @author Nicolas
 */
public class Capacitacion {

    private String nombreCapacitacion;
    private String nombreInstructorCapacitacion;
    private String descripcionCapacitacion;
    private String areaCapacitacion;
    private String fecha;
    private int horaInicio;
    private int horaFin;
    private String empresaEncargadaCapacitacion;
    private String finalizada;

    public Capacitacion() {

    }

    public Capacitacion(String nombreCapacitacion, String nombreInstructorCapacitacion, String descripcionCapacitacion, String areaCapacitacion, String fecha, int horaInicio, int horaFin, String empresaEncargadaCapacitacion, String finalizada) {
        this.nombreCapacitacion = nombreCapacitacion;
        this.nombreInstructorCapacitacion = nombreInstructorCapacitacion;
        this.descripcionCapacitacion = descripcionCapacitacion;
        this.areaCapacitacion = areaCapacitacion;
        this.finalizada = finalizada;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.empresaEncargadaCapacitacion = empresaEncargadaCapacitacion;
    }
    
    

    public String getNombreCapacitacion() {
        return nombreCapacitacion;
    }

    public void setNombreCapacitacion(String nombreCapacitacion) {
        this.nombreCapacitacion = nombreCapacitacion;
    }

    public String getNombreInstructorCapacitacion() {
        return nombreInstructorCapacitacion;
    }

    public void setNombreInstructorCapacitacion(String nombreInstructorCapacitacion) {
        this.nombreInstructorCapacitacion = nombreInstructorCapacitacion;
    }

    public String getDescripcionCapacitacion() {
        return descripcionCapacitacion;
    }

    public void setDescripcionCapacitacion(String descripcionCapacitacion) {
        this.descripcionCapacitacion = descripcionCapacitacion;
    }

    public String getAreaCapacitacion() {
        return areaCapacitacion;
    }

    public void setAreaCapacitacion(String areaCapacitacion) {
        this.areaCapacitacion = areaCapacitacion;
    }

    public String getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(String finalizada) {
        this.finalizada = finalizada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public String getEmpresaEncargadaCapacitacion() {
        return empresaEncargadaCapacitacion;
    }

    public void setEmpresaEncargadaCapacitacion(String empresaEncargadaCapacitacion) {
        this.empresaEncargadaCapacitacion = empresaEncargadaCapacitacion;
    }

}
