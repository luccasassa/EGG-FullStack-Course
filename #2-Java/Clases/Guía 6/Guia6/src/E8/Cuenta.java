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

package E8;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private int saldoActual;
    private int interesAnual;
    
    public Cuenta(int numeroCuenta, int dni, int saldoActual, int interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public long getDni() {
        return dni;
    }
    
    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    
    public void setInteresAnual(int interesAnual) {
        this.interesAnual = interesAnual;
    }
    public int getInteresAnual() {
        return interesAnual;
    }
    
    
    public int actualizarSaldo() {
        interesAnual=interesAnual/365;
        saldoActual=((interesAnual * saldoActual) /100);
        return saldoActual;
    }
    
    public int ingresarSaldo(int ingreso) {
        this.saldoActual+=ingreso;    //memorizar ésto
        return saldoActual;
    }
    
    public int retirarSaldo(int retiro) {
        this.saldoActual-=retiro;   //memorizar ésto
        return saldoActual;
    }

    public String datos(Cuenta objeto1){    //pude haber hecho un toString pero surgió un problemita de lectura de datos
        String datos = "N° DE Cuenta: "+this.numeroCuenta+"\n"
                        + "DNI: "+this.dni+"\n";
        return datos;
    }
}
