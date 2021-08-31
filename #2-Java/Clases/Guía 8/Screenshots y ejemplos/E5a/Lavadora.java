/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eje05;

/**
 *
 * @author Tomás
 */
public class Lavadora extends Electrodomesticos {
    
  private Integer carga ;

    public Lavadora() {
       super(); 
       this.carga = 5;
    }
  
    public Lavadora(Integer precio, Integer peso) {
        super(precio, peso);
        this.carga = 5;
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

  @Override
 public double precioFinal(){
  
     double precioFinalElec = super.precioFinal();
     Integer adicLav=0 ;
    
     if(carga>30){
         adicLav = 500 ;
     }

     double precioFinalLav =precioFinalElec + adicLav;
     return precioFinalLav;
     
 }
   
    
    
    
    
    
}
