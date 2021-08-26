/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
*/

package E3;

import java.util.Scanner;

public class InputMismatchException {
    
    public static void main(String[] args) {
        
        System.out.println("Generando número aleatorio entre 0 y 20...");
        int num = (int)(Math.random()*20);
        int c = 0;
        int intento;
        boolean exit = true;
        
        do{
            System.out.println("\n***Adivine el número***");
            try{
                exit = true;
                do{
                    Scanner sc = new Scanner(System.in).useDelimiter("\n");    //probablemente no me lo identifique, por eso lo meto en el do{
                    intento = sc.nextInt();

                    if (intento>num){
                        System.out.println("Digite un número menor");
                    } else {
                        System.out.println("Digite un número mayor");
                    }
                    c++;
                } while (intento!=num);
                System.out.println("Adivinaste el número ("+num+") en un total de "+c+" intentos.");
            } catch (Exception e) {
                System.err.println("Exception -> "+e.getClass());    //mostrar exception
                System.out.println("***CARACTER INVÁLIDO*** La cagaste en el intento "+(c+1));
                exit = false;
            }
        } while (exit!=true);    //es lo mismo poner solamente "true"
    }
}
