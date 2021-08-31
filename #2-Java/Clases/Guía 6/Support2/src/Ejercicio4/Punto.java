/*
Definir una clase llamada Punto con un constructor que inicialice las coordenadas
x e y. Generar dos instancias, es decir, crear dos objetos llamados punto1 y
punto2 y comprobar la distancia que existe entre ambos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */

package Ejercicio4;

public class Punto {
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
