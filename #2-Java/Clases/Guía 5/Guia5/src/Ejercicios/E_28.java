/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
*/

package Ejercicios;
import javax.swing.JOptionPane;
public class E_28 {
    
    public static void main(String[] args) {
        
        System.out.println("Generando dos números aleatorios......");
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        System.out.println("Multiplicándolos......");
        int resultado=num1*num2;
        int numero;
        int contador=0;
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Adivine el resultado: "));
            
            if(resultado>numero){
                System.out.println("Digite un número mayor");
            }else{
                System.out.println("Digite un número menor");
            }
            ++contador;
        }while(numero!=resultado);
        
        System.out.println("\nBien!! El resultado era: "+resultado);
        System.out.println("\nLo adivinaste en: "+contador+" intentos");
    }
}
