/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegradorJava;

import java.util.ArrayList;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Cliente {

    private String nombreYApellido;
    private Integer dni;
    private String mail;
    private String domicilio;
    private String telefono;
    private ArrayList<Poliza> polizasCliente = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombreYApellido, Integer dni, String mail, String domicilio, String telefono) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        //this.polizasCliente = PolizaService.polizasPorCliente(1, this);
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Poliza> getPolizasCliente() {
        return polizasCliente;
    }

    public void setPolizasCliente(ArrayList<Poliza> polizasCliente) {
        this.polizasCliente = polizasCliente;
    }

    @Override
    public String toString() {
        return "Cliente " + "Nombre Y Apellido=" + nombreYApellido
                + " Dni=" + dni + ", Mail=" + mail 
                + ", Domicilio=" + domicilio + ", telefono=" + telefono;
    }

}
