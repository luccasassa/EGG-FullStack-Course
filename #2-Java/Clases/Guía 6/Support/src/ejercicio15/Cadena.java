    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio15;

public class Cadena {
    
    private String frase;
    private Integer longitud;

    public Cadena() {
    }

    /*La clase deber tener un constructor mediante el cual se
    inicialice la frase, con una o más palabras ingresadas por el usuario
    (separadas entre sí por un espacio en blanco) y se inicialice de manera
    automática su longitud.*/
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud= frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
}
