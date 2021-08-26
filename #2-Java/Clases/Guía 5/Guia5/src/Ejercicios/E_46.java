/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
*/

package Ejercicios;
public class E_46 {
    
    public static void main(String[] args) {
        
        int[][] matriz=new int [4][4];
        
        for (int i=0; i<4; i++) {         //o ...;i<matriz.length;...
            for (int j=0; j<4; j++) {     //o ...;j<matriz[i].length;...
                matriz[i][j]=(int) (Math.random()*10);
            }
        }
        
        System.out.println("\nRellenando aleatoriamente la matriz 4x4");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.print("["+matriz[i][j]+"]"); //sin saltar
            }
            System.out.println(""); //salto de columna
        }
    }
}
