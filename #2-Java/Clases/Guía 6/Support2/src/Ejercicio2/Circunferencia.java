/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para calcular el área de la circunferencia (𝐴𝑟𝑒𝑎 = 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑜!).
d) Método para calcular el perímetro (𝑃𝑒𝑟𝑖𝑚𝑒𝑡𝑟𝑜 = 2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑜).
 */

package Ejercicio2;

public class Circunferencia {
    
    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public Circunferencia(){
        
    }
    
    
}
