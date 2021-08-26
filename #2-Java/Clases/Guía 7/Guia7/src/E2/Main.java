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

public class Main {
    
    public static void main(String[] args) {
        Servicios objeto2 = new Servicios();
        
        objeto2.agregarNumeros();
        objeto2.mostrarNumeros(objeto2.objeto1);
        System.out.println("La suma de los números es -> "+objeto2.sumaNumeros(objeto2.objeto1));
        System.out.println("El promedio de los números es -> "+objeto2.promedioNumeros(objeto2.objeto1));
        
    }
}
