/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado alto y un atributo privado largo, dados por el usuario. La clase también
incluirá un método para calcular la superficie del rectángulo, un método para
calcular el perímetro del rectángulo y otro que desplace el rectángulo en el plano.
Y por último tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos
getters, setters y constructores correspondientes.
Formulas: 𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 𝑏𝑎𝑠𝑒 ∗ 𝑎𝑙𝑡𝑢𝑟𝑎 / 𝑃𝑒𝑟í𝑚𝑒𝑡𝑟𝑜 = (𝑏𝑎𝑠𝑒 + 𝑎𝑙𝑡𝑢𝑟𝑎) ∗ 2.
*/

package Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el alto y el largo del rectangulo");
        Rectangulo rec1 = new Rectangulo();
        rec1.setAlto(sc.nextInt());
        rec1.setLargo(sc.nextInt());
        
        System.out.println("Ingrese cuanto desea moverlo del alto y largo");
        Rectangulo rec2 = new Rectangulo();
        rec2.setAlto(sc.nextInt());
        rec2.setLargo(sc.nextInt());
               
        Servicios invoc = new Servicios();
        
        System.out.println("La superficie del rectangulo es de " + Servicios.superficieRectangulo(rec1));
        System.out.println("El perimetro del rectangulo es de " + Servicios.superficieRectangulo(rec1));                
        Servicios.dibujoRectangulo(rec1);
        Servicios.moverRectangulo(rec2, rec1);
        
    }

}
