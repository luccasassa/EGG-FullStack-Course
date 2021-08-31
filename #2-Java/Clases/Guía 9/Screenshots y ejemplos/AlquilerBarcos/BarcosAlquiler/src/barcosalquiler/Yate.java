package barcosalquiler;

import java.time.LocalDate;

public class Yate extends Barco {
    //ATRIBUTOS//
    private Integer potenciaCV;
    
    //CONSTRUCTORES VACIO y POR PARAMETRO//
    public Yate() {
        super();
    }

    public Yate(Integer potenciaCV, Integer matricula, Integer eslora, int anioFabricacion, String nombre, Integer DNI, LocalDate fechaInicial, LocalDate fechaFinal, int diasTranscurridos, int posAmarre) {
        super(matricula, eslora, anioFabricacion, nombre, DNI, fechaInicial, fechaFinal, diasTranscurridos, posAmarre);
        this.potenciaCV = potenciaCV;
    }

    //GET&SET//
    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public int precioAlquiler() {
    return super.precioAlquiler() * potenciaCV;
    } 
    
}
