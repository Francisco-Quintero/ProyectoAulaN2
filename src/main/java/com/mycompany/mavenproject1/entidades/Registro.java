/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author franc
 */



public class Registro {
    
    LocalTime horaEntrada;
    LocalTime horaSalida;
    LocalDate Fecha;
    
    public ArrayList<Persona> personas;
    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<PuestoParqueo> puestoparqueo; 
    public ArrayList<Zona> zona;

    public Registro(LocalTime horaEntrada, LocalTime horaSalida, LocalDate Fecha, ArrayList<Persona> personas, ArrayList<Vehiculo> vehiculos, ArrayList<PuestoParqueo> puestoparqueo, ArrayList<Zona> zona) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.Fecha = Fecha;
        this.personas = personas;
        this.vehiculos = vehiculos;
        this.puestoparqueo = puestoparqueo;
        this.zona = zona;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<PuestoParqueo> getPuestoparqueo() {
        return puestoparqueo;
    }

    public void setPuestoparqueo(ArrayList<PuestoParqueo> puestoparqueo) {
        this.puestoparqueo = puestoparqueo;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
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

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    
    public void ingresarRegistro(){
        
        
    }
    
    public void eliminarRegistro(){
           
    }
    
    public void consultarRegistro(){
 
    }
    
    public void informarRegistro(){
        
    }
    
    
}
