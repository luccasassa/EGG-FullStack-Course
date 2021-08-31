package Service;

import Entidades.Autor;
import Entidades.Editorial;
import static Entidades.Editorial_.id;
import Entidades.Libro;
import Entidades.Prestamo;
import static Service.ServicePrincipal.menuPrincipal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServiceLibro {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuLibros(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA (LIBROS):\n"
            +"1. Crear libro.\n"
            +"2. Editar libro.\n"
            +"3. Eliminar libro.\n"
            +"4. Imprimir libros.\n"
            +"0. MENU PRINCIPAL.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: crearLibro();
                break;
                case 2: System.out.print("\nISBN del libro -> ");    Long isbn2 = sc.nextLong();
                        editarLibro(isbn2);
                break;
                case 3: System.out.print("\nISBN del libro -> ");    Long isbn3 = sc.nextLong();
                        eliminarLibro(isbn3);
                break;
                case 4: imprimirLibros();
                break;
                case 0: menuPrincipal();
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
    
    public static void crearLibro (){
        
        try {
            
            em.getTransaction().begin();
            
            Libro libro = new Libro();
            System.out.print("\nTítulo del libro -> ");
            libro.setTitulo(sc.next());
            System.out.print("Año del libro -> ");
            libro.setYear(sc.nextInt());
            System.out.print("Ejemplares del libro -> ");
            libro.setEjemplares(sc.nextInt());
            System.out.print("Prestados -> ");
            libro.setPrestados(sc.nextInt());
            
            Editorial editorial = em.find(Editorial.class, id);
            libro.setEditorial(editorial);
            
            Autor autor = em.find(Autor.class, id);
            libro.setAutor(autor);
            
            em.persist(libro);
            
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR crearLibro()**");
        }
    }
    
    public static void editarLibro(Long isbn){        //falta autor y editorial
        
        try {
            
            em.getTransaction().begin();

            Libro libro = em.find(Libro.class, isbn);
            System.out.print("Nuevo título del libro -> ");
            libro.setTitulo(sc.next());
            System.out.print("Nuevo año del libro -> ");
            libro.setYear(sc.nextInt());
            System.out.print("Ejemplares del libro -> ");
            libro.setEjemplares(sc.nextInt());
            System.out.print("Prestados -> ");
            libro.setPrestados(sc.nextInt());

            em.merge(libro);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR editarLibro()**");
        }
    }
    
    public static void eliminarLibro(Long isbn){
        
        try {
            
            em.getTransaction().begin();

            Libro libro = em.find(Libro.class, isbn);

            em.remove(libro);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR eliminarLibro()**");
        }
    }
    
//    public static List<Libro> buscarLibroIsbn(Long isbn){
//        
//        List<Libro> lista = em.createQuery("SELECT c FROM Libro c WHERE c.isbn LIKE :isbn")
//                .setParameter("isbn", "%"+isbn+"%")
//                .getResultList();
//        
//        return lista;
//    }
    
    public static void imprimirLibros(){
        
        try {
            
            List<Libro> lista = em.createQuery("SELECT c FROM Libro c")
                    .getResultList();

            int c = 1;

            for (Libro i : lista) {
                System.out.println("\033[37m"+"**LIBRO "+c+"**\033[30m"+"\n"+i.toString());
                c++;
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR imprimirLibros()**");
        }
    }
    
//    public static List<Libro> buscarLibroTitulo(String titulo){
//        
//        List<Libro> lista = em.createQuery("SELECT c FROM Libro c WHERE c.titulo LIKE :titulo")
//                .setParameter("titulo", "%"+titulo+"%")
//                .getResultList();
//        
//        return lista;
//    }
//    
//    public static void prestarLibro(Date fecha, Date devolucion){
//        
//        try {
//            
//            em.getTransaction().begin();
//            
//            List<Libro> listita = new ArrayList<>();
//            listita = buscarLibroTitulo(sc.next());
//            
//            Prestamo prestamo = new Prestamo();
//            prestamo.setFecha(fecha);
//            prestamo.setDevolucion(devolucion);
//            
//            prestamo.setLibro(listita);
//            
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//            System.out.println("**ERROR prestarLibro()**");
//        }
//    }
    
}
