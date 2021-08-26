/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/

package Ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E_23 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos números");
        double num1=leer.nextInt();
        double num2=leer.nextInt();
        int opcion=0;
        String opcionP="";
        int respuesta=0;
        String respuestaP="";
        
        do{
                opcionP=JOptionPane.showInputDialog("***MENU***\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir");
                opcion=Integer.parseInt(opcionP);

                switch(opcion){
                    case 1: JOptionPane.showMessageDialog(null,"SUMA: "+num1+" + "+num2+" = "+ (num1+num2));
                    break;
                    case 2: JOptionPane.showMessageDialog(null,"RESTA: "+num1+" - "+num2+" = "+ (num1-num2));
                    break;
                    case 3: JOptionPane.showMessageDialog(null,"MULTIPLICACIÓN: "+num1+ " x "+num2+" = "+ (num1*num2));
                    break;
                    case 4: JOptionPane.showMessageDialog(null,"DIVISIÓN "+num1+" / "+num2+" = "+ (num1/num2));
                    break;
                    case 5: respuestaP=JOptionPane.showInputDialog("¿Está seguro que desea salir del programa?\n"
                                +"1. ACEPTAR\n"
                                +"2. RECHAZAR");
                            respuesta=Integer.parseInt(respuestaP);
                            if(respuesta==2){
                            continue;
                            }else{
                                break;
                            }
                    default: JOptionPane.showMessageDialog(null,"ERROR. Elija una opción válida");
                    break;
                }
        }while (respuesta!=1);
    }
}
