/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

class B {
    void metodoB() {
        sentencia_b1

        try {
            sentencia_b2
        } catch (MioException e){
            sentencia_b3
        }
        finally
            sentencia_b4                  //se me hace que falta una llave
        }
    }
}

*/

package E6;

public class MetodoB_ClaseB {
    
    public static void main(String[] args) {
        
        System.out.println("a) Se ejecutan las sentencias (en el respectivo orden): 'a1', 'a2' y 'a6'.\n"
                        + "b) Se ejecutan las sentencias (en el respectivo orden): 'a1', 'a2', 'a3' y 'a4'.");
    }
}
