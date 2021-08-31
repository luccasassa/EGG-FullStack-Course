/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual
de café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad
indicada.
• Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */
package ejercicio11;

public class Cafetera {

    private Integer capacidadMaxima;
    private Integer cantidadActual;

    //• Constructor predeterminado: establece la capacidad máxima en 1000 
    //(c.c.) y la actual en cero (cafetera vacía).
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    //Constructor con la capacidad máxima de la cafetera; inicializa la cantidad 
    //actual de café igual a la capacidad máxima.
    public Cafetera(Integer capacidadMaxima) {
        this.cantidadActual = capacidadMaxima;
    }

    //Constructor con la capacidad máxima y la cantidad actual. Si la 
    //cantidad actual es mayor que la capacidad máxima de la cafetera, 
    //la ajustará al máximo
    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
            System.out.println("La cantidad actual supera el máximo. Capacidad "
                    + "actual= " + this.cantidadActual);
        }
    }

    //Métodos getters y setters.
    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
    public Integer llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        return cantidadActual;
    }

    //Método servirTaza(int): simula la acción de servir una taza con la 
    //capacidad indicada.
    //Si la cantidad actual de café “no alcanza” para llenar la taza, 
    //se sirve lo que quede.
    public Integer servirTaza(Integer asdasd) {
        if (cantidadActual == 0) {
            System.out.println("Ups! No tienes más café, deberías agregar si quieres servirte"
                    + " una taza..");
        } else if (asdasd > cantidadActual) {
            System.out.println("Solo pudimoos llenar tu taza con " + cantidadActual + "c.c de café");
            vaciarCafetera();
            System.out.println("Si deseas mas café deberás llenar tu cafetera");
        } else {
            cantidadActual -= asdasd;
            System.out.println("Taza llena! Ahora quedan " + cantidadActual + "c.c de café");
        }

        return cantidadActual;
    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public Integer vaciarCafetera() {
        setCantidadActual(0);
        System.out.println("Cafetera Vacía!");
        return cantidadActual;
    }

    //Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
    public Integer agregarCafe(Integer asdasd) {
        if (asdasd > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("Excediste la capacidad . Tienes " + this.cantidadActual
            + "c.c de café");
        } else {
            this.cantidadActual += asdasd;
            System.out.println("Café agregado! Ahora tienes " + this.cantidadActual +
                    "c.c de café");
        }
        return cantidadActual;
    }

    public void printCafetera() {
        System.out.println("Tu Cafetera tiene: ");
        System.out.println("Capacidad Maxima: " + this.capacidadMaxima + "c.c \n"
                + "Cantidad Actual de Café: " + this.cantidadActual + "c.c");
    }

}
