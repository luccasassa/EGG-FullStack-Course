/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5).
 */
package Ejercicios;
import java.util.Scanner;
public class E5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su temperatura en °C");
        double gradoC = leer.nextDouble(); //double para resultados decimales

        System.out.println("La temperatura en °F es "+ (32+(9*gradoC/5)));
    }
}