/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a
través de un método constructor. Luego, las operaciones que se podrán realizar
son las siguientes:
• Método obtenerRaices(): imprime las 2 posibles soluciones
• Método obtenerRaiz(): imprime una única raíz. Es en el caso en que se tenga una
única solución posible.
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método calcular(): mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación, y en caso de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
Solo varia el signo delante de -b
 */
package ejercicio09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de C");
        int c = leer.nextInt();
        
        /*
        Cuando vayan a calcular usen los valores a=1 b=4 c=3 para que les de dos valores. 
        A=2 b=4 c=2 para que les de un valor 
        Y 1,2,3 respectivamente para que les de que no tiene solución.
        */
        
        Raices ecuacion = new Raices(a, b, c);
        
        ecuacion.calcular();
        
//        if (ecuacion.getDiscriminante() >= 0) {
//            ecuacion.tieneRaices();
//            ecuacion.obtenerRaices();
//            
//        } else if (ecuacion.getDiscriminante() == 0) {
//            ecuacion.tieneRaiz();
//            ecuacion.obtenerRaiz();
//        }
    }
    
}
