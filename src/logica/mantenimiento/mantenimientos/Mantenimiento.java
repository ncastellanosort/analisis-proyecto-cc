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
    private String finalizadoMantenimiento;
    private String zonaMantenimiento;

    public Mantenimiento(String nombreMantenimiento, String encargadoMantenimiento, int cedulaEncargado, String finalizadoMantenimiento, String zonaMantenimiento) {
        this.nombreMantenimiento = nombreMantenimiento;
        this.encargadoMantenimiento = encargadoMantenimiento;
        this.cedulaEncargado = cedulaEncargado;
        this.finalizadoMantenimiento = finalizadoMantenimiento;
        this.zonaMantenimiento = zonaMantenimiento;
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
