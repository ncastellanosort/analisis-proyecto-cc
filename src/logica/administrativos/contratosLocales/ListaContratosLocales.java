/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.contratosLocales;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaContratosLocales {
    private static HashMap<Integer, ContratoLocal> contratosCentroComercial = new HashMap<>();

    public static HashMap<Integer, ContratoLocal> getContratosCentroComercial() {
        return contratosCentroComercial;
    }

    public static void setContratosCentroComercial(HashMap<Integer, ContratoLocal> contratosCentroComercial) {
        ListaContratosLocales.contratosCentroComercial = contratosCentroComercial;
    }
    
}
