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

package E3.Service;

import E3.Clases.Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CartasService {
    
    private static List<Cartas> baraja = new ArrayList<>();
    private static List<Cartas> dadas = new ArrayList<>();
    
    public static void menu(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"JUEGO CARTAS:\n"  
            +"1. Barajar cartas.\n"
            +"2. Dar cartas.\n"
            +"3. Ver siguiente carta.\n"
            //+"4. Ver cartas en mesa.\n"
            +"4. Ver cantidad de cartas restantes.\n"
            +"5. Juegar de nuevo.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: barajarCartas();
                break;
                case 2: darCartas(); mostrarCartasEnMesa();  //ambos métodos para ahorrarse una opción en el menu
                break;
                case 3: mostrarSiguienteCarta();
                break;
                //case 4: mostrarCartasEnMesa();
                //break;
                case 4: mostrarCartasDisponibles();
                break;
                case 5: jugarDeNuevo();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
    
    public static void crearBaraja(){    //CREAR ENUMS Y SETTEAR CANTIDAD DE CARTAS EN 40
        String[] palo = {"ORO", "COPA", "ESPADA", "BASTO"};
        
        for (int i=0; i<palo.length; i++) {    //recorro mi array de 4 palos
            for (int j=1; j<13; j++) {    //numeros de cartas existentes
                
                Cartas carta = new Cartas();
                
                if(j==8 || j==9){
                    j++;
                }else{
                    carta.setPalo(palo[i]);    //enums.values(i);    // CREO!!!
                    carta.setNumero(j);
                    baraja.add(carta);
                }
            }
        }
    }
    
    public static void barajarCartas(){
        Collections.shuffle(baraja);
    }
    
    public static void darCartas(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("\033[30m"+"¿Cuantas cartas quiere dar? -> ");
        int n = sc.nextInt();
        System.out.println("");
        
        if(n>baraja.size()){
            System.out.println("Cartas insuficientes");
        }else{
            for (int i=0; i<n; i++) {
                dadas.add(baraja.get(i));    //agrego a la lista dadas
                baraja.remove(i);    //resto las mismas de mi baraja
            }
        }
    }
    
    public static void mostrarSiguienteCarta(){
        if(baraja.isEmpty()){
            System.out.println("No quedan más cartas, por favor 'barajar' de nuevo");
        }else{
            Cartas c = new Cartas();
            c = baraja.get(0);
        }
    }
    
    public static void mostrarCartasEnMesa(){
        if(dadas.isEmpty()){
            System.out.println("No ha salido ningubna carta");
        }else{
            for (Cartas i : dadas) {
                System.out.println(i);    //se mostrará el toString de la clase Cartas
            }
        }
    }
    
    public static void mostrarCartasDisponibles(){
        System.out.println("Cartas restantes -> "+baraja.size());
    }
    
    public static void jugarDeNuevo(){    //ARREGLAR -> EL VALOR SE TIENE QUE VOLVER A SETTEAR EN 40 CARTAS (no sumárselas)
        CartasService.crearBaraja();
    }
}
