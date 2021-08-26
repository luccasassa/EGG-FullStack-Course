/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package Ejercicios;
import java.util.Scanner;
public class E_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor que el primero");
        } else if (num1 == num2){
            System.out.println("Ambos números son iguales");
        }
    }
}
