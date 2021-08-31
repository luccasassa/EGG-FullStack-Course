/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegradorJava;

import java.util.ArrayList;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class ClienteService {

    public static ArrayList<Cliente> crearCliente() {
        ArrayList<Cliente> listaClientes = new ArrayList();
        //no crear los arrayList aqui adentro, pasarlos por parametro o como
        //atributo global sino cada vez que vuelva
        //me creara uno nuevo
        //crear cliente deberia crear uno y no muchos
        for (int i = 0; i < 10; i++) {
            Cliente c = new Cliente();
            c.setNombreYApellido("Cliente " + (i+1));
            int rd = (int) (Math.random() * 30000000 + 10000000); 
            c.setDni(rd);
            c.setMail(c.getNombreYApellido().trim().toLowerCase() + "@gmail.com");
            c.setDomicilio("Calle " + (10-i) + " Numero " + i);
            c.setTelefono("99999999");
            
            int rdm = (int) (Math.random() * 3 + 1);
            
            c.setPolizasCliente(PolizaService.polizasPorCliente(rdm,c,c.getPolizasCliente()));
            
            listaClientes.add(c);
        }
        
        
        return listaClientes;
    }
}
