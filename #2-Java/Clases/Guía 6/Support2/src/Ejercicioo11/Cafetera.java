/*

 */

package Ejercicioo11;

public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;
    private int agregar;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.agregar = agregar;
    }
    
    public Cafetera(){
        
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getAgregar() {
        return agregar;
    }

    public void setAgregar(int agregar) {
        this.agregar = agregar;
    }
    
}
