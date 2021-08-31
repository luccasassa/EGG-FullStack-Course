/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio17;


public class Mes {
    
    private String[] mes={"enero","febrero","marzo","abril","mayo","junio",
        "julio","agosto","septiembre","octubre","noviembre","diciembre"};
    //private String mesSecreto = mes[(int)(Math.random()*11)];
    private String mesSecreto = mes[9];
    
    public boolean adivina(String mesJuego) {
        boolean adivina = mesSecreto.equals(mesJuego);
        return adivina;
    }

}
