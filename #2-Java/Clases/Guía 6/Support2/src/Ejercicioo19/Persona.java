
package Ejercicioo19;

public class Persona {
    
    private String nombre;
    private int dia;
    private int mes;
    private int año;

    public Persona(String nombre, int dia, int mes, int año) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
