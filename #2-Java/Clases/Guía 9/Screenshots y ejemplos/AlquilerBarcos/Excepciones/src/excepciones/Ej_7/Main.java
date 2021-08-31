package excepciones.Ej_7;


public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(ClaseUno.metodo());
        } catch(Exception e) {
            System.err.println("Excepcion en metodo()");
        }
    }

}
