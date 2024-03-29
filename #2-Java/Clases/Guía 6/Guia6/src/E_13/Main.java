/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
contener un vector con la palabra a buscar y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos con los parámetros que
sean necesarios:
• Un método para mostrar la longitud de la palabra que se debe encontrar.
• Un método para buscar si una letra ingresada por el usuario es parte de la palabra o
no.
• Un método para informar error o acierto.
• Un método para mostrar cuantas oportunidades le queda al jugador.
• Un método que al pedir ingresar una letra muestre que letras han sido encontradas y
en qué posición. Además, se debe mostrar también cuántas oportunidades quedan.
• Un método para buscar si se encontró la palabra completa.
• En el método main() se deberá pedir al usuario una letra hasta que el usuario haya
gastado todas sus oportunidades o bien hasta que encuentre la palabra.
Un ejemplo de salida puede ser así:
Longitud de la palabra: 6
Ingrese una letra:
a
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas,faltantes): (3,4)
Número de oportunidades restantes: 3
Estado Actual: a a a
----------------------------------------------
Ingrese una letra:
z
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas,faltantes): (3,4)
Número de oportunidades restantes: 2
Estado Actual: a a a
----------------------------------------------
Ingrese una letra:
b
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas,faltantes): (3,4)
Número de oportunidades restantes: 2
Estado Actual: a a b a
----------------------------------------------
Ingrese una letra:
u
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas,faltantes): (3,4)
Número de oportunidades restantes: 1
Estado Actual: a a a
----------------------------------------------
Ingrese una letra:
q
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
*/

package E_13;

public class Main {
    
    public static void main(String[] args) {
        
    }
}
