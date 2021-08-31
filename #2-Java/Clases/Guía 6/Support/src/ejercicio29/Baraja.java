package ejercicio29;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    //private static Cartas[] baraja = new Cartas[40];
    private static ArrayList<Cartas> barajaEsp = new ArrayList();
    private static ArrayList<Cartas> cartasDadas = new ArrayList();
    //private static Integer totalCartas = 40;

    public static void crearBaraja() {
        String[] palo = {"ORO", "COPA", "ESPADA", "BASTO"};
        //int pos = 0;
        //int suma = 0;
        for (int i = 0; i < palo.length; i++) {

            for (int j = 1; j <= 12; j++) {
                Cartas carta = new Cartas();
                if (j == 8 || j == 9) {
                    //carta.setPalo(palo[i]);
                    //carta.setNumero(j + 2);
                    //barajaEsp.add(carta);
                    //baraja[suma] = carta;
                    j++;
                    //pos++;
                    //suma += pos;
                } else {
                    carta.setPalo(palo[i]);
                    carta.setNumero(j);
                    barajaEsp.add(carta);
                    //baraja[suma] = carta;
                    //pos++;
                    //suma += pos;
                }
            }
        }
    }

    /**
     *
     */
    public static void barajar() {
        Collections.shuffle(barajaEsp);
    }


    public static Cartas siguienteCarta() {
        //int pos = 0;
        if (barajaEsp.isEmpty() /*|| barajaEsp.indexOf(c) == totalCartas*/) {
            System.out.println("No quedan mas cartas debe barajar de nuevo");
        } else {
            Cartas c = new Cartas();
            c = barajaEsp.get(0);
            //pos = barajaEsp.indexOf(c) + 1;
            //barajaEsp.get(pos +1);
        }
        return barajaEsp.get(0);
    }

    public static void cartasDisponibles() {
        System.out.println("Quedan " + barajaEsp.size() + " cartas.");
    }

    public static void darCartas(Integer n) {

        if (n > barajaEsp.size()) {
            System.out.println("No hay cartas suficientes para repartir");
        } else {
            for (int i = 0; i < n; i++) {
                cartasDadas.add(barajaEsp.get(i));
                barajaEsp.remove(i);
            }
        }
    }

    public static void cartasMonton() {

        if (cartasDadas.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Cartas cartaDada : cartasDadas) {
                System.out.println(cartaDada);
            }
        }
    }

    public static void mostrarBaraja() {
        for (Cartas carta : barajaEsp) {
            System.out.println(carta);
        }
    }
}
