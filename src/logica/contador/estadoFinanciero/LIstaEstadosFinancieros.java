/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.estadoFinanciero;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class LIstaEstadosFinancieros {
    
    private static HashMap<Integer, EstadoFinanciero> estadosFinancieros = new HashMap<>();

    public static HashMap<Integer, EstadoFinanciero> getEstadosFinancieros() {
        return estadosFinancieros;
    }

    public static void setEstadosFinancieros(HashMap<Integer, EstadoFinanciero> estadosFinancieros) {
        LIstaEstadosFinancieros.estadosFinancieros = estadosFinancieros;
    }
    
}
