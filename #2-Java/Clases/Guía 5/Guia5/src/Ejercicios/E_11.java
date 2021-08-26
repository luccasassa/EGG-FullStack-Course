/*
Crear un programa que dado un numero determine si es par o impar.
 */

package Ejercicios;
import java.util.Scanner;
public class E_11 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        
        System.out.println("Escriba un número");
        int num = leer.nextInt();
        
        if (num %2 == 0){
            System.out.println(verde+"El número es par");
        } else if (num %2 == 1){
            System.out.println(rojo+"El número es impar");
        }
    }
}
