/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio37;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Persona {
    
    protected String nya;
    protected Integer id;
    protected String estadoCivil;
    ;

    public Persona() {
    }

    public Persona(String nya, Integer id, String estadoCivil) {
        this.nya = nya;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNya() {
        return nya;
    }

    public void setNya(String nya) {
        this.nya = nya;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String cambioEstadoCivil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nuevo estado civil");
        estadoCivil = sc.nextLine();
        return estadoCivil;
    }
    @Override
    public String toString() {
        return "Nombre y Apellido: " + nya + ". ID: " + id + ". Estado Civil: " + estadoCivil;
    }
}