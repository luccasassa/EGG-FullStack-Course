
package Ejercicioo15;

public class Cadena {
    
    private String frase;
    private int longitud;
    private String caracter;
    private String cara;

    public Cadena(String frase, int longitud, String caracter, String cara) {
        this.frase = frase;
        this.longitud = longitud;
        this.caracter = caracter;
        this.cara = cara;
    }
    
    public Cadena(){
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }
       
}
