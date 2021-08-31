
package ejercicio29;

import java.util.Scanner;

public class MenuBaraja {

    public static void menu() {
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
                    Baraja.barajar();
                    break;
                case 2:
                    System.out.println("¿Cuantas cartas quiere dar?");
                    int n = sc.nextInt();
                    Baraja.darCartas(n);
                    break;
                case 3:
                    System.out.println(Baraja.siguienteCarta());

                    break;
                case 4:
                    Baraja.cartasMonton();
                    break;
                case 5:
                    Baraja.cartasDisponibles();
                    break;
                case 6:
                    Baraja.crearBaraja();
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
