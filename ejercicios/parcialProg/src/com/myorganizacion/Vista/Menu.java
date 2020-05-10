/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorganizacion.Vista;

import com.myorganizacion.Modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author walter
 */
public class Menu {

    public Principal principal;
    public Scanner lector;

    public Menu(Principal principal) {
        this.principal = principal;
        this.lector = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        int opc = -1;
        do {
            System.out.println("Bienvenido");
            System.out.println("1. Gestion de personas");
            System.out.println("2. Gestion de eventos");
            System.out.println("3. SALIR");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    mostrarSubMenuClientes();
                    break;
                case 2:
                    mostrarSubMenuEventos();
                    break;
                case 3:
                    opc = 0;
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 0);

    }

    private void mostrarSubMenuClientes() {
        int opc = -1;
        do {
            System.out.println("Modulo 1. Gestion de personas");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiantes por cedula");
            System.out.println("4. Modificar estudiante ");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Regresar al Menu principal");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    registrarEstudiantes();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    modificarEstudiante();
                    break;
                case 5:
                    eliminarEstudiante();
                    break;
                case 6:
                    opc = 0;
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 0);
    }

    private void mostrarSubMenuEventos() {
        System.out.println("esta opcion esta en desarrollo...");
    }

    private void registrarEstudiantes() {
        Persona estudiante = new Persona();
        System.out.println("Digite cedula");
        estudiante.setCedula(lector.nextInt());

        System.out.println("Digite Nombres");
        estudiante.setNombres(lector.next());

        System.out.println("Digite Apellidos");
        estudiante.setApellidos(lector.next());

        System.out.println("Digite edad");
        estudiante.setEdad(lector.nextInt());
        if (principal.getLogica().registrarP(estudiante)) {
            System.out.println("registtro exitoso");
        } else {
            System.out.println("estudiante no registrado");
        }
    }

    private void listarEstudiantes() {
        List<Persona> estudiantes = principal.getLogica().getLista();
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
        } else {
            System.out.println("Los estudiantes registrados son: ");
            for (Persona estudiante : estudiantes) {
                System.out.println(estudiante.toString());
            }
        }

    }

    private void buscarEstudiante() {
        System.out.println("Digite la cedula del estudiante");
        Persona estudiante = principal.getLogica().buscarEstudiante(lector.nextInt());
        if (estudiante == null) {
            System.out.println("estudiante no se encuentra registrado");
        } else {
            System.out.println(estudiante.toString());
        }
    }

    private void modificarEstudiante() {
        System.out.println("Digita la cedula del estudiante");
        Persona estudiante = principal.getLogica().buscarEstudiante(lector.nextInt());

        if (estudiante == null) {
            System.out.println("Estudiante no se encuentra registrado");
        } else {
            System.out.println("Estudiante: " + estudiante.toString());
            System.out.println("Digite Nombres");
            estudiante.setNombres(lector.next());

            System.out.println("Digite Apellidos");
            estudiante.setApellidos(lector.next());

            System.out.println("Digite edad");
            estudiante.setEdad(lector.nextInt());

            System.out.println("Estudiante modificado con exito");
        }
    }

    private void eliminarEstudiante() {
        System.out.println("Digita la cedula del estudiante que desea borrar");
        Persona estudiante = principal.getLogica().buscarEstudiante(lector.nextInt());

        if (estudiante == null) {
            System.out.println("Estudiante no se encuentra registrado");
        } else {
            principal.getLogica().borrarEstudiante(estudiante);
            System.out.println("Registro eliminado");
        }
    }

}
