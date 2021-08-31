/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Hotel4 extends Hotel3 {

    protected char gym;
    protected String nombreResturant;
    protected Integer capRestaurant;

    public Hotel4() {
        super();
    }

    public Hotel4(char gym, String nombreResturant, Integer capRestaurant) {
        this.gym = gym;
        this.nombreResturant = nombreResturant;
        this.capRestaurant = capRestaurant;
    }

    public Hotel4(char gym, String nombreResturant, Integer capRestaurant, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab) {
        super(cantHabitaciones, cantCamas, pisos, precioHab);
        this.gym = gym;
        this.nombreResturant = nombreResturant;
        this.capRestaurant = capRestaurant;
    }

    public Hotel4(char gym, String nombreResturant, Integer capRestaurant, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreResturant = nombreResturant;
        this.capRestaurant = capRestaurant;
    }

    public Integer valorAgregadoRest() {
       
        if (capRestaurant < 30) {
          return 10;   
        } else if (capRestaurant >=30 && capRestaurant <= 50) {
            return 30;
        } else {
            return 50;
        }     
    }
    
    public Integer valorAgregadoGym() {
        if (gym == 'A') {
            return 50;
        } else {
            return 30;
        } 
    }

    @Override
    public Integer calcularPrecioHab() {
        precioHab = 50 + (1 * cantCamas) + valorAgregadoRest() + valorAgregadoGym();
        return precioHab;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreAlojamiento + ". Direccion: " + direccion + ". Localidad: " + localidad + ". Gerente: " + gerente + ". "
                + "Cant Hab" + cantHabitaciones + ", cantCamas=" + cantCamas + ", pisos=" + pisos + ", precioHab=" + precioHab + "gym=" + gym + ", nombreResturant=" + nombreResturant + ", capRestaurant=" + capRestaurant + '}';
    }

    
}
