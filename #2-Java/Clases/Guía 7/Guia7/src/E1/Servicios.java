/*
Crear una clase llamada Palabra que mantenga información sobre diferentes
palabras con un atributo ArrayList de tipo String, que se le van a ir agregando
palabras por medio del método add(String). Al final, el programa debe permitirnos
conocer el conjunto de palabras de una determinada longitud ingresada por el
usuario. Este conjunto deberá estar ordenado alfabéticamente. Crear una
aplicación que muestre toda la información que disponga la clase Palabra.
*/

package E1;

import java.util.Collections;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Palabra objeto1 = new Palabra();
    
    public void ingresarPalabra(){
        String rta;
        System.out.print("Ingrese una palabra -> ");
        objeto1.addddd(sc.next());
        do{
            System.out.print("Desea seguir agregando palabras? s/n -> ");
            rta = sc.next();
            if("s".equals(rta)){
                System.out.print("Agregue otra palabra -> ");
                objeto1.addddd(sc.next());
            }
        }while(!"n".equals(rta));
    }
    
    public void cantidadPalabras(){
        System.out.print("\nLa cantidad de palabras de la lista son: ");
        objeto1.sizeeeee();
    }
    
    public void ordenarPalabras(){
        System.out.println("\nLas palabras ingresadas ordenadas son:");
        Collections.sort(objeto1.getPalabras());
    }
    
    public void mostrarPalabras(){
        for (String i : objeto1.getPalabras()){
            System.out.println("- "+i+" ("+i.length()+")");
        }
    }
}
