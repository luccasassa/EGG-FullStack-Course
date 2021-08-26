/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/

package Ejercicios;
import java.util.Scanner;
public class E_38 {
    
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = read.nextInt();
        
        while(num==0 || num==1){
            System.out.println("Ese número no es ni primo ni compuesto, intente con otro");
            num = read.nextInt();
        }
        System.out.println("El número es primo? - "+funcion(num));
    }
    
    public static boolean funcion(int num){
        int i,contador=0;
        
        for (i=1; i<=num; i++) {
            if(num%i==0){
                ++contador;
            }
        }
        return contador==2;
    }
}
