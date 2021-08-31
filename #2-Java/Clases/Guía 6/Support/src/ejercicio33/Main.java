/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        int dni, matricula, anioFabrica, mastiles, potencia, camarotes, posAmarre;
        double eslora, a;
        String fechaInicial;
        String fechaFinal;
        System.out.println("ingrese fecha inicial: ");
        fechaInicial = sc.next();
        System.out.println("ingrese fecha final: ");
        fechaFinal = sc.next();
        System.out.println("ingrese eslora en metros: ");
        eslora = sc.nextInt();
        System.out.println("ingrese nombre: ");
        nombre = sc.next();
        System.out.println("ingrese dni: ");
        dni = sc.nextInt();
        System.out.println("ingrese año de fabricacion: ");
        anioFabrica = sc.nextInt();
        System.out.println("ingrese numero mastiles: ");
        mastiles = sc.nextInt();
        System.out.println("ingrese potencia: ");
        potencia = sc.nextInt();
        System.out.println("ingrese numero de camarotes: ");
        camarotes = sc.nextInt();
        System.out.println("ingrese posicion de amarre: ");
        posAmarre = sc.nextInt();
        System.out.println("ingrese matricula: ");
        matricula = sc.nextInt();

        Calendar fechaInicio = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fechaInicio.setTime(dateFormat.parse(fechaInicial));

        Calendar fechaFin = Calendar.getInstance();
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        fechaFin.setTime(dateFormat2.parse(fechaFinal));

        TiposDeBarcos tipoBarco = new TiposDeBarcos(mastiles, potencia, camarotes, matricula, eslora, anioFabrica);
        Alquiler alquiler = new Alquiler(dni, fechaInicio, fechaFin, posAmarre, tipoBarco, mastiles, potencia, camarotes, matricula, Double.NaN, anioFabrica);

        if (mastiles > 0) {
            a = ((alquiler.precioAlquiler()) * (tipoBarco.yateOdeportivo()));
            System.out.println("el precio del alquiler es: " + a);
        }
    }

}
