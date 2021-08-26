/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada
familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las
familias.
*/

package Ejercicios;
import java.util.Scanner;
public class E_33 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        double familias,hijos,suma,edades,cantHijos; //reales para que el promedio me dé con coma(,)
        int i,j;
        
        System.out.println("Ingrese la cantidad de familias");
        familias=leer.nextInt();
        
        suma=0;
        cantHijos=0;
        
        for (i=1; i<=familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            hijos=leer.nextInt();
            
            System.out.println("Ingrese las edades de los hijos de la familia "+i);
            
            for (j=1; j<=hijos; j++) {
                edades=leer.nextInt();
                suma=suma+edades;
            }
            cantHijos=cantHijos+hijos;
            System.out.println("---------------------------------------------");
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("El promedio general de las edades de todos los hijos es: "+(suma/cantHijos));
    }
}
