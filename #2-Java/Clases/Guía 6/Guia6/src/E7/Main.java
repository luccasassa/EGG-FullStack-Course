/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado alto y un atributo privado largo, dados por el usuario. La clase también
incluirá un método para calcular la superficie del rectángulo, un método para
calcular el perímetro del rectángulo y otro que desplace el rectángulo en el plano.
Y por último tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos
getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.
*/

package E7;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el alto y el largo del rectángulo");
        Rectangulo objeto1 = new Rectangulo();    //éste método me pide crear obligatoriamente un constructor vacío
        objeto1.setAlto(read.nextInt());
        objeto1.setLargo(read.nextInt());
        
        Rectangulo.dibujar(objeto1);
        //----------------------------------------------------
//        System.out.println("Digite un nuevo Alto y Largo para moverlo");
//        Rectangulo objeto2 = new Rectangulo();
//        objeto2.setAlto(read.nextInt());
//        objeto2.setLargo(read.nextInt());
//         
//        System.out.println(Rectangulo.mover(objeto1,objeto2));
        //----------------------------------------------------
        System.out.println("La superficie del rectángulo es de: "+Rectangulo.calcularSuperficie(objeto1));
        System.out.println("El perímetro del rectángulo es de: "+Rectangulo.calcularPerimetro(objeto1));
    }
}

//2da forma de crar objetos

//        System.out.println("Ingrese el alto y el largo del rectángulo");
//        int alto1 = read.nextInt();
//        int largo1 = read.nextInt();
//        Rectangulo objeto1 = new Rectangulo(alto1,largo1);
//        //----------------------------------------------------
//        System.out.println("Digite un nuevo Alto y Largo para moverlo");
//        int alto2 = read.nextInt();
//        int largo2 = read.nextInt();
//        Rectangulo objeto2 = new Rectangulo(alto2,largo2);
