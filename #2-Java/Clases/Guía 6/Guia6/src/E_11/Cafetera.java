/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
al menos, los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• Métodos getters y setters.
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
*/

package E_11;

public class Cafetera {
    private Integer capacidadMaxima;
    private Integer cantidadActual;
    private Integer taza;
    
    public Cafetera(Integer capacidadMaxima, Integer cantidadActual, Integer taza) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.taza = taza;
    }
    
    Cafetera() {
    }
    
    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public Integer getCantidadActual() {
        return cantidadActual;
    }    
    
    public void setTaza(Integer taza) {
        this.taza = taza;
    }
    public Integer getTaza() {
        return taza;
    }
    
    
    public int llenarCafetera(Cafetera objeto1){
        objeto1.cantidadActual = objeto1.capacidadMaxima;
        return objeto1.cantidadActual;
    }
    
    public int servirTaza(Cafetera objeto1){
        return objeto1.cantidadActual -= objeto1.taza;
    }
    
    public int vaciarCafetera(Cafetera objeto1){
        objeto1.cantidadActual = 0;
        return objeto1.cantidadActual;
    }
    
    public int agregarCafe(Cafetera objeto1, int agrego){
        return objeto1.cantidadActual += agrego;
    }
}
