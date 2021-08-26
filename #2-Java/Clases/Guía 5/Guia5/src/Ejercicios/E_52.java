/*
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los
siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Donde cada uno de los números se calcula sumando los dos anteriores a él. 

Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…

La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
https://quantdare.com/numeros-de-fibonacci/
*/

package Ejercicios;
import java.util.Scanner;
public class E_52 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int num,a=0,b=1;
        
        System.out.println("Indique cuantos numero quiere escribir de la secuencia Fibonacci");
        num = read.nextInt();
        int vector[] = new int[num];
        
        for(int i=0;i<=num-1;i++){
            vector[i]= a + b;
            a=b;
            b=vector[i];
            System.out.print(vector[i]+" ");  
        }
        System.out.println("\n");
    }
}
