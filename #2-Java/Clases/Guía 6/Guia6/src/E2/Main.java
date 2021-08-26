/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación se deben crear los siguientes métodos:

a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para calcular el área de la circunferencia (Área = 𝜋 ∗ radio²).
d) Método para calcular el perímetro (Perímetro = 2 ∗ 𝜋 ∗ radio).
*/

package E2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el Radio para calcular su area y perímetro");
        double radio = read.nextDouble();
        Circunferencia coso1 = new Circunferencia(radio);
        
        coso1.setRadio(radio);
        System.out.println("\nRadio Ingresado: "+coso1.getRadio());    //traigo mi resultado
        System.out.println("Su Area es: "+coso1.Area());    //invocación
        System.out.println("Su Perimetro: "+coso1.Perimetro());    //invocación
    }
}
