/*
 Crear una clase llamada Fraccion que contenga métodos para sumar, restar,
 multiplicar y dividir fracciones. Los argumentos de cada método son el
 numerador y denominador según corresponda. La clase también debe contener
 un método constructor con parámetros.
 */
package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numerador y denominador de la primer fraccion");
        Fraccion fraccion1 = new Fraccion();        
        fraccion1.setX(sc.nextInt());
        fraccion1.setY(sc.nextInt());
        
        System.out.println("Ingrese el numerador y denominador de la segunda fraccion");
        Fraccion fraccion2 = new Fraccion();
        fraccion2.setX(sc.nextInt());
        fraccion2.setY(sc.nextInt());
        
        System.out.println("La suma es de " + Servicios.Suma(fraccion1,fraccion2));
        System.out.println("La resta es de " + Servicios.Resta(fraccion1,fraccion2));
        System.out.println("La multiplicacion es de " + Servicios.Multiplicacion(fraccion1,fraccion2));
        System.out.println("La division es de " + Servicios.Division(fraccion1,fraccion2));
    }

}
