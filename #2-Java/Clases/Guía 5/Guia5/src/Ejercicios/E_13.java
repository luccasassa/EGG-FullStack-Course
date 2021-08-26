/*
Realizar un programa que pida introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

package Ejercicios;
import java.util.Scanner;
public class E_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        
        System.out.println("Introduce una palabra");
        String palabra = leer.nextLine();
        int cantidad = palabra.length();
        
        if (cantidad == 8){
            System.out.println(verde+"CORRECTO");
        } else {
            System.out.println(rojo+"INCORRECTO");
        }
    }
}
