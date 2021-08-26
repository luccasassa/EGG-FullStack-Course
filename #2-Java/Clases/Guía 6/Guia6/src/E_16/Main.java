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
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Matematica objeto1 = new Matematica();
        Servicios objeto2 = new Servicios();
        
        System.out.println("Ingrese dos números para operar con ellos");
        objeto1.setNum1(sc.nextDouble());
        objeto1.setNum2(sc.nextDouble());
        
        System.out.println("\nEl número mayor entre ambos es "+objeto2.devolverMayor(objeto1));
        System.out.println("\nEl número mayor elevado al número menor es "+objeto2.calcularPotencia(objeto1));
        System.out.println("\nLa raíz cuadrada del número menor es "+objeto2.calcularRaiz(objeto1));
        System.out.println("\nLa suma de sus ángulos da "+objeto2.sumaAngulos(objeto1));
        
        
    }
}
