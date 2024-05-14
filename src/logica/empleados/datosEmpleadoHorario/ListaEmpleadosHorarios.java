/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.empleados.datosEmpleadoHorario;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaEmpleadosHorarios {
    
    private static HashMap<Integer, EmpleadoTrabajoHorario> horariosEmpleados = new HashMap<>();

    public static HashMap<Integer, EmpleadoTrabajoHorario> getHorariosEmpleados() {
        return horariosEmpleados;
    }

    public static void setHorariosEmpleados(HashMap<Integer, EmpleadoTrabajoHorario> horariosEmpleados) {
        ListaEmpleadosHorarios.horariosEmpleados = horariosEmpleados;
    }
    
    
    
}
