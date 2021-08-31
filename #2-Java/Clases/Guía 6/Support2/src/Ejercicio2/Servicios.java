/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;

public class Servicios {
    
    public double areaCircunferencia(double radio){
        double area = Math.PI * (Math.pow(radio,2));
        return area;
    }
    
    public static double perimetroCircunferencia(Circunferencia circulo){
        double perimetro = 2*Math.PI*circulo.getRadio();
        return perimetro;
    }
    
}
