/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.serviciosGenerales.tareas;

/**
 *
 * @author Nicolas
 */
public class Tarea {
    private String nombreTarea;
    private String personaEncargada;
    private String realizadaTarea;
    private String descripcionTarea;
    private String areaTarea;
    


    public Tarea(String nombreTarea, String personaEncargada, String realizadaTarea, String descripcionTarea, String areaTarea) {
        this.nombreTarea = nombreTarea;
        this.personaEncargada = personaEncargada;
        this.realizadaTarea = realizadaTarea;
        this.descripcionTarea = descripcionTarea;
        this.areaTarea = areaTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public String getRealizadaTarea() {
        return realizadaTarea;
    }

    public void setRealizadaTarea(String realizadaTarea) {
        this.realizadaTarea = realizadaTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getAreaTarea() {
        return areaTarea;
    }

    public void setAreaTarea(String areaTarea) {
        this.areaTarea = areaTarea;
    }
    
    
}
