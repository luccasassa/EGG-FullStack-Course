/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio31;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Ejecutable {

    private static Electrodomestico[] arrayElectro = new Electrodomestico[10];
    
    public static void crearElectro() {
        
        for (int i = 0; i < arrayElectro.length ; i++) {
            if (i < 5) {
                Electrodomestico lavadora= new Lavadora();
                arrayElectro[i] = lavadora;
            }
            
            if (i >= 5 && i < 10) {
                Electrodomestico televisor = new Televisor();
                arrayElectro[i] = televisor;
            }
        }
    }
    
    public static void comprobarPrecio() {
        int sumaLavadora = 0;
        int sumaTelevisores = 0;
        int sumaTotal;
        for (Electrodomestico electro : arrayElectro) {
            
            if (electro instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electro;
                System.out.println("Lavadora $" + lavadora.precioFinal()); 
                sumaLavadora += lavadora.precioFinal();
            }
            
            if (electro instanceof Televisor) {
                Televisor televisor = (Televisor) electro;
                System.out.println("Televisor $" + televisor.precioFinal());
                sumaTelevisores += televisor.precioFinal();
            }
        }
        sumaTotal = sumaLavadora + sumaTelevisores;
        System.out.println("Precio Total de Lavadoras: " + sumaLavadora + "\n"
                + "Precio Total de Televisores: " + sumaTelevisores + "\n"
                + "Precio Total Electro: " + sumaTotal);
    }
}
