/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegradorJava;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class CuotaService {

    public static ArrayList<Cuota> crearCuotas(Integer dim, String fdpago) {
        ArrayList<Cuota> cuotas = new ArrayList();
        //no crear los arrayList aqui adentro, pasarlos por parametro o como
        //atributo global sino cada vez que vuelva
        //me creara uno nuevo
        for (int i = 0; i < dim; i++) {
            Cuota c = new Cuota();
            c.setCuotaNro(i+1);
            c.setMontoCuota(200.00);
            c.setPagado(false);
            Date f1 = new Date(2020-1900, 7, 29);
            c.setFechaVto(f1);
            c.setFormaDePago(fdpago);
            cuotas.add(c);
        }
        
        return cuotas;
    }
}
