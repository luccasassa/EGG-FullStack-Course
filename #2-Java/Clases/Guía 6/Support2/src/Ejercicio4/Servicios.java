/*
Definir una clase llamada Punto con un constructor que inicialice las coordenadas
x e y. Generar dos instancias, es decir, crear dos objetos llamados punto1 y
punto2 y comprobar la distancia que existe entre ambos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */

package Ejercicio4;

public class Servicios {
    
    public double calculoDistancia(Punto punto1,Punto punto2){
        double resu;
        resu = Math.sqrt(Math.pow((punto2.getX()-punto1.getX()),2)+(Math.pow((punto2.getY()-punto1.getY()),2)));
        return resu;
    }
    
}
