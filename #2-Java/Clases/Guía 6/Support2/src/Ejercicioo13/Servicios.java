
package Ejercicioo13;

public class Servicios {
    
    public static void Rellenar(Ahorcado juego, Ahorcado juego1){       
        for (int i=0;i<juego.getPalabra().length();i++){
            juego.getBuscar()[i]="_ ";            
        }       
    }
    
    public static void Adivinar(Ahorcado juego, Ahorcado juego1){
        int falta = 0;
        int juga = 0;
        juego.setJugadas(juego.getJugadas()-1);
        juego.setFaltantes(0);
        for(int i=0;i<juego.getPalabra().length();i++){
            if (juego.getLetra().equals(juego.getPalabra().substring(i,i+1))){
                juego.getBuscar()[i]=juego.getPalabra().substring(i,i+1) + " ";
                juego.setEncontradas(juego.getEncontradas() + 1);
                juga = 1;
            }
        }
        juego.setJugadas(juego.getJugadas()+juga);
        System.out.println("Estado actual");
        for(int k=0;k<juego.getPalabra().length();k++){
            System.out.print(juego.getBuscar()[k]);
            if(juego.getBuscar()[k].equals("_ ")){
                falta += 1;
            }
        }
        juego.setFaltantes(falta);
        System.out.println("");
        System.out.println("Encontradas: " + juego.getEncontradas() + ", faltantes: " + falta);
        System.out.println("Tienes " + juego.getJugadas() + " intentos.");
    }   
}
