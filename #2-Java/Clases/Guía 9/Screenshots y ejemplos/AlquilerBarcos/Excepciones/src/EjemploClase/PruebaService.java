package EjemploClase;

public class PruebaService {

    /*
     METODO ejecutarPruebas() LLAMA A dividir() y crearPerro() 
     PERO DEBE UTILIZAR CLÁUSULAS TRY-CATCH PARA PODER ATRAPAR
     LAS EXCEPCIONES A PARTIR DE LA CLASE PruebaException
     */
    public static void ejecutarPruebas() {

        try {
            crearPerro("Lali", "");
            dividir(10, 0);
        } catch (PruebaException e) {
            System.out.println(e.getMessage());
        }

    }

    //METODO dividir() ADVIERTE A METODOS QUE LO INVOQUEN QUE SE PUEDE PRODUCIR UNA EXCEPCION//
    public static void dividir(int a, int b) throws PruebaException {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            throw new PruebaException("No puedes dividir por 0"); //MENSAJE FUNCION COMO ATRIBUTO TIPO STRING//
        }
    }

    /*
     METODO crearPerro() ADVIERTE A METODOS QUE LO INVOQUEN 
     QUE SE PUEDE PRODUCIR UNA EXCEPCION
     */
    public static void crearPerro(String nombre, String raza) throws PruebaException {
        if (nombre.isEmpty()) {
            throw new PruebaException("El casillero de nombre no puede estar vacío"); //MENSAJE FUNCION COMO ATRIBUTO TIPO STRING//
        }
        if (raza.isEmpty()) {
            throw new PruebaException("El casillero de raza no puede estar vacío"); //MENSAJE FUNCION COMO ATRIBUTO TIPO STRING//
        }
    }
}
