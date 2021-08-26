/*
Declarar cuatro variables de tipo entero A, B, C y D, y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable
auxiliar.
 */

package Ejercicios;
import java.util.Scanner;
public class E9 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese A, B, C y D");
        String a = leer.next();
        String b = leer.next();
        String c = leer.next();
        String d = leer.next();
        String aux;
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println("El valor final de A es "+ a);
        System.out.println("El valor final de B es "+ b);
        System.out.println("El valor final de C es "+ c);
        System.out.println("El valor final de D es "+ d);
    }
}
