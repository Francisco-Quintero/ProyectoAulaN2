/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Zona;
import java.util.*;

/**
 *
 * @author franc
 */
public class ListaZona implements IZona {
    
    private ArrayList<Zona> listaZona;
    
    

    public ListaZona() {
        this.listaZona = new ArrayList();
    }
    

    @Override
    public void agregarZona(Zona z) {
        this.listaZona.add(z);
    }

    @Override
    public void eliminarZona(int bloque) {
    }

    @Override
    public void actualizarZona(int bloque) {
    }

    @Override
    public ArrayList<Zona> informarZona() {
        ArrayList<Zona> lista = new ArrayList(this.listaZona);
        return lista;
    }
    
}
