/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
*/

package Ejercicios;
import java.util.Scanner;
public class E_47 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el tamaño de su matriz");
        int n=read.nextInt();
        int m=read.nextInt();
        int matriz[][]=new int[n][m];
        int suma=0;
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matriz[i][j]=(int) (Math.random()*10);
                suma=suma+matriz[i][j];
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print("["+matriz[i][j]+"]"); //SIN SALTAR
            }
            System.out.println("");
        }
        System.out.println("\nLa suma de los subíndices de la matriz es "+suma);
    }
}
