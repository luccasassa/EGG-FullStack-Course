package EjemploClase;

public class PruebaException extends Exception {
//EJEMPLO DE CLASE EXCEPTION CREADA POR NOSOTROS//

    //CONSTRUCTOR VACIO//
    public PruebaException() {
    }

    /*CONSTRUCTOR POR PARÁMETRO, PASA
    UN STRING PERSONALIZADO CON UN MENSAJE DE ERROR*/
    
    public PruebaException(String msg) {
        super(msg);
    }
}
