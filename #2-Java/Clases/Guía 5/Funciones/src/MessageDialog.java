import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class MessageDialog {
    
    public static void main(String[] args) {
        
        //------------------------------------------MESSAGE DIALOG------------------------------------------
        
        //JOptionPane.showMessageDialog(COMPONENTE, MENSAJE);
        JOptionPane.showMessageDialog(null,"Hola como estas");

        //ICONOS DE ALERTAS
        
        //JOptionPane.showMessageDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE);
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.ERROR_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.QUESTION_MESSAGE);
        
        //JOptionPane.showMessageDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE, ICONO);
        JOptionPane.showMessageDialog(null,"Hola como estas","COLOCAR TITULO",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/bbva.png"));
        
    }
}
//Facherito no?