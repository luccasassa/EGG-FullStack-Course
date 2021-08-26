/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

package Ejercicios;
import java.util.Scanner;
public class E_42 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Digite el tamaño de su vector");
        int num = read.nextInt();
        int[] vector = new int [num];
        
        int digitos1=0, digitos2=0, digitos3=0, digitos4=0, digitos5=0, digitosnull=0;    //funcionan como contador
        
        System.out.println("\nRellene los subíndices de su vector manualmente");
        for (int i=0; i<num; i++) {
            vector[i]=read.nextInt();
            
            if (vector[i]>=0 && vector[i]<=9){
                digitos1++;
            }else if(vector[i]>=10 && vector[i]<=99){
                digitos2++;
            }else if (vector[i]>100 && vector[i]<=999){
                digitos3++;
            }else if(vector[i]>=1000 && vector[i]<=9999){
                digitos4++;
            }else if(vector[i]>=10000 && vector[i]<=99999){
                digitos5++;
            }else{
                digitosnull++;
            }
        }
        
        System.out.println("\nHay "+digitos1+" subíndices de 1 cifra\n"
        + "Hay "+digitos2+" subíndices de 2 cifras\n"
        + "Hay "+digitos3+" subíndices de 3 cifras\n"
        + "Hay "+digitos4+" subíndices de 4 cifras\n"
        + "Hay "+digitos5+" subíndices de 5 cifra\n"
        + "Hay "+digitosnull+" subíndices de más de 5 cifras");
        
        
    }
}
