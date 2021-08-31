package Service;

import Entidades.Alumno;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AlumnoService {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Curso_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menu(){
        
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"CURSO EGG:\n"  
            +"1. Crear alumno.\n"
            +"2. Editar nombre de alumno.\n"
            +"3. Eliminar alumno.\n"
            +"4. Ver lista de alumnos.\n"
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: System.out.print("\nDocumento del alumno -> ");
                        Integer documento = sc.nextInt();

                        System.out.print("Nombre del alumno -> ");
                        String nombre = sc.next();

                        System.out.print("Apellido del alumno -> ");
                        String apellido = sc.next();

                        System.out.print("Edad del alumno -> ");
                        Integer edad = sc.nextInt();

                        crearAlumno(documento, nombre, apellido, edad);
                break;
                case 2: System.out.print("\nDocumento del alumno -> ");
                        Integer documento2 = sc.nextInt();

                        System.out.print("Nuevo nombre del alumno -> ");
                        String nombre2 = sc.next();
                
                        editarAlumno(documento2, nombre2);
                break;
                case 3: System.out.print("\nDocumento del alumno -> ");
                        Integer documento3 = sc.nextInt();
                
                        eliminarAlumno(documento3);
                break;
                case 4: imprimirAlumnosTodos();
                break;
                case 0: System.exit(0);
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
    
    public static void crearAlumno(Integer documento, String nombre, String apellido, Integer edad){
        
        em.getTransaction().begin();

        Alumno alumno = new Alumno();
        alumno.setDocumento(documento);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setEdad(edad);
        
        em.persist(alumno);
        
        em.getTransaction().commit();
    }
    
    public static void editarAlumno(Integer documento, String nombre) {    //agregar atributos que voy a settear
        
        em.getTransaction().begin();

        Alumno alumno = em.find(Alumno.class, documento);

        alumno.setNombre(nombre);    //settear otros atributos para cambiarlos también

        em.merge(alumno);
        em.getTransaction().commit();
    }
    
    public static void eliminarAlumno(Integer documento){
        
        em.getTransaction().begin();
        
        Alumno alumno = em.find(Alumno.class, documento);
        
        em.remove(alumno);
        
        em.getTransaction().commit();
    }
    
    public static List<Alumno> buscarAlumnosNombre(String nombre){
        
        List<Alumno> lista = em.createQuery("SELECT c FROM Alumno c WHERE c.nombre LIKE :nombre")
                .setParameter("nombre", "%"+nombre+"%")
                .getResultList();
        
        return lista;
    }
    
    public static List<Alumno> buscarAlumnosEdad(Integer edad){
        
        List<Alumno> lista = em.createQuery("SELECT c FROM Alumno c WHERE c.edad LIKE :edad")
                .setParameter("edad", "%"+edad+"%")
                .getResultList();
        
        return lista;
    }
    
    public static void imprimirAlumnosNombre(String nombre){
        
        List<Alumno> lista = buscarAlumnosNombre(nombre);
        
        for (Alumno i : lista) {
            System.out.println(i.toString());
        }
    }
    
    public static void imprimirAlumnosEdad(Integer edad){
        
        List<Alumno> lista = buscarAlumnosEdad(edad);
        
        for (Alumno i : lista) {
            System.out.println(i.toString());
        }
    }
    
    public static void imprimirAlumnosTodos(){
        
        List<Alumno> lista = em.createQuery("SELECT c FROM Alumno c")
                .getResultList();
        
        int c = 1;
        
        for (Alumno i : lista) {
            System.out.println("\033[37m"+"**ALUMNO "+c+"**\033[30m"+"\n"+i.toString());
            c++;
        }
    }
}
