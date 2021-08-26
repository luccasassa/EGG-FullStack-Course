/*
Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
- Los socios tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.

Solicite una letra (caracter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
*/

package Ejercicios;
import java.util.Scanner;
public class E_17 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la obra social de Panchito");
        String letra = leer.nextLine();
        System.out.println("Cuánto cuesta el arreglo de muela?");
        int num = leer.nextInt();
        
        if ("a".equals(letra) || "b".equals(letra) || "c".equals(letra)){ //es decir (letra=="a" | ...)
            switch (letra){
                case "a": System.out.println("Panchito tiene descuento y pagará $"+ (num*0.5));
                break;
                case "b": System.out.println("Panchito tiene descuento y pagará $"+ (num*0.65));
                break;
                case "c": System.out.println("Panchito no tiene descuento, por lo tanto pagará $"+ num);
                break;
                default: System.out.println("No exite tal obra social");
            }
        }
    }
}
