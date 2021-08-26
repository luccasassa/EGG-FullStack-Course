package E1;

import java.util.ArrayList;

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    
    private JugadorServicio js = new JugadorServicio();
    private RevolverServicio rs = new RevolverServicio();
   
    public void llenarJuego(Integer cant){
        //cargamos jugadores
        for (int i = 1; i <= cant; i++) {
            jugadores = (ArrayList<Jugador>) js.llenarJugador();
        }
        //cargamos revolver inicial
        revolver = rs.llenarRevolver();
    }
    
    public Boolean ronda(){
        Boolean devolver= true;
        
        for (Jugador j : jugadores) {
            //mostramos jugador
            System.out.println(j.getNombre());
        
            System.out.println("Disparar");
            //disparo enviando la posicion actual, y guardo el resultado booleano para retornar
            devolver = rs.disparar(revolver.getPosicionActual());
            revolver.setPosicionActual(rs.siguienteBala());
            //comprobamos el disparo
            if(!devolver){
                System.out.println("\033[31m"+"Palmó");
                j.setVivo(devolver);
            break;
            }
        }
        return devolver;
    }
   
    public void finJuego(){
        js.mostrarJugadores(jugadores);
    }
}

