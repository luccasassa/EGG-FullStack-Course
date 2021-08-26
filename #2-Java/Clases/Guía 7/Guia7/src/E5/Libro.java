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

import java.util.Comparator;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private Integer cantidad;
    private Integer prestados;

    public Libro(String titulo, String autor, Integer cantidad, Integer prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }
    
    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.getTitulo());
    }
}
