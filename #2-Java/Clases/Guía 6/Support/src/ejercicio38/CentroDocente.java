/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio38;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class CentroDocente {

    private ArrayList<Persona> listaCentroComp = new ArrayList();

    public CentroDocente() {
    }


    public ArrayList<Persona> getListaCentroComp() {
        return listaCentroComp;
    }

    public void setListaCentroComp(ArrayList<Persona> listaCompleta) {
        this.listaCentroComp = listaCompleta;
    }

//    public void alta(Persona p) {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("Ingrese Nombre y apellido");
//        p.setNya(sc.next());
//        System.out.println("Ingrese estado civil");
//        p.setEstadoCivil(sc.next());
//        System.out.println("Nuevo despacho:");
//        p.setDespachoAsign(sc.nextInt());
//        System.out.println("Ingrese ID");
//        p.setId(sc.nextInt());
//        p.setAnio(Calendar.YEAR);
//  
//        listaCentroComp.add(p);
//    }


    public void baja(int idBuscado) {
        Iterator<Persona> it = listaCentroComp.iterator();
        
        while (it.hasNext()) {           
            if (it.next().getId().equals(idBuscado)) {
                it.remove();
                System.out.println("Baja Exitosa");
                break;
            } else {
                System.out.println("La persona no pertenece al Centro Docente");
            }
        }
    }
    
    public void mostrar() {
        //esto es igual que un foreach comun!
        listaCentroComp.forEach((persona) -> {
            System.out.println(persona);
        });
    }
}