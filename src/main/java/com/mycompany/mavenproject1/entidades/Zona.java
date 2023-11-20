/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.entidades;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Zona {
        
    int bloque;
    int capacidad;
public ArrayList<PuestoParqueo> puestoparqueo; 

    public Zona(int bloque, int capacidad, ArrayList<PuestoParqueo> puestoparqueo) {
        this.bloque = bloque;
        this.capacidad = capacidad;
        this.puestoparqueo = puestoparqueo;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<PuestoParqueo> getPuestoparqueo() {
        return puestoparqueo;
    }

    public void setPuestoparqueo(ArrayList<PuestoParqueo> puestoparqueo) {
        this.puestoparqueo = puestoparqueo;
    }

    public void ingresarZona(int bloque, int puesto,boolean disponible){
        
    }
    
    public void eliminarZona(int bloque){
        
        
    }
    
    public void consultarZona(int bloque){
        
    }
    
        public ArrayList<String> informarZona() {
        ArrayList<String> zonas = null;
        return zonas;
    }
    
}

