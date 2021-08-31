/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
de String) y su longitud. La clase deber tener un constructor mediante el cual se
inicialice la frase, con una o más palabras ingresadas por el usuario (separadas
entre sí por un espacio en blanco) y se inicialice de manera automática su
longitud. Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(), deberá recibir por parámetro un carácter ingresado por el
usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a' se repite 4 veces
• Método compararLongitud(), deberá comparar la longitud de la frase que compone
la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(), deberá unir la frase contenida en la clase Cadena con una
nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(), deberá reemplazar todas las letras “a” que se encuentren en la
frase, por algún otro carácter seleccionado por el usuario.
*/

package Ejercicioo15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Cadena cadena1 = new Cadena();
        System.out.println("Ingrese una frase o palabra");
        cadena1.setFrase(sc.next());
        cadena1.setLongitud(cadena1.getFrase().length());
        System.out.println("Que caracter desea buscar en la frase");
        do {
            cadena1.setCaracter(sc.next());
            if(cadena1.getCaracter().length()>=2){
                System.out.println("Solo se podrá buscar de a una letra, ingreselo nuevamente");
            }
        }while(cadena1.getCaracter().length()>=2);
                
        System.out.println("Son " + Servicios.mostrarVocales(cadena1) + " vocales");
        System.out.println(Servicios.invertirFrase(cadena1));
        System.out.println("El caracter se encuentra " + Servicios.vecesRepetido(cadena1));
        
        Cadena cadena2 = new Cadena();
        System.out.println("Ingrese una nueva frase para comparar largo y unir");
        cadena2.setFrase(sc.next());
        
        System.out.println("Hay una diferencia de " + Servicios.compararLongitud(cadena1, cadena2) + " caracteres");
        System.out.println("Las dos frases unidas dan como resultado");
        System.out.println(Servicios.unirFrases(cadena1, cadena2));
        
        System.out.println("que caracter desea reemplazar");
        cadena2.setCaracter(sc.next());
        System.out.println("Y por que letra o signo desea reemplazarlo");
        cadena2.setCara(sc.next());
        
        System.out.println(Servicios.reemplazar(cadena1, cadena2));
    }

}
