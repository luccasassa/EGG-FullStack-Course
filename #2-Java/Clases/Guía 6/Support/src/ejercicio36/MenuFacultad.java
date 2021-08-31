/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class MenuFacultad {

    public static void menu(ArrayList<Persona> lista) {
        String salir = "";
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Que desea realizar?: ");
            System.out.println("1- Reasignar Despacho Empleado");
            System.out.println("2- Matricular Estudiante");
            System.out.println("3- Cambiar Departamento Profesores");
            System.out.println("4- Cambiar Seccion de Personal de Servicio");
            System.out.println("5- Mostrar todas las Personas");
            System.out.println("6- Cambiar Estado Civil");
            System.out.println("0- Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el id del empleado a reasignar en el nuevo despacho");
                    int idBuscar = sc.nextInt();
                    for (Persona persona : lista) {
                        if (persona instanceof Empleados) {
                            Empleados object = (Empleados) persona;
                            if (object.getId().equals(idBuscar)) {
                                object.reasignarDespacho();
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    Estudiante e = new Estudiante();
                    e.matriculacionEstudiante();
                    lista.add(e);
                    break;
                    
                case 3:
                    System.out.println("Ingrese el id del profesor que cambiará "
                            + "de departamento");
                    idBuscar = sc.nextInt();
                    for (Persona persona : lista) {
                        if (persona instanceof Profesor) {
                            Profesor object = (Profesor) persona;
                            if (object.getId().equals(idBuscar)) {
                                object.cambioDepartamento();
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id del personal de servicio "
                            + "que trasladara de seccion");
                    idBuscar = sc.nextInt();
                    for (Persona persona : lista) {
                        if (persona instanceof PersDeServicio) {
                            PersDeServicio object = (PersDeServicio) persona;
                            if (object.getId().equals(idBuscar)) {
                                object.trasladoDeSeccion();
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    mostrar(lista);
                    break;
                case 6:
                    System.out.println("Ingrese el id de la persona a la que "
                            + "cambiará el estado civil");
                    idBuscar = sc.nextInt();
                    for (Persona persona : lista) {
                        if (persona.getId().equals(idBuscar)) {
                            persona.cambioEstadoCivil();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Seguro desea salir? (S/N)");
                    salir = sc.next().toUpperCase();
                    break;
                default:
                    System.out.println("¡Opcion invalida!");
            }
        } while (!salir.equals("S"));
    }

    public static ArrayList<Persona> crearListaDePersonas() {
        ArrayList<Persona> lista = new ArrayList();
        Profesor profe1 = new Profesor("Ciencias", 2003, 12, "Profe 1", 111, "Solterx");
        Profesor profe2 = new Profesor("Sociologia", 2010, 3, "Profe Dos", 222, "Solterx");
        PersDeServicio serv1 = new PersDeServicio("Decanato", 2015, 14, "Personal Servicio 1", 112, "Otrx");
        PersDeServicio serv2 = new PersDeServicio("Biblioteca", 2018, 12, "Personal Servicio 2", 221, "Soltero");
        Estudiante est1 = new Estudiante("Ingenieria", "Estudiante Uno", 1111, "Solterx");
        Estudiante est2 = new Estudiante("Programacion", "Estudiante Dos", 2222, "Solterx");
        lista.add(profe1);
        lista.add(profe2);
        lista.add(serv1);
        lista.add(serv2);
        lista.add(est1);
        lista.add(est2);

        return lista;
    }

    public static void mostrar(ArrayList<Persona> lista) {
        lista.forEach((persona) -> {
            System.out.println(persona.toString());
        });
    }
}
