/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio41;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] array = new Integer[10];
        try {
            for (int i = 0; i < 11; i++) {
                array[i]= i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! ;) ");
            System.out.println(e.fillInStackTrace());
        }
    }
    
}
