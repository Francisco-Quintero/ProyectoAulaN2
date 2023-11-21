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
    
    String id, username, password;
    String nombre;
    String cedula;
    boolean carnet;
    String rol;
    LocalTime horaEntrada;
    LocalTime horaSalida;

    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String cedula, boolean carnet, String rol, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = "Juan";
        this.cedula = "1065478956";
        this.carnet = true;
        this.rol = "administrador";
        this.horaEntrada = LocalTime.now();
        this.horaSalida = LocalTime.now();
        this.username = "admin";
        this.password = "root";
    }

    public Persona(String id, String nombre, String cedula, boolean carnet, String rol, LocalTime horaEntrada, LocalTime horaSalida) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.carnet = carnet;
        this.rol = rol;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    //Métodos Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
