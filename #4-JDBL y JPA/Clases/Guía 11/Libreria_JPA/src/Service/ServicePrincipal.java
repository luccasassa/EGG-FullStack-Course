/*
Al alumno le toca desarrollar, las siguientes funcionalidades:

1) Crear base de datos Librería.
2) Crear unidad de persistencia.
3) Crear entidades previamente mencionadas (excepto Préstamo).
4) Generar las tablas con JPA.
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería.
7) Crear la interfaz InterfazLibrería para llamar los métodos de persistencia de datos.
8) Crear los métodos para borrar o editar dichas entidades.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Creación de un Cliente nuevo.
12) Crear entidad Préstamo.
13) Registrar el préstamo de un libro.
14) Agregar más de un libro a un préstamo.
15) Devolución de un libro.
16) Agregar validaciones a todas las funcionalidades de la aplicación.
17) Validar campos obligatorios.
18) No ingresar datos duplicados.
19) No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más ejemplares de los que hay,
    ni devolver más de los que se encuentran prestados. No se podrán prestar libros con fecha anterior a la fecha actual, etc.
*/

package Service;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ServicePrincipal {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("Libreria_JPAPU").createEntityManager();
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuPrincipal(){
        int opcion = 123;
        
        while(true){
            System.out.print("----------------------------------------\n"
            +"LIBRERÍA EGG:\n"
            +"1.Sección autores.\n"
            +"2.Sección clientes.\n"
            +"3.Sección editoriales.\n"
            +"4.Sección libros.\n"
            +"5.Sección préstamos.\n"                    
            +"0. SALIR.\n"
            +"----------------------------------------\n"
            +"\033[33m"+"ELIJA OPCIÓN: "+"\033[30m");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1: ServiceAutor.menuAutores();
                break;
                case 2: ServiceCliente.menuClientes();
                break;
                case 3: ServiceEditorial.menuEditoriales();
                break;
                case 4: ServiceLibro.menuLibros();
                break;
                case 5: ServicePrestamo.menuPrestamos();
                break;
                case 0: System.exit(0);
                break;
                default: System.out.println("\n\033[31m"+"***ERROR*** OPCIÓN NO VÁLIDA");
                break;
            }
        }
    }
}
