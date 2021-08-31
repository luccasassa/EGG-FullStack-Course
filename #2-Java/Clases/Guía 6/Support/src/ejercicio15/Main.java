/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
de cadena) y su longitud. La clase deber tener un constructor mediante el cual se
inicialice la frase, con una o más palabras ingresadas por el usuario
(separadas entre sí por un espacio en blanco) y se inicialice de manera
automática su longitud. Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(), deberá recibir por parámetro un carácter ingresado por
el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(), deberá unir la frase contenida en la clase Cadena con una
nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(), deberá reemplazar todas las letras “a” que se encuentren en
la frase, por algún otro carácter seleccionado por el usuario.
 */
package ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Cadena frase;
        Cadena frase2;
        CadenaService service = new CadenaService();
        
        System.out.println("Ingrese una frase");
        frase = new Cadena(sc.next());
        
        service.mostrarVocables(frase);
        service.invertirFrase(frase);
        
        System.out.println("Indicame un caracter para indicarte cuantas veces se repite");
        char n = sc.next().charAt(0);
        service.vecesRepetido(frase, n);
        
        System.out.println("Ingresa una nueva frase");
        frase2 = new Cadena(sc.next());
        
        if (service.compararLongitud(frase, frase2)) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tiene diferentes longitudes");
        }
        
        System.out.println("Unidas se ven asi: " + service.unirFrases(frase, frase2));
        
        System.out.println("Dime una letra para reemplazar todas las 'a'");
        n = sc.next().charAt(0);
        System.out.println("Asi queda la frase: " + service.reemplazar(frase, n));
    
    }
    
}
