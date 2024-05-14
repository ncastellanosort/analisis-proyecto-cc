/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.empleados;

import java.util.HashMap;


/**
 *
 * @author Nicolas
 */
public class ListaEmpleados {
    private static HashMap<Integer, Empleado> empleadosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Empleado> getEmpleadosCentroComercial() {
        return empleadosCentroComercial;
    }

    public static void setEmpleadosCentroComercial(HashMap<Integer, Empleado> empleadosCentroComercial) {
        ListaEmpleados.empleadosCentroComercial = empleadosCentroComercial;
    }
    
    
}
