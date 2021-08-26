package E_13;
import java.util.Random;
import java.util.Scanner;
public class Ahorcado_Individual {
    
    public static void main(String[] args) {
        String palabraSecreta = Secreta();
        char [] palabraGuiones = Guiones(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner sc = new Scanner(System.in);
        int intentos = 5;
        
        do{
            System.out.println("Palabra elegida aleatoriamente!");
            System.out.println(palabraGuiones);
            System.out.println(intentos+" intentos restantes");
            
            System.out.println("\nIntroduce una letra");
            char letra = sc.next().charAt(0);
            
            boolean algunaLetraAcertada = false;
            
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i)==letra){
                    palabraGuiones[i] = letra;
                    algunaLetraAcertada = true;
                }
            }
            
            if(!algunaLetraAcertada){
                System.out.println("No has acertado ninguna letra");
                --intentos;
                if(intentos==0){
                    System.out.println("Perdiste, no te quedan más intentos");
                    juegoTerminado = true;
                }
            }else{
                boolean juegoGanado = !hayGuiones(palabraGuiones);
                if(juegoGanado){
                    System.out.println("Ganaste!");
                    juegoTerminado = true;
                }
            }
        }while(!juegoTerminado);
        //sc.close();
    }
//--------------------------------------------------------------------    
    public static String Secreta(){
        String[] palabras = {"perro","laboratorio","estacionamiento","celular","escritorio","computadora"};
        Random azar = new Random();
        int n = azar.nextInt(palabras.length);
        return palabras[n];
    }
//--------------------------------------------------------------------
    public static char[] Guiones(String palabra){
        int nLetrasPalabraSecreta = palabra.length();
        char[] palabraGuiones = new char[nLetrasPalabraSecreta];
       
        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }
        return palabraGuiones; 
    }
//--------------------------------------------------------------------    
    public static boolean hayGuiones(char[] array){
        for(char l:array){
            if(l=='_'){
                return true;
            }
        }
        return false;
    }
}
