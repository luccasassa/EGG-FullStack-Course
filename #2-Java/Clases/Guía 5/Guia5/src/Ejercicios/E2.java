/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/

package Ejercicios;
import java.util.Scanner;
public class E2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt(); //se coloca nextInt ya que es un tipo de dato primitivo
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de ambos es igual a "+suma);
    }
}
