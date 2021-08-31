package ejercicio26;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//import java.util.SortedMap;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class SimuladorVotos {

    private static Scanner sc = new Scanner(System.in);
    private static List<String> nombre = new ArrayList();
    private static List<String> apellido = new ArrayList();
    private static List<Integer> dni = new ArrayList();
    private static List<String> listaCompleta = new ArrayList();
    private static Set<String> votados = new HashSet();
    private static Map<String, Integer> recuento = new HashMap();

    /**
     *
     */
    public static void crear() {
        nombre.add("Juan"); //.get(0)
        nombre.add("Pedro"); //.get(1)
        nombre.add("Aida");
        nombre.add("Gisele");
        nombre.add("Martin");
        nombre.add("Agustin");
        nombre.add("Nahuel");
        nombre.add("Mariela");
        nombre.add("Eduardo");
        nombre.add("Emilia");
        nombre.add("Brenda");
        nombre.add("Mirta");
        
        apellido.add("Larichia"); //.get(0)
        apellido.add("Galaburri");
        apellido.add("Gomez");
        apellido.add("Perez");
        apellido.add("Guzmaz");
        apellido.add("Brito");
        apellido.add("Gonzalez");
        apellido.add("Lopez");
        apellido.add("Fernandez");
        apellido.add("Vilches");
        apellido.add("Oviedo");
        apellido.add("Fiore");

        dni.add((int) (Math.random() * 40000000 + 1600000));
        dni.add((int) (Math.random() * 40000000 + 1600000));
        dni.add((int) (Math.random() * 40000000 + 1600000));

        for (int i = 0; i < nombre.size(); i++) {
            //Creo numeros random hasta el tamaño de la lista
            int n = (int) (Math.random() * nombre.size());
            int a = (int) (Math.random() * apellido.size());
            //Collections.shuffle(nombre);
            //Tomo (con el nombre.get() el nombre en la posicion random pasada por
            //parametro
            listaCompleta.add(nombre.get(n) + " " + apellido.get(a));
            recuento.put(listaCompleta.get(i), 0);
        }
    }

    public static void menu() {
        Integer opc = 999;

        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Votar");
            System.out.println("2. Mostrar Recuento de Votos");
            System.out.println("3. Mostrar Facilitadores");
            System.out.println("4. Mostrar el Lista completo de Alumnos");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    simular();
                    break;
                case 2:
                    mostrarRecuento();
                    break;
                case 3:
                    mostrarFacilitadores();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 0:
                    System.out.println("");
                    //fuerza a salir del programa
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                break;
            }
        }
    }

    private static void mostrarLista() {
        //Collections sort ordena en orden alfabetico
        Collections.sort(listaCompleta);
        System.out.println("Lista completa en Orden Alfabetico");
        listaCompleta.forEach((n) -> {
            System.out.println(n);
        });
    }

    private static void simular() {
        int n = 3;
        for (String alumno : listaCompleta) {
            n = 3; //n vuelve a 3 para que cada alumno tenga 3 oportunidades
            for (int i = 0; i < n; i++) {
                //votar var auxiliar para obtener el index random de la listaCompleta
                int votar = (int) (Math.random() * listaCompleta.size());
                //lista votados auxiliar para corroborar que un alunmno no vote
                //2 veces al mismo compañero
                //compara que votados no contenga el mismo nombre
                
                if (votados.contains(listaCompleta.get(votar))) {
                    //si lo tiene, n aumenta su valor para que siga teniendo la opcion
                    //de 3 votos
                    n++;
                    // compara si el nombre del indice "votar" es diferentes al nombre del
                    //alumno que está votando ahora
                } else if (!listaCompleta.get(votar).equals(alumno)) {
                    //agrega el nombre de lista completa en el indice votar al
                    //HashSet votados y al HashMap
                    votados.add(listaCompleta.get(votar));
                    //Map recuento le agrego el nombre, luego le aumento el value en 1
                    recuento.put(listaCompleta.get(votar), recuento.get(listaCompleta.get(votar)) + 1);
                    //System.out.println("Votante actual " + alumno);
                    //System.out.println("Votó a " + listaCompleta.get(votar));
                    //System.out.println("Recuento Parcial " + recuento.entrySet());
                } else {
                    //si votados contiene el nombre de listaCompleta en el indice
                    //vota y ademas el nombre de listaCompleta es igual al alumno
                    //n aumenta en 1 su valor para seguir permitiendo un total de 3
                    //votos validos
                    n++;
                }
            }
            //limpio votados, HashSet auxiliar para la votacion de cada alumno
            votados.clear();
        }
    }

    private static void mostrarRecuento() {
        System.out.println("Lista votados");
        //entrySet me permite obtener la key y value del HashMap
        for (Map.Entry<String, Integer> alumno : recuento.entrySet()) {
            System.out.println("Alumno: " + alumno.getKey() + " - Votos " + alumno.getValue());
        }
    }

    private static void mostrarFacilitadores() {
        //creo Map para facilitadores y lo ordeno segun los valores
        //de recuento
        Map<String, Integer> facilitadores = sortByValue(recuento);
        //variable aux para mostrar facilitadores y suplentes
        int j = 0;
        for (Map.Entry<String, Integer> alumno : facilitadores.entrySet()) {
            String key = alumno.getKey();
            Integer value = alumno.getValue();
            if (j == 10) {
                break;
            }
            if (j < 5) {
                if (j == 0) {
                    System.out.println("Facilitadores");
                }
                System.out.println(key + " - " + value);
            }
            if (j >= 5 && j < 10) {
                if (j == 5) {
                    System.out.println("Suplentes");
                }
                System.out.println(key + " - " + value);
            }
            j++;
        }
        //probando como funciona lo de abajo
//        Map<String, Integer> lalala;
//        lalala = (Map<String, Integer>) recuento.entrySet().stream()
//                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
//                //(entry) -> entry.getkey() (y getValue) funcionan igual que Map.Entry::getKey y getValue
//                .collect(Collectors.toMap((entry) -> entry.getKey(), (entry) -> entry.getValue(), (e1, e2) 
//                        -> e1, LinkedHashMap::new));
//    
    }
    //esto no lo entiendo, lo saqué de internet, pero me ordena el Map por value 
    //y no por key
    public static Map<String, Integer> sortByValue(Map<String, Integer> recuento) {
        return recuento.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
    

    //TODOS LOS INTENTOS DE FALLIDOS DE ORDENAR UN HASHMAP!
//        System.out.println("Facilitadores");
//        for (int i = 0; i < 6; i++) {
//            System.out.println(facilitadores.toString());
//        }
//        System.out.println("Suplentes");
//        for (int i = 0; i < 11; i++) {
//            System.out.println(facilitadores.get(i));
//            
//        }
//        
//        List<String> facilitadores = new ArrayList();
//        for (Map.Entry<String, oInteger> alumno : recuento.entrySet()) {
//            facilitadores.add(alumno.getValue() + " - " + alumno.getKey());
//
//        }
//        Collections.reverseOrder(facilitadores, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            @Override
//            public Comparator<String> reversed() {
//                return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            
//      });
//          System.out.println(facilitadores);
    //   }
//    private static Comparator<Map.Entry<String, Integer>> comparaValues = new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }   
//        };
    
}
