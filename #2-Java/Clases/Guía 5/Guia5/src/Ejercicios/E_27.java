/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
*/

package Ejercicios;
import java.util.Scanner;
public class E_27 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int dividendo, divisor;
        
        do{
            System.out.println("Ingrese un dividendo mayor a 1 o se volverá a pedir");
            dividendo=leer.nextInt();
        }while(dividendo<=1);
        
        do{
            System.out.println("Ingrese un divisor mayor a 1 o se volverá a pedir");
            divisor=leer.nextInt();
        }while(divisor<=1);
        
        int contador=0, residuo=dividendo;
        
        while(residuo-divisor>=0){
            residuo=residuo-divisor;
            System.out.println(+(residuo+divisor)+" - "+divisor+" = "+residuo);
            ++contador;
        }
        
        System.out.println("Dado que "+residuo+" es menor que "+divisor+" entonces el residuo es "+residuo+" y el cociente es "+contador);
    }
}
