/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).

   1 2 3        1 4 7                                0  1 -2
A= 4 5 6    AT= 2 5 8     EJEMPLO MATRIZ SIMÉTRICA=  1  3  0
   7 8 9        3 6 9                               -2  0  5
*/

package Ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E_48b {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int a,b;
        boolean simetrica = true;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));

        int matriz[][] = new int[a][b];

        System.out.println("Rellene una matriz");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Posición["+i+"]["+j+"]: ");
                matriz[i][j] = read.nextInt();
            }
        }

        if (a == b) {
            int i = 0;
            while (i<a && simetrica==true) {
                int j = 0;
                while (j<i && simetrica==true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica==true) {
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }
    }
}
