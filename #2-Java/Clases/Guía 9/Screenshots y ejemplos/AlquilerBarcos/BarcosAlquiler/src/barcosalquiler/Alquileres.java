package barcosalquiler;

import java.time.LocalDate;
import java.time.Period;

public class Alquileres {

    //ATRIBUTOS//
    protected String nombre;
    protected Integer DNI;
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal;
    protected int diasTranscurridos;
    protected int posAmarre;

    //CONSTRUCTORES - VACIO Y POR PARÁMETRO//
    public Alquileres() {
    }

    public Alquileres(String nombre, Integer DNI, LocalDate fechaInicial, LocalDate fechaFinal, int diasTranscurridos, int posAmarre) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.diasTranscurridos = diasTranscurridos;
        this.posAmarre = posAmarre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public void setDiasTranscurridos(int diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }

    public int diasAlquiler(LocalDate fechaInicial, LocalDate fechaFinal) {
        return diasTranscurridos = Period.between(fechaInicial, fechaFinal).getDays();
    }

}
