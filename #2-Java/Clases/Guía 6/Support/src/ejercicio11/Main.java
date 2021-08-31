/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual
de café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad
indicada.
• Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */
package ejercicio11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cafetera cafetera = new Cafetera();
        System.out.println("Bienvenido a tu cafetera virtual");
        int rpta;
        
        do { 
            System.out.println("Elije una opción");
            System.out.println("1. Configurar la capacidad maxima y cantidad actual de tu cafetera");
            System.out.println("2. Llenar Cafetera");
            System.out.println("3. Servir Taza");
            System.out.println("4. Vaciar Cafetera");
            System.out.println("5. Agregar Café");
            System.out.println("6. Conocer la capacidad Maxima de tu cafetera");
            System.out.println("7. Mostrar cantidad actual de café");
            System.out.println("8. Mostrar toda la info de la cafetera");
            System.out.println("0. Salir");
            rpta = leer.nextInt();
            
            switch (rpta) {
                case 0:
                    System.out.println("Gracias por jugar!");
                    break;
                case 1: 
                    System.out.println("Dime la capacidad máxima de tu cafetera");
                    cafetera.setCapacidadMaxima(leer.nextInt());
                    System.out.println("Dime la cantidad actual de cafe");
                    cafetera.setCantidadActual(leer.nextInt());
                    cafetera = new Cafetera(cafetera.getCapacidadMaxima(),cafetera.getCantidadActual());
                    break;
                case 2:
                    cafetera.llenarCafetera();
                    System.out.println("Cafetera llena con " + cafetera.getCantidadActual() +
                            "c.c de puro y rico café.");
                    break;
                case 3:
                    System.out.println("¿Cuánto café quieres en tu taza?");
                    int cant = leer.nextInt();
                    cafetera.servirTaza(cant);
                    break;
                case 4:
                    cafetera.vaciarCafetera();
                    break;
                case 5:
                    System.out.println("¿Cuánto café deseas agregar?");
                    int agregar = leer.nextInt();
                    cafetera.agregarCafe(agregar);
                    
                    //System.out.println("Listo! Ahora tienes " + cafetera.getCantidadActual() + "c.c de "
                     //       + "puro y rico café");
                    break;
                case 6:
                    System.out.println("La capacidad máxima es " + cafetera.getCapacidadMaxima());
                    break;
                case 7:
                    if (cafetera.getCantidadActual() == 0) {
                        System.out.println("Ups! Te quedaste sin café, deberías agregar...");
                    } else {
                        System.out.println("Tienes " + cafetera.getCantidadActual() + "c.c de café.");
                    }
                    break;
                case 8:
                    cafetera.printCafetera();
                    break;
                default:
                    System.out.println("Opción Inválida!");
            }
            
        } while (rpta !=0);
        
    }
    
}
