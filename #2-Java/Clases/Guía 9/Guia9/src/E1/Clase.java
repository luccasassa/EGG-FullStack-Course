/*
Inicializar un objeto de la clase Clase ejercicio 14 a null y tratar de invocar el
método esMayorDeEdad() a través de esta referencia. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
*/

package E1;

import java.util.ArrayList;

public class Clase {
    
    private ArrayList <Integer> lista;    //mal inicializada
    
    public Clase () {
    }
    
    public void sumatorio () {
        
        int suma = 0;
        
        for (Integer i : lista) {    //Integer igual que cuando se creó la lista (line 14)
            suma =+ i;
        }
        
        lista.add(suma);
    }
}
