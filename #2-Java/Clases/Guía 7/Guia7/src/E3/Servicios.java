/*
Crear una clase llamada CantanteFamoso, esta clase guardará cantantes
famosos y tendrá como atributos el nombre y discoConMasVentas, y los
métodos getters y setters.
Se debe además crear una clase Test con el método main que inicialice un
arrayList listaCantantesFamosos y agregue manualmente 5 objetos de tipo
CantanteFamoso a la la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.

Además, se debe pedir al usuario un nombre y disco con más ventas de otro
cantante famoso, y una vez introducidos los datos mostrar la lista actualizada.
Una vez mostrada la lista actualizada, se debe dar opción a elegir entre volver a
introducir los datos de otro cantante, editar un cantante, eliminar un cantante o
salir del programa. Se podrán introducir tantos datos de cantantes como se
desee.
*/

package E3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<CantanteFamoso> lista = new ArrayList<>();
    
    public void crearCantante(){
        CantanteFamoso objeto1 = new CantanteFamoso("Panchito", "Disco re piolón");
        lista.add(objeto1);
        CantanteFamoso objeto2 = new CantanteFamoso("Pepito","Viva la pepa");
        lista.add(objeto2);
        CantanteFamoso objeto3 = new CantanteFamoso("Mr. Linterna","Iluminado");
        lista.add(objeto3);
        CantanteFamoso objeto4 = new CantanteFamoso("New Videla","Derrapando en mi falcon");
        lista.add(objeto4);
        CantanteFamoso objeto5 = new CantanteFamoso("Gauchito Gil","Vida");
        lista.add(objeto5);
    }
    
    public void mostrarLista(){
        System.out.println("Lista de cantantes y sus discos más vendidos: \n");
        for (CantanteFamoso i : lista) {
            System.out.println("- "+"\033[37m"+i.getNombre()+" ("+"\033[30m"+i.getDisco()+")");
        }
    }
    
    public void peticion(){
        CantanteFamoso objeto6 = new CantanteFamoso();
        
        System.out.println("----------------------------------------------");
        System.out.print("Desea agregar más cantantes? (s/n) -> ");
        String rta = sc.next();
//        do{
//            System.out.print("***ERROR*** Responda con 's/n' -> ");
//            rta = sc.next();
//        }while(!"s".equals(rta) || !"n".equals(rta));
        
        if("s".equals(rta)){
            System.out.print("\nIngrese el nombre del cantante -> ");
            objeto6.setNombre(sc.next());
            System.out.print("Ingrese el disco más vendido del cantante -> ");
            objeto6.setDisco(sc.next());
            lista.add(objeto6);
            System.out.println("----------------------------------------------");
            mostrarLista();
        }else{
            System.out.println("\nMuy bien, hasta luego");
        }
    }
}
