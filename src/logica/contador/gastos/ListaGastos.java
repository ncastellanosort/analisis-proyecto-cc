/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.gastos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaGastos {
    
    // integer el identificador del gasto
    
    private static HashMap<Integer, Gasto> gastosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Gasto> getGastosCentroComercial() {
        return gastosCentroComercial;
    }

    public static void setGastosCentroComercial(HashMap<Integer, Gasto> gastosCentroComercial) {
        ListaGastos.gastosCentroComercial = gastosCentroComercial;
    }
    
}
