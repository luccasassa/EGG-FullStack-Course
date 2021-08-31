package barcosalquiler;

import java.time.LocalDate;

public class Deportivo extends Barco {
    //ATRIBUTOS//
    private Integer potenciaCV;
    private Integer numCamarotes;
    
    //CONSTRUCTORES//
    public Deportivo() {
        super();
    }

    public Deportivo(Integer potenciaCV, Integer numCamarotes, Integer matricula, Integer eslora, int anioFabricacion, String nombre, Integer DNI, LocalDate fechaInicial, LocalDate fechaFinal, int diasTranscurridos, int posAmarre) {
        super(matricula, eslora, anioFabricacion, nombre, DNI, fechaInicial, fechaFinal, diasTranscurridos, posAmarre);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

   
    //GET&SET//
    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    @Override
    public int precioAlquiler(){
        return super.precioAlquiler() * potenciaCV * numCamarotes;
    }
}
