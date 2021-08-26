/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
pasar que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).

El cambio de divisas son:
* 1.20 dólares es un 1 €
* 0.86 libras es un 1 €
* 110.87 pesos argentinos es un 1 €
*/

package Ejercicios;
import javax.swing.JOptionPane;
public class E_36 {
    
    public static void main(String[] args) {
        
        //double dd,ll,yy; NO ES NECESARIO!
        double euros = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UNA CIFRA EN EUROS (€)"));
        int cambio = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE:\n"
        + "1. Convertir a Dólar (U$D)\n"
        + "2. Convertir a libra (£)\n"
        + "3. Convertir a peso argentino ($)"));
        
        switch (cambio){
            case 1: System.out.println(euros+" euro/s equivale/n a "+dolar(euros)+" dólares estadounidenses");
            break;
            case 2: System.out.println(euros+" euro/s equivale/n a "+libra(euros)+" libras esterlinas");
            break;
            case 3: System.out.println(euros+" euro/s equivale/n a "+peso(euros)+" pesos argentinos");
            break;
            default: System.out.println("Opción NO Encontrada ***PROGRAMA FINALIZADO***");
            break;
        }
    }
    //----------------------------------------------------------------------------
    public static double dolar(double euros){
        double dd=euros*1.20;
        return dd;
    }
    //----------------------------------------------------------------------------
    public static double libra(double euros){
        double ll=euros*0.86;
        return ll;
    }
    //----------------------------------------------------------------------------
    public static double peso(double euros){
        double pp=euros*110.87;
        return pp;
    }
}
