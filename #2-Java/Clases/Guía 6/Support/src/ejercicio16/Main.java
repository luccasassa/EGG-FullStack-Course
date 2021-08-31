/*
 Realizar una clase llamada Matemática que tenga como atributos dos números
 reales con los cuales se realizarán diferentes operaciones matemáticas. La clase
 deber tener un constructor mediante el cual se inicialicen ambos valores en cero.
 Deberá además implementar los siguientes métodos:
 • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
 • calcular potencia() para calcular la potencia del mayor valor de la clase elevado al
 menor número. Previamente se deben redondear ambos valores.
 • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 • Método sumaAngulos(), para calcular la suma de dos ángulos:
 sen(a+b) = sen(a)*cos(b)+cos(a)*sen(b)
 donde a y b son los dos valores que componen la clase.
 */
package ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        Matematica cuenta = new Matematica();
        MathService service = new MathService();

        //el metodo service.creacuenta() es lo mismo que el sout comentado
        service.crearcuenta(cuenta);

//        System.out.println("Dame un numero");
//        cuenta.setN1(sc.nextDouble());
//      System.out.println("Dame otro numero");
//        cuenta.setN2(sc.nextDouble());
        System.out.println("Te paso estos datos...");
        System.out.println("El numero mayor es: " + service.devolverMayor(cuenta));
        System.out.println("El numero mayor elevado al menor es: " + service.potencia(cuenta));
        System.out.println("La raíz cuadrada del menor es: " + service.calcularRaiz(cuenta));
        System.out.println("La suma de sus ángulos da: " + service.sumaAngulos(cuenta));

        //Linea de codigo de demostracion del uso de getters..
        //System.out.println(cuenta.getN1());
    }

}
