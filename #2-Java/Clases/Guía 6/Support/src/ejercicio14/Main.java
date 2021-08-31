/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
algún otro atributo, puede hacerlo.
Se implementarán tres constructores:
• Un constructor por defecto.
• Un constructor con el nombre, edad y sexo recibidos como parámetro; y el resto
de los atributos se inicializarán con valores por defecto.
• Un constructor con todos los atributos como parámetro.
Los métodos que se implementarán son:
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en m)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se
recomienda hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
• Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
correcto, es decir, H M ó O. Si no es correcto se deberá mostrar un mensaje.
• Métodos getters y setters de cada atributo.
A continuación, crear una clase ejecutable que haga lo siguiente:
Pedir por teclado el nombre, la edad, sexo, peso y altura. Luego se crearán 3
objetos de la clase Persona de la siguiente manera: el primer objeto obtendrá los
valores pedidos por teclado, el segundo objeto obtendrá del usuario todos los
atributos menos el peso y la altura, y el tercer objeto será inicializado con valores
por defecto. Para este último utiliza los métodos set para darle a los atributos un
valor.
Para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal. Mostrar un mensaje.
Indicar para cada objeto si la persona es mayor de edad.
Por último, se debe mostrar la información completa de cada objeto, es decir, los
valores de todos sus atributos.
 */
package ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("¿Cuál es su sexo? H = hombre, M = mujer, O = otro");
        char sexo = leer.next().charAt(0);
        System.out.println("¿Cuanto pesas?");
        double peso = leer.nextDouble();
        System.out.println("Por ultimo, ¿cual es su altura?");
        double altura = leer.nextDouble();
        
        Persona a = new Persona(nombre, edad, sexo, peso, altura);
        Persona b = new Persona(nombre, edad, sexo);
        Persona c = new Persona();
        
        System.out.println("Persona A: ");
        a.imprimirPersona(a);
//        a.comprobarSexo(sexo);
//        switch (a.calcularIMC()) {
//            case -1:
//                System.out.println("Su IMC es menor a 20");
//                break;
//            case 0:
//                System.out.println("Su IMC está entre 20 y 25, está en bajo peso!");
//                break;
//            case 1:
//                System.out.println("Su IMC es superior a 25, usted está en sobrepeso");
//                break;
//        }
//        
//        if (a.esMayorDeEdad()) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Aún eres menor");
//        }
        
        System.out.println("Persona B: ");
        b.imprimirPersona(b);
//        b.comprobarSexo(sexo);
//        switch (b.calcularIMC()) {
//            case -1:
//                System.out.println("Su IMC es menor a 20");
//                break;
//            case 0:
//                System.out.println("Su IMC está entre 20 y 25, está en bajo peso!");
//                break;
//            case 1:
//                System.out.println("Su IMC es superior a 25, usted está en sobrepeso");
//                break;
//        }
//        
//        if (b.esMayorDeEdad()) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Aún eres menor");
//        }

        System.out.println("Persona C: ");
        c.imprimirPersona(c);
//        c.comprobarSexo(sexo);
//        switch (c.calcularIMC()) {
//            case -1:
//                System.out.println("Su IMC es menor a 20");
//                break;
//            case 0:
//                System.out.println("Su IMC está entre 20 y 25, está en bajo peso!");
//                break;
//            case 1:
//                System.out.println("Su IMC es superior a 25, usted está en sobrepeso");
//                break;
//        }
//        
//        if (c.esMayorDeEdad()) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Aún eres menor");
//        }
//        
   }
    
}
