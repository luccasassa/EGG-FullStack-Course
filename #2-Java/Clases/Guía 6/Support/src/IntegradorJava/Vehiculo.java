/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegradorJava;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer anio;
    private Integer numeroMotor;
    private String chasis;
    private String color;
    private String tipoDeVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, Integer numeroMotor, String chasis, String color, String tipoDeVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo " + "Marca=" + marca + ", modelo=" + modelo + ", año=" 
                + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis 
                + ", color=" + color + ", tipoDeVehiculo=" + tipoDeVehiculo;
    }
    
    
}
