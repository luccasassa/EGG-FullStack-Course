/*
Inicializar un objeto de la clase Clase ejercicio 14 a null y tratar de invocar el
método esMayorDeEdad() a través de esta referencia. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
*/

package E1;

public class NullPointerException {

    public static void main(String[] args) {
        
        try {
            Clase objeto1 = new Clase();
            Clase objeto2 = null;
            
            objeto1.sumatorio();    //lista no inicializada
            objeto2.sumatorio();    //objeto no inicializado
        } catch(Exception e) {
            System.err.println("Exception -> "+e.getClass());    //mostrar exception
            System.out.println("Lista y/u objeto no inicializado/s");
        }
    }
}
