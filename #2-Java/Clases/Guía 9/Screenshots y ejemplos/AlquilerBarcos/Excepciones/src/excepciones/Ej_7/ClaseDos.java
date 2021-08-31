package excepciones.Ej_7;

public class ClaseDos {
    public static int metodo() {
        int valor = 0;
        try {
           valor += 1;
           valor += Integer.parseInt("W");
           valor += 1;
            System.out.println("Valor final del try " + valor);
        } catch(NumberFormatException e) {
            
        }
    }
}
