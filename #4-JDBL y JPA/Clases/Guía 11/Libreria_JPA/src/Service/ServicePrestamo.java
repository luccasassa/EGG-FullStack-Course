package Service;

import static Service.ServicePrincipal.menuPrincipal;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServicePrestamo {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuPrestamos(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA (PRESTAMOS):\n"
            +"1. Crear préstamo. \n"
            +"2. Editar préstamo.\n"
            +"3. Eliminar préstamo.\n"
            +"4. Imprimir préstamos.\n"
            +"5. Registrar devolución.\n"    //SOLICITAR MÉTODO
            +"0. MENU PRINCIPAL.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: //
                break;
                case 2: //
                break;
                case 3: //
                break;
                case 4: //
                break;
                case 5: //
                break;
                case 0: menuPrincipal();
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
    
    
//    public boolean prestamo(){
//        
//        boolean respuesta = false;
//        
//        System.out.print("Ingrese el nombre del libro -> ");
//        String title = sc.next().toUpperCase();
//        
//        for (Libro i : lista) {
//            if (i.getTitulo().toUpperCase().equals(title)){
//                if (i.getCantidad()>0){
//                    i.setPrestados(i.getPrestados()+1);
//                    i.setCantidad(i.getCantidad()-1);
//                    respuesta = true;
//                }else{
//                    System.out.println("Cantidad insuficiente de libros ("+title+")");
//                }
//            }else{
//                System.out.println("No se encontró '"+title+"'");
//            }
//        }
//        return respuesta;
//    }
    
    
    
//    public boolean devolucion(){
//        boolean respuesta = false;
//        
//        System.out.print("Ingrese el nombre del libro -> ");
//        String title = sc.next().toUpperCase();
//        for (Libro i : lista) {
//            if (i.getTitulo().toUpperCase().equals(title)){
//                if (i.getPrestados()>0){
//                    i.setPrestados(i.getPrestados()-1);
//                    i.setCantidad(i.getCantidad()+1);
//                    respuesta = true;
//                }else{
//                    System.out.println("No se puede devolver un libro que no fué prestado");
//                }
//            }else{
//                System.out.println("No se encontró '"+title+"'");
//            }
//        }
//        return respuesta;
//    }
    
}
