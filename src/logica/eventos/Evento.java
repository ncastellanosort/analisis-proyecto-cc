/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.eventos;

/**
 *
 * @author Nicolas
 */
public class Evento {
    
    private String nombreEvento;
    private String fechaEvento;
    private String horaInicioEvento;
    private String horaFinEvento;
    private String objetivoEvento;
    private int presupuestoEvento;
    private String finalizadoEvento;

    public Evento(String nombreEvento, String fechaEvento, String horaInicioEvento, String horaFinEvento, String objetivoEvento, int presupuestoEvento, String finalizadoEvento) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.horaInicioEvento = horaInicioEvento;
        this.horaFinEvento = horaFinEvento;
        this.objetivoEvento = objetivoEvento;
        this.presupuestoEvento = presupuestoEvento;
        this.finalizadoEvento = finalizadoEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraInicioEvento() {
        return horaInicioEvento;
    }

    public void setHoraInicioEvento(String horaInicioEvento) {
        this.horaInicioEvento = horaInicioEvento;
    }

    public String getHoraFinEvento() {
        return horaFinEvento;
    }

    public void setHoraFinEvento(String horaFinEvento) {
        this.horaFinEvento = horaFinEvento;
    }

    public String getObjetivoEvento() {
        return objetivoEvento;
    }

    public void setObjetivoEvento(String objetivoEvento) {
        this.objetivoEvento = objetivoEvento;
    }

    public int getPresupuestoEvento() {
        return presupuestoEvento;
    }

    public void setPresupuestoEvento(int presupuestoEvento) {
        this.presupuestoEvento = presupuestoEvento;
    }

    public String getFinalizadoEvento() {
        return finalizadoEvento;
    }

    public void setFinalizadoEvento(String finalizadoEvento) {
        this.finalizadoEvento = finalizadoEvento;
    }
    

    
    
}
