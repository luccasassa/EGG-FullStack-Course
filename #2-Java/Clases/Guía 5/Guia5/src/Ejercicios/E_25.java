/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
*/

package Ejercicios;
import java.util.Scanner;
public class E_25 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int num; int contador=0; int contadorPares=0; int contadorImpares=0; int suma=0;
        System.out.println("Ingrese números hasta que alguno de ellos sea múltiplo de 5");
        
        do{
            num=leer.nextInt();
            ++contador;
            if (num>0){
                suma=suma+num;    
            }
            if(num%2==0){
                ++contadorPares;
            }else{
                ++contadorImpares;
            }
        }while(num%5!=0);
        
        System.out.println("El total de la suma de los números positivos es "+suma);
        System.out.println("El total de números ingresados es "+contador);
        System.out.println("El total de números pares ingresados es "+contadorPares);
        System.out.println("El total de números impares ingresados es "+contadorImpares);
    }
}
