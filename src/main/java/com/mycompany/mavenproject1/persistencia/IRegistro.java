/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Registro;
import java.util.*;

/**
 *
 * @author franc
 */
public interface IRegistro {
    
    public void agregarRegistro(Registro r);
    public void eliminarRegistro(String cedula);
    public ArrayList<Registro> informarRegistro();
    public void actualizarRegistro(String cedula);
    
}
