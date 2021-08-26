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

package E9;

public class Servicios {
    
    public void obtenerRaices(Raices objeto1){
        double x1 = (-objeto1.getB()+Math.sqrt(objeto1.getDiscriminante())) / (2 * objeto1.getA());
        double x2 = (-objeto1.getB()-Math.sqrt(objeto1.getDiscriminante())) / (2 * objeto1.getA());
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    public Boolean tieneRaices(Raices objeto1) {
        boolean rpta1 = objeto1.getDiscriminante() > 0;
        return rpta1;
    }
    
    /*Cuando el discriminante valga cero, la ecuación tendrá una solución única 
    (también se dice que la ecuación tiene una solución doble).
    Si es menor que cero, como no existen las raíces de números negativos, 
    la ecuación no tendrá soluciones. Y si es mayor que zero, 
    la ecuación tendrá dos soluciones.*/
    
    public void obtenerRaiz(Raices objeto1) {
        double x3 = ((-objeto1.getB())+0) / (2*objeto1.getA());
        System.out.println("x1 y x2 = "+x3);
    }
    public Boolean tieneRaiz(Raices objeto1) {
        boolean rpta2 = objeto1.getDiscriminante() == 0;
        return rpta2;
    }
    
    public void calcular(Raices objeto1){
        if(tieneRaices(objeto1)==true){
            obtenerRaices(objeto1);
        }
        if(tieneRaiz(objeto1)==true){
            obtenerRaiz(objeto1);
        }
        if(tieneRaices(objeto1)==false && tieneRaiz(objeto1)==false){
            System.out.println("La ecuación no tiene raíces");
        }
    }
}
