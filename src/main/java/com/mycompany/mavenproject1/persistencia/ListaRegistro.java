/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.entidades.Registro;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class ListaRegistro implements IRegistro {

    private ArrayList<Registro> listaRegistro;

    //constructor
    public ListaRegistro() {
        this.listaRegistro = new ArrayList();
    }
    
            
    
    @Override
    public void agregarRegistro(Registro r) {
        this.listaRegistro.add(r);
    }

    @Override
    public void eliminarRegistro(String cedula) {
        
    }

    @Override
    public ArrayList<Registro> informarRegistro() {
        ArrayList<Registro> lista = new ArrayList(this.listaRegistro);
        return lista;
    }

    @Override
    public void actualizarRegistro(String cedula) {
        Registro encontro = null;
        for(Registro r: this.listaRegistro){
//            if(r.getHoraEntrada){
//                System.out.println("Ingrese el nuevo nombre: ");
//                System.out.println("Ingrese la nueva cedula: ");
//                break;
//            }else{
//                System.out.println("El registro ingresado no existe...");
//            }
        }
    }
}
