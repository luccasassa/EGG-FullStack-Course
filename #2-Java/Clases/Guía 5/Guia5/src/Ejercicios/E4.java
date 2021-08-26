/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */

package Ejercicios;
import java.util.Scanner;
public class E4 {
       
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // o > new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine(); //"nextLine" para que me tome más de una palabra
        
        System.out.println(palabra.toLowerCase()); //minúsculas
        System.out.println(palabra.toUpperCase()); //mayúsculas
    }
}
