/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio18;

//import java.text.DecimalFormat;
import java.util.Arrays;

public class Arreglos {
    
    //private int dim;
    private double[] array;
    //private double[] array2;

    public Arreglos() {
    }

    public Arreglos(double[] array) { //int dim,?
        //this.dim = dim;
        this.array = array;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
    
    public double[] inicializar(int dim) {
        // DecimalFormat df = new DecimalFormat("#.00");
        this.array = new double[dim];
        //Arrays.fill(array, Math.round((Math.random()*10)*100d)/100d);
        for (int i = 0; i < array.length; i++) {
            array[i]=  Math.round((Math.random()*10)*100d)/100d;     
        }
        return array;
    }
    
    public double[] ordenar() {
        Arrays.sort(array);
        return array;
    }
    
    public void copiar(double[] ordenado) {
        //double[] array2;
        setArray(Arrays.copyOfRange(ordenado, 0, 20));
        //mostrar();
        Arrays.fill(getArray(), 10, 20, 0.5);        
       // return array2;
    }
    
    public void mostrar() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+array[i] + "]");
        }
        System.out.println("");
    }
}
