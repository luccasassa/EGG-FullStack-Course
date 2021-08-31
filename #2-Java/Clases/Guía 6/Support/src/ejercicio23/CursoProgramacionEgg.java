    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class CursoProgramacionEgg {

    private static List<Alumno> listaCurso = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private static void crearAlumno() {
        Integer opc = 999;

        while (opc != 0) {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese los datos solicitados");
            System.out.println("Nombre:");
            alumno.setNombre(sc.next());
            System.out.println("Apellido:");
            alumno.setApellido(sc.next());
            System.out.println("Numero de legajo:");
            alumno.setLegajo(sc.nextInt());
            System.out.println("Sexo (H=hombre, M=mujer, O=otro");
            alumno.setSexo(sc.next().charAt(0));
            System.out.println("Condicion (regular/condicional)");
            alumno.setCondicion(sc.next());
            System.out.println("Nota Final:");
            alumno.setNotaFinal(sc.nextDouble());
            listaCurso.add(alumno);
            System.out.println("¿Desea ingresar otro alumno? (1. Para agregar mas"
                    + ". 0 para salir)");
            opc = sc.nextInt();
        }
    }

    private static void mostrarTodo() {
        System.out.println("Lista Completa de Alumnos: ");
        for (Alumno alumno : listaCurso) {
            System.out.println(alumno);
        }
    }

    private static void mostrarCondicional() {
        System.out.println("Lista de Alumnos Con Situacion Condicional:");
        int cont = 0;
        for (Alumno alumno : listaCurso) {
            if (alumno.getCondicion().toLowerCase().equals("condicional")) {
                cont++;
                System.out.println("Nombre: " + alumno.getNombre());
            }
        }
        System.out.println("Total: " + cont);
    }

    private static void ordenarMayorAMenor() {
        Collections.sort(listaCurso, ordenarNotaMayor);
        for (Alumno obj : listaCurso) {
            System.out.println("Alumnos por nota de Mayor a Menor: ");
            System.out.println(obj.getNombre() + " " + obj.getApellido() + ". Nota Final" + obj.getNotaFinal());
        }
    }

    private static void ordenarMenorAMayor() {
        Collections.sort(listaCurso, ordenarNotaMenor);
        for (Alumno obj : listaCurso) {
            System.out.println("Alumnos por nota de Menor a Mayor: ");
            System.out.println(obj.getNombre() + " " + obj.getApellido() + ". Nota Final" + obj.getNotaFinal());
        }
    }

    private static void ordenAlfabetico() {
        Collections.sort(listaCurso, (Alumno p1, Alumno p2) -> p1.getNombre().compareTo(p2.getNombre()));
        for (Alumno obj : listaCurso) {
            System.out.println("Alumnos por nombre: " + obj.getNombre() + " " +
                    obj.getApellido());
        }
    }

    public static void menu() {
        Integer opc = 999;

        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Cargar Alumnos");
            System.out.println("2. Mostrar todos los alumnos del Curso "
                    + "Programacion Egg");
            System.out.println("3. Mostrar todos los alumnos que se encuentren "
                    + "como condicional y su cantidad");
            System.out.println("4. Mostrar la lista de Alumnos segun su Nota de"
                    + " mayor a menor");
            System.out.println("5. Mostrar la lista de Alumnos segun su Nota de"
                    + " menor a mayor");
            System.out.println("6. Mostrar la lista de Alumnos en Orden Alfabetico "
                    + "(nombre y apellido)");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    mostrarTodo();
                    break;
                case 3:
                    mostrarCondicional();
                    break;
                case 4:
                    ordenarMayorAMenor();
                    break;
                case 5:
                    ordenarMenorAMayor();
                    break;
                case 6:
                    ordenAlfabetico();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    /**
     *
     */
    //comparator lambda
    public static Comparator<Alumno> ordenarNotaMenor = (Alumno o1, Alumno o2) -> {
        if (o1.getNotaFinal() > o2.getNotaFinal()) {
            return 1;
        } else if (o1.getNotaFinal() == o2.getNotaFinal()) {
            return 0;
        } else {
            return -1;
        }
    };

    public static Comparator<Alumno> ordenarNotaMayor = new Comparator<Alumno>() {

        @Override
        public int compare(Alumno o1, Alumno o2) {
            if (o1.getNotaFinal() > o2.getNotaFinal()) {
                return -1;
            } else if (o1.getNotaFinal() == o2.getNotaFinal()) {
                return 0;
            } else {
                return 1;
            }
        }
    };

}
