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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Cliente> listaClientes = ClienteService.crearCliente();
        
        for (Cliente cliente : listaClientes) {
            //System.out.println(cliente);
            ArrayList<Poliza> poliza = cliente.getPolizasCliente();
            System.out.println("");
            
            for (Poliza p: poliza) {
                System.out.println(p);
                System.out.println(p.getCliente());
                System.out.println(p.getVehiculo());
                ArrayList<Cuota> c = p.getCuotas();
                
                for (Cuota cuota : c) {
                    System.out.println(cuota);
                }
                System.out.println("");
            }
        }
    }
    
}
