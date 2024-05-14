/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.empleados.datosEmpleadoHorario;

/**
 *
 * @author Nicolas
 */
public class EmpleadoTrabajoHorario {

    // la cedula es la key
    private String fecha;
    private String nombreEmpleadoRonda;
    private String areaEmpleado;
    private String horaEntrada;
    private String horaSalida;
    private String horasExtra;

    public EmpleadoTrabajoHorario(String fecha, String nombreEmpleadoRonda, String areaEmpleado, String horaEntrada, String horaSalida, String horasExtra) {
        this.fecha = fecha;
        this.nombreEmpleadoRonda = nombreEmpleadoRonda;
        this.areaEmpleado = areaEmpleado;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horasExtra = horasExtra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreEmpleadoRonda() {
        return nombreEmpleadoRonda;
    }

    public void setNombreEmpleadoRonda(String nombreEmpleadoRonda) {
        this.nombreEmpleadoRonda = nombreEmpleadoRonda;
    }

    public String getAreaEmpleado() {
        return areaEmpleado;
    }

    public void setAreaEmpleado(String areaEmpleado) {
        this.areaEmpleado = areaEmpleado;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(String horasExtra) {
        this.horasExtra = horasExtra;
    }

}
