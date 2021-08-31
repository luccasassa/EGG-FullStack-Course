/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio43;

import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String num1,num2;
        double total=0;
        
        try {
            num1 = sc.next();
            num2 = sc.next();
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            total = numero1 / numero2;

        } catch (NumberFormatException e) {
            System.out.println("Excepcion NumberFormat: "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Excepcion Arithmetic: "+ e.getMessage());
        } 
        
        System.out.println("Total: "+ total);
    }
    
}
