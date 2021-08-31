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
public abstract class Empleados extends Persona {

    protected Integer anio;
    protected Integer despachoAsign;
    protected String tipoEmpleado;

    public Empleados() {
        super();
    }

    public Empleados(Integer anio, Integer despachoAsign) {
        this.anio = anio;
        this.despachoAsign = despachoAsign;
    }

    public Empleados(Integer anio, Integer despachoAsign, String nya, Integer id, String estadoCivil) {
        super(nya, id, estadoCivil);
        this.anio = anio;
        this.despachoAsign = despachoAsign;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDespachoAsign() {
        return despachoAsign;
    }

    public void setDespachoAsign(Integer despachoAsign) {
        this.despachoAsign = despachoAsign;
    }

    public Integer reasignarDespacho() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nuevo numero de despacho");
        despachoAsign = sc.nextInt();
        return despachoAsign;
    }
    
    @Override
    public String toString() {
        super.toString();
        return "Año de Ingreso: " + anio + ". Despacho Asignado: " + despachoAsign;
    }
}
