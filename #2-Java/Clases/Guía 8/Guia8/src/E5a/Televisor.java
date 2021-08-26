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
public class Televisor extends Electrodomesticos {
    
    private Integer resolucion ;
    private Boolean sintonizador ;

    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }

     public Televisor( Integer precio, Integer peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizador = false;
    }
    

    public Televisor(Integer resolucion, Boolean sintonizador, Integer precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
      @Override
 public double precioFinal(){
  
     double precioFinalElec = super.precioFinal();
     double adicPul=0.0 ;
     Integer adicSint=0 ;
     
     if(this.resolucion>40){
         adicPul = precioFinalElec*0.3 ;
         System.out.println("holaa");
     }
     if(this.sintonizador){
         adicSint = 501;
         System.out.println("chau");
     }
  
      
     double precioFinalTV =precioFinalElec + adicPul+ adicSint;
        
     return precioFinalTV;
     
 }
    
    
    
    
    
    
}
