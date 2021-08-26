/*
Implemente un programa para una Librería haciendo uso de conjuntos para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe
guardar el título del libro, autor, número de ejemplares del libro y número de
ejemplares prestados.

La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método préstamo que incrementa el atributo correspondiente cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no
queden ejemplares disponibles para prestar. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método devolución que decremente el atributo correspondiente cuando se
produzca la devolución de un libro. No se podrán devolver libros que no se
hayan prestado. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
• Método toString para mostrar los datos de los libros.
*/

package E5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicios {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Set<Libro> lista = new TreeSet<>();
    //TreeSet necesita un comparator para saber como ordenar la lista
    
    public void menu(){
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"LIBRERIA:\n"  
            +"1. Cargar libros.\n"
            +"2. Préstamo.\n"
            +"3. Devolución.\n"
            +"4. Ver lista.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA ACCIÓN -> ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: cargarLibros();
                break;
                case 2: prestamo();
                break;
                case 3: devolucion();
                break;
                case 4: mostrarLista();
                break;
                case 0: System.out.println("\nChau");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
    
    public void cargarLibros(){
        Libro objeto1 = new Libro("El señor de los anillos","J Tolkien",10,0);
        Libro objeto2 = new Libro("Harry Potter","J Rowling",10,0);
        Libro objeto3 = new Libro("Don Quijote","Miguel de Cervantes",10,0);
        
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
    }
    
    public boolean prestamo(){
        boolean respuesta = false;
        
        System.out.print("Ingrese el nombre del libro -> ");
        String title = sc.next().toUpperCase();
        
        for (Libro i : lista) {
            if (i.getTitulo().toUpperCase().equals(title)){
                if (i.getCantidad()>0){
                    i.setPrestados(i.getPrestados()+1);
                    i.setCantidad(i.getCantidad()-1);
                    respuesta = true;
                }else{
                    System.out.println("Cantidad insuficiente de libros ("+title+")");
                }
            }else{
                System.out.println("No se encontró '"+title+"'");
            }
        }
        return respuesta;
    }
    
    public boolean devolucion(){
        boolean respuesta = false;
        
        System.out.print("Ingrese el nombre del libro -> ");
        String title = sc.next().toUpperCase();
        for (Libro i : lista) {
            if (i.getTitulo().toUpperCase().equals(title)){
                if (i.getPrestados()>0){
                    i.setPrestados(i.getPrestados()-1);
                    i.setCantidad(i.getCantidad()+1);
                    respuesta = true;
                }else{
                    System.out.println("No se puede devolver un libro que no fué prestado");
                }
            }else{
                System.out.println("No se encontró '"+title+"'");
            }
        }
        return respuesta;
    }
    
    public void mostrarLista(){
        int c=0;
        for (Libro i : lista) {
            c++;
            System.out.println("\n\033[30m"+"LIBRO "+c+"\n"
            +"- Título: "+i.getTitulo()+"\n"
            +"- Autor: "+i.getAutor()+"\n"
            +"- Cantidad: "+i.getCantidad());
        }
    }
}
