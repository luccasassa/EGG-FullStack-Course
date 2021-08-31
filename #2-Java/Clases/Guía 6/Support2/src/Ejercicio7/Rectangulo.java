/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado alto y un atributo privado largo, dados por el usuario. La clase también
incluirá un método para calcular la superficie del rectángulo, un método para
calcular el perímetro del rectángulo y otro que desplace el rectángulo en el plano.
Y por último tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos
getters, setters y constructores correspondientes.
Formulas: 𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 𝑏𝑎𝑠𝑒 ∗ 𝑎𝑙𝑡𝑢𝑟𝑎 / 𝑃𝑒𝑟í𝑚𝑒𝑡𝑟𝑜 = (𝑏𝑎𝑠𝑒 + 𝑎𝑙𝑡𝑢𝑟𝑎) ∗ 2.
 */

package Ejercicio7;

public class Rectangulo {
    
    private int alto;
    private int largo;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }
    
    public Rectangulo(){
        
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    
}
