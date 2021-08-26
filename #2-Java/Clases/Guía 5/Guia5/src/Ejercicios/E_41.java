/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/

package Ejercicios;
import java.util.Scanner;
public class E_41 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el tamaño de sus vectores");
        int num = leer.nextInt();
        int[] vector1 = new int[num];
        int[] vector2 = new int[num];
        
        System.out.println("\nRellene los índices del primer vector");
        for (int i=0; i<num; i++) {
            vector1[i]=leer.nextInt();
        }
        
        System.out.println("\nRellene los índices del segundo vector");
        for (int i=0; i<num; i++) {
            vector2[i]=leer.nextInt();
        }
        
        int contador=0;
        
        for (int i=0; i<num; i++) {
            if (vector1[i]!=vector2[i]){
                System.out.println("\nEl subíndice ["+i+"] no coincide entre los vectores.");
                break;
            }
            else {
                contador++;
            }
        }
        if(contador==num){
            System.out.println("\nLos subíndices de ambos vectores son iguales");
        }
    }
}
