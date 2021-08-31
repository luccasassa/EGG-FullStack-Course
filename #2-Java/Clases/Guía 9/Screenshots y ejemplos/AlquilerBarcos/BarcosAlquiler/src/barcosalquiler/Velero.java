package barcosalquiler;

import java.time.LocalDate;


public class Velero extends Barco {

    //ATRIBUTOS//
    private Integer numMastiles;

    //CONSTRUCTORES VACIO y POR PARAMETRO//
    public Velero() {
        super();
    }

    public Velero(Integer numMastiles, Integer matricula, Integer eslora, int anioFabricacion, String nombre, Integer DNI, LocalDate fechaInicial, LocalDate fechaFinal, int diasTranscurridos, int posAmarre) {
        super(matricula, eslora, anioFabricacion, nombre, DNI, fechaInicial, fechaFinal, diasTranscurridos, posAmarre);
        this.numMastiles = numMastiles;
    }

    //GET&SET//
    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //METODO QUE RETORNA VALOR DE PRECIO FINAL DE BARCO BASE * EL NUM DE MASTILES//
    @Override
    public int precioAlquiler() {
        return  super.precioAlquiler() * numMastiles;
    }

}
