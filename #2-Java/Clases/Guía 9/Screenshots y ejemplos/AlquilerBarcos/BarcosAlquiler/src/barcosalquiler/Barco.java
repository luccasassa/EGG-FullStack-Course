package barcosalquiler;

import java.time.LocalDate;


public class Barco extends Alquileres {

    //ATRIBUTOS//
    protected Integer matricula;
    protected Integer eslora;
    protected int anioFabricacion;

    //CONSTRUCTORES VACIO y POR PARAMETRO//
    public Barco() {
        super();
    }

    public Barco(Integer matricula, Integer eslora, int anioFabricacion, String nombre, Integer DNI, LocalDate fechaInicial, LocalDate fechaFinal, int diasTranscurridos, int posAmarre) {
        super(nombre, DNI, fechaInicial, fechaFinal, diasTranscurridos, posAmarre);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    //METODO QUE RETORNA VALOR DE MODULO//
    public int moduloBarco(){
        return (eslora * 10) * 2;
    }
    
    //METODO QUE RETORNA VALOR DE PRECIO FINAL DE BARCO BASE//
    public int precioAlquiler(){
        return super.diasAlquiler(fechaInicial, fechaFinal) * moduloBarco();
    }
    
   
}
