/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.convenios;

/**
 *
 * @author Nicolas
 */
public class Convenio {

    private String nombreConvenio;
    private String nombreFirmante;
    private String cedulaFirmante;
    private String fechaFirma;
    private String partesInvolucradas;
    private String duracionConvenio;
    private String objetivo;
    private String clausulasOcondiciones;
    private String beneficiosMutuos;
    private int compensacionConvenio;
    private String clausulasConfidencialidad;
    private String leyesAplicables;

    public Convenio(String nombreConvenio, String nombreFirmante, String cedulaFirmante, String fechaFirma, String partesInvolucradas, String duracionConvenio, String objetivo, String clausulasOcondiciones, String beneficiosMutuos, int compensacionConvenio, String clausulasConfidencialidad, String leyesAplicables) {
        this.nombreConvenio = nombreConvenio;
        this.nombreFirmante = nombreFirmante;
        this.cedulaFirmante = cedulaFirmante;
        this.fechaFirma = fechaFirma;
        this.partesInvolucradas = partesInvolucradas;
        this.duracionConvenio = duracionConvenio;
        this.objetivo = objetivo;
        this.clausulasOcondiciones = clausulasOcondiciones;
        this.beneficiosMutuos = beneficiosMutuos;
        this.compensacionConvenio = compensacionConvenio;
        this.clausulasConfidencialidad = clausulasConfidencialidad;
        this.leyesAplicables = leyesAplicables;
    }

    public String getNombreConvenio() {
        return nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public String getNombreFirmante() {
        return nombreFirmante;
    }

    public void setNombreFirmante(String nombreFirmante) {
        this.nombreFirmante = nombreFirmante;
    }

    public String getCedulaFirmante() {
        return cedulaFirmante;
    }

    public void setCedulaFirmante(String cedulaFirmante) {
        this.cedulaFirmante = cedulaFirmante;
    }

    public String getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(String fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public String getPartesInvolucradas() {
        return partesInvolucradas;
    }

    public void setPartesInvolucradas(String partesInvolucradas) {
        this.partesInvolucradas = partesInvolucradas;
    }

    public String getDuracionConvenio() {
        return duracionConvenio;
    }

    public void setDuracionConvenio(String duracionConvenio) {
        this.duracionConvenio = duracionConvenio;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getClausulasOcondiciones() {
        return clausulasOcondiciones;
    }

    public void setClausulasOcondiciones(String clausulasOcondiciones) {
        this.clausulasOcondiciones = clausulasOcondiciones;
    }

    public String getBeneficiosMutuos() {
        return beneficiosMutuos;
    }

    public void setBeneficiosMutuos(String beneficiosMutuos) {
        this.beneficiosMutuos = beneficiosMutuos;
    }

    public int getCompensacionConvenio() {
        return compensacionConvenio;
    }

    public void setCompensacionConvenio(int compensacionConvenio) {
        this.compensacionConvenio = compensacionConvenio;
    }

    public String getClausulasConfidencialidad() {
        return clausulasConfidencialidad;
    }

    public void setClausulasConfidencialidad(String clausulasConfidencialidad) {
        this.clausulasConfidencialidad = clausulasConfidencialidad;
    }

    public String getLeyesAplicables() {
        return leyesAplicables;
    }

    public void setLeyesAplicables(String leyesAplicables) {
        this.leyesAplicables = leyesAplicables;
    }

}
