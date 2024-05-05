/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.gastos;

/**
 *
 * @author Nicolas
 */
public class Gasto {

    private int cantidadMonetariaGasto;
    private String fechaGasto;
    private String conceptoGasto;
    private String proveedorGasto;
    private int numeroReciboGasto;
    private String categoriaGasto;
    private String areaDestinoGasto;
    private String metodoPagoGasto;

    public Gasto(int cantidadMonetariaGasto, String fechaGasto, String conceptoGasto, String proveedorGasto, int numeroReciboGasto, String categoriaGasto, String areaDestinoGasto, String metodoPagoGasto) {
        this.cantidadMonetariaGasto = cantidadMonetariaGasto;
        this.fechaGasto = fechaGasto;
        this.conceptoGasto = conceptoGasto;
        this.proveedorGasto = proveedorGasto;
        this.numeroReciboGasto = numeroReciboGasto;
        this.categoriaGasto = categoriaGasto;
        this.areaDestinoGasto = areaDestinoGasto;
        this.metodoPagoGasto = metodoPagoGasto;
    }

    public int getCantidadMonetariaGasto() {
        return cantidadMonetariaGasto;
    }

    public void setCantidadMonetariaGasto(int cantidadMonetariaGasto) {
        this.cantidadMonetariaGasto = cantidadMonetariaGasto;
    }

    public String getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(String fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public String getConceptoGasto() {
        return conceptoGasto;
    }

    public void setConceptoGasto(String conceptoGasto) {
        this.conceptoGasto = conceptoGasto;
    }

    public String getProveedorGasto() {
        return proveedorGasto;
    }

    public void setProveedorGasto(String proveedorGasto) {
        this.proveedorGasto = proveedorGasto;
    }

    public int getNumeroReciboGasto() {
        return numeroReciboGasto;
    }

    public void setNumeroReciboGasto(int numeroReciboGasto) {
        this.numeroReciboGasto = numeroReciboGasto;
    }

    public String getCategoriaGasto() {
        return categoriaGasto;
    }

    public void setCategoriaGasto(String categoriaGasto) {
        this.categoriaGasto = categoriaGasto;
    }

    public String getAreaDestinoGasto() {
        return areaDestinoGasto;
    }

    public void setAreaDestinoGasto(String areaDestinoGasto) {
        this.areaDestinoGasto = areaDestinoGasto;
    }

    public String getMetodoPagoGasto() {
        return metodoPagoGasto;
    }

    public void setMetodoPagoGasto(String metodoPagoGasto) {
        this.metodoPagoGasto = metodoPagoGasto;
    }

}
