package ejercicio20;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PalabraService {

    private static List<Palabra> lista = new ArrayList<>();

    public static List<Palabra> getLista() {
        return lista;
    }

    public static void setLista(List<Palabra> lista) {
        PalabraService.lista = lista;
    }

    public static void crearPalabra(String p) {
        Palabra word = new Palabra();
        word.setPalabra(p);
        word.setLongitud(p.length());
        crearLista(word);
    }

    public static void crearLista(Palabra p) {
        lista.add(p);
    }

    public static void buscar() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Decime un numero y te muestro las palabras que tienen"
                + " esa longitud: ");
        int n = sc.nextInt();
        List<Palabra> nuevaLista = new ArrayList<>();
        for (Palabra p : lista) {
            if (p.getLongitud() == n) nuevaLista.add(p);
            
            //ORDENA LA LISTA TAMBIEN!! !!!!!! (para que funcione comentar el if y comentar ordenarLista()  
//          lista.stream().filter((x) -> (x.getLongitud() == n)).forEachOrdered((x) -> {
//              nuevaLista.add(p);
//          });
        }
 
        ordenarLista(nuevaLista);
        imprimirLista(nuevaLista);
        
    }

    /**
     *
     * @param nuevaLista
     */
    public static void ordenarLista(List nuevaLista) {
        //Comparator Corto
        Collections.sort(nuevaLista, (Palabra p1, Palabra p2) -> p1.getPalabra().compareTo(p2.getPalabra()));

//Comparator Largo
//Collections.sort(nuevaLista, new Comparator<Palabra>() {
//    @Override
//    public int compare(Palabra p1, Palabra p2) {
//        return p1.getPalabra().compareTo(p2.getPalabra());
//    }
//});
    }
    public static void imprimirLista(List lista) {

//        for (Object object : lista) {
//            System.out.println(object);
//            
//        }
        //  lista.forEach((x) -> System.out.println(x));
//        lista.forEach((Palabra palabra) -> {
//            System.out.println("Palabra: "+palabra.getPalabra()+". Longitud:"
//                    + palabra.getLongitud()+".");
//        });
//        System.out.println("");
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Palabra n = (Palabra) it.next();
                System.out.println("Palabra: " + n.getPalabra() + ". Longitud: "
                        + n.getLongitud());
            }
    }

}
