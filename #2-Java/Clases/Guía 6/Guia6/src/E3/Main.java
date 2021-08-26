/*
Crear una clase llamada Fraccion que contenga métodos para sumar, restar,
multiplicar y dividir fracciones. Los argumentos de cada método son el
numerador y denominador según corresponda. La clase también debe contener
un método constructor con parámetros.
*/

package E3;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Fracción 1 - Numerador y Denominador");
        int num1 = read.nextInt();
        int den1 = read.nextInt();
        
        System.out.println("Fracción 2 - Numerador y Denominador");
        int num2 = read.nextInt();
        int den2 = read.nextInt();
        
        Fraccion cosa1 = new Fraccion(num1,den1);
        Fraccion cosa2 = new Fraccion(num2,den2);
        
        //----------------------------------------------
        
        System.out.println("\nSuma "+Fraccion.sumar(cosa1, cosa2));
        
        System.out.println("\nResta "+Fraccion.restar(cosa1, cosa2));
        
        System.out.println("\nMultiplicación "+Fraccion.multiplicar(cosa1, cosa2));
        
        System.out.println("\nDivisión "+Fraccion.dividir(cosa1, cosa2));
    }
}
