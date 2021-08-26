/*
*
*/

package Ejercicios;
import java.util.Scanner;
public class E_26a {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String cadena="";
        char inicio='0',fin='0';
        int longitud=0,valida=0,invalida=0,contador=0;
        
        do{
            System.out.println("Ingrese el codigo");
            cadena=in.nextLine();
            longitud=cadena.length();
            inicio=cadena.charAt(0);
            fin=cadena.charAt(cadena.length()-1);

            for (int i=0; i<longitud;i++) {
                if(cadena.charAt(i)=='&'){
                ++contador;
                }
            }

            if(contador==5){
                System.out.println("Secuencia especial ingresada");
                break;
            }
            
            if(longitud!=5){
                System.out.println("Longitud invalida");
            break;
            }
            
            if(inicio=='X' && fin=='0'){
                valida=valida +1;
            }else {
            invalida=invalida + 1;
            }
        }while(!"&&&&&".equals(cadena));
        
        System.out.println("Cantidad de instrucciones validas "+valida);
        System.out.println("Cantidad de instrucciones invalidas "+invalida);  
    }
}
