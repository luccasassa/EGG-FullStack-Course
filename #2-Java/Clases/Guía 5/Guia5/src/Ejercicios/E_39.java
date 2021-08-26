/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
https://www.youtube.com/watch?v=CKSW8ws8fAU
*/

package Ejercicios;
public class E_39 {
    
    public static void main(String[] args) {
        
        int[] vector=new int[100];
        
        for (int i=0; i<=99; i++) {
            vector[i]=i;
        }
        
        for (int i=99; i>=0; i--) {
            System.out.println(vector[i]);
        }
    }
}
