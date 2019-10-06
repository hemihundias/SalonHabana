/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import java.util.Date;
/**
 *
 * @author Hemihundias
 */
public class Cliente {
    private String nombre,telefono,evento,asistentes,cocina,jornadas, habitaciones;
    private Date fecha;
    

    public Cliente(String nombre, String telefono, String evento, String asistentes, String cocina, Date fecha, String jornadas, String habitaciones) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.evento = evento;
        this.asistentes = asistentes;
        this.cocina = cocina;
        this.jornadas = jornadas;
        this.fecha = fecha;
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public String getCocina() {
        return cocina;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }

    public String getJornadas() {
        return jornadas;
    }

    public void setJornadas(String jornadas) {
        this.jornadas = jornadas;
    }

    public Date getFechaReserva() {
        return fecha;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fecha = fechaReserva;
    }

    public String isHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public String[] toArrayString(){
                
        String[] s = new String[8];
        s[0]=nombre;
        s[1]=telefono;
        s[2]=evento;
        s[3]=asistentes;
        s[4]=cocina;
        s[5]=String.valueOf(fecha);
        s[6]=jornadas;
        s[7]=String.valueOf(habitaciones);
        
        return s;
        
    }
    
}
