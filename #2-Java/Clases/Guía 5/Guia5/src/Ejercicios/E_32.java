/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
****
*  *
*  *
****
*/

package Ejercicios;
import java.util.Scanner;
public class E_32 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño de su cuadrado");
        int num = leer.nextInt();
        
        for (int i=0;i<num;i++){
            System.out.print("*"); //sin saltar
            for (int j=1;j<=num-2;j++){
                if (i==0 || i==num-1){
                    System.out.print("*"); //sin saltar
                }
                else {
                    System.out.print(" "); //sin saltar
                }
            }
            System.out.println("*");
        }
    }
}
