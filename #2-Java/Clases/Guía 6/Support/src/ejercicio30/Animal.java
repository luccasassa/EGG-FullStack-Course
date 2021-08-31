/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio30;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public abstract class Animal {
    
    protected String nombre;
    protected Integer edad;
    protected String raza;
    protected String alimento;
    

    public Animal(String nombre, Integer edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    public abstract String Alimentarse();

}
