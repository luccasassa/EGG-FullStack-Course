/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento, por lo que debe ser posible pedirle su nombre, fecha de nacimiento y edad.
• Métodos get y set para llenar el objeto en el Main.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.
• Agregar a la clase el método menorQue(Persona persona) que recibe como
parámetro a otra persona y retorna true en caso de que el receptor tenga menor
edad que la persona que se recibe como parámetro, o false en caso contrario.
• Agregar un método de creación del objeto que respete la siguiente firma:
Persona(String nombre, Date fechaNacimiento). Este método recibe como
parámetros el nombre y la fecha de nacimiento de la persona a crear y retorna un objeto inicializado con los valores recibidos como parámetro.
*/

package E_19;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Persona objeto1 = new Persona();
        Persona objeto2 = new Persona();
        Servicios objeto3 = new Servicios();
        
        System.out.print("INGRESE SU NOMBRE --> ");
        objeto1.setNombre(sc.next());
        System.out.println("DIGITE SU FECHA DE NACIMIENTO dd/mm/yyyy");
        do {
            System.out.print("DIA --> ");
            objeto1.setDay(sc.nextInt());
        }while(objeto1.getDay()>31);              
        do {
            System.out.print("MES --> ");
            objeto1.setMonth(sc.nextInt());
        }while(objeto1.getMonth()>12);
        System.out.print("AÑO --> ");
        objeto1.setYear(sc.nextInt());
        
        objeto3.calcularEdad(objeto1);
        
        System.out.println("------------------------------");
        System.out.print("INGRESE OTRO NOMBRE --> ");
        objeto2.setNombre(sc.next());
        System.out.println("DIGITE OTRA FECHA DE NACIMIENTO dd/mm/yyyy");
        do {
            System.out.print("DIA --> ");
            objeto2.setDay(sc.nextInt());
        }while(objeto2.getDay()>31);              
        do {
            System.out.print("MES --> ");
            objeto2.setMonth(sc.nextInt());
        }while(objeto2.getMonth()>12);
        System.out.print("AÑO --> ");
        objeto2.setYear(sc.nextInt());
        
        System.out.println("------------------------------");
        objeto3.menorQue(objeto1, objeto2);
    }
}
