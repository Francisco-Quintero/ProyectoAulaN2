
package com.mycompany.mavenproject1.entidades;

import java.time.LocalTime;

/**
 *
 * @author franc
 */
public class Empleado extends Persona {
    
    String cargo;
    
/*
    public Empleado(String id) {
        super(id);
    }
*/

    public Empleado(String id, String nombre, String cedula, boolean carnet, String rol, LocalTime horaEntrada, LocalTime horaSalida) {
        super(id, nombre, cedula, carnet, rol, horaEntrada, horaSalida);
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    @Override
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public void salida(LocalTime horaSalida) {
        super.salida(horaSalida); 
    }

    @Override
    public void entrada(LocalTime horaEntrada) {
        super.entrada(horaEntrada); 
    }
    
}
