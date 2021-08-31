package excepciones.Ej_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int oportunidades = 5;
        boolean salida = true;
        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Ingrese un numero entero entre 1 y 500: ");
                int num = sc.nextInt();
                oportunidades--;
                if (calcularPosicion(num)) {
                    System.out.println("Acertaste!! " + "\n -> " + num);
                    salida = false;
                } else {
                    System.out.println("Fallaste, te restan " + oportunidades + " oportunidades");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                oportunidades--;
                System.out.println("Fallaste, te restan " + oportunidades + " oportunidades");
            }
        } while (salida);

    }

    public static boolean calcularPosicion(int num) {
        return num >= 1 && num <= 500;
    }
}
