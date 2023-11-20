/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;


import com.mycompany.mavenproject1.entidades.Zona;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public interface IZona {
    
    public void agregarZona(Zona z);
    public void eliminarZona(int bloque);
    public void actualizarZona(int bloque);
    public ArrayList<Zona> informarZona();
}
