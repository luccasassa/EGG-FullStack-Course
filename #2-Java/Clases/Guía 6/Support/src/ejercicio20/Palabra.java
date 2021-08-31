package ejercicio20;

public class Palabra {
    private String palabra;
    private Integer longitud;

    public Palabra() {
    }

    public Palabra(String palabra, Integer longitud) {
        this.palabra = palabra;
        this.longitud = longitud;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
    
    
}
