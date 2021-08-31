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
public class PolizaService {
    
    public static ArrayList<Poliza> polizasPorCliente(Integer n, Cliente c, ArrayList<Poliza> polizas) {
        //rrayList<Poliza> polizaCliente = new ArrayList();
        //no crear los arrayList aqui adentro, pasarlos por parametro o como
        //atributo global sino cada vez que vuelva
        //me creara uno nuevo
        for (int i = 0; i < n; i++) {
            Poliza p = new Poliza();
            p.setCantCuotas(3);
            int rdm = (int) (Math.random() * 199 + 1);
            p.setNumPoliza(rdm);
            Date f1 = new Date(2020-1900, 5, 10);
            p.setFechaInicio(f1);
            Date f2 = new Date(2030-1900, 5, 10);
            p.setFechaFin(f2);
            p.setFormaDePago("efectivo");
            int rdmMonto = (int) (Math.random() * 100000 + 25000);
            p.setMontoAsegurado(rdmMonto);
            p.setSeguroGranizo(false);
            p.setMontoMaxGranizo(0);
            p.setTipoDeCobertura("terceros");
            p.setCliente(c);
            p.setVehiculo(VehiculoService.crearVehiculo());
            p.setCuotas(CuotaService.crearCuotas(p.getCantCuotas(), p.getFormaDePago()));
            polizas.add(p);
        }
        
        return polizas;
    }

}
