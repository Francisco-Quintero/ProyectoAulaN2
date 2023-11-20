/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class ListaPersona implements IPersona {
    
    private ArrayList<Persona> listaPersona;
    
    //contructor
    public ListaPersona() {
        this.listaPersona = new ArrayList();
    }
    

    @Override
    public void agregarPersona(Persona p) {
        this.listaPersona.add(p);
    }

    @Override
    public void eliminarPersona(String cedula) {
        Persona encontro = null;
        for(Persona p: this.listaPersona){
            if(p.getCedula().equals(cedula)){
                encontro = p;
                listaPersona.remove(p);
                break;
            }else{
                System.out.println("La persona ingresada no existe...");
            }
        }
    }

    @Override
    public void actualizarPersona(String cedula) {
        Persona encontro = null;
        for(Persona p: this.listaPersona){
            if(p.getCedula().equals(cedula)){
                System.out.println("Ingrese el nuevo nombre: ");
                System.out.println("Ingrese la nueva cedula: ");
                break;
            }else{
                System.out.println("La persona ingresada no existe...");
            }
        }
    }

    @Override
    public ArrayList<Persona> informarPersona() {
        ArrayList<Persona> lista = new ArrayList(this.listaPersona);
        return lista;
    }
}
