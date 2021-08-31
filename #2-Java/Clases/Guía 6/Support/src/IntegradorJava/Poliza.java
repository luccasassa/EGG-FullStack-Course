/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegradorJava;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Poliza {
    
    private Integer numPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cantCuotas;
    private String formaDePago;
    private Integer montoAsegurado;
    private Boolean seguroGranizo;
    private Integer montoMaxGranizo;
    private String tipoDeCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private ArrayList<Cuota> cuotas = new ArrayList();

    public Poliza() {
    }

    public Poliza(Integer numPoliza, Date fechaInicio, Date fechaFin, Integer cantCuotas, String formaDePago, Integer montoAsegurado, Boolean seguroGranizo, Integer montoMaxGranizo, String tipoDeCobertura, Cliente cliente, Vehiculo vehiculo) {
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.seguroGranizo = seguroGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Integer montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Boolean getSeguroGranizo() {
        return seguroGranizo;
    }

    public void setSeguroGranizo(Boolean seguroGranizo) {
        this.seguroGranizo = seguroGranizo;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        String s;
        if (!seguroGranizo) {
            s = "No";
        } else {
            s = "Si";
        }
        return "Poliza " + " Nro=" + numPoliza + ", fecha Inicio=" + fechaInicio 
                + ", fecha Fin=" + fechaFin + ", cant Cuotas=" + cantCuotas 
                + ", formaDePago=" + formaDePago + ", monto Asegurado=" + montoAsegurado 
                + ", seguroGranizo=" + s + ", monto Max Granizo=" + montoMaxGranizo 
                + ", tipoDeCobertura=" + tipoDeCobertura;
    }
    
    
}
