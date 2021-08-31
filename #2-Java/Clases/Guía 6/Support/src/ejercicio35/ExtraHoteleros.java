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
public class ExtraHoteleros extends Alojamiento {
    
    protected Boolean privado;
    protected Integer mts2;

    public ExtraHoteleros() {
        super();
    }

    public ExtraHoteleros(Boolean privado, Integer mts2) {
        this.privado = privado;
        this.mts2 = mts2;
    }

    public ExtraHoteleros(Boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mts2 = mts2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMts2() {
        return mts2;
    }

    public void setMts2(Integer mts2) {
        this.mts2 = mts2;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros: " + " Privado: " + privado + ", Mts2: " + mts2;
    }
    
    

}
