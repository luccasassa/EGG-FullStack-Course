/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio33;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Barco {
    
    protected Integer matricula;
    protected Double eslora;
    protected Integer anioFab;

    public Barco() {
    }

    public Barco(Integer matricula, Double eslora, Integer anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }
    
    public Double modulo() {
        return ((eslora*10)*2);
    }

}
