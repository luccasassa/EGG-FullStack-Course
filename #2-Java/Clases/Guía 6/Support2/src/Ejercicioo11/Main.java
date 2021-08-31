/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
 y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
 al menos, los siguientes métodos:
 • Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
 actual en cero (cafetera vacía).
 • Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
 café igual a la capacidad máxima.
 • Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
 mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
 • Métodos getters y setters.
 • Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
 • Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
 Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
 • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 • Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */
package Ejercicioo11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        Cafetera cafe1 = new Cafetera();
        cafe1.setCapacidadMaxima(1000);
        cafe1.setCantidadActual(0);

        System.out.println("Ingrese la cantidad actual de la cafetera y el maximo");
        Cafetera cafe2 = new Cafetera();
        cafe2.setCantidadActual(sc.nextInt());
        cafe2.setCapacidadMaxima(sc.nextInt());

        System.out.println("Ingrese la opcion que desea realizar");
        do {
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar cafe");
            System.out.println("5-Ver estado actual de la cafetera");
            System.out.println("9-Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    cafe2.setCantidadActual(cafe1.getCapacidadMaxima());
                    break;
                case 2:
                    Servicios.ServirTaza(cafe1, cafe2);
                    break;
                case 3:
                    Servicios.VaciarCafetera(cafe1, cafe2);
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar?");
                    cafe2.setAgregar(sc.nextInt());
                    Servicios.AgregarCafe(cafe1, cafe2);
                    break;
                case 5:
                    System.out.println(cafe2.getCantidadActual());
                    break;
                case 9:
                    System.out.println("Nos vemos campeón");
            }

        } while (opcion != 9);

    }

}
