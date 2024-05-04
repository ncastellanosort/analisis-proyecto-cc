/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.capacitaciones;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaCapacitaciones {
    
    //identificador de la capacitacion

    private static HashMap<Integer, Capacitacion> capacitacionesCentroComercial = new HashMap<>();

    public static HashMap<Integer, Capacitacion> getCapacitacionesCentroComercial() {
        return capacitacionesCentroComercial;
    }

    public static void setCapacitacionesCentroComercial(HashMap<Integer, Capacitacion> capacitacionesCentroComercial) {
        ListaCapacitaciones.capacitacionesCentroComercial = capacitacionesCentroComercial;
    }

}
