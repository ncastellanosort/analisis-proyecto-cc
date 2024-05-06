/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.mantenimiento.mantenimientos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaMantenimientos {
    private static HashMap<Integer, Mantenimiento> mantenimientosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Mantenimiento> getMantenimientosCentroComercial() {
        return mantenimientosCentroComercial;
    }

    public static void setMantenimientosCentroComercial(HashMap<Integer, Mantenimiento> mantenimientosCentroComercial) {
        ListaMantenimientos.mantenimientosCentroComercial = mantenimientosCentroComercial;
    }
    
}
