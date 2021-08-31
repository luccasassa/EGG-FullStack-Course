/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un
arreglo de 50 números reales, y el segundo, un arreglo de 20 números, también
reales. El programa deberá inicializar el arreglo con números aleatorios y
mostrarlo por pantalla. Luego, el arreglo se debe ordenar de menor a mayor y
copiar los primeros 10 números ordenados al segundo arreglo de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package ejercicio18;

public class Main {

    public static void main(String[] args) {
               
        Arreglos array1 = new Arreglos();
        Arreglos array2 = new Arreglos();
       
        array1.inicializar(50);
        //System.out.println("Array2");
       
        array2.inicializar(20);
        //array2.mostrar();
       
        double[] ordenado = array1.ordenar();
        //array2.copiar(array1.array2);
        array2.copiar(ordenado);
        
        System.out.println("Array 1");
        array1.mostrar();
        System.out.println("\nArray 2");
        array2.mostrar();
    }
}
