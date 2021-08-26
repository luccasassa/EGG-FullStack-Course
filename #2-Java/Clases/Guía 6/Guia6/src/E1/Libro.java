/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor que inicialice esos atributos con los
valores pasados como parámetros. Definir una instancia para cargar un libro y
luego informar mediante otro método el número de ISBN, el título y el autor del
libro.
*/

package E1;

public class Libro {
    
    //ATRIBUTOS
    Integer codigo;
    Integer paginas;
    String titulo;
    String autor;
    
    //BOB EL CONSTRUCTOR (crear variables a mis atributos)
    public Libro(Integer codigo, Integer paginas, String titulo, String autor){
        this.codigo=codigo;
        this.paginas=paginas;
        this.titulo=titulo;
        this.autor=autor;
    }
    
    Libro() {   //es necesario en caso de ordenar los atributos por listaen mi main class
    }
}
