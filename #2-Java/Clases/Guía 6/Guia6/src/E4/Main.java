/*
Definir una clase llamada Punto con un constructor que inicialice las coordenadas
x e y. Generar dos instancias, es decir, crear dos objetos llamados punto1 y
punto2 y comprobar la distancia que existe entre ambos.
*/

package E4;

public class Main {
    
    public static void main(String[] args) {
        
        Punto punto1 = new Punto(100,200);
        Punto punto2 = new Punto(300,400);
        
        System.out.println("La coordenada es "+punto1.getX()+","+punto1.getY());
        System.out.println("La coordenada es "+punto2.getX()+","+punto2.getY());
        
        double resultado = Punto.distancia(punto1,punto2);  //si al método lo hago en el Main, va sin el nombre de la class(distancia(obj1,obj2))
        
        System.out.println("\nLa distancia es: "+resultado);
    }
}
    
//        
//        System.out.println("Ingrese las cordenadas X,Y");
//        double x1 = read.nextInt();
//        double y1 = read.nextInt();
//        Punto punto1 = new Punto(x1,y1);    //punto1.setX(100);    //punto1.setY(100);
//        System.out.println("La coordenada es "+punto1.getX()+","+punto1.getY());
//        
//        System.out.println("Ingrese las cordenadas X,Y");
//        double x2 = read.nextInt();
//        double y2 = read.nextInt();
//        Punto punto2 = new Punto(x2,y2);    //punto2.setX(200);    //punto2.setY(200);
//        System.out.println("La coordenada es "+punto2.getX()+","+punto2.getY());
//        
//        System.out.println("La distancia es: "+punto1.calcularDistancia(punto2));