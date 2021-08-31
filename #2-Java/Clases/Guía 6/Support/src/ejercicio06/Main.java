/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá
definir además dos constructores: uno vacío que inicializa el título y el autor a
cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes.
 */
package ejercicio06;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancion1 = new Cancion();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de la cancion");
        String titulo = leer.next();
        
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        
        cancion1.setAutor(autor);
        cancion1.setTitulo(titulo);
        
        System.out.println(cancion1.toString());
                
    }
    
}
