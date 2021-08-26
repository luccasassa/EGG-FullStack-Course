/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el
teclado y los guarde en un ArrayList de tipo Integer. La lectura de números termina
cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. A
continuación, el programa mostrará por pantalla el número de valores que se han
leído, su suma y su media (promedio). Por último se mostrarán todos los valores
leídos, indicando cuántos de ellos son mayores que la media. Utilizar los
siguientes 3 métodos para resolver el ejercicio:

• Método leerValores(): pide por teclado los números y los almacena en el ArrayList.
La lectura finaliza cuando se introduce el valor -99. El método devuelve mediante
return el ArrayList con los valores introducidos.
• Método calcularSuma(): Recibe como parámetro el ArrayList con los valores
numéricos y calcula y devuelve su suma. En este método se utiliza un Iterator para
recorrer el ArrayList.
• Método mostrarResultados(): Recibe como parámetro el ArrayList, la suma y la
media aritmética. Este método muestra por pantalla todos los valores, su suma y
su media y calcula y muestra cuantos números son superiores a la media.
*/

package E2;

import java.util.Iterator;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Calculos objeto1 = new Calculos();
    
    public void agregarNumeros(){
        System.out.print("Agregue un número a la lista -> ");
        Integer n = sc.nextInt();
        System.out.println("NOTA: digite '-99' para cortar la petición de números");
        objeto1.addddd(n);    //invoca a -> lista.add();
        
        System.out.print("\nQuiere añadir más números (s/n) -> ");
        String rta = sc.next();
        
        if("s".equals(rta)){
            do{
                System.out.print("Ingrese otro número -> ");
                n = sc.nextInt();
                
                if(n!=-99){
                    objeto1.addddd(n);
                }
            }while(n!=-99);
        }
    }
    
    public void mostrarNumeros(Calculos objeto1){
        System.out.println("--------------------------------");
        System.out.println("Lista de números: ");
        for (Object i : objeto1.getLista()) {
            System.out.println(i);
        }
    }
    
    public Integer sumaNumeros(Calculos objeto1){
        System.out.println("--------------------------------");
        Iterator<Integer> it = objeto1.getLista().iterator();
        Integer s = 0;
        
        while(it.hasNext()){    //mientras haya un número siguiente
            Integer n = it.next();    //
            s += n;
        }
        return s;
        
        //for (Object i : objeto1.getLista()) {
        //s+=i;
        //}
        //objeto1.setSuma();
    }
    
    public Integer promedioNumeros(Calculos objeto1){
        return sumaNumeros(objeto1)/objeto1.sizeeeee();
    }
}
