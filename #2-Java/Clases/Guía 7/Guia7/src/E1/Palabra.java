/*
Crear una clase llamada Palabra que mantenga información sobre diferentes
palabras con un atributo ArrayList de tipo String, que se le van a ir agregando
palabras por medio del método add(String). Al final, el programa debe permitirnos
conocer el conjunto de palabras de una determinada longitud ingresada por el
usuario. Este conjunto deberá estar ordenado alfabéticamente. Crear una
aplicación que muestre toda la información que disponga la clase Palabra.
*/

package E1;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private List<String> palabras = new ArrayList();

    public Palabra() {
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }

    public void addddd(String asd){    //se hace unicamente manual
        palabras.add(asd);
    }
    
    public void sizeeeee(){    //se hace unicamente manual
        System.out.println(palabras.size());
    }
}
