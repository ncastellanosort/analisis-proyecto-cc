/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.robos;

/**
 *
 * @author Nicolas
 */
public class Robo {

    private String fechaRobo;
    private String horaRobo;
    private String descripcionRobo;
    private String valorEstimadoRobo;
    private String esLocalRobo;
    private String objetosRobadosRobo;
    private String testigoRobo;
    private String danosMaterialesRobo;
    private String notificacionAutoridadesRobo;

    public Robo(String fechaRobo, String horaRobo, String descripcionRobo, String valorEstimadoRobo, String esLocalRobo, String objetosRobadosRobo, String testigoRobo, String danosMaterialesRobo, String notificacionAutoridadesRobo) {
        this.fechaRobo = fechaRobo;
        this.horaRobo = horaRobo;
        this.descripcionRobo = descripcionRobo;
        this.valorEstimadoRobo = valorEstimadoRobo;
        this.esLocalRobo = esLocalRobo;
        this.objetosRobadosRobo = objetosRobadosRobo;
        this.testigoRobo = testigoRobo;
        this.danosMaterialesRobo = danosMaterialesRobo;
        this.notificacionAutoridadesRobo = notificacionAutoridadesRobo;
    }

    public String getFechaRobo() {
        return fechaRobo;
    }

    public void setFechaRobo(String fechaRobo) {
        this.fechaRobo = fechaRobo;
    }

    public String getHoraRobo() {
        return horaRobo;
    }

    public void setHoraRobo(String horaRobo) {
        this.horaRobo = horaRobo;
    }

    public String getDescripcionRobo() {
        return descripcionRobo;
    }

    public void setDescripcionRobo(String descripcionRobo) {
        this.descripcionRobo = descripcionRobo;
    }

    public String getValorEstimadoRobo() {
        return valorEstimadoRobo;
    }

    public void setValorEstimadoRobo(String valorEstimadoRobo) {
        this.valorEstimadoRobo = valorEstimadoRobo;
    }

    public String getEsLocalRobo() {
        return esLocalRobo;
    }

    public void setEsLocalRobo(String esLocalRobo) {
        this.esLocalRobo = esLocalRobo;
    }

    public String getObjetosRobadosRobo() {
        return objetosRobadosRobo;
    }

    public void setObjetosRobadosRobo(String objetosRobadosRobo) {
        this.objetosRobadosRobo = objetosRobadosRobo;
    }

    public String getTestigoRobo() {
        return testigoRobo;
    }

    public void setTestigoRobo(String testigoRobo) {
        this.testigoRobo = testigoRobo;
    }

    public String getDanosMaterialesRobo() {
        return danosMaterialesRobo;
    }

    public void setDanosMaterialesRobo(String danosMaterialesRobo) {
        this.danosMaterialesRobo = danosMaterialesRobo;
    }

    public String getNotificacionAutoridadesRobo() {
        return notificacionAutoridadesRobo;
    }

    public void setNotificacionAutoridadesRobo(String notificacionAutoridadesRobo) {
        this.notificacionAutoridadesRobo = notificacionAutoridadesRobo;
    }

}
