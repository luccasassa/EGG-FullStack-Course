/*
40. Inicializar un objeto de la clase Persona ejercicio 14 a null y tratar de invocar el
método esMayorDeEdad() a través de esta referencia. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser
controlada
 */
package ejercicio40;

import ejercicio14.Persona;

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
        Persona p = null;
        
        try {
            p.esMayorDeEdad();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
    
}
