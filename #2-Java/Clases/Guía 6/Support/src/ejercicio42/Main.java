/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio42;

import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 3);
        int num = 0;
        int intentos = 0;
        boolean entero;
        do {

            do {
                System.out.println("Elegi un numero (1-500)");
                try {
                    num = sc.nextInt();
                    System.out.println("El numero introducido es: " + num);
                    intentos++;
                    entero = true;
                } catch (Exception ex) {
                    System.out.println("Eso no es un numero entero");
                    //sc.next(); // se lee el elemento no reconocido para eliminarlo
                    intentos++;
                    entero = false;
                }
            } while (!entero);

            if (num > numeroSecreto) {
                System.out.println("El numero secreto es menor. Sigue intentando");

            }
            if (num < numeroSecreto) {
                System.out.println("El numero secreto es mayor. Sigue intentandolo");
            }

        } while (num != numeroSecreto);

        System.out.println("Exacto! El numero es: " + numeroSecreto);
        System.out.println("Cantidad de intentos: " + intentos);
    }
    
}
