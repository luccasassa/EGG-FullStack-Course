/*
26. Desarrollar un simulador del sistema de votación de facilitadores de EGG.
• La clase Simulador debe ser tener un método que retorna un listado de alumnos
generados de manera aleatoria. Las combinaciones de nombre, apellido y dni
deben ser generadas de manera aleatoria. Se sugiere almacenar una lista con
nombres y una lista con apellidos, y luego, que el programa genere
automáticamente de manera aleatoria combinaciones de los mismos.
• Las combinaciones de DNI posibles deben estar dentro de un rango real de
números de documentos.
• Se debe imprimir por pantalla el listado de alumnos.
• El método simular de la clase Simulator recibe el listado de alumnos y para cada
alumno genera tres votos de manera aleatoria. Tener en cuenta que un alumno no
puede votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar un
hashset para resolver esto. Todos los alumnos deben guardarse en una lista de
alumnos.
• El recuento de votos recibe la lista de alumnos votados y comienza a hacer el
recuento de votos utilizando la clase voto. Para hacer el recuento de votos utilizar
la clase hashmap.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben
crear 5 facilitadores suplentes con los 5 segundos alumnos más votados.
 */
package ejercicio26;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        SimuladorVotos.crear();
        SimuladorVotos.menu();
        
    }
    
}
