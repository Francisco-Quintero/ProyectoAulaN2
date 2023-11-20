/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class ListaVehiculo implements IVehiculo {
    
    private ArrayList<Vehiculo> listaVehiculo;

    
    
    public ListaVehiculo() {
        this.listaVehiculo = new ArrayList();
    }
    
    

    @Override
    public void ingresarVehiculo(Vehiculo r) {
        this.listaVehiculo.add(r);
    }

    @Override
    public void eliminarVehiculo(String placa) {
    }

    @Override
    public void actualizarVehiculo(String placa) {
    }

    @Override
    public ArrayList<Vehiculo> informarVehiculo() {
        ArrayList<Vehiculo> lista = new ArrayList(this.listaVehiculo);
        return lista;
    }
    
}
