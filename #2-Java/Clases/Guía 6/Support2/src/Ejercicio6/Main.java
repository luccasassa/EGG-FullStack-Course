/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se
deberá definir además dos constructores: uno vacío que inicializa el título y el
autor a cadenas vacías y otro que reciba como parámetros el título y el autor de
la canción. Se deberán además definir los métodos getters y setters
correspondientes.
*/

package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del autor y luego el titulo");
        Cancion cancion1 = new Cancion();
        cancion1.setAutor(sc.next());
        cancion1.setTitulo(sc.next());
        
        Cancion cancion2 = new Cancion("Acid rain","Liquid tension experiment");
        
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
    }

}
