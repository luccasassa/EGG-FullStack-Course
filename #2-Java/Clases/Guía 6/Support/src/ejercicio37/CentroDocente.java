/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio37;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class CentroDocente {

    private ArrayList<Profesor> listaProf = new ArrayList();
    private ArrayList<PersDeServicio> listaPersServ = new ArrayList();
    private ArrayList<Estudiante> listaEstud = new ArrayList();
    private ArrayList<Persona> listaCentroComp = new ArrayList();

    public CentroDocente() {
    }


    public ArrayList<Profesor> getListaProf() {
        return listaProf;
    }

    public void setListaProf(ArrayList<Profesor> listaProf) {
        this.listaProf = listaProf;
    }

    public ArrayList<PersDeServicio> getListaPersServ() {
        return listaPersServ;
    }

    public void setListaPersServ(ArrayList<PersDeServicio> listaPersServ) {
        this.listaPersServ = listaPersServ;
    }

    public ArrayList<Estudiante> getListaEstud() {
        return listaEstud;
    }

    public void setListaEstud(ArrayList<Estudiante> listaEstud) {
        this.listaEstud = listaEstud;
    }

    public ArrayList<Persona> getListaCentroComp() {
        return listaCentroComp;
    }

    public void setListaCentroComp(ArrayList<Persona> listaCompleta) {
        this.listaCentroComp = listaCompleta;
    }

    public void alta(Profesor profesor) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese Nombre y apellido");
        profesor.setNya(sc.next());
        System.out.println("Ingrese estado civil");
        profesor.setEstadoCivil(sc.next());
        System.out.println("Nuevo despacho:");
        profesor.setDespachoAsign(sc.nextInt());
        System.out.println("Ingrese ID");
        profesor.setId(sc.nextInt());
        profesor.setAnio(Calendar.YEAR);
        listaProf.add(profesor);
        listaCentroComp.add(profesor);
    }

    public void alta(Estudiante e) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese Nombre y Apellido");
        e.setNya(sc.next());
        System.out.println("Ingrese Curso");
        e.setCurso(sc.next());
        System.out.println("Ingrese Estado Civil");
        e.setEstadoCivil(sc.next());
        System.out.println("Ingrese ID");
        e.setId(sc.nextInt());
        listaEstud.add(e);
        listaCentroComp.add(e);
    }

    public void alta(PersDeServicio ps) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese Seccion");
        ps.setSeccion(sc.next());
        System.out.println("Ingrese Nombre y apellido");
        ps.setNya(sc.next());
        System.out.println("Ingrese estado civil");
        ps.setEstadoCivil(sc.next());
        System.out.println("Nuevo despacho:");
        ps.setDespachoAsign(sc.nextInt());
        System.out.println("Ingrese ID");
        ps.setId(sc.nextInt());
        ps.setAnio(Calendar.YEAR);
        listaPersServ.add(ps);
        listaCentroComp.add(ps);
    }

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