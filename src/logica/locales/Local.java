/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.locales;

/**
 *
 * @author Nicolas
 */
public class Local {
    
    // private int numeroLocal;  id para el hashmap
    
    private int numeroLocal;
    private String tamanoLocal;
    private String condicionesDeArriendoLocal;
    private String arrendatario;
    private int precioArriendoLocal;
    


    public Local(int numeroLocal, String tamanoLocal, String condicionesDeArriendoLocal, String arrendatario, int precioArriendoLocal) {
        this.numeroLocal = numeroLocal;
        this.tamanoLocal = tamanoLocal;
        this.condicionesDeArriendoLocal = condicionesDeArriendoLocal;
        this.arrendatario = arrendatario;
        this.precioArriendoLocal = precioArriendoLocal;
    }

    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public String getTamanoLocal() {
        return tamanoLocal;
    }

    public void setTamanoLocal(String tamanoLocal) {
        this.tamanoLocal = tamanoLocal;
    }

    public String getCondicionesDeArriendoLocal() {
        return condicionesDeArriendoLocal;
    }

    public void setCondicionesDeArriendoLocal(String condicionesDeArriendoLocal) {
        this.condicionesDeArriendoLocal = condicionesDeArriendoLocal;
    }

    public String getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public int getPrecioArriendoLocal() {
        return precioArriendoLocal;
    }

    public void setPrecioArriendoLocal(int precioArriendoLocal) {
        this.precioArriendoLocal = precioArriendoLocal;
    }
    
    
    
    
}
