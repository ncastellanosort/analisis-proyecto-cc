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
    

    public Area(String nombreArea, String ubicacionArea, String tamanoArea) {
        this.nombreArea = nombreArea;
        this.ubicacionArea = ubicacionArea;
        this.tamanoArea = tamanoArea;
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
    
    
    
}
