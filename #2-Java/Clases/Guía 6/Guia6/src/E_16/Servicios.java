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

public class Servicios {
    
    public double devolverMayor(Matematica objeto1){        
        return Math.max(objeto1.getNum1(), objeto1.getNum2());
    }
    
    public double calcularPotencia(Matematica objeto1){
        double exp = Math.round(Math.min(objeto1.getNum1(), objeto1.getNum2()));
        double max = Math.round(Math.max(objeto1.getNum1(), objeto1.getNum2()));
        
        return Math.pow(max, exp);
    }
    
    public double calcularRaiz(Matematica objeto1) {
        double min = Math.abs(Math.min(objeto1.getNum1(), objeto1.getNum2()));
        
        return (Math.sqrt(min));
    }
    
    public double sumaAngulos(Matematica objeto1) {
        return (Math.sin(objeto1.getNum1())*Math.cos(objeto1.getNum2()) + Math.cos(objeto1.getNum1())*Math.sin(objeto1.getNum2()));
    }
}
