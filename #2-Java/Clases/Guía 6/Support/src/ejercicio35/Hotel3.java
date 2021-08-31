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
public class Hotel3 extends Alojamiento {

    protected Integer cantHabitaciones;
    protected Integer cantCamas;
    protected Integer pisos;
    protected Integer precioHab;

    public Hotel3() {
        super();
    }

    public Hotel3(Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab) {
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }

    public Hotel3(Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }
    
    public Integer calcularPrecioHab() {
        precioHab = 50 + (1 * cantCamas);
        return precioHab;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreAlojamiento + ". Direccion: " + direccion + ". Localidad: " + localidad + ". Gerente: " + gerente + ". "
                + "Cant Hab" + cantHabitaciones + ", cantCamas=" + cantCamas + ", pisos=" + pisos + ", precioHab=" + precioHab ;
    }
    
    
    
}
