/*
Indique qué se mostrará por pantalla cuando se ejecute cada una de estas clases:
    
public class Uno {
    
    public static void main(String[] args) {
        
        try {
            metodo();
        }catch(Exception e) {
            System.err.println("Excepcion en metodo()") ;
            e.printStackTrace();
        }
    }
    public static void metodo() {
        int valor=0;

        try {
            valor++;
            valor=+Integer.parseInt("42");
            valor++;
            System.out.println("Valor final del try: "+valor);
            
        } catch (NumberFormatException e) {
            valor=+Integer.parseInt("42");
            System.out.println("Valor final del catch: "+valor);

        } finally {
            valor++;
            System.out.println("Valor final del finally: "+valor);
        }

        valor++;
        System.out.println("Valor antes del return: "+valor);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
public class Dos{

    public static void main (String[] args) {
    try{
        metodo();

    } catch(Exception e) {
        System.err.println ("Excepcion en metodo()");
        e.printStackTrace();
    }
}
    private static void metodo() {
        int valor=0;

        try{
            valor++;
            valor=+Integer.parseInt("W");
            valor++;
            System.out.println("Valor final del try: "+valor);

        } catch ( NumberFormatException e ) {
            valor=+Integer.parseInt("42");
            System.out.println("Valor final del catch: "+valor);

        } finally {
            valor++;
            System.out.println("Valor final del finally: "+valor);
        }
        valor++;
        System.out.println("Valor antes del return:"+valor);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
class Tres{
    private static int metodo( ) {
        int valor=0;

        try{
            valor++;
            valor=+Integer.parseInt("W");
            valor++;
            System.out.println("Valor final del try: " + valor);

        } catch(NumberFormatException e) {
            valor=+Integer.parseInt ("W");
            System.out.println("Valor final del catch: "+valor);

        } finally{
            valor++;
            System.out.println("Valor final del finally:"+valor);

        }
        valor++;
        System.out.println("Valor antes del return: "+valor) ;
        return valor;
    }

    public static void main (String[] args) {
        try{
            System.out.println(metodo());

        } catch(Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
}

*/

package E7;

public class ClaseUno_Dos_Tres {
    public static void main(String[] args) {
        System.out.println("Todos andan menos el 3, se rompe");    //verificar
    }
}
