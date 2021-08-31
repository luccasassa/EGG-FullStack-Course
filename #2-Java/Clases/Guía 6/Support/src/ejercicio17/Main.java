    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Mes juego = new Mes();

        System.out.println("Adivina el mes secreto");
        String mesJuego = sc.next();
        //String[] mesJuego = {mes};
        juego.adivina(mesJuego);

        
        if (juego.adivina(mesJuego) == false) {

            do {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
                mesJuego = sc.next();
                juego.adivina(mesJuego);

            } while (juego.adivina(mesJuego) == false);

        } if (juego.adivina(mesJuego)) {
            System.out.println("¡Ha acertado!");
        }

    }

}
