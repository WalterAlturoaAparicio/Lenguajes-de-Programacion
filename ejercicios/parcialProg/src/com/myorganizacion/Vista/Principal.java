/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorganizacion.Vista;

import com.myorganizacion.Controlador.LogicaPersona;

/**
 *
 * @author walter
 */
public class Principal {
    
    private Menu menu;
    private LogicaPersona logica;
    
    public Principal(){
        this.menu=new Menu(this);
        this.logica=new LogicaPersona();
    }
    
    public Menu getMenu(){
        return menu;
    }

    public LogicaPersona getLogica() {
        return logica;
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.getMenu().mostrarMenuPrincipal();

    }
    
}
