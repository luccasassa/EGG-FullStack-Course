/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

package Ejercicios;
import java.util.Scanner;
public class E_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        
        if(palabra.substring(0,1).equals("A")){
            System.out.println(verde+"CORRECTO");
        } else {
            System.out.println(rojo+"INCORRECTO");
        }   
    }
}
