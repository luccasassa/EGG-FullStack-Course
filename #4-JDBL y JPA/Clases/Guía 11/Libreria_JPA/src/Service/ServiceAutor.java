package Service;

import Entidades.Autor;
import Entidades.Libro;
import static Service.ServicePrincipal.menuPrincipal;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServiceAutor {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuAutores(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA (AUTORES):\n"
            +"1. Crear autor\n"
            +"2. Editar autor.\n"
            +"3. Eliminar autor.\n"
            +"4. Imprimir autores.\n"
            +"0. MENU PRINCIPAL.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: crearAutor();
                break;
                case 2: System.out.print("\nID del autor -> ");    String id2 = sc.next();
                        editarAutor(id2);
                break;
                case 3: System.out.print("\nID del autor -> ");    String id3 = sc.next();
                        eliminarAutor(id3);
                break;
                case 4: imprimirAutores();
                break;
                case 0: menuPrincipal();
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
    
    public static void crearAutor(){
        
        try {
            
            em.getTransaction().begin();
            
            Autor autor = new Autor();
            System.out.print("\nNombre del autor -> ");
            autor.setNombre(sc.next());
            
            em.persist(autor);
            
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR crearAutor()**");
        }
    }
    
    public static void editarAutor(String id){        //falta autor y editorial
        
        try {
            
            em.getTransaction().begin();

            Autor autor = em.find(Autor.class, id);
            System.out.print("\nNuevo nombre del autor -> ");
            autor.setNombre(sc.next());

            em.merge(autor);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR editarAutor()**");
        }
    }
    
    public static void eliminarAutor(String id){
        
        try {
            
            em.getTransaction().begin();

            Autor autor = em.find(Autor.class, id);

            em.remove(autor);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR eliminarAutor()**");
        }
    }
    
    public static void imprimirAutores(){
        
        try {
            
            List<Libro> lista = em.createQuery("SELECT c FROM Autor c")
                    .getResultList();

            int c = 1;

            for (Libro i : lista) {
                System.out.println("\033[37m"+"**AUTOR "+c+"**\033[30m"+"\n"+i.toString());
                c++;
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR imprimirAutores()**");
        }
    }
    
}
