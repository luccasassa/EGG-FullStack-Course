/*
Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas y 40 minutos.
 */

package Ejercicios;
import java.util.Scanner;
public class E8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos. Se convertirá en días, horas y minutos");
        int minutos = leer.nextInt();
        int dias,horas;
        
        dias = minutos/1440;
        horas = minutos%1440/60; //se utiliza la función MOD % para usar el residuo
        minutos = minutos%60; //se utiliza la función MOD % para usar el residuo
        
        System.out.println("Su equivalente es de: ");
        System.out.println("Días: "+ dias);
        System.out.println("Horas: "+ horas); //horas=minutos/60-(dias*24)
        System.out.println("Minutos: "+minutos); //minutos=minutos-horas*60-dias*24
    }
}
