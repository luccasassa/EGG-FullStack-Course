/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
*/

package Ejercicios;
import java.util.Scanner;
public class E_29 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un número para calcular sus dígitos");
        int num=leer.nextInt();
        int digitos=0;
        
        while(num!=0){
            num=num/10;
            ++digitos;
        }
        
        System.out.println("\nEl número ingresado contiene "+digitos+" dígitos.");
    }
}
