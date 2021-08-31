package ejercicio28;

import java.util.ArrayList;
import java.util.List;

public class EspectadorService {
    
    private static List<Espectador> espectadores = new ArrayList<>();
    
    public static ArrayList<Espectador> crearEspectadores() {
        
        
        
        for (int i = 0; i < AsientoService.getSala().size(); i++) {
            Espectador e = new Espectador();
            e.setNombre("Espectador " + (i+1));
            e.setEdad((int) (Math.random()*90 + 1));
            e.setDinero(Math.random()*1000);
            espectadores.add(e);
           // System.out.println(e);
        }
        
        return (ArrayList<Espectador>) espectadores;  //casteo automático
    }

    public static ArrayList<Espectador> getEspectadores() {
        return (ArrayList<Espectador>) espectadores;  //casteo automático
    }

    public static void setEspectadores(ArrayList<Espectador> espectadores) {
        EspectadorService.espectadores = espectadores;
    }
    
    

}
