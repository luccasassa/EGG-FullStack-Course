/*
Definir una clase llamada Punto con un constructor que inicialice las coordenadas
x e y. Generar dos instancias, es decir, crear dos objetos llamados punto1 y
punto2 y comprobar la distancia que existe entre ambos.
*/

package E4;

public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y){this.x = x;this.y = y;}

    public void setX(int x){this.x = x;}

    public int getX(){return x;}

    public void setY(int y){this.y = y;}

    public int getY(){return y;}
    
    public static double distancia(Punto a,Punto b){
        double x = (b.getX()-a.getX());
        double y = (b.getX()-a.getX());
        
        double potenciaX = Math.pow(x, 2);
        double potenciaY = Math.pow(y, 2);
        
        double sumaXY = potenciaX + potenciaY;
        double distancia = Math.sqrt(sumaXY);
        return distancia;
    }
    
    //    public double calcularDistancia(Punto punto1){
    //        int x1=x;
    //        int y1=y;
    //        int x2=punto1.getX();
    //        int y2=punto1.getY();
    //        
    //        double dis=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    //        return dis;
    //    }
}
