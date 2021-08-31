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
public class Hotel5 extends Hotel4 {
    
    protected Integer cantSalones;
    protected Integer cantSuites;
    protected Integer cantLimosinas;

    public Hotel5() {
        super();
    }

    public Hotel5(Integer cantSalones, Integer cantSuites, Integer cantLimosinas) {
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalones, Integer cantSuites, Integer cantLimosinas, char gym, String nombreResturant, Integer capRestaurant) {
        super(gym, nombreResturant, capRestaurant);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalones, Integer cantSuites, Integer cantLimosinas, char gym, String nombreResturant, Integer capRestaurant, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab) {
        super(gym, nombreResturant, capRestaurant, cantHabitaciones, cantCamas, pisos, precioHab);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalones, Integer cantSuites, Integer cantLimosinas, char gym, String nombreResturant, Integer capRestaurant, Integer cantHabitaciones, Integer cantCamas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreResturant, capRestaurant, cantHabitaciones, cantCamas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public Integer calcularPrecioHab() {
        precioHab = 50 + (1 * cantCamas) + valorAgregadoRest() + valorAgregadoGym() + (cantLimosinas*15);
        return precioHab;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreAlojamiento + ". Direccion: " + direccion + ". Localidad: " + localidad + ". Gerente: " + gerente + ". "
                + "Cant Hab" + cantHabitaciones + ", cantCamas=" + cantCamas + ", pisos=" + pisos + ", precioHab=" + precioHab + "gym=" + gym + ", "
                + "nombreResturant=" + nombreResturant + ", capRestaurant=" + capRestaurant+ "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + 
                ", cantLimosinas=" + cantLimosinas + '}';
    }

    
}
