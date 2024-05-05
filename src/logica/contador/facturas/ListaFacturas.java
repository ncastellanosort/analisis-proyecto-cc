/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.contador.facturas;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaFacturas {

    private static HashMap<Integer, Factura> facturasCentroComercial = new HashMap<>();

    public static HashMap<Integer, Factura> getFacturasCentroComercial() {
        return facturasCentroComercial;
    }

    public static void setFacturasCentroComercial(HashMap<Integer, Factura> facturasCentroComercial) {
        ListaFacturas.facturasCentroComercial = facturasCentroComercial;
    }

}
