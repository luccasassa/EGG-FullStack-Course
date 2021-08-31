/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio32;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public abstract class Baraja {
    
    protected Integer cartasTotal;
    protected Integer cartasPalo;

    public Baraja() {
    }

    public Baraja(Integer cartasTotal, Integer cartasPalo) {
        this.cartasTotal = cartasTotal;
        this.cartasPalo = cartasPalo;
    }

    public Integer getCartasTotal() {
        return cartasTotal;
    }

    public void setCartasTotal(Integer cartasTotal) {
        this.cartasTotal = cartasTotal;
    }

    public Integer getCartasPalo() {
        return cartasPalo;
    }

    public void setCartasPalo(Integer cartasPalo) {
        this.cartasPalo = cartasPalo;
    }

    
    public abstract void crearBaraja();
}
