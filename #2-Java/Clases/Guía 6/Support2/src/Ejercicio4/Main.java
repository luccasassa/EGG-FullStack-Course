/*
Definir una clase llamada Punto con un constructor que inicialice las coordenadas
x e y. Generar dos instancias, es decir, crear dos objetos llamados punto1 y
punto2 y comprobar la distancia que existe entre ambos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
*/

package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el primer punto X e Y");
        Punto punto1 = new Punto();
        punto1.setX(sc.nextDouble());
        punto1.setY(sc.nextDouble());
        
        System.out.println("Ingrese el segundo punto X e Y");
        Punto punto2 = new Punto();
        punto2.setX(sc.nextDouble());
        punto2.setY(sc.nextDouble());
        
        Servicios res = new Servicios();
        
        System.out.println("La distancia de los puntos es de " + res.calculoDistancia(punto1, punto2));
        
        
    }

}
