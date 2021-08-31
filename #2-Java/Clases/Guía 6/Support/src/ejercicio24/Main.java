/*
24. Implemente un programa para una Librería haciendo uso de conjuntos para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe
guardar el título del libro, autor, número de ejemplares del libro y número de
ejemplares prestados.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método préstamo que incrementa el atributo correspondiente cada vez que se
realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolución que decremente el atributo correspondiente cuando se
produzca la devolución de un libro. No se podrán devolver libros que no se hayan
prestado. Devuelve true si se ha podido realizar la operación y false en caso
contrario.
• Método toString para mostrar los datos de los libros.
 */
package ejercicio24;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libreria.menu();
    }
    
}
