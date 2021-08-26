/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados 
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
*/

package Ejercicios;
import java.util.Scanner;
public class E_51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        String palabra1,palabra2,palabra3,palabra4,palabra5;
        int cant, largo,num,pal,pal1,rand;
        String abc,l;
        String matriz[][] = new String[20][20];
        abc = "qwertyuiopasdfghjklñzxcvbnm";
        largo = abc.length();
        
        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres");
        do {
            palabra1 = sc.next();
            cant=palabra1.length();
            if (cant>5 || cant<3){
                System.out.println("Entre 3 y 5 caracteres");
            }
        } while (cant>5 || cant<3);
        
        do {
            palabra2 = sc.next();
            cant=palabra2.length();
            if (cant>5 || cant<3){
                System.out.println("Entre 3 y 5 caracteres");
            }
        } while (cant>5 || cant<3);
        
        do {
            palabra3 = sc.next();
            cant=palabra3.length();
            if (cant>5 || cant<3){
                System.out.println("Entre 3 y 5 caracteres");
            }
        } while (cant>5 || cant<3);
        
        do {
            palabra4 = sc.next();
            cant=palabra4.length();
            if (cant>5 || cant<3){
                System.out.println("Entre 3 y 5 caracteres");
            }
        } while (cant>5 || cant<3);
        
        do {
            palabra5 = sc.next();
            cant=palabra5.length();
            if (cant>5 || cant<3){
                System.out.println("Entre 3 y 5 caracteres");
            }
        } while (cant>5 || cant<3);
        
        for(int i=0;i<19;i++){
            for(int k=0;k<=19;k++){
                num = (int) (Math.random()*(largo-1));
                l = abc.substring(num,num+1);
                matriz[i][k] = l;
            }
        }
        
        pal =(int) (Math.random()*(largo-6));
        pal1 = palabra1.length();
        rand = (int) (Math.random()*15);
        for(int i=0;i<=pal1-1;i++){
            matriz[pal][rand+i]=palabra1.substring(i,i+1);
        }    
        
        pal =(int) (Math.random()*(largo-6));
        pal1 = palabra2.length();
        rand = (int) (Math.random()*15);
        for(int i=0;i<=pal1-1;i++){
            matriz[pal][rand+i]=palabra2.substring(i,i+1);
        }      
        
        pal =(int) (Math.random()*(largo-6));
        pal1 = palabra3.length();
        rand = (int) (Math.random()*15);
        for(int i=0;i<=pal1-1;i++){
            matriz[pal][rand+i]=palabra3.substring(i,i+1);
        }
        
        pal =(int) (Math.random()*(largo-6));
        pal1 = palabra4.length();
        rand = (int) (Math.random()*15);
        for(int i=0;i<=pal1-1;i++){
            matriz[pal][rand+i]=palabra4.substring(i,i+1);
        }
        
        pal =(int) (Math.random()*(largo-6));
        pal1 = palabra5.length();
        rand = (int) (Math.random()*15);
        for(int i=0;i<=pal1-1;i++){
            matriz[pal][rand+i]=palabra5.substring(i,i+1);
        }
        
        for(int i=0;i<19;i++){
            for(int k=0;k<=19;k++){
                System.out.print(matriz[i][k]+" ");
            }
            System.out.println("");
        }
    }
}
