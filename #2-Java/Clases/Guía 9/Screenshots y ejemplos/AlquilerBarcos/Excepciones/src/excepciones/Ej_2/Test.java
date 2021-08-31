package excepciones.Ej_2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Array v = new Array();
        System.out.println("Ingrese un numero para recorrer el array: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            try {
                System.out.println("-> " + v.getVector()[i]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }    
        }
    }
}
