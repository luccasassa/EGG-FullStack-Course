/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 * @param <T>
 */
public class Cartas<T> {

    private Integer numero;
    private T palo;

    public Cartas() {
    }

    public Cartas(Integer numero, T palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public T getPalo() {
        return palo;
    }

    public void setPalo(T palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        String numString;
        Boolean francesa = false;
        // da un error que no entiendo, a nahuel le sale bien y tenemos lo mismo
        //fracesa = palo instanceOf PalosBarFrancesa;
        
        for (PalosBarFrancesa value : PalosBarFrancesa.values()) {
            if (this.palo.equals(value)) {
                francesa = true;
                break;
            }
        }

        if (francesa) {
            switch (this.numero) {
                case 1:
                    numString = "As";
                    break;
                case 11:
                    numString = "Jota";
                    break;
                case 12:
                    numString = "Reina";
                    break;
                case 13:
                    numString = "Rey";
                    break;
                default:
                    numString = numero.toString();
            }
        } else {
            switch (this.numero) {
                case 1:
                    numString = "As";
                    break;
                case 10:
                    numString = "Sota";
                    break;
                case 11:
                    numString = "Caballo";
                    break;
                case 12:
                    numString = "Rey";
                    break;
                default:
                    numString = numero.toString();
            }
        }

        return numString + " de " + palo;
    }

}
