/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/

package Ejercicios;
import java.util.Scanner;
public class E_20 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        int max = leer.nextInt();
        int suma = 0;
        
        do{
            System.out.println("Ingrese un número que desea sumar hasta llegar al límite");
            int num = leer.nextInt();
            suma=suma+num;
        }while (suma<max);
        
        System.out.println("La suma ya igualó o superó al número límite");
        System.out.println("Resultado: "+ suma);
    }
}
