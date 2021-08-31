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
public class TiposDeBarcos extends Barco {

    private Integer mastiles;
    private Integer potencia;
    private Integer camarotes;

    public TiposDeBarcos() {
        super();
    }

    public TiposDeBarcos(Integer mastiles, Integer potencia, Integer camarotes) {
        this.mastiles = mastiles;
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public TiposDeBarcos(Integer mastiles, Integer potencia, Integer camarotes, Integer matricula, Double eslora, Integer anioFab) {
        super(matricula, eslora, anioFab);
        this.mastiles = mastiles;
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int yateOdeportivo() {
        int deportivo = 300;
        int yate = 500;

        if (camarotes == 0) {
            return deportivo;
        } else {
            return yate;
        }
    }

}
