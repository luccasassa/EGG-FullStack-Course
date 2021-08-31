
package ejercicio24;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Libreria {

    private static TreeSet<Libro> listado = new TreeSet(Libro.compararTitulo);
    //TreeSet necesita un comparator para saber como ordenar la lista
  
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void menu() {
        Integer opc = 999;

        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Cargar Libros Nuevos a Liberia");
            System.out.println("2. Prestar un Libro");
            System.out.println("3. Devolver un Libro");
            System.out.println("4. Mostrar el Listado completo de Libros");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    cargarLibros();
                    break;
                case 2: 
                    prestarLibro();
                    break;
                case 3:
                    devolverLibro();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    //fuerza a salir del programa
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    private static void cargarLibros() {
        String opc = "";
        
        Libro l1 = new Libro();
        l1.setTitulo("La magia");
        l1.setAutor("Ronda");
        l1.setTotal(10);
        l1.setPrestados(0);
        
        Libro l2 = new Libro();
        l2.setTitulo("Harry Potter");
        l2.setAutor("No se");
        l2.setTotal(2);
        l2.setPrestados(0);
        
        
        Libro l3 = new Libro();
        l3.setTitulo("Uno");
        l3.setAutor("Uno");
        l3.setTotal(5);
        l3.setPrestados(0);
      
        
        listado.add(l1);
        listado.add(l2);
        listado.add(l3);

        
        
//        while (!opc.equals("N") || !opc.equals("n")) {
//            Libro l = new Libro();
//            System.out.println("Ingrese los datos solicitados");
//            System.out.println("Titulo:");
//            l.setTitulo(sc.next());
//            System.out.println("Autor:");
//            l.setAutor(sc.next());
//            System.out.println("Numero total de ejemplares:");
//            l.setTotal(sc.nextInt());
//            l.setPrestados(0);
//            listado.add(l);
//            System.out.println("¿Desea ingresar otro libro? (S/N)");
//            opc = sc.next();
//        }
    }

    private static Boolean prestarLibro() {
        Boolean prestar = false;
        
        System.out.println("Desea buscar libro para prestar por titulo o autor? (Selecciona T o A)");
        String opc = sc.next();
        switch (opc) {
            case "T":
            case "t":
                System.out.println("Ingrese el titulo");
                String titulo = sc.next();
                titulo = titulo.toUpperCase();
                for (Libro libro : listado) {
                    if (libro.getTitulo().toUpperCase().equals(titulo)) {
                        if (libro.getTotal() >= 1) {
                            libro.setPrestados(libro.getPrestados() + 1);
                            libro.setTotal(libro.getTotal() - 1);
                            prestar = true;
                            break;
                        } else {
                            System.out.println("No quedan libros para prestar");
                        }
                    } else {
                        System.out.println("No se encontró el libro por el titulo");
                    }
                }
                break;
            case "A":
            case "a":
                System.out.println("Ingrese el autor");
                String autor = sc.next();
                autor = autor.toUpperCase();
                for (Libro libro : listado) {
                    if (libro.getAutor().toUpperCase().equals(autor)) {
                        if (libro.getTotal() >= 1) {
                            libro.setPrestados(libro.getPrestados() + 1);
                            libro.setTotal(libro.getTotal() - 1);
                            prestar = true;
                            break;
                        } else {
                            System.out.println("No quedan libros para prestar");
                        }
                    } else {
                        System.out.println("No se encontró el libro por el autor");
                    }
                }
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        return prestar;
    }

    private static Boolean devolverLibro() {
        Boolean devolver = false;
        
        System.out.println("Desea buscar libro para Devolver por titulo o autor?"
                + " (Selecciona T o A)");
        String opc = sc.next();
        switch (opc) {
            case "T":
            case "t":
                System.out.println("Ingrese el titulo");
                  String titulo = sc.next();
                titulo = titulo.toUpperCase();
                for (Libro libro : listado) {
                    if (libro.getTitulo().toUpperCase().equals(titulo)) {
                        if (libro.getPrestados()>= 1) {
                            libro.setPrestados(libro.getPrestados() - 1);
                            libro.setTotal(libro.getTotal() + 1);
                            devolver = true;
                            break;
                        } else {
                            System.out.println("El libro nunca fue prestado, "
                                    + "no se puede devolver");
                        }
                    } else {
                        System.out.println("No se encontró el libro por el titulo");
                    }
                }
                break;
            case "A":
            case "a":
                System.out.println("Ingrese el titulo");
                String autor = sc.next().toUpperCase();
                for (Libro libro : listado) {
                    if (libro.getAutor().toUpperCase().equals(autor)) {
                        if (libro.getPrestados()>= 1) {
                            libro.setPrestados(libro.getPrestados() - 1);
                            libro.setTotal(libro.getTotal() + 1);
                            devolver = true;
                            break;
                        } else {
                            System.out.println("El libro nunca fue prestado, "
                                    + "no se puede devolver");
                        }
                    } else {
                        System.out.println("No se encontró el libro por el autor");
                    }
                }
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        return devolver;    
    }
    
    private static void mostrarLista() {
        for (Libro libro : listado) {
            System.out.println(libro);
        }
    }  
}
