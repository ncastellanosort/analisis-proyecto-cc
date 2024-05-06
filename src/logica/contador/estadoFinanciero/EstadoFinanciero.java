/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.estadoFinanciero;

/**
 *
 * @author Nicolas
 */
public class EstadoFinanciero {

    private String mes;
    private String activos;
    private String pasivos;
    private String patrimonioNeto;
    private int flujoEfectivoEntrante;
    private int flujoEfectivoSaliente;
    private int gananciasRetenidas;
    private int capitalContanteActual;

    public EstadoFinanciero(String mes, String activos, String pasivos, String patrimonioNeto, int flujoEfectivoEntrante, int flujoEfectivoSaliente, int gananciasRetenidas, int capitalContanteActual) {
        this.mes = mes;
        this.activos = activos;
        this.pasivos = pasivos;
        this.patrimonioNeto = patrimonioNeto;
        this.flujoEfectivoEntrante = flujoEfectivoEntrante;
        this.flujoEfectivoSaliente = flujoEfectivoSaliente;
        this.gananciasRetenidas = gananciasRetenidas;
        this.capitalContanteActual = capitalContanteActual;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getActivos() {
        return activos;
    }

    public void setActivos(String activos) {
        this.activos = activos;
    }

    public String getPasivos() {
        return pasivos;
    }

    public void setPasivos(String pasivos) {
        this.pasivos = pasivos;
    }

    public String getPatrimonioNeto() {
        return patrimonioNeto;
    }

    public void setPatrimonioNeto(String patrimonioNeto) {
        this.patrimonioNeto = patrimonioNeto;
    }

    public int getFlujoEfectivoEntrante() {
        return flujoEfectivoEntrante;
    }

    public void setFlujoEfectivoEntrante(int flujoEfectivoEntrante) {
        this.flujoEfectivoEntrante = flujoEfectivoEntrante;
    }

    public int getFlujoEfectivoSaliente() {
        return flujoEfectivoSaliente;
    }

    public void setFlujoEfectivoSaliente(int flujoEfectivoSaliente) {
        this.flujoEfectivoSaliente = flujoEfectivoSaliente;
    }

    public int getGananciasRetenidas() {
        return gananciasRetenidas;
    }

    public void setGananciasRetenidas(int gananciasRetenidas) {
        this.gananciasRetenidas = gananciasRetenidas;
    }

    public int getCapitalContanteActual() {
        return capitalContanteActual;
    }

    public void setCapitalContanteActual(int capitalContanteActual) {
        this.capitalContanteActual = capitalContanteActual;
    }

}
