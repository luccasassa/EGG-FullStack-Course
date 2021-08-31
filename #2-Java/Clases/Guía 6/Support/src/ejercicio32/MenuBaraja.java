
package ejercicio32;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuBaraja {

    public static void menu() {
        int opc = 999;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        while (opc != 0) {
            System.out.println("Elija un tipo de baraja");
            System.out.println("1. Baraja Española");
            System.out.println("2. Baraja Francesa");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    BarajaEspanola barajaEspanola = new BarajaEspanola();
                    barajaEspanola.tipoDeJuego();
                    barajaEspanola.crearBaraja();
                    juego(false, barajaEspanola.getBarajaEspanola());
                    break;
                case 2:
                    BarajaFrancesa barajaFrancesa = new BarajaFrancesa();
                    barajaFrancesa.crearBaraja();
                    juego(true, barajaFrancesa.getBarajaFrancesa());
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    //fuerza a salir del programa
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void juego(Boolean francesa, ArrayList<Cartas> baraja) {
        int opc = 999;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Barajar");
            System.out.println("2. Dar Cartas");
            System.out.println("3. Siguiente Carta");
            System.out.println("4. Mostrar Cartas que han salido ");
            System.out.println("5. Cartas Disponibles");
            System.out.println("6. Jugar de Nuevo");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    BarajaJugar.barajar(baraja);
                    break;
                case 2:
                    System.out.println("¿Cuantas cartas quiere dar?");
                    int n = sc.nextInt();
                    BarajaJugar.darCartas(n, baraja);
                    break;
                case 3:
                    System.out.println(BarajaJugar.siguienteCarta(baraja));
                    break;
                case 4:
                    BarajaJugar.cartasMonton();
                    break;
                case 5:
                    BarajaJugar.cartasDisponibles(baraja);
                    break;
                case 6:
                    BarajaJugar.jugarDeNuevo(baraja);
                    menu();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    //fuerza a salir del programa
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        }
    }

}

//case 3:
//                    System.out.println(Baraja.siguienteCarta());
//
//                    break;
//                case 4:
//                    Baraja.cartasMonton();
//                    break;
//                case 5:
//                    Baraja.cartasDisponibles();
//                    break;
//                case 6:
//                    Baraja.crearBaraja();
//                    break;
