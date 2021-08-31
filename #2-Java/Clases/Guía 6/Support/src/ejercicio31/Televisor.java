/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio31;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Televisor extends Electrodomestico {
    
    private Integer pulgadas;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT, Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT, Integer precioBase, String color, char consumo, Integer peso) {
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public Integer precioFinal() {
        Integer precio = super.precioFinal();
        
        if (this.pulgadas > 40) {
            this.precioFinal = precio + (precio + 40 / 100);
        } else {
            this.precioFinal = precio;
        }
        
        if (this.sintonizadorTDT) {
            this.precioFinal = precio + 500;
        } else {
            this.precioFinal = precio;
        }
        
        return this.precioFinal;
    }
    
    
}
