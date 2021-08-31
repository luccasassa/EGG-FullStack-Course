    /*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
y el interés anual que se aplica a la cuenta (porcentaje). Las operaciones asociadas
a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
diario (interés anual dividido entre 365 aplicado al saldo actual)
• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
• Agregar los métodos getters y setters correspondientes.
 */
package ejercicio08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su saldo inicial ");
        double saldoActual = leer.nextDouble();
        System.out.println("Ingrese el interés anual");
        double interesAnual = leer.nextDouble();
        
        CuentaBancaria c1 = new CuentaBancaria(numeroCuenta, dni, saldoActual, interesAnual);
        
        int opc=999;
        do {
            System.out.println("Seleccion una operación");
            System.out.println("1-Ingresar Saldo");
            System.out.println("2-Retirar Saldo");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Consultar Datos");
            System.out.println("5-Actualizar Saldo");
            System.out.println("0-Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el monto a depositar");
                    double ingreso = leer.nextInt();
                    saldoActual = c1.ingresarSaldo(ingreso);
                    System.out.println("Su saldo actual es $" + saldoActual);
                    break;
                case 2:
                    System.out.println("Ingreso el monto a retirar");
                    double retiro = leer.nextInt();
                    saldoActual = c1.retirarSaldo(retiro);
                    System.out.println("Retiró: $"+ retiro+"\nSu nuevo saldo es $"
                            + saldoActual);
                    break;
                case 3:
                    System.out.println("Su saldo actual es: $" + c1.getSaldoActual());
                    break;
                case 4: 
                    System.out.println(c1.toString());
                    break;
                case 5:
                    c1.actualizarSaldo();
                    System.out.println("Su interés anual es :" +c1.getInteresAnual()+"% \n"
                            + "Su saldo Actualizado es: $"+c1.getSaldoActual());
                    break;
                case 0:
                    System.out.println("Has elegido Salir.");
                    break;
                
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
            
        } while (opc!=0);
        
        System.out.println("Gracias Por Utilizar Nuestros Servicios!");
        
    }
    
}
