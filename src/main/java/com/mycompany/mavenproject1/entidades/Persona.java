/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.entidades;

import java.time.LocalTime;

/**
 *
 * @author franc
 */
public abstract class Persona {
    
    String id;
    String nombre;
    String cedula;
    boolean carnet;
    String rol;
    LocalTime horaEntrada;
    LocalTime horaSalida;

    public Persona(String id) {
        this.id = id;
    }
    
    public Persona(String nombre, String cedula, boolean carnet) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carnet = carnet;
    }

    public Persona(String nombre, String cedula, boolean carnet, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carnet = carnet;
        this.rol = rol;
    }

    public Persona(String id, String nombre, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isCarnet() {
        return carnet;
    }

    public void setCarnet(boolean carnet) {
        this.carnet = carnet;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
    public void entrada(LocalTime horaEntrada){
        
        this.horaEntrada=horaEntrada;
    }
    
    public void salida (LocalTime horaSalida){
        
        this.horaSalida=horaSalida;
    }
}
