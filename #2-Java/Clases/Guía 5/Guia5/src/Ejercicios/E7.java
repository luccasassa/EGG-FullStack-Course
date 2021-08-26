/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */

package Ejercicios;
import java.util.Scanner;
public class E7 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese un número");
       int numero = leer.nextInt();
       double raiz = Math.sqrt(numero); //raíz cuadrada
       
       System.out.println("El doble del número es de "+ (numero*2));
       System.out.println("El triple del número es de "+ (numero*3));       
       System.out.println("La raíz cuadrada del número es de "+ raiz);  
    }
}
