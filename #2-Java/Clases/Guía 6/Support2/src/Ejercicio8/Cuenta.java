/*

• Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
diario (interés anual dividido entre 365 aplicado al saldo actual)
• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */

package Ejercicio8;

public class Cuenta {
    
    private int cuentaBancaria;
    private int DNI;
    private int saldo;
    private int interesAnual;

    public Cuenta(int cuentaBancaria, int DNI, int saldo, int interesAnual) {
        this.cuentaBancaria = cuentaBancaria;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }
    
    public Cuenta(){
        
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(int interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    
    
}
