/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public interface IPersona {
    
    public void agregarPersona(Persona p);
    public void eliminarPersona(String cedula);
    public void actualizarPersona(String cedula);
    public ArrayList<Persona> informarPersona();
}
