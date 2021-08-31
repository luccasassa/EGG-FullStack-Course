/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(3,4);
        
        double resultado = distancia(punto1,punto2);
        
        System.out.println("La distancia es " + resultado);
    }
    public static double distancia(Punto a, Punto b) {
        
        double x = (b.getX()-a.getX()); 
        double y = (b.getY()-a.getY());
        
        double potenciaX = Math.pow(x, 2);  
        double potenciaY = Math.pow(y, 2);
        
        double sumaXY = potenciaX + potenciaY;
        
        double distancia = Math.sqrt(sumaXY);
        
        return distancia;
    }
}
