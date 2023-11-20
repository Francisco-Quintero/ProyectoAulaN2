/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.entidades;

import java.util.ArrayList;


public abstract class Vehiculo {
    String placa;
    String tipo;
    String modelo;
    String color;

    
    
    public Vehiculo(String placa, String tipo, String modelo, String color) {
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public void ingresaeVehiculo(String tipo, String placa, String modelo, String color){
        
    
    }
    
    
    public void eliminarVehiculo(String placa){
        
    }
    
    
    public void consultarVehiculo(String placa){
        
  
    }
    public ArrayList<Vehiculo> informarVehiculo() {
    
        return null;
    
     }
    
    
}
