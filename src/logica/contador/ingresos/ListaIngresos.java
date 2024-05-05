/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.ingresos;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaIngresos {
    
    
    //identificador los ingresos es el id de transaccion

    private static HashMap<Integer, Ingreso> ingresosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Ingreso> getIngresosCentroComercial() {
        return ingresosCentroComercial;
    }

    public static void setIngresosCentroComercial(HashMap<Integer, Ingreso> ingresosCentroComercial) {
        ListaIngresos.ingresosCentroComercial = ingresosCentroComercial;
    }

}
