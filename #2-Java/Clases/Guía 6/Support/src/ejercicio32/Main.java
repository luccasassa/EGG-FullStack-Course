/*
Ahora se debe realizar unas mejoras a la clase Baraja del ejercicio 29. Lo primero
que haremos es que nuestra clase Baraja será la clase padre y será abstracta. Le
añadiremos el número de cartas en total y el número de cartas por palo. El método
crearBaraja() será abstracto.
La clase Carta tendrá un atributo genérico que será el palo de nuestra versión
anterior.
Creamos dos Enumeraciones (ver: https://javadesdecero.es/avanzado/enumerados-enum-ejemplos/ ):

PalosBarEspañola:
OROS
COPAS
ESPADAS
BASTOS

PalosBarFrancesa:
DIAMANTES
PICAS
CORAZONES
TREBOLES

Crear dos clases hijas:
BarajaEspañola: tendrá un atributo boolean para indicar si queremos jugar con las
cartas 8 y 9 (total 48 cartas) o no (total 40 cartas).
BarajaFrancesa: no tendrá atributos, el total de cartas es 52 y el número de cartas
por palo es de 13. Esta clase tendrá dos métodos llamados:
• cartaRoja(Carta<PalosBarFrancesa> c): si el palo es de corazones y
diamantes.
• cartaNegra(Carta<PalosBarFrancesa> c): si el palo es de tréboles y picas.
De la carta modificaremos el método toString().
Si el palo es de tipo PalosBarFrancesa:
La carta número 11 será Jota
La carta numero 12 será Reina
La carta numero 13 será Rey
La carta numero 1 será As
Si el palo es de tipo PalosBarEspañola:
La carta numero 10 será Sota
La carta numero 12 será Caballo
La carta numero 13 será Rey
La carta numero 1 será As
 */
package ejercicio32;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Baraja barajaEspañola = new BarajaEspañola();
//        Baraja barajaFrancesa = new BarajaFrancesa();
        MenuBaraja.menu();
    }
    
}
