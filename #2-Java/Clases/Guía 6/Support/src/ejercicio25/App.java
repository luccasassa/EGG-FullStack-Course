/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class App {

    private static Map<Integer, Producto> listaProd = new HashMap();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void menu() {
        Integer opc = 999;

        while (opc != 0) {
            System.out.println("Elija una opcion");
            System.out.println("1. Cargar Nuevos Productos");
            System.out.println("2. Modificar el Precio de un producto");
            System.out.println("3. Eliminar un Producto");
            System.out.println("4. Mostrar el Listado completo de Productos");
            System.out.println("0. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    //fuerza a salir del programa
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    private static void cargarProducto() {
        String opc = "";
        
        Producto p1 = new Producto();
        p1.setIsbn(1234);
        p1.setProducto("P1");
        p1.setPrecio(5.2);
        
        Producto p2 = new Producto();
        p2.setIsbn(3454);
        p2.setProducto("P2");
        p2.setPrecio(8.2);
        
        Producto p3 = new Producto();
        p3.setIsbn(132454);
        p3.setProducto("P3");
        p3.setPrecio(7.2);

        listaProd.put(p1.getIsbn(), p1);
        listaProd.put(p2.getIsbn(), p2);
        listaProd.put(p3.getIsbn(), p3);

//        while (!opc.equals("N") || !opc.equals("n")) {
//            Producto p = new Producto();
//            System.out.println("Ingrese los datos solicitados");
//            System.out.println("ISBN:");
//            p.setIsbn(sc.nextInt());
//            System.out.println("Nombre del Producto:");
//            p.setProducto(sc.next());
//            System.out.println("Precio:");
//            p.setPrecio(sc.nextDouble());
//            listaProd.put(p.getIsbn(), p);
//        }
    }

    private static Double modificarPrecio() {
        System.out.println("Ingrese el ISBN del producto que desea modificarle "
                + "el precio");
        Integer buscado = sc.nextInt();
        Producto p = listaProd.get(buscado);
        System.out.println("Ingrese el nuevo precio");
        p.setPrecio(sc.nextDouble());
        
        return p.getPrecio();
    }
    
    private static void eliminarProducto() {
        System.out.println("Ingrese el ISBN del numero a Eliminar");
        Integer eliminado = sc.nextInt();
        listaProd.remove(eliminado);
    }
    
    private static void mostrarLista() {
        Iterator<Map.Entry<Integer, Producto>> it = listaProd.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Producto> obj = it.next();
            System.out.println(obj);
        }
    }
}