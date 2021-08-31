/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Calculos {
    
    //Todo lo comentado fue para demostrar como seria teniendo las cosas como
    //atributos de la clase != a lo que pide el ejercicio per se
//    private static ArrayList<Integer> listaNum = new ArrayList<>();
//    private static Integer suma;
//    private static Integer media;

//    public static ArrayList<Integer> getListaNum() {
//        return listaNum;
//    }
//
//    public static void setListaNum(ArrayList<Integer> listaNum) {
//        Calculos.listaNum = listaNum;
//    }
//    
    
    
    public static ArrayList leerValores() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaNum = new ArrayList<>();
        System.out.println("Ingrese un numero (-99 para finalizar)");
        Integer n = sc.nextInt();
        listaNum.add(n);

        while (n != -99) {
            System.out.println("Ingrese otro numero");
            n = sc.nextInt();
            if (n != -99) {
                listaNum.add(n);
            }
            
            //if (n == -99)  listaNum.remove(n);
        }

        return listaNum;
    }

    public static Integer calcularSuma(List listaNum) {
        Integer suma = 0;
        Iterator it = listaNum.iterator();
        while (it.hasNext()) {
            Integer ob = (Integer) it.next();
            suma += ob;
        }
        
        return suma;
    }
    
    public static double calcularMedia(List listaNum, Integer suma) {
        return suma / listaNum.size();  
    }
    
    public static void mostrarResultados(List listaNum, Integer suma, double media) {
        System.out.println("La suma de todos los numeros es " + suma);
        System.out.println("La media es: " + media);
        
        int n = 0;
        for (Iterator it = listaNum.iterator(); it.hasNext();) {
            Integer num = (Integer) it.next();
            if (num > media) {
                n++;
            }
        }
        System.out.println("Hay " + n + " numeros superiores a la media.");
    }

}
