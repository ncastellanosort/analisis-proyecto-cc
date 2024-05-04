/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.proveedores;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaProveedores {
    
    
    // el integer es el numero de identificacion fiscal
    private static HashMap<Integer, Proveedor> proveedoresCentroComercial = new HashMap<>();

    public static HashMap<Integer, Proveedor> getProveedoresCentroComercial() {
        return proveedoresCentroComercial;
    }

    public static void setProveedoresCentroComercial(HashMap<Integer, Proveedor> proveedoresCentroComercial) {
        ListaProveedores.proveedoresCentroComercial = proveedoresCentroComercial;
    }
    

}
