/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Alquiler extends TiposDeBarcos{

    private Integer dniCliente;
    private Calendar fechaInicio;
    private Calendar fechaFinal;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
        super();
    }

    public Alquiler(Integer dniCliente, Calendar fechaInicio, Calendar fechaFinal, Integer posicionAmarre, Barco barco) {
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Alquiler(Integer dniCliente, Calendar fechaInicio, Calendar fechaFinal, Integer posicionAmarre, Barco barco, Integer mastiles, Integer potencia, Integer camarotes) {
        super(mastiles, potencia, camarotes);
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Alquiler(Integer dniCliente, Calendar fechaInicio, Calendar fechaFinal, Integer posicionAmarre, Barco barco, Integer mastiles, Integer potencia, Integer camarotes, Integer matricula, Double eslora, Integer anioFab) {
        super(mastiles, potencia, camarotes, matricula, eslora, anioFab);
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Double precioAlquiler() {
        
        if (fechaFinal.getTimeInMillis() > fechaInicio.getTimeInMillis()) {
            Long diasDeAlquiler= TimeUnit.DAYS.toDays(fechaFinal.getTimeInMillis() - fechaInicio.getTimeInMillis()+1);
            return (diasDeAlquiler * super.modulo());
        } else if (fechaFinal.getTimeInMillis() == fechaInicio.getTimeInMillis()) {
            return (super.modulo());
        } else {
            return 0.0;
        }
    }

}
