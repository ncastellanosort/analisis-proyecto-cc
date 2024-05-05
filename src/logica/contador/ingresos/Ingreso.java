/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.ingresos;

/**
 *
 * @author Nicolas
 */
public class Ingreso {

    private int cantidadMonetariaIngreso;
    private String fechaIngreso;
    private String origenIngreso;
    private String tipoDeIngresoIngreso;
    private String metodoDePagoIngreso;
    private String areaOrigenIngreso;

    public Ingreso(int cantidadMonetariaIngreso, String fechaIngreso, String origenIngreso, String tipoDeIngresoIngreso, String metodoDePagoIngreso, String areaOrigenIngreso) {
        this.cantidadMonetariaIngreso = cantidadMonetariaIngreso;
        this.fechaIngreso = fechaIngreso;
        this.origenIngreso = origenIngreso;
        this.tipoDeIngresoIngreso = tipoDeIngresoIngreso;
        this.metodoDePagoIngreso = metodoDePagoIngreso;
        this.areaOrigenIngreso = areaOrigenIngreso;
    }

    public int getCantidadMonetariaIngreso() {
        return cantidadMonetariaIngreso;
    }

    public void setCantidadMonetariaIngreso(int cantidadMonetariaIngreso) {
        this.cantidadMonetariaIngreso = cantidadMonetariaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getOrigenIngreso() {
        return origenIngreso;
    }

    public void setOrigenIngreso(String origenIngreso) {
        this.origenIngreso = origenIngreso;
    }

    public String getTipoDeIngresoIngreso() {
        return tipoDeIngresoIngreso;
    }

    public void setTipoDeIngresoIngreso(String tipoDeIngresoIngreso) {
        this.tipoDeIngresoIngreso = tipoDeIngresoIngreso;
    }

    public String getMetodoDePagoIngreso() {
        return metodoDePagoIngreso;
    }

    public void setMetodoDePagoIngreso(String metodoDePagoIngreso) {
        this.metodoDePagoIngreso = metodoDePagoIngreso;
    }

    public String getAreaOrigenIngreso() {
        return areaOrigenIngreso;
    }

    public void setAreaOrigenIngreso(String areaOrigenIngreso) {
        this.areaOrigenIngreso = areaOrigenIngreso;
    }

}
