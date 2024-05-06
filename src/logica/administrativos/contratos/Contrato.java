/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.contratos;

/**
 *
 * @author Nicolas
 */
public class Contrato {
    private String nombreArrendatarioContrato;
    private String descripcionContrato;
    private String duracionContrato;
    private String condicionesDeRenovacionContrato;
    private int montoMensualContrato;
    private String plazosDePagoContrato;
    private String usoDelLocalContrato;
    private String nombreLocalContrato;
    private String seguros;

    public Contrato(String nombreArrendatarioContrato, String descripcionContrato, String duracionContrato, String condicionesDeRenovacionContrato, int montoMensualContrato, String plazosDePagoContrato, String usoDelLocalContrato, String nombreLocalContrato, String seguros) {
        this.nombreArrendatarioContrato = nombreArrendatarioContrato;
        this.descripcionContrato = descripcionContrato;
        this.duracionContrato = duracionContrato;
        this.condicionesDeRenovacionContrato = condicionesDeRenovacionContrato;
        this.montoMensualContrato = montoMensualContrato;
        this.plazosDePagoContrato = plazosDePagoContrato;
        this.usoDelLocalContrato = usoDelLocalContrato;
        this.nombreLocalContrato = nombreLocalContrato;
        this.seguros = seguros;
    }

    public String getNombreArrendatarioContrato() {
        return nombreArrendatarioContrato;
    }

    public void setNombreArrendatarioContrato(String nombreArrendatarioContrato) {
        this.nombreArrendatarioContrato = nombreArrendatarioContrato;
    }

    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    public void setDescripcionContrato(String descripcionContrato) {
        this.descripcionContrato = descripcionContrato;
    }

    public String getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(String duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public String getCondicionesDeRenovacionContrato() {
        return condicionesDeRenovacionContrato;
    }

    public void setCondicionesDeRenovacionContrato(String condicionesDeRenovacionContrato) {
        this.condicionesDeRenovacionContrato = condicionesDeRenovacionContrato;
    }

    public int getMontoMensualContrato() {
        return montoMensualContrato;
    }

    public void setMontoMensualContrato(int montoMensualContrato) {
        this.montoMensualContrato = montoMensualContrato;
    }

    public String getPlazosDePagoContrato() {
        return plazosDePagoContrato;
    }

    public void setPlazosDePagoContrato(String plazosDePagoContrato) {
        this.plazosDePagoContrato = plazosDePagoContrato;
    }

    public String getUsoDelLocalContrato() {
        return usoDelLocalContrato;
    }

    public void setUsoDelLocalContrato(String usoDelLocalContrato) {
        this.usoDelLocalContrato = usoDelLocalContrato;
    }

    public String getNombreLocalContrato() {
        return nombreLocalContrato;
    }

    public void setNombreLocalContrato(String nombreLocalContrato) {
        this.nombreLocalContrato = nombreLocalContrato;
    }

    public String getSeguros() {
        return seguros;
    }

    public void setSeguros(String seguros) {
        this.seguros = seguros;
    }
    
    
            
            
}
