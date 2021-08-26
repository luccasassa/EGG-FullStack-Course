/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un
arreglo de 50 números reales, y el segundo, un arreglo de 20 números, también
reales. El programa deberá inicializar el arreglo con números aleatorios y
mostrarlo por pantalla. Luego, el arreglo se debe ordenar de menor a mayor y
copiar los primeros 10 números ordenados al segundo arreglo de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
resultantes: el ordenado de 50 elementos y el combinado de 20.
*/

package E_18;

public class Arreglos {
    
    private double[] array1 = new double[50];
    private double[] array2 = new double[20];

    public Arreglos(double[] array1, double[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public Arreglos(){
    }  

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }
}
