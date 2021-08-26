import javax.swing.JOptionPane;
public class InputDialog {
    
    public static void main(String[] args) {
        
        //------------------------------------------INPUT DIALOG------------------------------------------
        
        //Este cuadro de dialogo es para ingresar datos, todo lo que se reciba se tomará como un String
        //JOptionPane.showInputDialog(MENSAJE);
        //JOptionPane.showInputDialog(COMPONENTE, MENSAJE);
        //JOptionPane.showInputDialog(COMPONENTE,VALOR INICIAL);
        //JOptionPane.showInputDialog(COMPONENTE, MENSAJE,VALOR INICIAL);
        //JOptionPane.showInputDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE);
        //JOptionPane.showInputDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE, ICONO, ARREGLO, VALOR INICIAL);

        String animal = (JOptionPane.showInputDialog(null,"Selecciona el animal que te gusta mas","Animales", 
                JOptionPane.PLAIN_MESSAGE,null,new Object[] { "Selecciona","Perro", "Gato", "Mono", "Caballo" },
                "Selecciona")).toString();
        JOptionPane.showMessageDialog(null, "Tu animal favorito es:  "+animal, "Animales", JOptionPane.PLAIN_MESSAGE);

       
        int numAleatorio = Integer.parseInt(JOptionPane.showInputDialog(null,"Intoduce un numero cualquiera","Numeros Aleatorios", 
                JOptionPane.PLAIN_MESSAGE));
        JOptionPane.showMessageDialog(null,"Tu numero aleatorio es  "+numAleatorio,"Numeros Aleatorios",JOptionPane.PLAIN_MESSAGE);
    }
}
//Facherito no?