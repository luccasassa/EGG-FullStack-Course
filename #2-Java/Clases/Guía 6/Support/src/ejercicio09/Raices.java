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


public class Raices {

    private Integer a;
    private Integer b;
    private Integer c;
    private double discriminante;

    public Raices() {
    }

    public Raices(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = Math.pow(b, 2) - (4 * a * c);
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    public void obtenerRaices() {
        double x1 = (-b + (Math.sqrt(discriminante))) / (2 * a);
        double x2 = (-b - (Math.sqrt(discriminante))) / (2 * a);

        System.out.println("X1=" + x1);
        System.out.println("X2=" + x2);
    }

    public void obtenerRaiz() {
        double x1 = (-b) / (2 * a);

        System.out.println("X1=X2=" + x1);
    }

    public Boolean tieneRaices() {
        if (this.discriminante > 0) {
            //System.out.println("La ecuacion tiene dos soluciones:");
        }
        return (this.discriminante > 0);
    }

    public Boolean tieneRaiz() {
        if (this.discriminante == 0) {
            //System.out.println("La ecuacion tiene una solución:");

        }
        return (this.discriminante == 0);
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();

        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuacion no tiene solución");
        }
    }

}
