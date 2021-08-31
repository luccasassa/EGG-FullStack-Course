package ejercicio28;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SimuladorCine {
    

    public static void venderEntrada(Cine cine, ArrayList<Espectador> espectadores) {
        Double entrada = cine.getPrecio();
        Pelicula peli = cine.getPelicula();
        Integer edadMin = cine.getPelicula().getEdadMin();

        for (Espectador e : espectadores) {
            System.out.print(e.getNombre());
            if (e.getDinero() >= entrada) {
                if (e.getEdad() >= edadMin) {
                    System.out.println("     Entrada vendida");
                    ubicarEspectador(e, AsientoService.getSala());
                    
                    imprimirSalaOcupada(AsientoService.getSala());  
                } else {
                    System.out.println(" no cumple con la edad minima para ver la pelicula: " + edadMin + " años");
                }
            } else {
                System.out.println(" no tiene dinero suficiente para la entrada");
            }
        }
    }

    public static void ubicarEspectador(Espectador e, TreeMap<String, Espectador> sala) {
        int asientoNum;
        int asientoLetra;
        String[] l = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        String aux;
        for (int i = 0; i < 10; i++) {
            asientoNum = (int) (Math.random() * 8 + 1);
            asientoLetra = (int) (Math.random() * l.length);
            aux = asientoNum + l[asientoLetra];
            if (sala.containsKey(aux) && sala.containsValue(null)) {
                System.out.println("Asiento asignado: " + aux);
                sala.put(aux, e);
                break;
            }
        }
    }
    
    public static void imprimirSalaOcupada(TreeMap<String, Espectador> sala) {
        int fila = 0;
        System.out.println("");
        for (Entry<String, Espectador> asiento : sala.entrySet()) {
            String key = asiento.getKey();
            Espectador value = asiento.getValue();
            fila++;
            if (asiento.getValue() != null) {
                System.out.print("-- ");
            } else {
                System.out.print(key + " ");
            }
            if (fila == 9) {
                fila=0;
                System.out.println(" ");
            }
        }
        System.out.println("");
    }
}
