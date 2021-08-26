/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee caracteres enviados por un sensor. Las lecturas se realizan
de a 5 caracteres (buffer) por vez, los cuales deben llegar con un formato fijo: el
primer carácter tiene que ser X y el último tiene que ser 0.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE que no sea correcta se considera inválida. Al finalizar el
proceso, se imprime un informe indicando la cantidad de lecturas correctas e
inválidas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring() y Length().
*/

package Ejercicios;
import java.util.Scanner;
public class E_26 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador1=0;
        int contador2=0;
        String palabra="";
        System.out.println("Ingrese los códigos del RS232");
        
        do{
            palabra = leer.nextLine();
            palabra= palabra.toUpperCase();
            int cantidad = palabra.length();
            
            if(cantidad!=5){
                System.out.println("Código incorrecto, tiene que ser de 5 caracteres");
            }
            
            if(palabra.substring(0,1).equals("X") && palabra.substring(4,5).equals("0")){
                contador1++;
            } else {
                contador2++;
            }
            
            if("&&&&&".equals(palabra)){
                contador2--; //para que no me lo tome como lectura incorrecta
            }
        }while(!"&&&&&".equals(palabra));
        
        System.out.println("La cantidad de lecturas correctas son "+contador1);
        System.out.println("La cantidad de lecturas incorrectas son "+contador2);
    }
}
