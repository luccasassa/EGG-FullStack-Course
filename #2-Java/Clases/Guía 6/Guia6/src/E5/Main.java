/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
constructores: un constructor vacío y otro con la hora, minutos y segundos
ingresado por el usuario. Deberá definir además, los métodos getters y setters
correspondientes, y el método imprimirHoraCompleta().
*/

package E5;
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        
        int hora = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        while(hora<00 || hora>23){
            JOptionPane.showMessageDialog(null,"INGRESE HORAS VÁLIDAS","ERROR",JOptionPane.ERROR_MESSAGE);
            hora = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas nuevamente:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        }
        
        int minutos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los minutos:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        while(minutos<00 || minutos>59){
            JOptionPane.showMessageDialog(null,"INGRESE MINUTOS VÁLIDOS","ERROR",JOptionPane.ERROR_MESSAGE);
            minutos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los minutos nuevamente:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        }
        
        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los segundos:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        while(segundos<00 || segundos>59){
            JOptionPane.showMessageDialog(null,"INGRESE SEGUNDOS VÁLIDOS","ERROR",JOptionPane.ERROR_MESSAGE);
            segundos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los segundos nuevamente:","TIEMPO",JOptionPane.PLAIN_MESSAGE));
        }
        
        Tiempo objeto1 = new Tiempo(hora,minutos,segundos);
        
        System.out.println("La hora es: "+Tiempo.imprimirHoraCompleta(objeto1));
    }
}
