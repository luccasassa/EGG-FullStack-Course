/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las
notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado se obtienen 4 notas, 2
por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada
nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 70% de sus notas del curso.
*/

package Ejercicios;
import javax.swing.JOptionPane;
public class E_45 {
    
    public static void main(String[] args) {
        
        double tp1,tp2,integrador1,integrador2;
        double[] vector = new double[10];
        
        for (int i=1; i<10; i++) {
            System.out.println("Ingrese las 4 notas del "+i+"° alumno");
            
            tp1 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 1° trabajo práctico (10%)"));
            while(tp1<1 || tp1>10){
                JOptionPane.showMessageDialog(null,"**ERROR** La nota debe ser entre 1 y 10");
                tp1 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 1° trabajo práctico (10%)"));
            }
            
            tp2 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 2° trabajo práctico (15%)"));
            while(tp2<1 || tp2>10){
                JOptionPane.showMessageDialog(null,"**ERROR** La nota debe ser entre 1 y 10");
                tp2 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 2° trabajo práctico (15%)"));
            }
            
            integrador1 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 1° Integrador (25%)"));
            while(integrador1<1 || integrador1>10){
                JOptionPane.showMessageDialog(null,"**ERROR** La nota debe ser entre 1 y 10");
                integrador1 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 1° Integrador (25%)"));
            }
            
            integrador2 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 2° integrador (50%)"));
            while(integrador2<1 || integrador2>10){
                JOptionPane.showMessageDialog(null,"**ERROR** La nota debe ser entre 1 y 10");
                integrador2 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 2° Integrador (50%)"));
            }

            vector[i]=(double) (tp1*0.10+tp2*0.15+integrador1*0.25+integrador2*0.50);    //es necesario castear. (double para promedios con coma)
        }
        
        for (int i=1; i<10; i++) {
            //System.out.println("["+vector[i]+"]");
            
            if(vector[i]>7){
                System.out.println("\nAlumno "+i+"° - Nota Final ("+vector[i]+") - APROBADO");
            }else{
                System.out.println("\nAlumno "+i+"° - Nota Final ("+vector[i]+") - DESAPROBADO");
            }
        }
    }
}
