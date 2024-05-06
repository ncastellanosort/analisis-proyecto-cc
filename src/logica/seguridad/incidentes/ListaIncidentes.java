/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.incidentes;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaIncidentes {
    private static HashMap<Integer, Incidente> incidentesCentroComercial = new HashMap<>();

    public static HashMap<Integer, Incidente> getIncidentesCentroComercial() {
        return incidentesCentroComercial;
    }

    public static void setIncidentesCentroComercial(HashMap<Integer, Incidente> incidentesCentroComercial) {
        ListaIncidentes.incidentesCentroComercial = incidentesCentroComercial;
    }
    
}
