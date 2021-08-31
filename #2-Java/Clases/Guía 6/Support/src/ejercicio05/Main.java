/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la hora");
        int hora = leer.nextInt();
        
        System.out.println("Ingrese los minutos");
        int minutos = leer.nextInt();
        
        System.out.println("Ingrese los segundos");
        int segundos = leer.nextInt();

        Tiempo nuevoTiempo = new Tiempo(hora, minutos, segundos);

        nuevoTiempo.imprimirHoraCompleta();

    }

}
