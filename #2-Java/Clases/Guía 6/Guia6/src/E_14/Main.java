/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
algún otro atributo, puede hacerlo.
Se implementarán tres constructores:
• Un constructor por defecto.
• Un constructor con el nombre, edad y sexo recibidos como parámetro; y el resto de
los atributos se inicializarán con valores por defecto.
• Un constructor con todos los atributos como parámetro.
Los métodos que se implementarán son:
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en m)). Si esta fórmula da por resultado un valor menor que 20, la función
devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que el peso está por debajo de su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la
persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer uso de
constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
• Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
correcto, es decir, H M ó O. Si no es correcto se deberá mostrar un mensaje.
• Métodos getters y setters de cada atributo.
A continuación, crear una clase ejecutable que haga lo siguiente:
Pedir por teclado el nombre, la edad, sexo, peso y altura. Luego se crearán 3 objetos de
la clase Persona de la siguiente manera: el primer objeto obtendrá los valores pedidos
por teclado, el segundo objeto obtendrá del usuario todos los atributos menos el peso y
la altura, y el tercer objeto será inicializado con valores por defecto. Para este último
utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal. Mostrar un mensaje.
Indicar para cada objeto si la persona es mayor de edad.
Por último, se debe mostrar la información completa de cada objeto, es decir, los valores
de todos sus atributos.
Clases de Utilidad en Java
Los métodos disponibles para las clases de utilidad String, Integer, Math, Array, Date,
Calendar y GregorianCalendar se pueden consultar el “Apéndice B”.
*/

package E_14;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Servicios objeto4 = new Servicios();
        
        Persona objeto1 = new Persona();
        System.out.println("Ingrese su nombre");
        objeto1.setNombre(sc.next());
        System.out.println("Ingrese su edad");
        objeto1.setEdad(sc.nextInt());
        System.out.println("Ingrese su sexo");
        objeto1.setSexo(sc.next());
        System.out.println("Ingrese su peso");
        objeto1.setPeso(sc.nextDouble());            //Double SI o SI (sino salta error)
        System.out.println("Ingrese su altura");
        objeto1.setAltura(sc.nextDouble());          //Double SI o SI (sino salta error)
        
        Persona objeto2 = new Persona();
        objeto2.setNombre(objeto1.getNombre());
        objeto2.setEdad(objeto1.getEdad());
        objeto2.setSexo(objeto1.getSexo());
        objeto2.setPeso(objeto1.getPeso()-20);
        objeto2.setAltura(objeto1.getAltura());
        
        Persona objeto3 = new Persona();
        objeto3.setNombre(objeto1.getNombre());
        objeto3.setEdad(objeto1.getEdad());
        objeto3.setSexo(objeto1.getSexo());
        objeto3.setPeso(objeto1.getPeso()+20);
        objeto3.setAltura(objeto1.getAltura());
        
        System.out.println("--------------------------------------");
        System.out.println("**TU ESTADO ACTUAL**");
        objeto4.imprimirPersona(objeto1);
        System.out.println("**TU ESTADO EN MODO FLACO ESCOPETA**");
        objeto4.imprimirPersona(objeto2);
        System.out.println("**TU ESTADO EN MODO JABALÍ**");
        objeto4.imprimirPersona(objeto3);
    }
}
