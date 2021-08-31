/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class BarajaJugar {

    private static ArrayList<Cartas> cartasDadas = new ArrayList();

    public static void barajar(ArrayList<Cartas> baraja) {
        Collections.shuffle(baraja);
    }

    public static void darCartas(Integer n, ArrayList<Cartas> baraja) {

        if (n > baraja.size()) {
            System.out.println("No hay cartas suficientes para repartir");
        } else {
            Iterator<Cartas> it = baraja.iterator();
            while (it.hasNext()) {
                if (n == 0) {
                    break;
                }
                
                cartasDadas.add(it.next());
                it.remove();
                n--;
            }
        }

    }

    public static Cartas siguienteCarta(ArrayList<Cartas> baraja) {
        //int pos = 0;
        if (baraja.isEmpty() /*|| barajaEsp.indexOf(c) == totalCartas*/) {
            System.out.println("No quedan mas cartas debe barajar de nuevo");
        } else {
            Cartas c = new Cartas();
            c = baraja.get(0);
            //pos = barajaEsp.indexOf(c) + 1;
            //barajaEsp.get(pos +1);
        }
        return baraja.get(0);
    }

    public static void cartasMonton() {

        if (cartasDadas.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println(cartasDadas.size());
            for (Cartas cartaDada : cartasDadas) {
                System.out.println(cartaDada);
            }
        }
    }

    public static void cartasDisponibles(ArrayList<Cartas> baraja) {
        System.out.println("Quedan " + baraja.size() + " cartas.");
    }

    public static void jugarDeNuevo(ArrayList<Cartas> baraja) {
        baraja.clear();
        cartasDadas.clear();
    }
}
