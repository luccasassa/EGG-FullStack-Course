/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio32;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class BarajaFrancesa extends Baraja {
    
    private static ArrayList<Cartas> barajaFrancesa= new ArrayList();

    public BarajaFrancesa() {
        super();
        this.cartasTotal = 52;
        this.cartasPalo = 13;      
    }

    public BarajaFrancesa(Integer cartasTotal, Integer cartasPalo) {
        super(cartasTotal, cartasPalo);
    }    

    public ArrayList<Cartas> getBarajaFrancesa() {
        return barajaFrancesa;
    }

    public void setBarajaFrancesa(ArrayList<Cartas> barajaFrancesa) {
        this.barajaFrancesa = barajaFrancesa;
    }
    
    
    
    public Boolean cartaRoja(Cartas<PalosBarFrancesa> c) {
        Boolean cartaRoja = false;
        if (c.getPalo() == PalosBarFrancesa.CORAZONES 
            || c.getPalo() == PalosBarFrancesa.DIAMANTES) {
            cartaRoja = true;
        }
        return cartaRoja;
    }
    
    public Boolean cartaNegra(Cartas<PalosBarFrancesa> c) {
        Boolean cartaNegra = false;
        if (c.getPalo().equals(PalosBarFrancesa.PICAS)
            || c.getPalo().equals(PalosBarFrancesa.TREBOLES)) {
            cartaNegra = true;
        }
        return cartaNegra;
    }

    public static void barajar() {
        Collections.shuffle(barajaFrancesa);
    }
    
    @Override
    public void crearBaraja() {
        PalosBarFrancesa[] palo = PalosBarFrancesa.values();
        
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < cartasPalo; j++) {
                Cartas c = new Cartas();
                c.setNumero(j+1);
                c.setPalo(palo[i]);
                barajaFrancesa.add(c);
            }
        }
        mostrar();
    }

     public void mostrar() {
        for (Cartas carta : barajaFrancesa) {
            if (cartaRoja(carta)) {
                System.out.print("ROJA ");
            } else if (cartaNegra(carta)) {
                System.out.print("NEGRA ");
            }
            System.out.println(carta);
            
        }
    }
}
