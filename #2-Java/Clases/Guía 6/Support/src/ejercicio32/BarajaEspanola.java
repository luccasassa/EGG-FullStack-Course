/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class BarajaEspanola extends Baraja {

    private Boolean jugarCon8y9;
    private static ArrayList<Cartas> barajaEspanola= new ArrayList();

    public BarajaEspanola() {
        super();
    }
    public BarajaEspanola(Boolean jugarCon8y9) {
        super();
        this.jugarCon8y9 = jugarCon8y9;
    }

    public BarajaEspanola(Boolean jugarCon8y9, Integer cartasTotal, Integer cartasPalo) {
        super(cartasTotal, cartasPalo);
        this.jugarCon8y9 = jugarCon8y9;
    }

    public Boolean getJugarCon8y9() {
        return jugarCon8y9;
    }

    public void setJugarCon8y9(Boolean jugarCon8y9) {
        this.jugarCon8y9 = jugarCon8y9;
    }

    public ArrayList<Cartas> getBarajaEspanola() {
        return barajaEspanola;
    }

    public void setBarajaEspanola(ArrayList<Cartas> barajaEspanola) {
        this.barajaEspanola = barajaEspanola;
    }

    public Integer tipoDeJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Con cuantas cartas quieres jugar? (40 o 48)");
        Integer rpta = sc.nextInt();

        while (!rpta.equals(40) && (!rpta.equals(48))) {
            System.out.println("Ingrese un numero valido 40 0 48");
            rpta = sc.nextInt();
        }
        
        switch (rpta) {
            case 40:
                this.cartasPalo = 10;
                this.cartasTotal = 40;
                this.jugarCon8y9 = false;
                break;
            case 48:
                this.cartasPalo = 12;
                this.cartasTotal = 48;
                this.jugarCon8y9 = true;
                break;
            default:
                System.out.println("Opcion Invalida");
        }

        return this.cartasPalo;
    }

    @Override
    public void crearBaraja() {
        PalosBarEspanola[] palo = PalosBarEspanola.values();
        
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < this.cartasPalo; j++) {
                if (!jugarCon8y9 && j >= 7 || j >= 8) {
                    Cartas c = new Cartas();
                    c.setNumero(j + 3);
                    c.setPalo(palo[i]);
                    barajaEspanola.add(c);
                    //continue;
                } else {
                    Cartas c = new Cartas();
                    c.setNumero(j + 1);
                    c.setPalo(palo[i]);
                    barajaEspanola.add(c);
                }
            }
        }
        mostrar();
    }
    
    public void mostrar() {
        for (Cartas carta : barajaEspanola) {
            System.out.println(carta);
        }
    }

}
