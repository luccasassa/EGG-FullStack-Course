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
public class Residencias extends ExtraHoteleros {
    
    protected Integer cantHab;
    protected Boolean dctoGremios;
    protected Boolean campoDeportivo;

    public Residencias() {
        super();
    }

    public Residencias(Integer cantHab, Boolean dctoGremios, Boolean campoDeportivo) {
        this.cantHab = cantHab;
        this.dctoGremios = dctoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantHab, Boolean dctoGremios, Boolean campoDeportivo, Boolean privado, Integer mts2) {
        super(privado, mts2);
        this.cantHab = cantHab;
        this.dctoGremios = dctoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantHab, Boolean dctoGremios, Boolean campoDeportivo, Boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.dctoGremios = dctoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public Boolean getDctoGremios() {
        return dctoGremios;
    }

    public void setDctoGremios(Boolean dctoGremios) {
        this.dctoGremios = dctoGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros: " + " Privado: " + privado + ", Mts2: " + mts2 
                + "Residencias " + "cantHab=" + cantHab + ", dctoGremios=" + dctoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
