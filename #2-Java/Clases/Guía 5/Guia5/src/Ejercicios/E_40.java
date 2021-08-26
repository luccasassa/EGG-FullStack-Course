/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/

package Ejercicios;
import java.util.Scanner;
public class E_40 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el tamaño de su vector");
        int num = read.nextInt();
        
        int[] vector = new int[num];
        
        System.out.println("\nRellene los índices de su vector");
        int suma=0;
        
        for (int i=0; i<num; i++) {    //(...;i<num;...), es decir (num-1)
            vector[i]=read.nextInt();
            suma=suma+vector[i];
        }
        System.out.println("\nLa suma de todos los índices del vector es igual a: "+suma);
    }
}
