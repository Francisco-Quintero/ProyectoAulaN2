/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.logica;

import com.mycompany.mavenproject1.entidades.Persona;
import com.mycompany.mavenproject1.persistencia.*;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class LogicaListaPersona {
    
    private IPersona data;
    
    //Constructor
    public LogicaListaPersona() {
        this.data = new ListaPersona();
    }
    
    
    //Methods
    public void agregarPersona(Persona p){
        this.data.agregarPersona(p);
    }
    
    public void eliminarPersona(String cedula) {
        this.data.eliminarPersona(cedula);
    }
    
    public void actualizarPersona(String cedula) {
        this.data.actualizarPersona(cedula);
    }
    
    public ArrayList<Persona> informarPersona(){
        return this.data.informarPersona();
    }
}
