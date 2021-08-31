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
• Agregar los métodos getters y setters correspondientes
 */

package ejercicio08;

public class CuentaBancaria {
    
    private Integer numeroCuenta;
    private Integer dniCliente;
    private double saldoActual;
    private double interesAnual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer numeroCuenta, Integer dniCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    /**
     *
     *
     * @return
     */
    public double actualizarSaldo() {
        double interesDiario=interesAnual/365;
        saldoActual+=((interesDiario * saldoActual) /100);
        return saldoActual;
    }
    
    public double ingresarSaldo(double ingreso) {
        this.saldoActual+=ingreso;
        return saldoActual;
        
    }
    
    public double retirarSaldo(double retiro) {
        this.saldoActual-=retiro;
        return saldoActual;
        
    }

    @Override
    public String toString() {
        return "Sus datos son: \n" + "Numero de Cuenta: " + numeroCuenta + "\n"
                + "DNI: " + dniCliente + "\nSaldo Actual: " + saldoActual + "\n"
                + "Interes Anual: " + interesAnual;
    }
    
    

}
