/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array (por
ejemplo mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el
mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que
vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución del programa
podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
*/

package Ejercicioo17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Meses juego = new Meses();
        int cont = 0;
        
        Servicios.SetearMeses(juego);
        
        System.out.println("Adivine cual es el mes secreto");
               
        do{
            juego.setMesSecreto(sc.next());
            cont += 1;
        }while(!juego.getMesSecreto().equals(juego.getMeses()[5]));
        
        System.out.println("Correcto, lo adivinaste con " + cont + " intentos.");
    }

}
