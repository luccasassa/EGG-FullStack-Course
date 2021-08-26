/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor que inicialice esos atributos con los
valores pasados como parámetros. Definir una instancia para cargar un libro y
luego informar mediante otro método el número de ISBN, el título y el autor del
libro.
*/

package E1;

public class Main {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro(123456789, 504, "Don Quijote", "Miguel de Cervantes");    //método facil lineal
        
        System.out.println("Libro 1 - Características\n"
        +"\nSu ISBN es "+libro1.codigo+"\n"
        +"La cantidad de páginas que tiene son "+libro1.paginas+"\n"
        +"El título del libro es: "+libro1.titulo+"\n"
        +"El autor del libro es: "+libro1.autor+"\n");
        
        //---------------------------------------------
        
        Libro libro2 = new Libro();
        libro2.codigo = 987654321;
        libro2.paginas = 3508;
        libro2.titulo = "Harry Potter";
        libro2.autor = "J K Rowling";
        
        System.out.println("Libro 2 - Características\n"
        +"\nSu ISBN es "+libro2.codigo+"\n"
        +"La cantidad de páginas que tiene son "+libro2.paginas+"\n"
        +"El título del libro es: "+libro2.titulo+"\n"
        +"El autor del libro es: "+libro2.autor+"\n");
    } 
}
