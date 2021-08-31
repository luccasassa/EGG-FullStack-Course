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

public class Servicios {
    
    public static int superficieRectangulo(Rectangulo rec1){
        int superficie;
        superficie = rec1.getAlto() * rec1.getLargo();
        return superficie;
    }
    
    public static int perimetroRectangulo(Rectangulo rec1){
        int perimetro;
        perimetro = (rec1.getAlto()+rec1.getLargo())*2;
        return perimetro;
    }
    
    public static String dibujoRectangulo(Rectangulo rec1){
        String dibujo="*";
        
        for (int i=0;i<rec1.getAlto();i++){ 
            System.out.print("*");
            for (int k=0;k<rec1.getLargo()-2;k++){
                if (i==0 || i==rec1.getAlto()-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.println("*");
        }        
        return dibujo;
    }
    
    public static String moverRectangulo(Rectangulo rec2,Rectangulo rec1){
        String mover;
        mover = "*";
        for(int i=0;i<rec2.getAlto();i++){
            System.out.println(" ");
        }
        for (int l=0;l<rec1.getAlto();l++){ 
            for (int p=0;p<rec2.getLargo();p++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=0;k<rec1.getLargo()-2;k++){
                if (l==0 || l==rec1.getAlto()-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
        }
            System.out.println("*");
        }
        return mover;
    }
}
