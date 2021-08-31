package excepciones.Ej_4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {

    public static void main(String[] args) {
        boolean salida = true;
        do {
            try {
                Scanner sc = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Ingrese dos numeros enteros: ");
                String num1 = sc.nextLine();
                String num2 = sc.nextLine();

                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);

                System.out.println("Resultado -> " + division(numero1, numero2));
                salida = false;
            } catch (InputMismatchException | NumberFormatException | ArithmeticException e) { //MULTI-CATCH//
                System.out.println(e.toString());
            }
        } while (salida);
   
    }

    public static String division(double numero1, double numero2) {
        DecimalFormat df = new DecimalFormat("#.00");
        double resultado = numero1 / numero2;
        return df.format(resultado);
    }
}
