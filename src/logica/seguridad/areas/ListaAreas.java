/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.areas;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaAreas {
    private static HashMap<Integer, Area> areasCentroComercial = new HashMap<>();

    public static HashMap<Integer, Area> getAreasCentroComercial() {
        return areasCentroComercial;
    }

    public static void setAreasCentroComercial(HashMap<Integer, Area> areasCentroComercial) {
        ListaAreas.areasCentroComercial = areasCentroComercial;
    }
    
    
}
