package ejercicio27;

import java.util.Scanner;
import java.util.Set;

public class JugadorService {

    public static void crear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el numero de jugadores (entre 1 y 6)");
        Integer n = sc.nextInt();
        
        //revolver.setPosBala((int) (Math.random() * 10) + 1);
       
        if (n > 6 || n < 1) {
            for (int i = 0; i < 6; i++) {
                Jugador j = new Jugador();
                j.setId(i + 1);
                j.setNombre("Jugador " + j.getId());
                j.setVivo(true);
                Juego.crearLista(j);
            }
        } else {
            for (int i = 0; i < n; i++) {
                Jugador j = new Jugador();
                j.setId(i + 1);
                j.setNombre("Jugador " + j.getId());
                j.setVivo(true);
                Juego.crearLista(j);
            }
        }
    }

    public static Boolean disparar(Revolver r, Jugador j) {
        if (r.getPosTambor() == r.getPosBala()) {
            j.setVivo(false);
            return j.getVivo();
        } else {
            j.setVivo(true);
            return j.getVivo();
        }
    }
}
