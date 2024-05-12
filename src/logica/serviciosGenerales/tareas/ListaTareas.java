/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.serviciosGenerales.tareas;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaTareas {
    
    private static HashMap<Integer, Tarea> tareasCentroComercial = new HashMap<>();

    public static HashMap<Integer, Tarea> getTareasCentroComercial() {
        return tareasCentroComercial;
    }

    public static void setTareasCentroComercial(HashMap<Integer, Tarea> tareasCentroComercial) {
        ListaTareas.tareasCentroComercial = tareasCentroComercial;
    }
    
    
}
