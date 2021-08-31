/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje05;

/**
 *
 * @author Tomás
 */
public class Electrodomesticos {

    protected Integer precio;
    protected String color;
    protected String consumo;
    protected Integer peso;

    public Electrodomesticos() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumo = "f";
        this.peso = 5;
    }

    public Electrodomesticos(Integer precio, Integer peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = "blanco";
        this.consumo = "f";

    }

    public Electrodomesticos(Integer precio, String color, String consumo, Integer peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;

    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(String consumo) {

        if (!consumo.equals("a") && !consumo.equals("b") &&  !consumo.equals("c") &&  !consumo.equals("d") &&  !consumo.equals("e") &&  !consumo.equals("f")) {
            this.consumo = "f";
        } else {
            this.consumo = consumo;
        }
    }

    private void comprobarColor(String color) {

        if (!color.equals("blanco") && !color.equals("rojo") && !color.equals("negro") && !color.equals("azul") && !color.equals("gris")) {
            this.color = "blanco";
        } else {
            this.color = color;
        }
    }

    public double precioFinal() {
        Integer adicConsumo = 0;
        Integer adicPeso = 0;
        switch (consumo) {
            case "a":
                adicConsumo = 1000;
                break;
            case "b":
                adicConsumo = 800;
                break;
            case "c":
                adicConsumo = 600;
                break;
            case "d":
                adicConsumo = 500;
                break;
            case "e":
                adicConsumo = 300;
                break;
            case "f":
                adicConsumo = 100;
                break;
        }
        
    int indicePeso = 0;
    if(peso>=0 && peso <=19){
       indicePeso=1 ; 
    }else if(peso>=20 && peso <=49){
         indicePeso=2 ; 
    } else if(peso>=50 && peso <=79){
         indicePeso=3 ; 
    } else if(peso >=80){
         indicePeso=4 ; 
    }
    
    
switch (indicePeso) {
            case 1 :
                adicPeso = 100;
                break;
            case 2:
                adicPeso = 500;
                break;
            case 3:
                adicPeso = 800;
                break;
            case 4:
                adicPeso = 1000;
                break;
        
        }
       double precioFinal = precio + adicConsumo + adicPeso;
       return   precioFinal ;
      

    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
 
    
    
}
