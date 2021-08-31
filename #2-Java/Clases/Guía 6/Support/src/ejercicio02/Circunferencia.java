/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real.
A continuación se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
d) Método para calcular el perímetro (Perimetro = 2 * PI * radio).
 */

package ejercicio02;

public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /** Metodo para calcular el area
     *
     * @return devuelve el area
     */
    public double calcularArea () {
        
        double area = 3.14 * Math.pow(this.radio, 2);
        
        return area;
                
    }
    
    /** Calcular Perimetro
     *
     * @return
     */
    public double calcularPerim () {
        
        double perim = 2 * 3.14 * this.radio;
        
        return perim;
    }

}
