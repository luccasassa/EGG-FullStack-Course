/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio37;

import java.util.Scanner;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Estudiante extends Persona{
    
    protected String curso;

    public Estudiante() {
        super();
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nya, Integer id, String estadoCivil) {
        super(nya, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
    @Override
    public String toString() {
        super.toString();
        return "Estudiante: Nombre y Apellido:" + nya + ". ID:" + id + ". Curso: " + curso;
    }

    public Estudiante matriculacionEstudiante() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre y apellido");
        nya = sc.next();
        System.out.println("Ingrese numero ID");
        id = sc.nextInt();
        System.out.println("Ingrese Estado Civil");
        estadoCivil = sc.next();
        System.out.println("Ingrese el curso");
        curso = sc.next();
        
        return this;
    }
}