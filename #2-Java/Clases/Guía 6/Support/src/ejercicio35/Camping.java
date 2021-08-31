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
public class Camping extends ExtraHoteleros {

    protected Integer capMaxCarpas;
    protected Integer cantBanios;
    protected Boolean restaurannt;

    public Camping() {
        super();
    }

    public Camping(Integer capMaxCarpas, Integer cantBanios, Boolean restaurannt) {
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurannt = restaurannt;
    }

    public Camping(Integer capMaxCarpas, Integer cantBanios, Boolean restaurannt, Boolean privado, Integer mts2) {
        super(privado, mts2);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurannt = restaurannt;
    }

    public Camping(Integer capMaxCarpas, Integer cantBanios, Boolean restaurannt, Boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurannt = restaurannt;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurannt() {
        return restaurannt;
    }

    public void setRestaurannt(Boolean restaurannt) {
        this.restaurannt = restaurannt;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros: " + " Privado: " + privado + ", Mts2: " + mts2 + 
                "Camping " + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurannt=" + restaurannt;
    }
    
    
}
