/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio27;

import java.util.Comparator;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private Boolean vivo;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean vivo) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
    //Metodo enviado a Jugador Service
//    public Boolean disparar(Revolver r) {
//        if (r.getPosTambor() == r.getPosBala()) {
//            return vivo = false;
//        } else {
//            return vivo = true;
//        }
//    }
    
    public static Comparator<Jugador> ordenId = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador o1, Jugador o2) {
            return o1.getId().compareTo(o2.getId());
        }
    
};
}
