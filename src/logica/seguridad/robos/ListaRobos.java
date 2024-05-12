/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.robos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaRobos {
    
    private static HashMap<Integer, Robo> robosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Robo> getRobosCentroComercial() {
        return robosCentroComercial;
    }

    public static void setRobosCentroComercial(HashMap<Integer, Robo> robosCentroComercial) {
        ListaRobos.robosCentroComercial = robosCentroComercial;
    }
    
    
}
