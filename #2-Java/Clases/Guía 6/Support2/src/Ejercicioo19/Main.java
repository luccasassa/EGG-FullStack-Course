/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento, por lo que debe ser posible pedirle su nombre, fecha de nacimiento
y edad.
• Métodos get y set para llenar el objeto en el Main.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(Persona persona) que recibe como
parámetro a otra persona y retorna true en caso de que el receptor tenga menor
edad que la persona que se recibe como parámetro, o false en caso contrario.
• Agregar un método de creación del objeto que respete la siguiente firma:
Persona(String nombre, Date fechaNacimiento). Este método recibe como
parámetros el nombre y la fecha de nacimiento de la persona a crear y retorna un
objeto inicializado con los valores recibidos como parámetro.
*/

package Ejercicioo19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Persona persona1 = new Persona();
        Persona personaHoy = new Persona();
        Persona persona2 = new Persona();
        
        personaHoy.setAño(2021);
        personaHoy.setMes(4);
        personaHoy.setDia(29);
        
        System.out.println("Ingrese su nombre");
        persona1.setNombre(sc.next());
        System.out.println("Ingrese su fecha de nacimiento");       
        do {
            System.out.println("Dia");
            persona1.setDia(sc.nextInt());
        }while(persona1.getDia()>31);              
        do {
            System.out.println("Mes");
            persona1.setMes(sc.nextInt());
        }while(persona1.getMes()>12);
        System.out.println("Año");
        persona1.setAño(sc.nextInt());
        
        System.out.println(Servicios.calcularEdad(persona1, personaHoy));
        
        System.out.println("Ingrese el nombre y la fecha de nacimiento de la otra persona para saber si es menor o mayor que " + persona1.getNombre());
        System.out.println("Ingrese su nombre");
        persona2.setNombre(sc.next());
        System.out.println("Ingrese su fecha de nacimiento");
        do {
            System.out.println("Dia");
            persona2.setDia(sc.nextInt());
        }while(persona2.getDia()>31);              
        do {
            System.out.println("Mes");
            persona2.setMes(sc.nextInt());
        }while(persona2.getMes()>12);
        System.out.println("Año");
        persona2.setAño(sc.nextInt());
        
        if(Servicios.menorQue(persona1, persona2)==true){
            System.out.println(persona2.getNombre() + " es mayor que " + persona1.getNombre());
        }else {
            System.out.println(persona2.getNombre() + " es menor que " + persona1.getNombre());
        }
    }
}
