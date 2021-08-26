/*
Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario e
imprimirlo. Salario = Hs. trabajadas * valor por hora
 */

package Ejercicios;
import java.util.Scanner;
public class E6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese las horas por día trabajadas");
        int horas = leer.nextInt();
        
        System.out.println("Ingrese el valor por hora");
        int valorHora = leer.nextInt();
        
        System.err.println("El salario semanal es de "+ (horas*valorHora));
    }
}
