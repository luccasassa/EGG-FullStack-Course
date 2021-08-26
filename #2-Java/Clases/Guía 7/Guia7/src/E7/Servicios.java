/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm. 
Nota: Poner el código postal sin la letra,solo el numero.

• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos.
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Después editar el código postal que buscó el usuario.
• Muestra por pantalla los datos.
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos.
*/

package E7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Servicios {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map<Integer, String> lista = new HashMap();
    
    public void menu(){
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"Google Maps:\n"
            +"1. Cargar nuevo código postal.\n"
            +"2. Ver listado de códigos postales.\n"
            +"3. Modificar un código postal.\n"
            +"4. Eliminar un código postal.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: cargarCP();
                break;
                case 2: mostrarLista();
                break;
                case 3: modificarCP();
                break;
                case 4: eliminarCP();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
    
    public void cargarCP() {
        
        System.out.print("\n\033[30m"+"Digite un nuevo código postal -> ");
        Integer code = sc.nextInt();
        System.out.print("Ingrese una ciudad -> ");
        String city = sc.next();
        lista.put(code, city);
    }
    
    public void mostrarLista() {
        Iterator<HashMap.Entry<Integer, String>> it = lista.entrySet().iterator();
        System.out.println("");
        while (it.hasNext()) {
            Map.Entry<Integer, String> i = it.next();
            System.out.println(i.getKey()+" - "+i.getValue());
        }
    }
    
    public void modificarCP(){
        
        System.out.print("\n\033[30m"+"Qué código postal desea cambiar? -> ");
        Integer code = sc.nextInt();        
        
        //System.out.println(lista.get(code));
        String city = lista.get(code);
        
        lista.remove(code);
        
        System.out.print("\033[30m"+"Digite el nuevo código postal -> ");
        code = sc.nextInt();
        lista.put(code, city);  
        
        mostrarLista();
    }
    
    public void eliminarCP(){
        
        System.out.print("\n\033[30m"+"Qué código postal desea eliminar? -> ");
        Integer code = sc.nextInt();
        lista.remove(code);
    }
}
