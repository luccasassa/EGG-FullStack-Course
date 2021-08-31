
package Ejercicioo18;

public class Arreglos {
    
    private int[] array1 = new int[50];
    private double[] array2 = new double[20];

    public Arreglos(int[] array1, double[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public Arreglos(){
        
    }  

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }
    
    
}
