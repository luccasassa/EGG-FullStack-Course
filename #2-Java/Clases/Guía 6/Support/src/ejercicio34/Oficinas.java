package ejercicio34;

public class Oficinas implements Edificio {
    
    private Integer numOficinas;
    private Double base;
    private Double altura;

    public Oficinas() {
    }

    public Oficinas(Integer numOficinas, Double base, Double altura) {
        this.numOficinas = numOficinas;
        this.base = base;
        this.altura = altura;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    @Override
    public Double getSuperficieEdificio() {
        return (base*altura);
    }

    @Override
    public String toString() {
        return "Numero de Oficinas: " + numOficinas;
    }
}
