/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eje05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tomás
 */
public class Eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Electrodomesticos> listaElectro = new ArrayList();    

        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(2000, 35);
        Lavadora lav3 = new Lavadora(50, 1400, "rojo", "b", 35);
        Lavadora lav4 = new Lavadora();
        Lavadora lav5 = new Lavadora();
        
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(1600, 10);
        Televisor tv3 = new Televisor(50, true, 1350, "azul", "z", 100);
        Televisor tv4 = new Televisor();
        Televisor tv5 = new Televisor();
        
         listaElectro.add(lav1); 
         listaElectro.add(lav2);  
         listaElectro.add(lav3); 
         listaElectro.add(lav4); 
         listaElectro.add(lav5); 
         
         listaElectro.add(tv1); 
         listaElectro.add(tv2); 
         listaElectro.add(tv3); 
         listaElectro.add(tv4); 
         listaElectro.add(tv5); 
         
         
         
        for (Electrodomesticos e : listaElectro) {
            System.out.println("---------------------------------------");
            System.out.println(e.toString());
            System.out.println("el precio final es: " +  e.precioFinal());
            System.out.println("---------------------------------------");  
            if(e instanceof Lavadora  ){
               Lavadora lavad = (Lavadora)e ; 
                System.out.println("la carga es: "+ lavad.getCarga());
                System.out.println("Precio final lavadora " + lavad.precioFinal());
            }
            if(e instanceof Televisor  ){
               Televisor tv = (Televisor)e ; 
                System.out.println("el consumo es: "+ tv.getConsumo());
                System.out.println("Precio final tv " + tv.precioFinal());
            }
            
        }
 
        
        
         
         
         
         
         
         
         
    }
    
}
