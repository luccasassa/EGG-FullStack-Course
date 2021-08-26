/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación:

• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
aplicación. A continuación, debe programar las clases definidas en las que,
además de los constructores, hay que desarrollar los métodos correspondientes
a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/

package E9.Service;

import E9.Clases.Empleado;
import E9.Clases.Estudiante;
import E9.Clases.Persona;
import E9.Clases.PersonalDeServicio;
import E9.Clases.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacultadService {
    
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static List<Persona> listaaa = new ArrayList<>();
    
    public static ArrayList<Persona> crearListaPersonas(){
        
        //(Profesor) departamento.
        //(Empleado) añoIncorporacion, numDespacho.
        //(Persona) nombreYapellido, ID, estadoCivil.
        Profesor profesor = new Profesor("Ingeniería", 2010, 7, "Pato Carlos Bustos d'Elavaca", 1187, "Casado");
        listaaa.add(profesor);
        
        //(PersonalDeServicio) seccion.
        //(Empleado) añoIncorporacion, numDespacho.
        //(Persona) nombreYapellido, ID, estadoCivil.
        PersonalDeServicio persDeServ = new PersonalDeServicio("Decano", 2007, 1, "Jorge Nitales", 1129, "Viudo");
        listaaa.add(persDeServ);
        
        //(Estudiante) curso.
        //(Persona) nombreYapellido, ID, estadoCivil.
        Estudiante estudiante = new Estudiante("Ing. Industrial", "Kevin Chuca", 8415, "Soltero");
        listaaa.add(estudiante);
        
        return (ArrayList<Persona>) listaaa;    //obligatorio castear (lo exige NetBeans)
    }
    
    public static void mostrarTodo(){
        for (Persona i : listaaa) {
            System.out.println(i.toString());
        }
    }
    
    public static void menu(){    //es necesario importarla del primer método ya que no la identifica en los "case"
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"SELECCIONE UNA OPCION:\n"  
            +"1. Reasignar Despacho Empleado.\n"
            +"2. Matricular Estudiante.\n"
            +"3. Cambiar Departamento Profesores.\n"
            +"4. Cambiar Seccion de Personal de Servicio.\n"
            +"5. Cambiar Estado Civil.\n"
            +"6. Mostrar todas las Personas.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("\033[37m"+"Ingrese el ID del empleado a reasignar en el nuevo despacho -> ");
                    int buscarID = sc.nextInt();
                    for (Persona persona : listaaa) {
                        if (persona instanceof Empleado) {
                            Empleado empleado = (Empleado) persona;
                            if (empleado.getId().equals(buscarID)) {
                                empleado.reasignarDespacho();
                                break;
                            }
                        }
                    }
                break;
                case 2:
                    Estudiante e = new Estudiante();
                    e.matriculacionEstudiante();
                    listaaa.add(e);
                break;
                case 3:
                    System.out.print("Ingrese el ID del profesor que cambiará de departamento -> ");
                    buscarID = sc.nextInt();
                    for (Persona persona : listaaa) {
                        if (persona instanceof Profesor) {
                            Profesor object = (Profesor) persona;
                            if (object.getId().equals(buscarID)) {
                                object.cambioDepartamento();
                                break;
                            }
                        }
                    }
                break;
                case 4:
                    System.out.print("Ingrese el ID del personal de servicio que trasladara de seccion ->");
                    buscarID = sc.nextInt();
                    for (Persona persona : listaaa) {
                        if (persona instanceof PersonalDeServicio) {
                            PersonalDeServicio object = (PersonalDeServicio) persona;
                            if (object.getId().equals(buscarID)) {
                                object.trasladoDeSeccion();
                                break;
                            }
                        }
                    }
                break;
                case 5:
                    System.out.print("Ingrese el ID de la persona a la que cambiará el estado civil");
                    buscarID = sc.nextInt();
                    for (Persona persona : listaaa) {
                        if (persona.getId().equals(buscarID)) {
                            persona.cambioEstadoCivil();
                        }
                    }
                break;
                case 6: mostrarTodo();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
}
