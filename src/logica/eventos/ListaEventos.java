/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.eventos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaEventos {
    
    private static HashMap<Integer, Evento> eventosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Evento> getEventosCentroComercial() {
        return eventosCentroComercial;
    }

    public static void setEventosCentroComercial(HashMap<Integer, Evento> eventosCentroComercial) {
        ListaEventos.eventosCentroComercial = eventosCentroComercial;
    }
    
}
