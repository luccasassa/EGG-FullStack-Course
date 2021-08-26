/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
*/

package Ejercicios;
import java.util.Scanner;
public class E_16 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rojo = "\033[31m";
        
        System.out.println("Escriba una letra, el programa le indicará si es una vocal o no");
        String letra = leer.nextLine();
        
        switch (letra){
            case "a": System.out.println("Es una vocal");
            break;
            case "e": System.out.println("Es una vocal");
            break;
            case "i": System.out.println("Es una vocal");
            break;
            case "o": System.out.println("Es una vocal");
            break;
            case "u": System.out.println("Es una vocal");
            break;
            default: System.out.println(rojo+"No es una vocal");
            break;
        }
    }
}
