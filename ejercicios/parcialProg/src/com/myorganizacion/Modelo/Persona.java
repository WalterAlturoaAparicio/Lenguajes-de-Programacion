/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorganizacion.Modelo;

import java.util.List;

/**
 *
 * @author walter
 */
public class Persona {
    private int cedula, edad;
    private String nombres, apellidos;
    private List<Persona> propiedades;
    
    public Persona(){
        
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Persona> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Persona> propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public String toString() {
        return '{' + "cedula=" + cedula + ", nombres=" + nombres 
            + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
    
}
