/*
Crear una clase Rectángulo que modelee rectángulos por medio de un atributo
privado alto y un atributo privado largo, dados por el usuario. La clase también
incluirá un método para calcular la superficie del rectángulo, un método para
calcular el perímetro del rectángulo y otro que desplace el rectángulo en el plano.
Y por último tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos
getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.
*/

package E7;

public class Rectangulo {
    private int alto;
    private int largo;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }
    
    Rectangulo() {
        //creado automáticamente por setear atributos en el main
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getAlto() {
        return alto;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getLargo() {
        return largo;
    }
    
    
    public static int calcularSuperficie(Rectangulo objeto1){
        int superficie = (objeto1.getLargo()*objeto1.getAlto());
        return superficie;
    }
    
    public static int calcularPerimetro(Rectangulo objeto1){
        int perimetro = ((objeto1.getLargo()+objeto1.getAlto())*2);
        return perimetro;
    }
    
    public static void dibujar(Rectangulo objeto1){
        //String dibujo = "*";
        
        for (int i=0; i<objeto1.getAlto(); i++) {
            System.out.print("*");
            for (int j=1; j<objeto1.getLargo()-2; j++) {
                if(i==0 || i==objeto1.getLargo()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        //return dibujo;
    }
    
//    public static String mover(Rectangulo objeto2,Rectangulo objeto1){
//        String movimiento = "";
//        
//        for (int i=0; i<objeto2.getAlto(); i++) {
//            System.out.println(" ");
//        }
//        for (int a=0; a<objeto1.getAlto(); a++) {
//            for (int b=0; b<objeto2.getLargo(); b++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j=0; j<objeto1.getLargo()-1; j++) {
//                if(a==0 || a==objeto1.getAlto()-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("*");
//        }
//        return movimiento;
//    }
}

