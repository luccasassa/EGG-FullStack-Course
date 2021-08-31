/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio3;

public class Servicios {
    
    public static String Suma(Fraccion fraccion1,Fraccion fraccion2){
        String suma;
        int suma1,suma2;
        suma1 = fraccion1.getX() + fraccion2.getX();
        suma2 = fraccion1.getY() + fraccion2.getY();
        suma = suma1 + "/" + suma2;
        return suma;
    }
    
    public static String Resta(Fraccion fraccion1,Fraccion fraccion2){
        String resta;
        int resta1,resta2;
        resta1 = fraccion1.getX() - fraccion2.getX();
        resta2 = fraccion1.getY() - fraccion2.getY();
        resta = resta1 + "/" + resta2;
        return resta;
    }
    
    public static String Multiplicacion(Fraccion fraccion1,Fraccion fraccion2){
        String multi;
        int multi1,multi2;
        multi1 = fraccion1.getX() * fraccion2.getX();
        multi2 = fraccion1.getY() * fraccion2.getY();
        multi = multi1 + "/" + multi2;
        return multi;
    }
    
    public static String Division(Fraccion fraccion1,Fraccion fraccion2){
        String divi;
        int divi1,divi2;
        divi1 = fraccion1.getX() / fraccion2.getX();
        divi2 = fraccion1.getY() / fraccion2.getY();
        divi = divi1 + "/" + divi2;
        return divi;
    }
}
