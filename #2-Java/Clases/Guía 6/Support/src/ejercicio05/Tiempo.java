/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Tiempo {

    private Integer hora;
    private Integer minutos;
    private Integer segundos;

    public Tiempo(Integer hora, Integer minutos, Integer segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo() {

    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public void imprimirHoraCompleta() {
        System.out.println("La hora completa es: " + this.hora + ":" + this.minutos + ":" + this.segundos);
    }

}
