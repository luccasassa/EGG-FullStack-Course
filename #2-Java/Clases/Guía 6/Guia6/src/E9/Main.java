/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores
de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a
través de un método constructor. Luego, las operaciones que se podrán realizar
son las siguientes:

• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
Solo varia el signo delante de -b
*/

package E9;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        //a=1 b=4 c=3 para 2 raíces
        //a=2 b=4 c=2 para una raíz
        //a=1 b=2 c=3 para ninguna raíz
        
        System.out.println("Ingrese el valor de sus coeficientes:");
        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        Raices objeto1 = new Raices(A,B,C);
        
        Servicios serv1 = new Servicios();
        serv1.calcular(objeto1);
    }
}
