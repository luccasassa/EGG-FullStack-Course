/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio19;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fechaNac;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Persona(String nombre, Date fechaNac, Integer edad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int calcularEdad() {
        Calendar fNac = Calendar.getInstance();
        fNac.setTime(this.fechaNac); //convierto DATE a Calendar
        Calendar today = Calendar.getInstance();  //obtengo la fecha de hoy
        //resto al año de hoy, el año dado por el usuario
        this.edad = today.get(Calendar.YEAR) - fNac.get(Calendar.YEAR);
        return edad;
    }
    
    public Boolean menorQue() {
        return true; //arreglar, no es asi!
    }
  
}
