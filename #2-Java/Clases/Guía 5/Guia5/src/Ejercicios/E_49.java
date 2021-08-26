/*
Crear cuadrado mágico 3 x 3 formado por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales sean idénticas.
Determinar si éste es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

Formato:
6  1  8
7  5  3  
2  9  4  

*/

package Ejercicios;
import javax.swing.JOptionPane;
public class E_49 {                 //DUDA LINEA 45
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];
        
        int c=0,l=2,suma1=0,suma2=0,suma3=0,suma4=0,suma5=0,suma6=0,suma7=0,suma8=0;
             
        System.out.println("Rellenando matriz......");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Subíndice "+i+","+j+": "));
                
                while(matriz[i][j]<1 || matriz[i][j]>9){
                    JOptionPane.showMessageDialog(null,"**ERROR** El subíndice debe ser entre 1 y 9");
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Subíndice "+i+","+j+": "));
                }
            }
        }
        
        for (int i=0; i<3; i++){
            suma1=suma1+matriz[0][i];
            suma2=suma2+matriz[1][i];
            suma3=suma3+matriz[2][i];
            suma4=suma4+matriz[i][0];
            suma5=suma5+matriz[i][1];
            suma6=suma6+matriz[i][2];
            suma7=suma7+matriz[i][i];    //diagonal principal
            suma8=suma8+matriz[i][l];    //diagonal secundaria
            l=l-1;                       //variable que actúa en conjunto con la diagonal secundaria
        }
        if(suma1==suma2){
            c++;
        }
        if(suma1==suma3){
            c++;
        }
        if(suma1==suma4){
            c++;
        }
        if(suma1==suma5){
            c++;
        }
        if(suma1==suma6){
            c++;
        }
        if(suma1==suma7){
            c++;
        }
        if(suma1==suma8){
            c++;
        }
        if (c==7){
            System.out.println("");
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    System.out.print("["+matriz[i][j]+"]"); //SIN SALTAR
                }
                System.out.println("");
            }
            System.out.println("\nEs un cuadrado magico");
        }else{
            System.out.println("\nNo es un cuadrado magico");
        }
    }
}
