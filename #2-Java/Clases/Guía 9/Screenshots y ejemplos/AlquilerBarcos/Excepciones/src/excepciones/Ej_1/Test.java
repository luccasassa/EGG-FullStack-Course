package excepciones.Ej_1;

public class Test {
    
    public static void main(String[] args) {
        Persona p = new Persona();
        p = null;
        try {
              System.out.println("¿Es mayor de edad? "  + mayorEdad(p));
        } catch(NullPointerException e) {
            System.out.println(e.toString());
        }
      
    }
    
    public static boolean mayorEdad(Persona p) {
        return p.getEdad() >= 18;
    }
}
