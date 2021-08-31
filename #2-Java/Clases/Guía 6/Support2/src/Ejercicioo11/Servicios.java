/*
• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
 */

package Ejercicioo11;

public class Servicios {
    
    public static int LlenarCafetera(Cafetera cafe1,Cafetera cafe2){
        int llenar;
        cafe2.setCantidadActual(cafe1.getCapacidadMaxima());
        llenar = cafe1.getCapacidadMaxima();       
        return llenar;
    }
    
    public static int ServirTaza(Cafetera cafe1, Cafetera cafe2){
        int servir;
        servir=100;
        if(cafe2.getCantidadActual()<servir){
            System.out.println("No hay suficiente cafe, por favor llene la cacfetera");
        } else {
            cafe2.setCantidadActual(cafe2.getCantidadActual()-servir);
        }                
        return servir;
    }
    
    public static int VaciarCafetera(Cafetera cafe1, Cafetera cafe2){
        int vaciar;
        vaciar = 0;
        cafe2.setCantidadActual(cafe1.getCantidadActual());                
        return vaciar;
    }
    
    public static int AgregarCafe(Cafetera cafe1, Cafetera cafe2){
        int agregar,resto;
        resto = cafe2.getCapacidadMaxima()-cafe2.getCantidadActual();
        if (resto<cafe2.getAgregar()){
            System.out.println("No puede agregar mas del maximo!!");
        } else {
            cafe2.setCantidadActual(cafe2.getCantidadActual()+cafe2.getAgregar());
        }
        agregar=cafe2.getAgregar();        
        return agregar;
    }
    
}
