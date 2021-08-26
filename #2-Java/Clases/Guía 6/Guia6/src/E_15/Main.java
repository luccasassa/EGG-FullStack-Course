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
Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(), deberá comparar la longitud de la frase que compone
la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(), deberá unir la frase contenida en la clase Cadena con una
nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(), deberá reemplazar todas las letras “a” que se encuentren en la
frase, por algún otro carácter seleccionado por el usuario.
*/

package E_15;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cadena objeto1 = new Cadena();
        Servicios objeto2 = new Servicios();
        
        System.out.println("Ingrese una frase");
        objeto1.setFrase1(sc.next());
        
        objeto2.mostrarVocales(objeto1);
        objeto2.invertirFrase(objeto1);
        
        System.out.println("\nDigite una letra a buscar en la frase");
        char letra = sc.next().charAt(0);
        
        System.out.println("La letra se encuentra repetida en la frase "+objeto2.vecesRepetido(objeto1, letra)+" veces");
        
        System.out.println("\nIngrese otra frase");
        objeto1.setFrase2(sc.next());
        
        objeto2.compararLongitud(objeto1);
        
        System.out.println("\nSe reemplazarán todas las letras 'a' por un síbolo. Digite un símbolo:");
        String simbolo = sc.next();
        objeto2.reemplazar(objeto1, simbolo);
    }
}
