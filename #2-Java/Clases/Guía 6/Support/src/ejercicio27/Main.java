/*
27. Realizar el juego de la ruleta rusa en Java. Como muchos saben, el juego se trata
de un número de jugadores que con un revolver que posee una sola bala en el
tambor se dispara en la cabeza. Las clases a hacer son del juego son las
siguientes:
Clase Revolver: esta clase posee los siguientes atributos: posición actual (posición
del tambor donde se dispara, puede que esté la bala o no) y posición bala (la
posición del tambor donde se encuentra la bala). Estas dos posiciones, se
generarán aleatoriamente.
Métodos:
• disparar(): devuelve true si la bala coincide con la posición actual
• siguienteBala(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está la bala)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número
del jugador, empieza en 1), nombre (Empezara con Jugador más su ID, “Jugador
1” por ejemplo) y vivo (indica si está vivo o no el jugador)
Métodos:
• disparar(Revolver r): el jugador se apunta y se dispara, si la bala se dispara, el
jugador muere.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• finJuego(): cuando un jugador muere, devuelve true
• ronda(): cada jugador se apunta y se dispara, y luego se informara del estado de la
partida (El jugador se dispara, no ha muerto en esa ronda, etc.).
El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si
no está en este rango, por defecto será 6. En cada turno uno de los jugadores,
dispara el revólver, si éste tiene la bala el jugador muere y el juego termina.
 */
package ejercicio27;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Juego.menu();
    }
}
