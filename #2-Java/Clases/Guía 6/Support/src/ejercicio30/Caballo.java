/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class Caballo extends Animal {

    public Caballo(String nombre, Integer edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    @Override
    public String Alimentarse() {
        return "Me alimento de " + alimento;
    }

}
