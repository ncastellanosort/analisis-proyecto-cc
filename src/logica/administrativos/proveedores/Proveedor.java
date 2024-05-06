/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.proveedores;

/**
 *
 * @author Nicolas
 */
public class Proveedor {

    private String nombreEmpresaProveedor;
    private String direccionRegistradaProveedor;
    private long numeroContactoProveedor;
    private String direccionCorreoProveedor;
    private String servicioSuministradoProveedor;
    private String referenciaComercialProveedor;
    private String terminoDePagoProveedor;
    
    public Proveedor(){
    
    }

    public Proveedor(String nombreEmpresaProveedor, String direccionRegistradaProveedor, long numeroContactoProveedor, String direccionCorreoProveedor, String servicioSuministradoProveedor, String referenciaComercialProveedor, String terminoDePagoProveedor) {
        this.nombreEmpresaProveedor = nombreEmpresaProveedor;
        this.direccionRegistradaProveedor = direccionRegistradaProveedor;
        this.numeroContactoProveedor = numeroContactoProveedor;
        this.direccionCorreoProveedor = direccionCorreoProveedor;
        this.servicioSuministradoProveedor = servicioSuministradoProveedor;
        this.referenciaComercialProveedor = referenciaComercialProveedor;
        this.terminoDePagoProveedor = terminoDePagoProveedor;
    }

    public String getNombreEmpresaProveedor() {
        return nombreEmpresaProveedor;
    }

    public void setNombreEmpresaProveedor(String nombreEmpresaProveedor) {
        this.nombreEmpresaProveedor = nombreEmpresaProveedor;
    }

    public String getDireccionRegistradaProveedor() {
        return direccionRegistradaProveedor;
    }

    public void setDireccionRegistradaProveedor(String direccionRegistradaProveedor) {
        this.direccionRegistradaProveedor = direccionRegistradaProveedor;
    }

    public long getNumeroContactoProveedor() {
        return numeroContactoProveedor;
    }

    public void setNumeroContactoProveedor(long numeroContactoProveedor) {
        this.numeroContactoProveedor = numeroContactoProveedor;
    }

    public String getDireccionCorreoProveedor() {
        return direccionCorreoProveedor;
    }

    public void setDireccionCorreoProveedor(String direccionCorreoProveedor) {
        this.direccionCorreoProveedor = direccionCorreoProveedor;
    }

    public String getServicioSuministradoProveedor() {
        return servicioSuministradoProveedor;
    }

    public void setServicioSuministradoProveedor(String servicioSuministradoProveedor) {
        this.servicioSuministradoProveedor = servicioSuministradoProveedor;
    }

    public String getReferenciaComercialProveedor() {
        return referenciaComercialProveedor;
    }

    public void setReferenciaComercialProveedor(String referenciaComercialProveedor) {
        this.referenciaComercialProveedor = referenciaComercialProveedor;
    }

    public String getTerminoDePagoProveedor() {
        return terminoDePagoProveedor;
    }

    public void setTerminoDePagoProveedor(String terminoDePagoProveedor) {
        this.terminoDePagoProveedor = terminoDePagoProveedor;
    }

}
