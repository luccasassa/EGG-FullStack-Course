
package ejercicio27;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Juego {

    private static Set<Jugador> jugadores = new TreeSet(Jugador.ordenId);
    private static Revolver revolver;

    public static void menu() {
        Integer opc = 999;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        while (opc != 0) {
            System.out.println("Elija una opcion");
            if (jugadores.isEmpty()) {
                System.out.println("1. Cantidad de Jugadores");
            }

            System.out.println("2. Jugar");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    JugadorService.crear();
                    break;
                case 2:
                    if (jugadores.isEmpty()) {
                        System.out.println("Debe elegir la cantidad de jugadores"
                                + " primero");
                    } else {
                        ronda();
                    }

                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void crearLista(Jugador j) {
        jugadores.add(j);
    }

    private static Boolean finJuego() {
        Boolean fin = false;
        for (Jugador jug : jugadores) {
            if (!jug.getVivo()) {
                fin = true;
                break;
            }
        }
        return fin;
    }

    private static void ronda() {
        revolver.setPosBala((int) (Math.random() * 10) + 1);
        while (!finJuego()) {
            for (Jugador jug : jugadores) {
                System.out.println("Turno de " + jug.getNombre());
                revolver.setPosTambor((int) (Math.random() * 10) + 1);
                if (!JugadorService.disparar(revolver, jug)) {
                    finJuego();
                    System.out.println("El " + jug.getNombre() + " se ha disparado.");
                    System.out.println("Fin del Juego");
                    System.exit(0);
                } else {
                    System.out.println("El" + jug.getNombre() + " no ha muerto"
                            + " en esta ronda");
                }
            }
        }
    }

//    METODO ENVIADO A JugadorService
//    private static void crear() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Indique el numero de jugadores (entre 1 y 6)");
//        Integer n = sc.nextInt();
//
//        revolver.setPosBala((int) (Math.random() * 10) + 1);
//        //revolver.setPosTambor((int) (Math.random() * 10));
//
//        if (n > 6 || n < 1) {
//            for (int i = 0; i < 6; i++) {
//                Jugador j = new Jugador();
//                j.setId(i + 1);
//                j.setNombre("Jugador " + j.getId());
//                j.setVivo(true);
//                jugadores.add(j);
//            }
//        } else {
//            for (int i = 0; i < n; i++) {
//                Jugador j = new Jugador();
//                j.setId(i + 1);
//                j.setNombre("Jugador " + j.getId());
//                j.setVivo(true);
//                jugadores.add(j);
//            }
//        }
//    }
}
