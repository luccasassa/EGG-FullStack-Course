/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegradorJava;

import java.util.Date;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Cuota {
    
    private Integer cuotaNro;
    private Double montoCuota;
    private Boolean pagado;
    private Date fechaVto;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(Integer cuotaNro, Double montoCuota, Boolean pagado, Date fechaVto, String formaDePago) {
        this.cuotaNro = cuotaNro;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.fechaVto = fechaVto;
        this.formaDePago = formaDePago;
    }

    public Integer getCuotaNro() {
        return cuotaNro;
    }

    public void setCuotaNro(Integer cuotaNro) {
        this.cuotaNro = cuotaNro;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        String stringPagado;
        if (pagado) {
            stringPagado = "Si";
        } else {
            stringPagado = "No";
        }
        return "Cuota { " + "cuotaNro=" + cuotaNro + ", montoCuota=" + montoCuota 
                + ", pagado=" + stringPagado + ", fechaVto=" + fechaVto 
                + ", formaDePago=" + formaDePago + " }";
    }
    
    

}
