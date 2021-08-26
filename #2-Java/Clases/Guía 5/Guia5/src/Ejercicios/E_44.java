/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
*/

package Ejercicios;
public class E_44 {
    
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el tamaño de su vector");
        int num=read.nextInt();
        int[] vector=new int [num];
        
        relleno(vector);
        System.out.println("Imprimiendo por pantalla..");
        imprimo(vector);
    }
    
    public static int relleno(int[] vector){    //vector como argumento o parámetro
        for (int i=0; i<vector.length; i++) {    //vector en bucle de una función
            vector[i]=(int) (Math.random()*10);
        }
        return vector.length;    //vector como retorno
    }
    
    public static int imprimo(int[] vector){
        for (int i=0; i<vector.length; i++) {
            System.out.println("vector"+"["+vector[i]+"]");
        }
        return vector.length;
    }
}
