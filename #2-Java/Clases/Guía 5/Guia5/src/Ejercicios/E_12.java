/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */

package Ejercicios;
import java.util.Scanner;
public class E_12 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        
        System.out.println("Escriba una palabra");
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) { //debe ser completamente igual
            System.out.println(verde+"CORECTO");
        }  else {
            System.out.println(rojo+"INCORRECTO");
        }
    }
}
