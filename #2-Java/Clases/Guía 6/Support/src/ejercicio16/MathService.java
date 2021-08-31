/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio16;

import java.util.Scanner;


public class MathService {
    
    /*Método devolverMayor() para retornar cuál de los dos atributos tiene 
    el mayor valor*/
    public double devolverMayor(Matematica cuenta) {
        return (Math.max(cuenta.getN1(), cuenta.getN2()));
    }

    /*calcular potencia() para calcular la potencia del mayor valor de la 
clase elevado al menor número. Previamente se deben redondear ambos valores.*/
    public double potencia(Matematica cuenta) {
        double exp = Math.round(Math.min(cuenta.getN1(), cuenta.getN2()));
        double max = Math.round(Math.max(cuenta.getN1(), cuenta.getN2()));
        //min = Math.round(min);
        //exp = Math.round(exp);
       //double potencia = Math.pow(min, exp);
       //return potencia;
       return Math.pow(max, exp); 
    }
    
    /* Método calculaRaiz(), para calcular la raíz cuadrada del menor de los 
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
    absoluto del número.*/
    public double calcularRaiz(Matematica cuenta) {
        double min = Math.abs(Math.min(cuenta.getN1(), cuenta.getN2()));
        //min = Math.abs(min);
        return (Math.sqrt(min));
    }
    
    /* Método sumaAngulos(), para calcular la suma de dos ángulos:
    sen(a+b) = sen(a)*cos(b)+cos(a)*sen(b)
    donde a y b son los dos valores que componen la clase.*/
    public double sumaAngulos(Matematica cuenta) {
        return (Math.sin(cuenta.getN1())*Math.cos(cuenta.getN2()) + Math.cos(cuenta.getN1())*Math.sin(cuenta.getN2()));
    }
    
    public Matematica crearcuenta(Matematica cuenta) {
        Scanner sc = new Scanner(System.in);
       //Matematica cuenta = new Matematica();
        System.out.println("Dame un numero");
        cuenta.setN1(sc.nextDouble());
        System.out.println("Dame otro numero");
        cuenta.setN2(sc.nextDouble());
        
        return cuenta;
    }
}
