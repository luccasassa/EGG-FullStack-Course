/*
Defina una clase llamada DivisionNumero. En el método main utilice el método
nextLine() para leer dos números en forma de cadena. A continuación, utilice el
método parseInt() para convertir las cadenas al tipo int y guardarlas en dos
variables de tipo int (numero1 y numero2). Divida numero1 por numero2 y muestre
el resultado. El ingreso por teclado puede causar una excepción de
tipo InputMismatchException. Recordá que el método Integer.parseInt()
convierte números de tipo String a int. Si la cadena no puede
convertirse a entero, arroja una NumberFormatException. Además, al
dividir un número por cero surge una ArithmeticException. Manipule las
posibles excepciones utilizando un bloque de región segura try-catch.
*/

package E4;

import java.util.Scanner;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;

public class ArithmeticException {
    
    public static void main(String[] args) {
        
        
        try{
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese dos números escritos en forma de cadena de caracteres:");
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            
            double numero1 = Integer.parseInt(num1);
            double numero2 = Integer.parseInt(num2);
            double division = (numero1/numero2);
            
            System.out.println("\nLos número son: "+numero1+" y "+numero2+", y la división entre ambos es "+division+".");
            //
        }catch (NumberFormatException e){
            System.err.println("Exception: "+e.getClass());
            System.out.println("No se pueden convertir las palabras en números");
            //
        }
//        catch (ArithmeticException e){
//            System.err.println("Exception: "+e.getClass());
//            System.out.println("No se puede dividir por cero");
//        }
        
        /*
        public static String division(int numero1, int numero2) {
            DecimalFormat df = new DecimalFormat("#.00");
            double resultado = numero1 / numero2;
        
            return df.format(resultado);
        }
        */
    }
}
