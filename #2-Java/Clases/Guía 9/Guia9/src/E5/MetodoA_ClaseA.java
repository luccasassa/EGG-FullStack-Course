/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

class A {
    void metodoA() {
        sentencia_a1
        sentencia_a2
    try {
        sentencia_a3
        sentencia_a4
    } catch (MioException e){
        sentencia_a6
    }
    sentencia_a5                          //fuera de catch, la ultima llave cierra el void
    }
}

*/

package E5;

public class MetodoA_ClaseA {
    
    public static void main(String[] args) {
        
        System.out.println("a) Se ejecutan las sentencias (en el respectivo orden): 'a1', 'a2', 'a6' y 'a5'.\n"
                        + "b) Se ejecutan las sentencias (en el respectivo orden): 'a1', 'a2', 'a3', 'a4' y 'a5'.");
    }
}
