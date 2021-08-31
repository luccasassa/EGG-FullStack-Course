/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio23;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private Integer legajo;
    private char sexo;
    private String condicion;
    private Double notaFinal;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Integer legajo, char sexo, String condicion, Double notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno " + "Nombre: " + nombre + ". Apellido: " + apellido + ". Legajo N°: " + legajo + ". Sexo:" + sexo + ". Condicion: " + condicion + ". Nota Final: " + notaFinal;
    }    
}
