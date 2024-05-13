/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.areas;

/**
 *
 * @author Nicolas
 */
public class Area {

    private String nombreArea;
    private String ubicacionArea;
    private String tamanoArea;
    private String nombreEncargadoArea;
    private int cedulaEncargadoArea;
    private int horaInicioEncargadoArea;
    private int horaFinEncargadoArea;
    private String pisoArea;
    private String terminado;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTerminado() {
        return terminado;
    }

    public void setTerminado(String terminado) {
        this.terminado = terminado;
    }

    public Area(String nombreArea, String ubicacionArea, String tamanoArea) {
        this.nombreArea = nombreArea;
        this.ubicacionArea = ubicacionArea;
        this.tamanoArea = tamanoArea;
    }

    public Area(String fecha, String nombreArea, String ubicacionArea, String tamanoArea, String nombreEncargadoArea, int cedulaEncargadoArea, int horaInicioEncargadoArea, int horaFinEncargadoArea, String pisoArea, String terminado) {
        this.nombreArea = nombreArea;
        this.ubicacionArea = ubicacionArea;
        this.tamanoArea = tamanoArea;
        this.nombreEncargadoArea = nombreEncargadoArea;
        this.cedulaEncargadoArea = cedulaEncargadoArea;
        this.horaInicioEncargadoArea = horaInicioEncargadoArea;
        this.horaFinEncargadoArea = horaFinEncargadoArea;
        this.pisoArea = pisoArea;
        this.terminado = terminado;
        this.fecha = fecha;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getUbicacionArea() {
        return ubicacionArea;
    }

    public void setUbicacionArea(String ubicacionArea) {
        this.ubicacionArea = ubicacionArea;
    }

    public String getTamanoArea() {
        return tamanoArea;
    }

    public void setTamanoArea(String tamanoArea) {
        this.tamanoArea = tamanoArea;
    }

    public String getNombreEncargadoArea() {
        return nombreEncargadoArea;
    }

    public void setNombreEncargadoArea(String nombreEncargadoArea) {
        this.nombreEncargadoArea = nombreEncargadoArea;
    }

    public int getCedulaEncargadoArea() {
        return cedulaEncargadoArea;
    }

    public void setCedulaEncargadoArea(int cedulaEncargadoArea) {
        this.cedulaEncargadoArea = cedulaEncargadoArea;
    }

    public int getHoraInicioEncargadoArea() {
        return horaInicioEncargadoArea;
    }

    public void setHoraInicioEncargadoArea(int horaInicioEncargadoArea) {
        this.horaInicioEncargadoArea = horaInicioEncargadoArea;
    }

    public int getHoraFinEncargadoArea() {
        return horaFinEncargadoArea;
    }

    public void setHoraFinEncargadoArea(int horaFinEncargadoArea) {
        this.horaFinEncargadoArea = horaFinEncargadoArea;
    }

    public String getPisoArea() {
        return pisoArea;
    }

    public void setPisoArea(String pisoArea) {
        this.pisoArea = pisoArea;
    }

}
