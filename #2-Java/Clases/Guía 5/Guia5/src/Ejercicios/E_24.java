/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/

package Ejercicios;
import java.util.Scanner;
public class E_24 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int num; int contador=0; int suma=0;
        System.out.println("Ingrese 20 números hasta que alguno de ellos sea 0");
        
        do{
            num=leer.nextInt();
            ++contador;
            if (num>0){
                suma=suma+num;    
            }
            if(num==0){
                System.out.println("Se capturó el numero cero (0)");
            }
        }while(num!=0 && contador<20);
        
        System.out.println("El total de la suma de los números positivos es "+suma);
    }
}
