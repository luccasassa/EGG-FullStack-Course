/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
*/

package Ejercicios;
import java.util.Scanner;
public class E_22 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int tope;
        
        do{
            System.out.println("Ingrese un número tope mayor a 0 o se volverá a pedir");
            tope=leer.nextInt();
        }while(tope==0);
        
        int contador=0;
        int min=0;
        int max=0;
        int promedio=0;
        
        if(tope!=0){
            do{
                System.out.println("Introduzca un número");
                int num=leer.nextInt();
                
                if(contador==0){ //0 porque todavía no dió ninguna vuelta mi bucle.
                    min=num;
                    max=num;
                }
                
                promedio=promedio+num;
                ++contador;
                
                if(num<min){
                    min=num;
                }
                
                if(num>max) {
                    max=num;
                }
            }while (contador<tope);
            
            System.out.println("****Calculando resultados****");
            System.out.println("El número mínimo es "+ min);
            System.out.println("El número máximo es "+ max);
            System.out.println("El promedio general es "+ (promedio/contador));
        }
    }
}
