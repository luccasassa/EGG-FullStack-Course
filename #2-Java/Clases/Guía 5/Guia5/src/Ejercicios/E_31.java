/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función contains() y replace() de Java
*/

package Ejercicios;
public class E_31 {
    
    public static void main(String[] args) {
        
        //String frase = "Hola mundo";
        //System.out.println(frase.replace("o", "a"));
        //System.err.println(frase.contains("a"));
        
        for (int i=0;i<=9;i++){
            for (int j=0;j<=9;j++){
                for (int k=0;k<=9;k++){
                    String reemplazo=(String.valueOf(i)+"-"+String.valueOf(j)+"-"+String.valueOf(k));
                    System.out.println(reemplazo.replace("3","E"));
                }
            }
        }
    }
}
