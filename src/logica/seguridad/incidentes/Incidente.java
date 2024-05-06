/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.seguridad.incidentes;

/**
 *
 * @author Nicolas
 */
public class Incidente {
    private String nombreAreaIncidente;
    private String fechaIncidente;
    private String horaIndicente;
    private String descripcionIncidente;
    private String personasInvolucradasIncidente;
    private String accionesTomadasIncidente;
    private String danosMaterialesIncidente;
    private String notificacionAutoridadesIncidente;
    


    public Incidente(String nombreAreaIncidente, String fechaIncidente, String horaIndicente, String descripcionIncidente, String personasInvolucradasIncidente, String accionesTomadasIncidente, String danosMaterialesIncidente, String notificacionAutoridadesIncidente) {
        this.nombreAreaIncidente = nombreAreaIncidente;
        this.fechaIncidente = fechaIncidente;
        this.horaIndicente = horaIndicente;
        this.descripcionIncidente = descripcionIncidente;
        this.personasInvolucradasIncidente = personasInvolucradasIncidente;
        this.accionesTomadasIncidente = accionesTomadasIncidente;
        this.danosMaterialesIncidente = danosMaterialesIncidente;
        this.notificacionAutoridadesIncidente = notificacionAutoridadesIncidente;
    }

    public String getNombreAreaIncidente() {
        return nombreAreaIncidente;
    }

    public void setNombreAreaIncidente(String nombreAreaIncidente) {
        this.nombreAreaIncidente = nombreAreaIncidente;
    }

    public String getFechaIncidente() {
        return fechaIncidente;
    }

    public void setFechaIncidente(String fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }

    public String getHoraIndicente() {
        return horaIndicente;
    }

    public void setHoraIndicente(String horaIndicente) {
        this.horaIndicente = horaIndicente;
    }

    public String getDescripcionIncidente() {
        return descripcionIncidente;
    }

    public void setDescripcionIncidente(String descripcionIncidente) {
        this.descripcionIncidente = descripcionIncidente;
    }

    public String getPersonasInvolucradasIncidente() {
        return personasInvolucradasIncidente;
    }

    public void setPersonasInvolucradasIncidente(String personasInvolucradasIncidente) {
        this.personasInvolucradasIncidente = personasInvolucradasIncidente;
    }

    public String getAccionesTomadasIncidente() {
        return accionesTomadasIncidente;
    }

    public void setAccionesTomadasIncidente(String accionesTomadasIncidente) {
        this.accionesTomadasIncidente = accionesTomadasIncidente;
    }

    public String getDanosMaterialesIncidente() {
        return danosMaterialesIncidente;
    }

    public void setDanosMaterialesIncidente(String danosMaterialesIncidente) {
        this.danosMaterialesIncidente = danosMaterialesIncidente;
    }

    public String getNotificacionAutoridadesIncidente() {
        return notificacionAutoridadesIncidente;
    }

    public void setNotificacionAutoridadesIncidente(String notificacionAutoridadesIncidente) {
        this.notificacionAutoridadesIncidente = notificacionAutoridadesIncidente;
    }
    
    
    
}
