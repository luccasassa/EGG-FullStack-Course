/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/

package Ejercicios;
import java.util.Scanner;
public class E_43 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n"); 
        
        System.out.println("Digite el tamaño de su vector");
        int num = read.nextInt();
        int[] vector = new int [num];
        
        for (int i=0; i<num; i++) {
            vector[i]=(int) (Math.random()*10);
        }
        
        for (int i=0; i<num; i++) {
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println("\nQué número desea buscar en su vector?");
        int x = read.nextInt();
        
        boolean respuesta;
        
        for (int i=0; i<num; i++) {
            if(respuesta = x==vector[i]){    //sintaxis correcta para variables booleanas
                System.out.println("El número se encontró en la posición ["+i+"] de su vector");
            }
        }
        
        int i=0,j=0;   //el programa copia el valor de 'i' y 'j' del "for", así que no importa inicializarlos en 0
        
        if(respuesta = x!=vector[i]){    //fuera del for para que no se repita el msj por cada subíndice
            System.out.println("El número no se encontró en el vector");
        }
    }
}
