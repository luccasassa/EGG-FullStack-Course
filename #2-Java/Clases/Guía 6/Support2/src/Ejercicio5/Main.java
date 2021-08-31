/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
constructores: un constructor vacío y otro con la hora, minutos y segundos
ingresado por el usuario. Deberá definir además, los métodos getters y setters
correspondientes, y el método imprimirHoraCompleta().
*/

package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Tiempo tie = new Tiempo();
        
        System.out.println("Ingrese las horas");
        tie.setHoras(sc.nextInt());
        System.out.println("Ingrese los minutos");
        tie.setMinutos(sc.nextInt());
        System.out.println("Ingrese los segundos");
        tie.setSegundos(sc.nextInt());
        
        System.out.println(tie.imprimirHoraCompleta());
        
        
    }


}
