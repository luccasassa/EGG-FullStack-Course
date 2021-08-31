/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor que inicialice esos atributos con los
valores pasados como parámetros. Definir una instancia para cargar un libro y
luego informar mediante otro método el número de ISBN, el título y el autor del
libro.
 */

package ejercicio01;

public class Libro {
    
    int isbn;
    String titulo;
    String autor;
    int numeroPaginas;
    
    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void mostrarLibro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de Páginas: " + this.numeroPaginas);
    }

}
