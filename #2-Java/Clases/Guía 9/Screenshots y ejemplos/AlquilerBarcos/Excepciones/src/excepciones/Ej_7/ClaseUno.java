package excepciones.Ej_7;

public class ClaseUno {
    public static int metodo(){
        int valor = 0;
        try {
            valor += 1;
            valor += Integer.parseInt("24");
            valor += 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor += Integer.parseInt("42");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor += 1;
            System.out.println("Valor final del finally" + valor);
        }
        
        valor += 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
