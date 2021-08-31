package Service;

import Entidades.Editorial;
import Entidades.Libro;
import static Service.ServicePrincipal.menuPrincipal;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServiceEditorial {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuEditoriales(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA (EDITORIALES):\n"
            +"1. Crear editorial\n"
            +"2. Editar editorial.\n"
            +"3. Eliminar editorial.\n"
            +"4. Imprimir editoriales.\n"
            +"0. MENU PRINCIPAL.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: crearEditorial();
                break;
                case 2: System.out.print("\nID de la editorial -> ");    String id2 = sc.next();
                        editarEditorial(id2);
                break;
                case 3: System.out.print("\nID de la editorial -> ");    String id3 = sc.next();
                        eliminarEditorial(id3);
                break;
                case 4: 
                break;
                case 0: menuPrincipal();
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
    
    public static void crearEditorial(){
        
        try {
            
            em.getTransaction().begin();

            Editorial editorial = new Editorial();
            System.out.print("\nNombre de la editorial -> ");
            editorial.setNombre(sc.next());

            em.persist(editorial);

            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR crearEditorial()**");
        }
    }
    
    public static void editarEditorial(String id){        //falta autor y editorial
        
        try {
            
            em.getTransaction().begin();

            Editorial editorial = em.find(Editorial.class, id);
            System.out.print("\nNuevo nombre de la editorial -> ");
            editorial.setNombre(sc.next());

            em.merge(editorial);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR editarEditorial()**");
        }
    }
    
    public static void eliminarEditorial(String id){
        
        try {
            
            em.getTransaction().begin();

            Editorial editorial = em.find(Editorial.class, id);

            em.remove(editorial);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR eliminarEditorial()**");
        }
    }
    
    public static void imprimirEditoriales(){
        
        try {
            
            List<Libro> lista = em.createQuery("SELECT c FROM Editorial c")
                    .getResultList();

            int c = 1;

            for (Libro i : lista) {
                System.out.println("\033[37m"+"**EDITORIAL "+c+"**\033[30m"+"\n"+i.toString());
                c++;
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR imprimirEditoriales()**");
        }
    }
    
}
