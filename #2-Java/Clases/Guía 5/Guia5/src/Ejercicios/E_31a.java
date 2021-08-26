/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función contains() y replace() de Java
*/

package Ejercicios;
public class E_31a {
    
    public static void main(String[] args) {
        
        String num1 = "", num2 = "", num3 = "";
        //boolean encontro = true;

        for (int i=0; i<=9; i++) {
            for (int j=0; j<=9; j++) {
                for (int k=0; k<=9; k++) {

                    num1 = Integer.toString(i);
                    num2 = Integer.toString(j);
                    num3 = Integer.toString(k);

                    if (num1.contains("3")) {
                        num1 = num1.replace("3", "E");
                    }
                    if (num2.contains("3")) {
                        num2 = num2.replace(num2, "E");
                    }
                    if (num3.contains("3")) {
                        num3 = num3.replace(num3, "E");
                    } System.out.println((num1) + "-" + (num2) + "-" + (num3));
                }
            }
        }
    }
}
