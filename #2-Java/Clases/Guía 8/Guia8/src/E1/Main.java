package E1;

import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese cantidad de jugadores");
        Integer cantidad = sc.nextInt();
        
        if (cantidad > 6){
            System.err.println("El maximo de jugadores es 6");
            cantidad = 6;
        }
      
        juego.llenarJuego(cantidad);
        
        int r = 0;
        Boolean bool;
        
        do{
            r++;
            bool = juego.ronda();
        }while(bool);
        
        System.out.println("\n- ESTADISTICAS -");
        System.out.println("Ronda: "+ r);
        juego.finJuego();
        
        System.out.println("\n- FIN JUEGO -");
    }
   
    // 1- Eduardo
    // 2- Alexis
    // 3- David
    // 4- Jime
    // 5- Lucas Paginas
    // 6- Pili
}
