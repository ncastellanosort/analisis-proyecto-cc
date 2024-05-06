/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.contratos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaContratos {
    private static HashMap<Integer, Contrato> contratosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Contrato> getContratosCentroComercial() {
        return contratosCentroComercial;
    }

    public static void setContratosCentroComercial(HashMap<Integer, Contrato> contratosCentroComercial) {
        ListaContratos.contratosCentroComercial = contratosCentroComercial;
    }
    
}
