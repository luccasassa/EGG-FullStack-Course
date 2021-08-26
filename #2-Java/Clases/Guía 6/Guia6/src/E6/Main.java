/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se
deberá definir además dos constructores: uno vacío que inicializa el título y el
autor a cadenas vacías y otro que reciba como parámetros el título y el autor de
la canción. Se deberán además definir los métodos getters y setters
correspondientes.
*/

package E6;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el título de la canción:");
        String titulo = read.next();
        System.out.println("Ingrese el autor de la canción:");
        String autor = read.next();
        
        Cancion objeto1 = new Cancion(titulo,autor);
        
        System.out.println(objeto1.toString());
    }
}
