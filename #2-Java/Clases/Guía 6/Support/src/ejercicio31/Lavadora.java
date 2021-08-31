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
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(Integer carga, Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(Integer carga, Integer precioBase, String color, char consumo, Integer peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    /**
     *
     * @return
     */
    @Override
    public Integer precioFinal() {
        Integer precio = super.precioFinal();

        if (this.carga > 30) {
            this.precioFinal = precio + 500;
        } else if (this.carga <= 30) {
            this.precioFinal = precio;
        }

        return this.precioFinal;
    }

}
