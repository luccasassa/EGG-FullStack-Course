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
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {    //ARREGLAR SALDO NEGATIVO
        
        int numcuenta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su N° de Cuenta:","BBVA",JOptionPane.PLAIN_MESSAGE));
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su DNI:","BBVA",JOptionPane.PLAIN_MESSAGE));
        int saldoact = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su saldo inicial:","BBVA",JOptionPane.PLAIN_MESSAGE));
        int interesbanco = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el interés anual:","BBVA",JOptionPane.PLAIN_MESSAGE));
        
        Cuenta objeto1 = new Cuenta(numcuenta,id,saldoact,interesbanco);
        
        int opcion = 123;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una operación\n"
            + "1. Ingresar Saldo.\n"
            + "2. Retirar Saldo.\n"
            + "3. Consultar Saldo.\n"
            + "4. Consultar Datos.\n"
            + "5. Actualizar Saldo.\n"
            + "0. SALIR","BBVA",JOptionPane.PLAIN_MESSAGE));
            
            switch(opcion){
                case 1: int ingreseSaldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a depositar:","(1)INGRESAR SALDO",JOptionPane.PLAIN_MESSAGE));
                    saldoact = objeto1.ingresarSaldo(ingreseSaldo);
                    JOptionPane.showMessageDialog(null,"Usted ingresó $"+ingreseSaldo+"\nSu nuevo saldo es $"+saldoact,"SALDO ACTUALIZADO",JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 2: int retireSaldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a retirar:","(2) RETIRAR SALDO",JOptionPane.PLAIN_MESSAGE));
                    saldoact = objeto1.retirarSaldo(retireSaldo);
                    JOptionPane.showMessageDialog(null,"Usted retiró $"+retireSaldo+"\nSu nuevo saldo es $"+saldoact,"SALDO ACTUALIZADO",JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 3: JOptionPane.showMessageDialog(null,"Su saldo actual es "+objeto1.getSaldoActual(),"(3) CONSULTAR SALDO",JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 4: JOptionPane.showMessageDialog(null,objeto1.datos(objeto1),"(4) CONSULTAR DATOS",JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 5: JOptionPane.showMessageDialog(null,"Su interés anual es: " +interesbanco+"% \n"
                    + "Su saldo Actualizado es: $"+saldoact,"(5) ACTUALIZAR SALDO",JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 0: System.out.println("");
                break;
                
                default: JOptionPane.showMessageDialog(null,"OPCIÓN NO VÁLIDA","***ERROR***",JOptionPane.ERROR_MESSAGE);
                break;
            }
        }while(opcion!=0);
    }
}
