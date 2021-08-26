/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación se deben crear los siguientes métodos:

a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para calcular el área de la circunferencia (Área = 𝜋 ∗ radio²).
d) Método para calcular el perímetro (Perímetro = 2 ∗ 𝜋 ∗ radio).
*/

package E2;

public class Circunferencia {
    
    //ATRIBUTOS
    private double radio;
    
    //BOB EL CONSTRUCTOR
    public Circunferencia(double radio){
        this.radio=radio;
    }
    
    //SETTER (a)
    public void setRadio(double radio){    //SETEA(modifica) EL VALOR DEL ATRIBUTO APODO
        this.radio = radio;
    }
    //GETTER
    public double getRadio(){    //(b)
        return radio;
    }
    
    //CALCULAR AREA
    public double Area(){    //(c)    //no se agregan parámetros, copia el valor del atributo
        double area = 3.14*Math.pow(radio,2);
        return area;
    }
    
    //CALCULAR PERÍMETRO
    public double Perimetro(){    //(d)    //no se agregan parámetros, copia el valor del atributo
        double perimetro=2*3.14*radio;
        return perimetro;
    }
}
