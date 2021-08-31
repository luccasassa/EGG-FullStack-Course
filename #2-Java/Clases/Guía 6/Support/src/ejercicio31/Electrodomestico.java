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
public abstract class Electrodomestico {

    protected Integer precioBase;
    protected String color;
    protected char consumo;
    protected Integer peso;
    protected Integer precioFinal;

    public Electrodomestico() {
        this.precioBase = 1000;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 5;
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumo = 'F';
    }

    public Electrodomestico(Integer precioBase, String color, char consumo, Integer peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Integer precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F') {
            this.consumo = 'F';
        }
    }

    public void comprobarColor(String color) {
        color = color.toLowerCase();
        if (!color.equals("blanco") || !color.equals("negro")
                || !color.equals("rojo") || !color.equals("azul")
                || !color.equals("gris")) {
            color = "blanco";
        }
    }

    public Integer precioFinal() {
        switch (this.consumo) {
            case 'A':
                this.precioFinal = this.precioBase + 1000;
                break;
            case 'B':
                this.precioFinal =this.precioBase + 800;
                break;
            case 'C':
                this.precioFinal = this.precioBase + 600;
                break;
            case 'D':
                this.precioFinal = this.precioBase+ 500;
                break;
            case 'E':
                this.precioFinal = this.precioBase + 300;
                break;
            case 'F':
                this.precioFinal = this.precioBase + 100;
                break;
        }

        if (this.peso > 0 && this.peso <= 19) {
            this.precioFinal = precioFinal + 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precioFinal = precioFinal + 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precioFinal = precioFinal + 800;
        } else if (this.peso >= 80) {
            this.precioFinal= precioFinal + 1000;
        }

        return this.precioFinal;
    } 
}