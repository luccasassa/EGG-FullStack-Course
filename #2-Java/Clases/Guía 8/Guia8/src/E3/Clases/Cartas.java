/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un
número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros
y copas). Esta clase debe contener un método toString() que retorne el número
de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40
exactamente.

Las operaciones que podrá realizar la baraja son:

Métodos:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
*/

package E3.Clases;

import java.util.Comparator;

public class Cartas {
    
    private Integer numero;
    private String palo;
    private Enum palos;

    public Cartas() {
    }

    public Cartas(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    public static Comparator<Cartas> orden = new Comparator<Cartas>(){
        @Override
        public int compare(Cartas o1, Cartas o2) {
            return o2.getNumero().compareTo(o1.getNumero());
        }
    };

    @Override
    public String toString() {
        return "\033[37m"+"- "+numero+" de "+palo;
    }
}
