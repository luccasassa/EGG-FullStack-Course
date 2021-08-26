/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla*/

package Ejercicios;
import java.util.Scanner;
public class E3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next(); //no se coloca nextString ya que es un tipo de dato NO primitivo
         
        System.out.println("Su nombre es "+nombre);
    }
}
