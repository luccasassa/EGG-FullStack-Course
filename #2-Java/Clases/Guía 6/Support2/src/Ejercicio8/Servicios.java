/*
 
 */

package Ejercicio8;

public class Servicios {
    
    public static int Agregar(Cuenta cuenta1, Cuenta cuenta2){
        int suma;
        suma = cuenta1.getSaldo()+cuenta2.getSaldo();
        cuenta1.setSaldo(suma);        
        return suma;
    }
    
    public static int Sacar(Cuenta cuenta1, Cuenta cuenta2){
        int resta;
        resta = cuenta1.getSaldo()-cuenta2.getSaldo();
        cuenta1.setSaldo(resta);
        return resta;
    }
    
    public static int Imprimir(Cuenta cuenta1){
        int imp=0;
        System.out.println("Numero de cuenta: " + cuenta1.getCuentaBancaria());
        System.out.println("DNI: " + cuenta1.getDNI());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("Interes anual: " + cuenta1.getInteresAnual());
        return imp;
    }
    
}
