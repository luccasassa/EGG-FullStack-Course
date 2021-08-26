/*
Realizar una clase llamada Matemática que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase
deber tener un constructor mediante el cual se inicialicen ambos valores en cero.
Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
• Método sumaAngulos(), para calcular la suma de dos ángulos:
sen(a+b) = sen(a)*cos(b)+cos(a)*sen(b)
donde a y b son los dos valores que componen la clase.
*/

package E_16;

public class Matematica {
    
    private double num1;
    private double num2;

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    Matematica() {
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
