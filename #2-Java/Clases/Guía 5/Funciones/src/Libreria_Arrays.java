/*
- binarySearch: Busca un valor que le pasamos por parámetro, devuelve su posición. Debe estar ordenado.
- copyOf: Copia un array y lo devuelve en un nuevo array.
- copyOfRange: Copia un array y lo devuelve en un nuevo array. Le indicamos la posición de origen y de destino.
- equals: Indica si dos arrays son iguales.
- fill: Rellena un array con un valor que le indiquemos como parámetro.
- sort: Ordena el array.
- toString: Muestra el contenido del array pasado como parámetros.
*/

import java.util.Arrays;
public class Libreria_Arrays {
 
    public static void main(String[] args) {
        int num[]={8, 10, 15, 20, 21, 25, 30, 32, 40, 41};
         
        //Devuelve un 4
        System.out.println("Metodo binarySearch: "+Arrays.binarySearch(num, 21));
        //Copia el array num hasta la quinta posicion(este ultimo no incluido), devuelve un array
        int num2[] = Arrays.copyOf(num, 4);
        System.out.println("Metodo copyOf ");
        //Lo recorremos para ver que lo realiza correctamente
        muestraArray(num2);
        System.out.println("------------------");
         
        //Copia el array num de la tercera hasta la octava posicion, devuelve un array
        int num3[] = Arrays.copyOfRange(num, 2, 6);
        System.out.println("Metodo copyOfRange");
        muestraArray(num3);
        System.out.println("------------------");
         
        //Compara si num1 y num2 no son iguales
        System.out.println("Metodo equals: "+Arrays.equals(num, num2));
        
        System.out.println("Metodo fill");
        Arrays.fill(num3, 5);
        muestraArray(num3);
        System.out.println("------------------");
         
        System.out.println("Metodo toString");
        System.out.println(Arrays.toString(num));
    }
    //-------------------------------------------------------------------------------------------------
    public static void muestraArray(int num[]){
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
