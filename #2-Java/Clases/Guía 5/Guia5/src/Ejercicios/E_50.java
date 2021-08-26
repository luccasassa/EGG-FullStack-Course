/*
Dadas dos matrices cuadradas de números enteros, la matriz1 de 10x10 y la matriz2 
de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz2 está
contenida dentro de la matriz1. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz1, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz2. En ese caso, el
programa debe indicar la fila y la columna de la matriz1 en la cual empieza el
primer elemento de la submatriz2.
*/

package Ejercicios;
import java.util.Scanner;
public class E_50 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int matriz1[][] = new int[10][10];
        int matriz2[][] = new int[3][3];
        
        int c=0;
        boolean verif=false;
        
        System.out.println("");
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matriz1[i][j]=(int)(Math.random()*10);
                System.out.print(matriz1[i][j]+" ");    //sin saltar
            }
            System.out.println("");
        }
        
        System.out.println("\nDigite su matriz[3][3]");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz2[i][j]=read.nextInt();
            }
        }
        
        for(int i=0; i<8; i++){        //llega hasta 8,8 para que mi matriz 3x3 pueda llegue al borde y no lea de más
            for(int j=0; j<8; j++){
                if(matriz1[i][j]==matriz2[0][0]){   
                    for(int a=0; a<3; a++){
                        for(int b=0; b<3; b++){                           
                            if(matriz1[(i+a)][(j+b)]==matriz2[a][b]){
                                c++;
                                if (c==9){
                                   System.out.println("\nEn el punto ["+i+"]["+j+"] empieza el primer elemento de la submatriz");
                                   verif=true;
                                }
                            }
                        }
                    }
                    c=0;    //reinicia mi contador para que no se sumen veces de más. También para que mi 3x3 esté totalmente igual.
                }
            }
        } 
        if (verif==false){
            System.out.println("\nNo se encontro ninguna similitud");
        }
    }
}
