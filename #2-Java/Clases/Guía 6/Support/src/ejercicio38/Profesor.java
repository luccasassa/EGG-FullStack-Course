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
public class Profesor extends Empleados {

    protected String departamento;

    public Profesor() {
        super();
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, Integer anio, Integer despachoAsign) {
        super(anio, despachoAsign);
        this.departamento = departamento;
    }

    public Profesor(String departamento, Integer anio, Integer despachoAsign, String nya, Integer id, String estadoCivil) {
        super(anio, despachoAsign, nya, id, estadoCivil);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        super.toString();
        return "Profesor: Nombre y Apellido:" + nya + ". ID:" + id + ". Departamento: " + departamento;
    }

    public void cambioDepartamento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nuevo departamento");
        departamento = sc.nextLine();
    }  
}
