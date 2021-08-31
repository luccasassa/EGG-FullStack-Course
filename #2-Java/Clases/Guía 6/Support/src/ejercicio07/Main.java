/*
 Crear una clase Rectángulo que modele rectángulos por medio de cuatro puntos
(los vértices). La clase dispondrá de dos constructores: uno que cree un rectángulo
partiendo de sus cuatro vértices y otro que cree un rectángulo partiendo de la base
y la altura, de forma que su vértice inferior izquierdo esté en (0,0). La clase también
incluirá un método para calcular la superficie y otro que desplace el rectángulo en
el plano. Se deberán además definir los métodos getters y setters
correspondientes (𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 𝑏𝑎𝑠𝑒 ∗ 𝑎𝑙𝑡𝑢𝑟𝑎).
 */
package ejercicio07;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r1 = new Rectangulo(0,4,3); //v2=y=0,x=4 v3=y=3,x=0
        Rectangulo r2 = new Rectangulo();
        
//        System.out.println("Ingrese la posicion x,y del vertice 2");
//        int x2 = leer.nextInt();
//        int y2 = leer.nextInt();
        
      //  r1.setV2(x2,y2);
        
        int superficie= r1.superficie(r1.getBase(),r1.getAltura());
        System.out.println("La superficie del rectangulo es: "+ superficie);
        System.out.println("Ingrese un numero para desplazar el rectangulo"
                + ".\nSi es positivo se corre a la derecha, si es negativo se corre"
                + " a la izquierda");
        int n = leer.nextInt();
        
        r1.desplazar(n);
        
        
    }
}
