package ejercicio28;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class AsientoService {

    private static Map<String, Espectador> sala = new TreeMap(AsientoService.ordenar);

    public static Map<String, Espectador> crearSala() {
        
        int n = 8;
        String[] l = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        //int pos= 0;
        System.out.println("Sala de Cine Vacia");
        for (int i= 0; i < l.length; i++) {
            Asiento a = new Asiento();
            a.setNumero(n);                
            a.setOcupado(false);
            a.setEspectador(null);
            a.setLetra(l[i]);
            //System.out.print(a.getNumero() + a.getLetra()+ " ");
            //System.out.print(a.getLetra());
            for (int j = 0; j < l.length; j++) {
                Asiento b = new Asiento();
                //n=8;
                //.setNumero(n
                a.setLetra(l[j]);
                //pos++;
                b.setLetra(a.getLetra());
                b.setNumero(a.getNumero());
                b.setOcupado(a.isOcupado());
                b.setEspectador(a.getEspectador());
                String aux = a.getNumero() + a.getLetra();
                //String aux2 = a.getNumero() + a.getLetra();
                //System.out.print(a.getNumero() + a.getLetra()+ " ");
                sala.put(aux, null);
                //sala.put(aux2, null);
            }
            //pos = 0;
            n--;
            if (n == 0) {
                i++;
            }
            //System.out.println(" ");
        }
        
        System.out.println("Sala size " + sala.size() );
        SimuladorCine.imprimirSalaOcupada((TreeMap<String, Espectador>) sala);
        return sala;
    }

    public static TreeMap<String, Espectador> getSala() {
        return (TreeMap<String, Espectador>) sala;
    }

    public static void setSala(TreeMap<String, Espectador> sala) {
        AsientoService.sala = sala;
    }
    
    public static Comparator<String> ordenar = new Comparator<String>() {
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };
}
