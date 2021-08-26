package Inicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class I_1 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void menu(){
        
        System.out.println("Agregamos varias colleciones con nombres de Perros!");
        //Coleccion: LISTAS: ArrayList
        ArrayList <String> nombresList = new ArrayList<>();
        
        //Coleccion: CONJUNTO: TreeSet
        TreeSet <Integer> nombresTree = new TreeSet<>();
        
        //Coleccion: MAPAS: HashMap
        HashMap <Integer,String> nombresMap = new HashMap<>();
        
        //Agregar a la LIST
        nombresList.add("Perritu");
        nombresList.add("Almendra");
        nombresList.add("Almendra");
        
        //Agregar al SET
        nombresTree.add(36);
        nombresTree.add(5);
        nombresTree.add(36);
        
        //Agregar al MAP
        nombresMap.put(777, "Almendra");
        nombresMap.put(356, "Perritu");
        nombresMap.put(557, "Chizito");
        
        mostrarList(nombresList);
        mostrarSet(nombresTree);
        mostrarMap(nombresMap);
        
        //Eliminamos un nombre de la LISTA
        eliminarNombre(nombresList);
        mostrarList(nombresList);
    }
    public static void mostrarList(ArrayList<String> nombresList){
        System.out.println("Mostramos los nombres de LA LIST");
        //FOR EACH
        for (String obj : nombresList) {
            System.out.println(obj);
        }
    }
    
    public static void mostrarSet(TreeSet<Integer> nombresTree){
        System.out.println("Mostramos los nombres del TREESET");
        for (Integer obj : nombresTree) {
            System.out.println(obj);
        }
        
        
    }
    
    public static void mostrarMap(HashMap<Integer,String>nombresMap){
        System.out.println("Nombres desde el MAP");
//        System.out.println("Mostramos solo VALORES: ");
//        for (String obj : nombresMap.values()) {
//            System.out.println(obj);
//        }
//        
//        System.out.println("Mostramos LAS LLAVES");
//        for (Integer obj : nombresMap.keySet()) {
//            System.out.println(obj);
//        }
        //PARA MOSTRAR TODO, USAMOS ITERATOR!
        //PRIMERO llamamos a la interface Iterator
        Iterator<HashMap.Entry<Integer,String>> it = nombresMap.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Integer, String> obj = it.next();
            System.out.println("Llave: "+obj.getKey()+ ". Valor: "+ obj.getValue());
        }
        
    }
    
    public static ArrayList<String> eliminarNombre(ArrayList<String> nombresList){

        Iterator it = nombresList.iterator();
        
        while (it.hasNext()) {
            String obj =(String) it.next();
            
            if (obj.equals("Perritu")) {
                it.remove();
            }
            
        }
        
        return nombresList;
    }
}
