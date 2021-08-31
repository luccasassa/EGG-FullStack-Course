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

package Ejercicioo16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Matematica mate1 = new Matematica();
        
        System.out.println("Ingrese dos numeros para realizar los calculos");
        mate1.setNum1(sc.nextInt());
        mate1.setNum2(sc.nextInt());
        
        System.out.println("El numero mayor es el " + Servicios.devolverMayor(mate1));
        System.out.println("La potencia del mayor numero al menor numero es " + Servicios.calcularPotencia(mate1));
        System.out.println("La raiz cuadrada del numero mas chico es " + Servicios.calcularRaiz(mate1));
        System.out.println("La suma de los angulos es " + Servicios.sumarAngulos(mate1));
        
    }

}
