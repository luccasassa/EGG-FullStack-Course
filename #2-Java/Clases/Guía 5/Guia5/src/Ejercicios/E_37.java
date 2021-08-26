/*
Diseñe una función que pida el nombre y la edad de n personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de
edad. El método debe preguntarle al usuario si quiere seguir mostrando personas y
frenar cuando el usuario ingrese la palabra “No”.
*/

package Ejercicios;
import java.util.Scanner;
public class E_37 {           //HAY QUE USAR UN MÉTODO
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta = null;
        int contador=0;

        do{
            contador++;
            System.out.println("Ingrese el nombre de la "+contador+"° persona");
            String nombre=leer.next();
            System.out.println("Ingrese la edad de la "+contador+"° persona");
            int edad=leer.nextInt();

            if (edad<1){
            System.out.println("Ingrese una edad valida");
            }else if(edad>18){
                System.out.println("---------------");
                System.out.println("DNI de la "+contador+"° persona:\n"
                + "Nombre: "+nombre+"\n"
                + "Edad: "+edad+"\n"
                + "MAYOR DE EDAD");
                System.out.println("---------------");
            }else{
                System.out.println("---------------");
                System.out.println("DNI de la "+contador+"° persona:\n"
                + "Nombre: "+nombre+"\n"
                + "Edad: "+edad+"\n"
                + "MENOR DE EDAD");
                System.out.println("---------------");
            }
                System.out.println("Desea seguir mostrando personas (s/n)");
                respuesta=leer.next();
        }while(!"n".equals(respuesta));
    }
}
