package Service;

import Entidades.Cliente;
import Entidades.Libro;
import static Service.ServicePrincipal.menuPrincipal;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServiceCliente {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuClientes(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA (CLIENTES):\n"
            +"1. Crear cliente.\n"
            +"2. Editar cliente.\n"
            +"3. Eliminar cliente.\n"
            +"4. Imprimir clientes.\n"
            +"0. MENU PRINCIPAL.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: crearCliente();
                break;
                case 2: System.out.print("\nDocumento del cliente -> ");    Long documento2 = sc.nextLong();
                        editarCliente(documento2);
                break;
                case 3: System.out.print("\nDocumento del cliente -> ");    Long documento3 = sc.nextLong();
                        eliminarCliente(documento3);
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
    
    public static void crearCliente (){
        
        try {
            
            em.getTransaction().begin();

            Cliente cliente = new Cliente();
            System.out.print("\nNombre del cliente -> ");
            cliente.setNombre(sc.next());
            System.out.print("Apellido del cliente -> ");
            cliente.setApellido(sc.next());
            System.out.print("Domicilio del cliente -> ");
            cliente.setDomicilio(sc.next());
            System.out.print("Teléfono del cliente -> ");
            cliente.setTelefono(sc.next());

            em.persist(cliente);

            em.getTransaction().commit();
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR crearCliente()**");
        }
    }
    
    public static void editarCliente(Long documento){        //falta autor y editorial
        
        try {
            
            em.getTransaction().begin();

            Cliente cliente = em.find(Cliente.class, documento);
            System.out.print("\nNuevo nombre del cliente -> ");
            cliente.setNombre(sc.next());
            System.out.print("Nuevo apellido del cliente -> ");
            cliente.setApellido(sc.next());
            System.out.print("Nuevo domicilio del cliente -> ");
            cliente.setDomicilio(sc.next());
            System.out.print("Nuevo teléfono del cliente -> ");
            cliente.setTelefono(sc.next());

            em.merge(cliente);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR editarCliente()**");
        }
    }
    
    public static void eliminarCliente(Long documento){
        
        try {
            
            em.getTransaction().begin();

            Cliente cliente = em.find(Cliente.class, documento);

            em.remove(cliente);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR eliminarCliente()**");
        }
    }
    
    public static void imprimirClientes(){
        
        try {
            
            List<Libro> lista = em.createQuery("SELECT c FROM Cliente c")
                    .getResultList();

            int c = 1;

            for (Libro i : lista) {
                System.out.println("\033[37m"+"**CLIENTE "+c+"**\033[30m"+"\n"+i.toString());
                c++;
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("**ERROR imprimirClientes()**");
        }
    }
    
}
