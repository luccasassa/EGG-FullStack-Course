/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/

package Ejercicios;
import java.util.Scanner;
public class E_21 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double altura;
        double contador1=0;
        double contador2=0;
        double suma1=0;
        double suma2=0;
        String respuesta;
        
        do{
            System.out.println("Ingrese una altura");
            altura=leer.nextDouble();
            System.out.println("Desea ingresar otra altura? (s/n)");
            respuesta=leer.next();
            suma1=suma1+altura;
            ++contador1;
            
            if (altura<=1.60){
                suma2=suma2+altura;
                ++contador2;
            }
        }while(respuesta.equals("s"));
        
        double promedio2=suma2/contador2;
        System.out.println("La altura promedio de los petizos es de: "+ promedio2);
        
        double promedio1=suma1/contador1;
        System.out.println("La altura promedio general es de: "+ promedio1);
    }
}
