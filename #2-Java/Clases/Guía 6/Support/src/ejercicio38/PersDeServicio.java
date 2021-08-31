/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio38;

import java.util.Scanner;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class PersDeServicio extends Empleados{
    
    protected String seccion;

    public PersDeServicio() {
        super();
    }

    public PersDeServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersDeServicio(String seccion, Integer anio, Integer despachoAsign) {
        super(anio, despachoAsign);
        this.seccion = seccion;
    }

    public PersDeServicio(String seccion, Integer anio, Integer despachoAsign, String nya, Integer id, String estadoCivil) {
        super(anio, despachoAsign, nya, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        super.toString();
        return "Personal De Servicio: Nombre y Apellido: " + nya + ". ID: " + id + ". Seccion: " + seccion;
    }
    
    public void trasladoDeSeccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nueva seccion del personal de servicio"); 
        seccion = sc.nextLine();
    }
}