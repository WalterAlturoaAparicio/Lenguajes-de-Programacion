/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorganizacion.Controlador;

import com.myorganizacion.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walter
 */
public class LogicaPersona {
    
    private List<Persona> listaPersona;
    
    public LogicaPersona(){
        this.listaPersona = new ArrayList<>();
    }
    
    public boolean registrarP(Persona estudiante) {
        for(Persona personas:listaPersona){
            if(personas.getCedula()==estudiante.getCedula()){
                return false;
            }
        }
        listaPersona.add(estudiante);
        return true;
    }

    public List<Persona> getLista() {
        return listaPersona;
    }

    public Persona buscarEstudiante(int cedula) {
        for(Persona persona:listaPersona){
            if(persona.getCedula()==cedula){
                return persona;
            }
        }
        return null;
    }
    public boolean modificarPersona(int cedula){
        
        for(Persona personas:listaPersona){
            if(personas.getCedula()==cedula){
                return false;
            }
        }
        return true;
        
    }

    public void borrarEstudiante(Persona estudiante) {
        
        for(Persona personas:listaPersona){
            if(personas.getCedula()==estudiante.getCedula()){
                listaPersona.remove(estudiante);
                break;
            }
        }
    }
   
    
}
