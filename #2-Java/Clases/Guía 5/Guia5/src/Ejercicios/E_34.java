/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

package Ejercicios;
import javax.swing.JOptionPane;
public class E_34 {
    
    public static void main(String[] args) {
        
        int i=0,num,contador=0;
        
        while(contador<4){
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            
            if(num<1 || num>20){
                System.out.println("("+num+") *ERROR* El número debe ser entre 1 y 20");
            }else{
                System.out.print(num);
                for (i=1;i<=num;i++){
                    System.out.print("*"); //sin saltar
                }
                System.out.println("");
                ++contador;
            }
        }
    }
}
