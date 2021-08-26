/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
*/

package Ejercicios;
import java.util.Scanner;
public class E_35 {
    
    public static void main(String[] args) { 
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        //int rs,rr,rm,rd; 
        System.out.println("Ingrese dos números");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("Qué operación desea realizar?");
        String respuesta=leer.next(); //En caso de ser mas de una palabra SI VA .nextLine!!!!!!!!!
        
        switch (respuesta.toLowerCase()){
            case "s": System.out.println("La suma entre "+num1+" y "+num2+" es "+sumar(num1,num2));
            break;
            case "r": System.out.println("La resta entre "+num1+" y "+num2+" es "+restar(num1,num2));
            break;
            case "m": System.out.println("La multiplicación entre "+num1+" y "+num2+" es "+multiplicar(num1,num2));
            break;
            case "d": System.out.println("La división entre "+num1+" y "+num2+" es "+dividir(num1,num2));
            break;
            default: System.out.println("Ingresó una operación inválida");
            break;
        }
    }
    //----------------------------------------------------------------------------
    public static int sumar(int num1,int num2){ //void en caso de no retornar una variable
        int rs=num1+num2;
        return rs;
    }
    //----------------------------------------------------------------------------
    public static int restar(int num1,int num2){
        int rr=num1+num2;
        return rr;
    }
    //----------------------------------------------------------------------------
    public static int multiplicar(int num1,int num2){
        int rm=num1*num2;
        return rm;
    }
    //----------------------------------------------------------------------------
    public static int dividir(double num1,double num2){
        double rd=num1/num2;
        return (int) rd;
    }
}
