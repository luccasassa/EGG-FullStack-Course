/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor que inicialice esos atributos con los
valores pasados como parámetros. Definir una instancia para cargar un libro y
luego informar mediante otro método el número de ISBN, el título y el autor del
libro.
 */

package ejercicio01;

public class Main {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro(273734882, "Los Diez Negritos", "Agatha Christie", 150);
        libro1.mostrarLibro();
    }
}
