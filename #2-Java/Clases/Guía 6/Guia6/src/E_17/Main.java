/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array (por
ejemplo mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el
mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que
vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución del programa
podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
*/

package E_17;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Secreto objeto1 = new Secreto();
        Servicios objeto2 = new Servicios();
        
        System.out.println("Adivine el mes");
        objeto1.setMesSecreto(sc.next());
        
        objeto2.adivina(objeto1);
        
        do{
            if (objeto2.adivina(objeto1)==false){
                System.out.println("**INCORRECTO** INTENTE NUEVAMENTE");
                objeto1.setMesSecreto(sc.next());
                objeto2.adivina(objeto1);
            }
            if(objeto2.adivina(objeto1)==true){
                System.out.println("**CORRECTO** ACERTASTE");
            }
        }while(objeto2.adivina(objeto1)==false);
    }
}
