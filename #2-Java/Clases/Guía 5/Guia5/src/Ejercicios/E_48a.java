/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).

   1 2 3        1 4 7                                0  1 -2
A= 4 5 6    AT= 2 5 8     EJEMPLO MATRIZ SIMÉTRICA=  1  3  0
   7 8 9        3 6 9                               -2  0  5
*/

package Ejercicios;
import java.util.Scanner;
public class E_48a {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n,c=0;
        boolean res=false;
        
        System.out.println("Ingrese el tamaño de la matriz[N][N]");
        n = leer.nextInt();
        int[][] matrizA = new int[n][n];
        int[][] matrizAT = new int[n][n];

        //Relleno la matriz
        System.out.println("Ingrese los numeros en la matriz");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrizA[i][j] = leer.nextInt();
            }
        }

        //Relleno matriz AT y la multiplico por -1
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrizAT[i][j] = matrizA[j][i] * -1;
            }
        }

        //Imprimo las dos matrices para comprobar
        System.out.println("Matriz A:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrizA[i][j] + ", ");
            }
            System.out.println("");
        }

        System.out.println("Matriz -AT:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrizAT[i][j] + ", ");
            }
            System.out.println("");
        }

        // Comparo las dos matrices
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (matrizAT[i][j] == matrizA[i][j]) {
                    c++;
                }
            }
        }
        if (c == 9) {
            System.out.println("La matriz A es una matriz antisimétrica");
            res = true;
        }
        if (res == false) {
            System.out.println("La matriz A NO es antisimétrica");
        }
    }
}
