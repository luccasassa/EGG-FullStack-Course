/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor que inicialice esos atributos con los
valores pasados como parámetros. Definir una instancia para cargar un libro y
luego informar mediante otro método el número de ISBN, el título y el autor del
libro.
*/

package Ejercicio1;

import java.util.Scanner;

public class MainLibros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Libros libro1 = new Libros(1231325,"lo que el viento se llevo","Nostradamus",524);
        
        Libros libro3 = new Libros(64646,"alalal","porroror",513);
        
        Libros libro2 = new Libros();
            libro2.ISBN = 651131;
            libro2.autor = "pepe honguito";
            
        
        System.out.println("ISBN " + libro1.ISBN + ", autor " + libro1.autor + ", paginas " + libro1.paginas + ", titulo: " + libro1.titulo);
        
    }

}
