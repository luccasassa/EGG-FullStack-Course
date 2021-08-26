/*
Se plantea desarrollar un programa que permita representar la siguiente
situación.
Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; y lo
que interesa conocer es la superficie que tiene y los tipos de polideportivos. Un
edificio de oficinas es un edificio; interesa conocer la superficie que tiene.
Para lograr esto vamos a tener que crear una interfaz InstalacionDeportiva con un
método int tipoDeInstalacion() y una interfaz Edificio con un metodo double
calcularSuperficie(). Luego crearemos una clase Polideportivo con sus atributos
largo, ancho, nombre y tipo de instalación que puede ser Techado o Abierto, esta
clase implementará las dos interfaces. Además, vamos a crear una clase
EdificioDeOficinas con sus atributos número de oficinas, ancho, largo y numero
de pisos. Esta clase solo implementará la interfaz Edificio.
Por ultimo, crear una clase Test con el método main y dos ArrayList. El primer
ArrayList debe contener tres polideportivos, y el segundo, dos edificios de
oficinas. Utilizar un iterator para recorrer las colecciones y utilizar el método
tipoDeInstalación() para saber cuantos polideportivos son techados y cuantos
abiertos. Además usaremos el método calcularSuperficie(), para calcular la
superficie de todos los polideportivos como de todos los edificios de oficina.
Una vez realizado el ejercicio responda: ¿Entre qué clases existe una relación que
se asemeja a la herencia múltiple?
¿Querés saber más de interfaces? link 1 – link 2
*/

package E7.Service;

import E7.Clases.Oficina;
import E7.Clases.Polideportivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OficinaService {
    
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static List<Oficina> listaOficina = new ArrayList<>();
    private static List<Polideportivo> listaPoli = new ArrayList<>();
    
    public static void crearEdificios(){
        
        Oficina oficina1 = new Oficina();
        System.out.print("Cantidad de oficinas en el edificio 1 -> ");
        oficina1.setCantidadOficinas(sc.nextInt());
        System.out.print("Base -> ");
        oficina1.setBase(sc.nextInt());
        System.out.print("Altura -> ");
        oficina1.setAltura(sc.nextInt());
        listaOficina.add(oficina1);
        
        System.out.println("-----------------------------------------");
        
        Oficina oficina2 = new Oficina();
        System.out.print("Cantidad de oficinas en el edificio 2 -> ");
        oficina2.setCantidadOficinas(sc.nextInt());
        System.out.print("Base -> ");
        oficina2.setBase(sc.nextInt());
        System.out.print("Altura -> ");
        oficina2.setAltura(sc.nextInt());
        listaOficina.add(oficina2);
        
        System.out.println("-----------------------------------------");
        
        Polideportivo polideportivo1 = new Polideportivo("Francesco Virgolini");
        listaPoli.add(polideportivo1);
        
        Polideportivo polideportivo2 = new Polideportivo("Juan Enrique Pajas");
        listaPoli.add(polideportivo2);
    }
    
    public static void imprimirEdificios(){
        int c = 0;
        
        for (Oficina  i : listaOficina) {
            c++;
            System.out.println("- Edificio "+c+"\n"
            +"- Cantidad de oficinas: "+i.getCantidadOficinas()+"\n"
            +"- Superficie " + i.superficieEdificio());
            System.out.println("-----------------------------------------");
        }
        
        for (Polideportivo j : listaPoli) {
            System.out.println("Se instaló: "+j.tipoDeInstalacion()+"\n"
            +"- Nombre: "+j.getNombre());
            System.out.println("-----------------------------------------");
        }
    }
}
