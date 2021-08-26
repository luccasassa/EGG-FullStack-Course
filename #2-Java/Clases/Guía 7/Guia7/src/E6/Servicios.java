/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas, como introducir un elemento,
modificar su precio, eliminar un producto y mostrar los productos que tenemos
con su precio (Utilizar Hashmap).
*/

package E6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Servicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map <Integer, Tienda> lista = new HashMap();
    
    public void menu(){
        int opcion = 123;
        
        do{
            System.out.print("----------------------------------------\n"
            +"FOOD STORE:\n"
            +"1. Cargar productos.\n"
            +"2. Ver lista de productos.\n"
            +"3. Modificar un producto.\n"
            +"4. Eliminar un producto.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: cargarProductos();
                break;
                case 2: mostrarLista();
                break;
                case 3: modificarPrecio((HashMap<Integer, Tienda>) lista);
                break;
                case 4: eliminarProducto();
                break;
                case 0: System.out.println("");
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }while(opcion!=0);
    }
    
    public void cargarProductos(){
        
        Tienda objeto1 = new Tienda();
        System.out.println("\n\033[32m"+"PRODUCTO 1");
        System.out.print("\033[30m"+"Nombre del producto -> ");
        objeto1.setProducto(sc.next());
        System.out.print("Precio del producto -> ");
        objeto1.setPrecio(sc.nextDouble());
        
        Tienda objeto2 = new Tienda();
        System.out.println("\n\033[32m"+"PRODUCTO 2");
        System.out.print("\033[30m"+"Nombre del producto -> ");
        objeto2.setProducto(sc.next());
        System.out.print("Precio del producto -> ");
        objeto2.setPrecio(sc.nextDouble());
        
        Tienda objeto3 = new Tienda();
        System.out.println("\n\033[32m"+"PRODUCTO 3");
        System.out.print("\033[30m"+"Nombre del producto -> ");
        objeto3.setProducto(sc.next());
        System.out.print("Precio del producto -> ");
        objeto3.setPrecio(sc.nextDouble());

        lista.put(1, objeto1);
        lista.put(2, objeto2);
        lista.put(3, objeto3);
    }
    
    public void mostrarLista(){
        Iterator<Map.Entry<Integer, Tienda>> it = lista.entrySet().iterator();  //para recorrer toda la lista y no un objeto (ya que son más de 1)
        System.out.println("");
        while(it.hasNext()){
            Map.Entry<Integer, Tienda> i = it.next();  //sintaxis casi similar a la del for each
            System.out.println("- Producto "+i.getKey()+" / "+i.getValue().getProducto()+" ($"+i.getValue().getPrecio()+")");
        }
    }
    
    public Map<Integer, Tienda> modificarPrecio (HashMap<Integer, Tienda> i) {
    
        System.out.print("\n\033[30m"+"A qué producto le desea modificar el precio? (N° de llave) -> ");
        Integer producto = sc.nextInt();
        
        for (Map.Entry<Integer,Tienda> entry : i.entrySet()) { //devuelve un set de clave valor
            Tienda j = entry.getValue();//se lo seteo al producto p
           if(lista.keySet().contains(producto)) {
               System.out.print("Ingrese el nuevo precio -> ");
               double precioNuevo = sc.nextDouble();
               j.setPrecio(precioNuevo);
               i.put(producto, j);//aca se pisa el objeto pasandole el nombre que existia con precio nuevo
               mostrarLista();
               break;
            }else{
               System.out.println("\n\033[31m"+"No se encuentra "+producto);
               break;
            }
        }
        return i;
    }
    
    public void eliminarProducto(){
        System.out.print("Ingrese el número del producto a eliminar -> ");
        Integer delete = sc.nextInt();
        lista.remove(delete);
    }
    
//    public void modificarPrecio(){
//        
//        System.out.print("\033[30m"+"A qué producto le desea modificar el precio? (N° de llave) -> ");
//        Integer producto = sc.nextInt();
//        
//        Tienda t = lista.get(producto);
//        System.out.print("Ingrese el nuevo precio -> ");
//        t.setPrecio(sc.nextDouble());
//    }
}
