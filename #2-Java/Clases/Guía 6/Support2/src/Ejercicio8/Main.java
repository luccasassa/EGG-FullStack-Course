/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
y el interés anual que se aplica a la cuenta (porcentaje). Las operaciones
asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes con los que llenaremos el
objeto en el Main.
• Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
diario (interés anual dividido entre 365 aplicado al saldo actual)
• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
*/

package Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int resp;
        
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();        
        
        System.out.println("Ingrese su numero de cuenta");
        cuenta1.setCuentaBancaria(sc.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta1.setDNI(sc.nextInt());
        System.out.println("Cuanto dinero va a ingresar?");
        cuenta1.setSaldo(sc.nextInt());
        System.out.println("Ingrese el interes anual");
        cuenta1.setInteresAnual(sc.nextInt());
        
        System.out.println("Desea 1-Depositar, "
                + "2-Retirar, "
                + "3-Mostrar saldo, "
                + "4- Mostrar datos de la cuenta, "
                + "5-Salir");
        resp = sc.nextInt();
                        
        do {
            switch (resp){
                case 1: System.out.println("Cuanto dinero ingresará?");
                    cuenta2.setSaldo(sc.nextInt());
                    Servicios.Agregar(cuenta1, cuenta2);
                    break;
                case 2: System.out.println("Cuanto dinero desea retirar?");
                    cuenta2.setSaldo(sc.nextInt());
                    if (cuenta2.getSaldo()>cuenta1.getSaldo()){
                        System.out.println("El saldo es mayor al que tiene");
                        do {
                            System.out.println("Ingrese un saldo menor");
                            cuenta2.setSaldo(sc.nextInt());
                        }while (cuenta2.getSaldo()>cuenta1.getSaldo());
                        Servicios.Sacar(cuenta1, cuenta2);
                        break;
                    } else {
                        Servicios.Sacar(cuenta1, cuenta2);
                        break;
                    }
                case 3: System.out.println(cuenta1.getSaldo());
                    break;
                case 4: Servicios.Imprimir(cuenta1);
                    break;
                case 5: System.out.println("Pasala lindo loco, chau chau!"); 
                    break;
            }
            System.out.println("Desea 1-Depositar, 2-Retirar, 3-Mostrar saldo, 4- Mostrar datos de la cuenta,5-Salir");
            resp = sc.nextInt();
        } while (resp!=5);
        
    }

}
